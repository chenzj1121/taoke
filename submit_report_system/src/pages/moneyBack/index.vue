<template>
  <div>
    <div class="title">退/返款操作</div>
    <el-form
      inline
      size="mini"
      label-width="100px">
      <el-form-item label="店铺名称：">
        <el-input v-model="form.bmShopName"></el-input>
      </el-form-item>
      <!-- <el-form-item label="商品ID：">
        <el-input v-model="form.name"></el-input>
      </el-form-item> -->
      <el-form-item label="优惠券名称：">
        <el-input v-model="form.bmYhqName"></el-input>
      </el-form-item>
      <el-form-item label="申请时间">
        <el-date-picker 
        v-model="form.bmCreateTime" 
        type="date"
        value-format='timestamp'
        placeholder="选择日期">
        </el-date-picker>
      </el-form-item>
        <span style="position:relative;top:5px;left:-5px;">至</span>
          <el-form-item prop="outlineTimeEnd">
            <el-date-picker
              v-model="form.bmCreateTimeEnd"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
         </el-form-item>
      <el-form-item label="打款时间">
        <el-date-picker v-model="form.bmMakeTime"
          type="date"
          value-format='timestamp'
          placeholder="选择日期">
         </el-date-picker>
      </el-form-item>
       <span style="position:relative;top:5px;left:-5px;">至</span>
          <el-form-item prop="outlineTimeEnd">
            <el-date-picker
              v-model="form.bmMakeTimeEnd"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
      </el-form-item>
      <br>
      <el-form-item label="状态：">
        <el-select v-model="form.bmConfirmType">
          <el-option v-for="(option, index) in statusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="bindData()">查询</el-button>
        <el-button type="primary" >下载表格</el-button>
        <span>驳回消息 5 条</span>
        <span>点击查看</span>
      </el-form-item>
    </el-form>
    <el-table
      size="mini"
      :data="moneyBackTableData">
      <el-table-column type="selection" width="30"></el-table-column>
      <el-table-column type="index" label="序号"></el-table-column>
      <el-table-column prop="bmConfirmType" label="确认状态" width="100px">
              <template slot-scope="scope">
           <el-popover
            placement="right"
            trigger="click">
            <div style="text-align: center;">
              <div  v-if="scope.row.bmConfirmType=='待审核'">
              <p style="padding:10px 0;text-align:left" >您正在进行查款审核操作</p>
              <el-button size="mini" type="warning" @click="checkForYes(scope.row)">通过</el-button>
              <el-button size="mini" type="danger" @click="checkForNo(scope.row)">拒绝</el-button>
              </div>
              <div v-if="scope.row.bmConfirmType=='拒绝'">
                <p style="padding:10px 0;text-align:left">拒绝理由如下:</p>
                <p style="color:red;">{{scope.row.bmByzd}}</p>
              </div>
            </div>
            <!-- <el-button slot="reference" type="danger" >拒绝</el-button> -->
            <el-button slot="reference" :disabled="(type!=0 || scope.row.bmConfirmType=='通过')?(scope.row.bmConfirmType=='拒绝'?false:true):false " size="mini" :type="scope.row.bmConfirmType=='拒绝'?'danger':(scope.row.bmConfirmType=='待审核'?'warning':'')">{{scope.row.bmConfirmType=='拒绝'?scope.row.bmConfirmType+'(查看)':scope.row.bmConfirmType}}</el-button>
           </el-popover>
         </template>
      </el-table-column>
      <el-table-column prop="dep" label="销售部"></el-table-column>
      <el-table-column prop="group" label="组别"></el-table-column>
      <el-table-column prop="creater" label="销售人"></el-table-column>
      <el-table-column label="店铺名称">
        <template slot-scope="scope">
          <span class="link" @click="showMoreRecords(scope.row.bmTimeid,scope.row.bmShopName)">{{scope.row.bmShopName}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="bmShopName" label="商品ID"></el-table-column>
      <el-table-column prop="bmYhqName" label="优惠券名称"></el-table-column>
      <el-table-column prop="bmOnlineTime1" label="上线时间"></el-table-column>
      <el-table-column prop="bmOfflineTime1" label="下线时间"></el-table-column>
      <el-table-column prop="bmType" label="操作类型"></el-table-column>
      <el-table-column prop="bmMakeMoney" label="打款金额"></el-table-column>
      <el-table-column prop="bmBackMoney" label="返/退款金额"></el-table-column>
      <el-table-column prop="bmSurplus" label="剩余金额"></el-table-column>
      <el-table-column prop="bmBackAccount" label="打款账户">
        <template slot-scope="scope">
          <span class="link" @click="showAccountInfo(scope.row)">{{scope.row.bmBackAccount}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="bmMakeTime1" label="打款时间"></el-table-column>
      <el-table-column prop="bmCreateTime1" label="申请时间"></el-table-column>
      <el-table-column prop="bmText" label="备注"></el-table-column>
      <el-table-column prop="bmYhqPhoto" label="优惠券图片">
        <template slot-scope="scope">
            <el-image 
              style="width: 60px; height: 60px"
              :src="`${PRE_URL}/${scope.row.bmYhqPhoto}`" 
              :preview-src-list="[`${PRE_URL}/${scope.row.bmYhqPhoto}`]">
            </el-image>
          <!-- <img src="http://iph.href.lu/200x200"  min-width="70" height="70"> -->
        </template>
      </el-table-column>
 
      <el-table-column prop="bmMakePhoto" label="打款截图">
         <template slot-scope="scope">
            <el-image 
              style="width: 60px; height: 60px"
              :src="`${PRE_URL}/${scope.row.bmMakePhoto}`" 
              :preview-src-list="[`${PRE_URL}/${scope.row.bmMakePhoto}`]">
            </el-image>
          <!-- <img src="http://iph.href.lu/200x200"  min-width="70" height="70"> -->
        </template>
      </el-table-column>
      <el-table-column prop="bm_back_type" label="再次提交" width="100px">
         <template slot-scope="scope">
           <el-button size="mini" @click='resubmit(scope.row)' disabled>再次提交</el-button>
         </template>
      </el-table-column>
    </el-table>
    <Page style="text-align:right;margin-top:10px;" :page="page" @change="bindData"/>

    <el-dialog
      title="此店铺下同属这笔款的商品记录"
      width="80%"
      :visible.sync="moreRecordsByShopVisiable">
      <!-- <el-row type="flex" justify="space-between">
        <el-col :span="2" style="margin-bottom: 40px;">
          <div style="padding: 20px;">返款来源</div>
        </el-col>
        <el-col>
          <el-table :data="originTableData" size="mini" style="width:100%;" border>
            <el-table-column label="店铺名称" prop="name"></el-table-column>
            <el-table-column label="所属团队" prop="name"></el-table-column>
            <el-table-column label="责任人" prop="name"></el-table-column>
            <el-table-column label="打款金额" prop="name"></el-table-column>
            <el-table-column label="剩余金额" prop="name"></el-table-column>
            <el-table-column label="到款时间" prop="name"></el-table-column>
          </el-table>
        </el-col>
      </el-row> -->
      <el-table
        style="width: 100%;"
        size="mini"
        :data="moreRecordsByShopTableData">
         <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column label="部门" prop="goodsDeptId"></el-table-column>
        <el-table-column label="销售人" prop="goodsUserId"></el-table-column>
        <el-table-column label="店铺名称" prop="goodsShopName"></el-table-column>
        <el-table-column label="商品ID" prop="goodsId"></el-table-column>
        <el-table-column label="优惠券名称" prop="goodsYhqName"></el-table-column>
        <el-table-column label="上线时间" prop="goodsStarttime"></el-table-column>
        <el-table-column label="下线时间" prop="goodsEndtime"></el-table-column>
        <el-table-column label="结算金额" prop="goodsPayMoney"></el-table-column>
        <el-table-column label="结算量" prop="goodsNums"></el-table-column>
        <el-table-column label="服务费单价" prop="goodsService"></el-table-column>
        <el-table-column label="转入账户" prop="goodszhuanghu"></el-table-column>
        <el-table-column label="打款日期" prop="dakuanriqi"></el-table-column>
      </el-table>
      <!-- <el-pagination
        background
        style="margin-top:10px;text-align:right;"
        layout="prev, pager, next"
        :total="100">
      </el-pagination> -->
       <Page style="text-align:right;margin-top:10px;" :page="page1" />
    </el-dialog>

    <el-dialog
      :visible.sync="accountInfoVisiable"
      width="40%"
      title="到款账户信息">
      <el-form label-position="left" label-width="150px">
        <el-form-item label="销售花名："><span>{{ accountInfo.bmUserName }}</span></el-form-item>
        <el-form-item label="返/退款金额："><span>{{ accountInfo.bmBackMoney }}</span></el-form-item>
        <el-form-item label="打款账户："><span>{{ accountInfo.bmBackAccount }}</span></el-form-item>
        <el-form-item label="打款账号："><span>{{ accountInfo.bmBackAccountNumber }}</span></el-form-item>
        <el-form-item label="返款比例："><span>{{ accountInfo.bmBackBl }}</span></el-form-item>
        <el-form-item label="退款银行："><span>{{ accountInfo.bmBackType }}</span></el-form-item>
        <el-form-item label="银行卡号：" v-if="accountInfo.bmBackType!='支付宝'" ><span>{{ accountInfo.bmMakeAccount }}</span></el-form-item>
        <el-form-item label="备注："><span>{{ accountInfo.bmText }}</span></el-form-item>
      </el-form>
    </el-dialog>
       <el-dialog
      title="请选择返款时间"
      width="25%"
      :visible.sync="backTimeBox">
      <el-date-picker
      v-model="checkObj.bmMakeTime"
      type="date"
      placeholder="选择日期"
      required>
    </el-date-picker>
    <el-button type="warning" @click="submitBackTime" style="margin-left:10px;">提交</el-button>
    </el-dialog>
     <el-dialog
      title="请填写拒绝原因"
      width="40%"
      :visible.sync="rejectBox">
     <el-input
      type="textarea"
      autosize
      placeholder="请输入内容"
      v-model="checkObj.bmByzd">
    </el-input>
    <el-button type="warning" size="mini"  @click="submitReject" style="margin-top:20px;">提交</el-button>
    </el-dialog>

  </div>
</template>

<script>
import {PRE_URL,getBackMoney,getUserByList, getDeptByList,getGroupByList,updateBackMoney,getGoodsDetail} from '@/api'
import Page from '@/components/page'
import { getUser } from '../../utils/auth'
export default {
    components: {
    Page
  },
  data () {
    return {
      form: {
        bmDeptId:getUser().type==0?null:getUser().deptId,
        bmGroupId:getUser().type==0?null:getUser().groupId,
      },
      moneyBackTableData: [
        // { name: 'name', id: 1 }
      ], // 返款的表格数据
      statusOptions: [
        { label: '全部', value: '' },
        { label: '通过', value: '通过' },
        { label: '拒绝', value: '拒绝' },
        { label: '待修改', value: '待修改' },
      ],
      moreRecordsByShopVisiable: false,
      moreRecordsByShopTableData: [
        { name: 'name', id: 1 }
      ], // 此店铺下同属这笔款的商品列表数据
      originTableData: [
        { name: 'name', id: 1 }
      ], // 返款来源表格数据
      accountInfoVisiable: false,
      accountInfo: {},
      loading: false,
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
       page1: {
        pageSize: 5,
        pageNum: 1,
        total: 0,
      },
       userList:[],
      groupList:[],
      deptList:[],
      PRE_URL,
      type:getUser().type,
      backTimeBox:false,
      rejectBox:false,
      checkObj:{},
    }
  },
  mounted(){
    this.getUserList()
    this.getDeptList()
    this.getGroupList()
    this.bindData()
  },
  methods: {
    resubmit(item){
        this.$router.push({ path: '/cooperationDetail/checking',query:{bmId:item.bmId}})
    },
      checkForNo(item){
      this.rejectBox= true,
      this.checkObj = item
    },
    checkForYes(item){
      this.backTimeBox = true
      this.checkObj = item
    },
    submitBackTime(){
      console.log(this.checkObj.bmMakeTime)
      if (this.checkObj.bmMakeTime && this.checkObj) {
      this.checkObj.bmConfirmType ='通过'
      this.checkObj.bmCreateTime = new Date(this.checkObj.bmCreateTime)
        updateBackMoney(this.checkObj).then(res=>{
            if (res.success) {
              this.$sucmsg(res.message)
            }else{
              this.$errmsg(res.message)
            }
            this.backTimeBox = false
            this.bindData()
        })
      }else{
        this.$errmsg("请选择到款日期")
      }
    },
  submitReject(){
    if (this.checkObj.bmByzd && this.checkObj) {
          this.checkObj.bmMakeTime = new Date(this.checkObj.bmMakeTime)
          this.checkObj.bmCreateTime = new Date(this.checkObj.bmCreateTime)
          this.checkObj.bmConfirmType = '拒绝'
          updateBackMoney(this.checkObj).then(res=>{
              if (res.success) {
                this.$sucmsg(res.message)
              }else{
                this.$errmsg(res.message)
              }
              this.rejectBox = false
              this.bindData()
          })
    }else{
       this.$errmsg("请填写拒绝理由")
    }
    },
    downloadFile(){
      downloadDetail("moban").then(res=>{
        console.loading(res)
      })
    },
      getDeptList () {
      getDeptByList().then(res => {
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
    bindData(){
      const form = this.form
      const page = this.page.pageNum
      const rows = this.page.pageSize
      this.loading = true
      getBackMoney(form, page, rows).then(res=>{
           res.rows.forEach((item,index)=>{
              let list =["bmOfflineTime","bmOnlineTime","bmMakeTime","bmCreateTime"]
              list.forEach(obj=>{
                item[obj+'1'] = item[obj]?this.getMyDate(item[obj]):''
              })
              this.deptList.forEach(obj=>{
                if(item.bmDeptId == obj.deptId){
                  item.dep = obj.deptName
                }
              })
              this.groupList.forEach(obj=>{
                if(item.bmDeptId == obj.groupDeptId && item.bmGroupId == obj.groupId){
                  item.group = obj.groupName
                  // item.dep = obj.groupName
                }
              })
              this.userList.forEach(obj=>{
                if(item.bmUserId ==obj.id ){
                  item.creater = obj.username
                }
              })
      
          })
        this.moneyBackTableData=res.rows
        this.page.total = res.total
      console.log(res.rows)

      })
    },
    showMoreRecords (goodsFid,shopName) {
       this.moreRecordsByShopTableData=[]
      if (!goodsFid) {
        
      }else{
      getGoodsDetail({goodsFid}).then(res=>{
        if (res.rows[0]) {
           res.rows.forEach((item,index)=>{
            item.goodsEndtime =  item.goodsEndtime?this.getMyDate(item.goodsEndtime):''
            item.goodsStarttime = item.goodsEndtime?this.getMyDate(item.goodsStarttime):''
            item.goodsShopName = shopName
           this.groupList.forEach(obj=>{
                if(item.goodsGroupId == obj.groupId && item.goodsDeptId == obj.groupDeptId){
                  item.goodsGroupId = obj.groupName
                }
              })
              this.userList.forEach(obj=>{
                if(item.goodsUserId ==obj.id ){
                  item.goodsUserId = obj.username
                }
              })
              this.deptList.forEach(obj=>{
                if(item.goodsDeptId == obj.deptId){
                  item.goodsDeptId = obj.deptName
                }
              })
            })
        }
         this.moreRecordsByShopTableData = res.rows
            console.log(res.rows)
       
      })
      }
      this.moreRecordsByShopVisiable = true
    },
    showAccountInfo (item) {
      this.accountInfoVisiable = true
      this.accountInfo = item
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
.title {
  padding: 10px;
  background: #eee;
  margin-bottom: 10px;
  font-size: 16px;
  font-weight: 600
}
.link {
  color: blue;
  text-decoration: underline;
  cursor: pointer;
}
</style>
