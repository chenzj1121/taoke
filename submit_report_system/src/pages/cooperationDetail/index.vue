<template>
  <div>
    <el-row>
      <el-form
        inline
        :model="form"
        ref="form"
        size="mini">
        <el-form-item prop="shopName" label="店铺名称">
          <el-input v-model="form.coopCustomer"/>
        </el-form-item>
        <el-form-item prop="shopId" label="商品ID">
          <el-input v-model="form.coopGoodsId"/>
        </el-form-item>
        <el-form-item prop="coopType" label="提报状态">
          <el-select v-model="form.coopTbtype">
            <el-option v-for="(option, index) in submitOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="活动类型">
          <el-select v-model="form.coopActivity">
            <el-option v-for="(option, index) in actionOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
 
      
        <el-form-item prop="coopZero" label="是否零点">
          <el-select v-model="form.coopZero">
            <el-option v-for="(option, index) in isZeroOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <br>
        <el-form-item prop="tibaoTime" label="提报时间">
           <el-date-picker
              v-model="form.coopTbTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <span style="position:relative;top:5px;left:-5px;">至</span>
        <el-form-item prop="tibaoTimeEnd">
            <el-date-picker
              v-model="form.coopTbmaxTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <el-form-item prop="onlineTimeBegin" label="上线时间">
           <el-date-picker
              v-model="form.coopStartTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <span style="position:relative;top:5px;left:-5px;">至</span>
        <el-form-item prop="onlineTimeEnd">
            <el-date-picker
              v-model="form.coopMaxStartTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
         <el-form-item prop="outlineTimeBegin" label="下线时间">
           <el-date-picker
              v-model="form.coopEndTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <span style="position:relative;top:5px;left:-5px;">至</span>
        <el-form-item prop="outlineTimeEnd">
            <el-date-picker
              v-model="form.coopMaxEndTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <el-form-item prop="name" label="回款状态">
          <el-select v-model="form.name" :disabled='true'>
            <el-option v-for="(option, index) in paybackOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="是否查款" >
          <el-select v-model="form.name" :disabled='true'>
            <el-option v-for="(option, index) in isExamineOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="coopPayType" label="结算类型">
          <el-select v-model="form.coopPayType">
            <el-option v-for="(option, index) in settleStatusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
      <div v-if="type==0 || type ==1">
      <el-form-item label="销售部" v-if="isBoss">
       <el-select v-model="form.coopDeptId" placeholder="请选择" @change="getGroup(form.coopDeptId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  deptList" :key="i" :value="item.deptId" :label="item.deptName"></el-option>
              </el-select>
      </el-form-item>
      <el-form-item label="组别" v-if="isBoss">
         <el-select v-model="form.coopGroupId" placeholder="请选择" @change="getMember(form.coopDeptId,form.coopGroupId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  gruopList2" :key="i" :value="item.groupId" :label="item.groupName"></el-option>
              </el-select>
      </el-form-item>
      <el-form-item label="责任人">
        <el-select v-model="form.coopUserId" placeholder="请选择">
                <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  memberList" :key="i" :value="item.id" :label="item.username"></el-option>
              </el-select>
      </el-form-item>
      </div>
        <el-form-item>
          <el-button type="primary" @click="bindData">查询</el-button>
          <el-button @click="() => {this.form = {};this.bindData()}">重置</el-button>&nbsp;&nbsp;&nbsp;
          <!-- <span>驳回消息 0 条</span>
          <span class="link">点击查看</span> -->
          <!-- &nbsp;&nbsp; -->
          <!-- <el-button type="primary">下载模板</el-button>
          <el-button type="warning">上传数据</el-button> -->
          <span style="font-size: 16px;">通过数：{{passNum}} </span>
        </el-form-item>
     
      </el-form>
      <el-table
        style="width: 100%;"
        v-loading="loading"
        :data="cooperationDetailTableData"
        size="mini">
        <el-table-column type="selection"></el-table-column>
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column prop="coopTbtype" label="提报状态">
           <template slot-scope="scope" >
             <p :class="scope.row.coopTbtype=='待审核'?'shenhe':'jieshu'">{{scope.row.coopTbtype}}</p>
             <p class="checkReject" v-if="scope.row.coopTbtype=='拒绝'" @click="checkReason(scope.row)">(查看)</p>
           </template>
        </el-table-column>
        <el-table-column prop="coopPttype" label="平台状态"></el-table-column>
        <el-table-column prop="coopCustomer" label="商家客户"></el-table-column>
        <el-table-column prop="coopMainpicture" label="商家主图">
                <template   slot-scope="scope">            
                    <!-- <img :src="scope.row.coopMainpicture"  min-width="70" height="70" /> -->
                     <el-image 
                      style="width: 70px; height: 70px"
                      :src="scope.row.coopMainpicture" 
                      :preview-src-list="[`${scope.row.coopMainpicture}`]">
                    </el-image>
                </template>   
        </el-table-column>
        <el-table-column prop="coopActivity" label="商家活动"></el-table-column>
        <el-table-column prop="coopGoodsId" label="商品ID"></el-table-column>
        <el-table-column prop="coopZero" label="零点提报"></el-table-column>
        <el-table-column prop="coopAlterprice" label="券后价"></el-table-column>
        <el-table-column prop="coopYhqnums" label="优惠券总量"></el-table-column>
        <el-table-column prop="coopYjscale" label="佣金比例"></el-table-column>
        <el-table-column prop="coopTbtime1" label="提报时间"  width="100px"></el-table-column>
        <el-table-column prop="coopStarttime1" label="上线时间" width="100px"></el-table-column>
        <el-table-column prop="coopEndtime1" label="结束时间"  width="100px"></el-table-column>
        <el-table-column prop="coopBack" label="回款金额"></el-table-column>
        <el-table-column prop="coopDept" label="部门"></el-table-column>
        <el-table-column prop="coopUser" label="责任人"></el-table-column>
        <el-table-column prop="coopYhqName" label="优惠券名称"></el-table-column>
        <el-table-column prop="coopMessage" label="备注">
          <template slot-scope="scope">
             <p class="web" slot="reference"></p>
             <el-popover
              placement="top-start"
              width="200"
              trigger="hover">
              <p>{{scope.row.coopMessage}}</p>
            <p class="web" slot="reference">{{scope.row.coopMessage}}</p>
             </el-popover> 
          </template>
        </el-table-column>
        <el-table-column prop="name" label="操作" width="360px">
          <template slot-scope="scope">
            <span class="flex">
              <el-button size="mini" type="primary" @click="viewGood(scope.row.coopGoodsId)">查看商品</el-button>
              <el-button size="mini" v-if="scope.row.coopTbtype =='待审核'" @click="delCoop(scope.row)">撤回</el-button>
              <el-button size="mini" type="warning" @click="reCoop(scope.row,scope.row.coopBossId,scope.row.coopId)">重新提报</el-button>
              <el-button size="mini" type="primary" @click="nav2Checking(scope.row)">查款</el-button>
              <!-- <el-button size="mini" type="warning">返/退款</el-button> -->
            </span>
          </template>
        </el-table-column>
      </el-table>
      <Page style="text-align:right;margin-top:10px;" :page="page" @change="bindData"/>
    </el-row>
     <ReasonBox v-if="viewReason" @func="closeBox" :data='reason'/>
  </div>
</template>

<script>
import Page from '@/components/page'
import ReasonBox from "@/components/reason"
import { getGroupByList ,getGroupMember,PRE_URL,getCooperationPage ,getDeptByList,getUserByList,addBackMoney,getShopById,delCoopById,updateCoop,addCoop,getCooperNum} from '@/api'
import {getUser} from "@/utils/auth"

export default {
  components: {
    Page,
    ReasonBox
  },
  data () {
    return {
      form: {
        coopDeptId:getUser().type==0?'':getUser().deptId,
        coopGroupId:getUser().type==0?'':getUser().groupId,
      },
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
      loading: false,
      submitOptions: [ // 提报状态options
        { label: '全部', value: null },
        { label: '待审核', value: '待审核' },
        { label: '通过', value: '通过' },
        { label: '拒绝', value: '拒绝' },
      ],
      actionOptions: [ // 活动类型
        { label: '全部', value: null },
        { label: '聚划算', value: '聚划算' },
        { label: '淘抢购', value: '淘抢购' },
        { label: '常规推广', value: '常规推广' }
      ],
      paybackOptions: [ // 回款状态
        { label: '全部', value: null },
        { label: '已回款', value: '已回款' },
        { label: '待回款', value: '待回款' },
        { label: '推广中', value: '推广中' }
      ],
      isZeroOptions: [ // 是否零点
        { label: '全部', value: null },
        { label: '非零点', value: '非零点' },
        { label: '零点', value: '零点' }
      ],
      dutyPersonOptions: [
        { label: '全部', value: null }
      ],
      isExamineOptions: [ // 是否查款
        { label: '全部', value: null },
        { label: '已查款', value: '已查款' },
        { label: '未查款', value: '未查款' }
      ],
      settleStatusOptions: [ // 结算类型
        { label: '全部', value: null },
        { label: '线上结算', value: '线上结算' },
        { label: '线下结算', value: '线下结算' }
      ],
      cooperationDetailTableData: [],
      userList:[],
      groupList:[],
      gruopList2:[],
      deptList:[],
      memberList:[],
      type:2,
      viewReason:false,
      reason:{},
      PRE_URL,
      passNum:0,
       isBoss:false,
    }
  },
  mounted () {
    this.type = getUser().type
    if (this.type==0) {
      this.isBoss =true
    }else{
      this.form.deptId = getUser().deptId
      this.form.groupId = getUser().groupId
      this.getMember( this.form.deptId,this.form.groupId)
    }
    this.getUserList()
    this.getDeptList()
    this.getGroupList()
    this.bindData()
  },
  methods: {
     getGroup(id){
        this.form.groupId = null;
        if( this.form.coopUserId){ this.form.coopUserId = null;}
        this.gruopList2 = []
        this.memberList = []
      if(id){
      //  this.form.shopDeptId =null;
      this.groupList.map(item=>{
        if(item.groupDeptId==id){
          this.gruopList2.push(item)
        }
      })
      }
    },
    getMember(deptId,groupId){
      console.log(deptId,groupId)
        if( this.form.coopUserId){ this.form.coopUserId = null;}
      this.memberList = [];
      if(deptId && groupId){
      //  this.form.groupId = null;
        getGroupMember(deptId,groupId).then(res=>{
          this.memberList = res
        })
      }
    },
    checkReason(data){
      this.viewReason = true;
      this.reason =data;
    },
    closeBox(data){
      console.log(data)
      this.viewReason = data
    },
    delCoop(item){
      this.$confirm(`是否撤销【${item.coopCustomer}】的该条提报?`, '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
          item.coopTbtype ="待修改"
          updateCoop(item).then(res=>{
          if (res.success) {
            this.$sucmsg(res.message)
            this.bindData()
          }else{
            this.$errmsg(res.message)
          }
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        })
      })
    },
   reCoop(item,id,coopId){
    //  if (item.coopTbtype=="通过") {
    //      this.$confirm(`该提报已通过，是否重新创建一条?`, '提示', {
    //     confirmButtonText: '确定',
    //     cancelButtonText: '取消',
    //     type: 'warning'
    //   }).then(() => {
    //     item.coopTbtype ="待审核";
    //     item.coopUser = getUser().id
    //     item.coopTbtime = new Date()
    //     item.coopShenheId = null
    //     item.coopShenheBz = null
    //     item.coopShenheTime = null
    //     item.coopId=null
    //     addCoop(item).then(res=>{
    //         if (res.success) {
    //           this.$sucmsg(res.message)
    //         }else{
    //           this.$errmsg(res.message)
    //         }
    //         this.bindData()
    //     })
    //   }).catch(()=>{})
    //  }else{
     getShopById(id).then(res=>{
       if (res) {
          this.$router.push({ path: '/customer/cooperationDetail',name:'cooperationDetail' ,params:res,query:{coopId}})
       }
     })
    //  }
   },
    viewGood(id){
         window.open(`https://item.taobao.com/item.htm?ft=t&id=${id}`);   
    },
      getDeptList () {
      getDeptByList().then(res => {
        // console.log(res)
        this.deptList = res
      })
    },
      getUserList(){
      getUserByList().then(res=>{
        this.userList = res
      })
    },
     getGroupList() {
      getGroupByList().then(res => {
        this.groupList = res
      })
    },
    bindData () {
      const form = this.form
      // form.coopTbTimeEnd = new Date(form.coopTbTimeEnd).getTime();
      // form.coopStartTimeEnd = new Date(form.coopStartTimeEnd).getTime();
      // form.coopEndTimeEnd = new Date(form.coopEndTimeEnd).getTime();
      const page = this.page.pageNum
      const rows = this.page.pageSize
      this.loading = true
      getCooperNum(form, page, rows).then(res=>{
        this.passNum = res
      })
      getCooperationPage(form, page, rows).then(res => {
         res.rows.forEach((item,index)=>{
           let list =["coopEndtime","coopStarttime","coopTbtime"]
           list.forEach(obj=>{
             item[obj+'1'] = this.getMyDate(item[obj])
            // console.log(oTime)
           })
            // item.coopEndtime = new Date(item.coopEndtime);
            // item.coopStarttime = new Date(item.coopStarttime);
            // item.coopTbtime = new Date(item.coopTbtime)
              this.deptList.forEach(obj=>{
                if(item.coopDeptId == obj.deptId ){
                  item.coopDept = obj.deptName
                }
              })
              this.userList.forEach(obj=>{
                if(item.coopUserId ==obj.id ){
                  item.coopUser = obj.username
                }
              })
   
          })
        console.log(res)

        this.cooperationDetailTableData = res.rows
        this.page.total = res.total
        this.loading = false
      })
        .catch(() => {
          this.loading = false
        })
    },
    nav2Checking (obj) {
      this.$router.push({path: 'checking',query:{id:obj.coopBossId}})
    },
  getMyDate(str) {
    var oDate = new Date(str)
    let oYear = oDate.getFullYear()
    let oMonth = oDate.getMonth()+1
    let oDay = oDate.getDate()
    let oHour =oDate.getHours()
    let oMin = oDate.getMinutes()
    if (oMin <10) {
      oMin = "0"+oMin
    }
    let oTime = oYear +'-'+ oMonth +'-'+oDay+" "+oHour+":"+oMin
    return oTime;
    }

  }
}
</script>

<style scoped lang='less'>
.link {
  color: blue;text-decoration:underline;cursor:pointer;
}
.flex {
  display: flex;
  // justify-content: space-between;
}
.el-button+.el-button {
  margin-left: 2px;
}
.checkReject{
  display:inline;
  cursor: pointer;
  color: blue;
}
.web{
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 3;
  overflow: hidden;
}

</style>
