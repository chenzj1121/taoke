<template>
  <div>
    <div class="title">查款管理</div>
    <el-form inline size="mini" label-position="left" label-width="120px;">
      <el-form-item label="店铺名称：">
        <el-input v-model="form.cmShopName"></el-input>
      </el-form-item>
      <el-form-item label="优惠券名称：">
        <el-input v-model="form.cmYhqName"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="申请时间：">
        <el-date-picker
          v-model="form.cmApplyTime"
          type="datetime"
          value-format="yyyy年mm月dd日">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.cmApplyTimeEnd"
          type="datetime"
          value-format="yyyy年mm月dd日">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="到款时间：">
        <el-date-picker
          v-model="form.cmBackTime"
          type="datetime"
          value-format="yyyy年mm月dd日">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.cmBackTimeEnd"
          type="datetime"
          value-format="yyyy年mm月dd日">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="状态：">
        <el-select v-model="form.cmType">
          <el-option v-for="(option, index) in statusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="结算金额排序：">
        <el-select v-model="form.cmJsMoney">
          <el-option v-for="(option, index) in orderByOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="服务费金额统计：">
        <el-input type="number" v-model="cmFwPrice"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="bindData">查询</el-button>
        <el-button @click="() => {this.form = {}; this.bindData()}">重置</el-button>
      </el-form-item>
    </el-form>

    <el-table
      size="mini"
      v-loading="loading"
      :data="checkingTableData">
      <el-table-column type="selection"></el-table-column>
      <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column prop="cmType" label="查款状态">
         <template slot-scope="scope">
           <el-popover
            placement="right"
            trigger="click">
            <div style="text-align: center;">
              <div  v-if="scope.row.cmType=='待审核'">
              <p style="padding:10px 0;text-align:left" >您正在进行查款审核操作</p>
              <el-button size="mini" type="warning" @click="checkForYes(scope.row)">通过</el-button>
              <el-button size="mini" type="danger" @click="checkForNo(scope.row)">拒绝</el-button>
              </div>
              <div v-if="scope.row.cmType=='拒绝'">
                <p style="padding:10px 0;text-align:left">拒绝理由如下:</p>
                <p style="color:red;">{{scope.row.cmBeiyong}}</p>
              </div>
            </div>
            <!-- <el-button slot="reference" type="danger" >拒绝</el-button> -->
            <el-button slot="reference" :disabled="(type!=0 || scope.row.cmType=='通过')?(scope.row.cmType=='拒绝'?false:true):false " size="mini" :type="scope.row.cmType=='拒绝'?'danger':(scope.row.cmType=='待审核'?'warning':'')">{{scope.row.cmType=='拒绝'?scope.row.cmType+'(查看)':scope.row.cmType}}</el-button>
           </el-popover>
         </template>
      </el-table-column>
      <el-table-column prop="cmSellDeptName" label="销售部"></el-table-column>
      <el-table-column prop="cmDeptName" label="部门"></el-table-column>
      <el-table-column prop="cmUserName" label="责任人"></el-table-column>
      <el-table-column prop="cmShopName" label="店铺名称">
        <template slot-scope="scope">
          <span class="link" @click="showOtherRecords(scope.row.cmShopId,scope.row.cmShopName)">{{ scope.row.cmShopName }}</span>
        </template>
      </el-table-column>
      <el-table-column prop="cmShopType" label="类型"></el-table-column>
      <el-table-column prop="cmJsMoney" label="结算金额"></el-table-column>
      <el-table-column prop="cmFkMoney" label="返款金额"></el-table-column>
      <el-table-column prop="cmSyMoney" label="剩余金额"></el-table-column>
      <el-table-column prop="cmJsNums" label="结算量"></el-table-column>
      <el-table-column prop="cmFwPrice" label="服务费单价"></el-table-column>
      <el-table-column prop="cmYhqPhoto" label="优惠券截图">
        <template slot-scope="scope">
          <!-- <img :src="`${PRE_URL}/`+scope.row.cmYhqPhoto"  min-width="70" height="70"> -->
            <el-image 
            style="width: 70px; height: 70px"
            :src="`${PRE_URL}/`+scope.row.cmYhqPhoto" 
            :preview-src-list="[`${PRE_URL}/${scope.row.cmYhqPhoto}`]">
          </el-image>
        </template>
      </el-table-column>
      <el-table-column prop="name" label="打款截图">
         <template slot-scope="scope">
          <!-- <img :src="`${PRE_URL}/`+scope.row.cmDkPhote"  min-width="70" height="70"> -->
           <el-image 
            style="width: 70px; height: 70px"
            :src="`${PRE_URL}/`+scope.row.cmDkPhote" 
            :preview-src-list="[`${PRE_URL}/${scope.row.cmDkPhote}`]">
          </el-image>
        </template>
      </el-table-column>
      <el-table-column prop="cmLoadCustomer" label="转入账户"></el-table-column>
      <el-table-column prop="cmApplyTime" label="申请时间"></el-table-column>
    
      <el-table-column prop="cmYhqName" label="优惠券名称"></el-table-column>
      <el-table-column prop="cmBackTime" label="到款时间"></el-table-column>
      <el-table-column prop="cmText" label="备注"></el-table-column>
      <el-table-column prop="cmYhqType" label="券截图">
         <template slot-scope="scope">
           <el-image 
            style="width: 70px; height: 70px"
            :src="`${PRE_URL}/`+scope.row.cmYhqType" 
            :preview-src-list="[`${PRE_URL}/${scope.row.cmYhqType}`]">
          </el-image>
          <!-- <img :src="`${PRE_URL}/`+scope.row.cmYhqType"  min-width="70" height="70"> -->
        </template>
      </el-table-column>
      <el-table-column label="再次提交" width="120px">
        <template slot-scope="scope">
          <el-button v-if="scope.row.cmType!='通过'" size="mini" type="success" @click="reSubmit(scope.row)">再次提交</el-button>
        </template>
      </el-table-column>
    </el-table>
    <Page style="text-align:right;margin-top:10px;" :page="page" @change="bindData"/>

    <el-dialog
      title="此店铺下同属这笔款的商品记录"
      width="80%"
      :visible.sync="otherRecordsVisiable">
      <el-table
        style="width: 100%;"
        size="mini"
        :data="otherRecordsTableData">
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
    <!-- <Page style="text-align:right;margin-top:10px;" :page="page1" @change="bindData"/> -->
    </el-dialog>
    <el-dialog
      title="请选择到款时间"
      width="25%"
      :visible.sync="backTimeBox">
      <el-date-picker
      v-model="checkObj.cmBackTime"
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
      v-model="checkObj.cmBeiyong">
    </el-input>
    <el-button type="warning" size="mini"  @click="submitReject" style="margin-top:20px;">提交</el-button>
    </el-dialog>
  </div>
</template>

<script>
import Page from '@/components/page'
import { getCheckmonkeyPage,getDeptByList,getGroupByList,getUserByList ,getGoodsDetail,PRE_URL,upCheckMoney,getCheckmonkeyNum} from '@/api'
import { getUser } from '../../utils/auth'
export default {
  components: {
    Page
  },
  mounted () {
    this.getUserList()
    this.getGroupList()
    this.getDeptList()
    this.bindData()
    this.type = getUser().type
  },
  data () {
    return {
      form: {
        cmApplyTimeEnd:null,
        cmBackTimeEnd:null,
      },
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
       page1: {
        pageSize: 5,
        pageNum: 1,
        total: 0
      },
      loading: false,
      statusOptions: [
        { label: '全部', value: null },
        { label: '待审核', value: '待审核' },
        { label: '通过', value: '通过' },
        { label: '拒绝', value: '拒绝' },
      ],
      orderByOptions: [
        { label: '全部', value: ' ' },
        { label: '由高到低', value: '2' },
        { label: '由低到高', value: '1' }
      ],
      checkingTableData: [
        { name: 'name', id: 1 }
      ],
      otherRecordsTableData: [
        { name: 'name', id: 1 }
      ],
      otherRecordsVisiable: false,
        deptList:[],
        groupList:[],
        userList:[],
        PRE_URL,
        type:2,
        backTimeBox:false,
        rejectBox:false,
        checkObj:{},
        cmFwPrice:0,
    }
  },
  methods: {
    checkForNo(item){
      this.rejectBox= true,
      this.checkObj = item
    },
    checkForYes(item){
      this.backTimeBox = true
      this.checkObj = item
    },
    submitBackTime(){
      console.log(this.checkObj.cmBackTime)
      if (this.checkObj.cmBackTime && this.checkObj) {
      this.checkObj.cmType ='通过'
      this.checkObj.cmApplyTime = new Date(this.checkObj.cmApplyTime)
        upCheckMoney(this.checkObj).then(res=>{
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
    if (this.checkObj.cmBeiyong && this.checkObj) {
          this.checkObj.cmApplyTime = new Date(this.checkObj.cmApplyTime)
          this.checkObj.cmBackTime = new Date(this.checkObj.cmBackTime)
          this.checkObj.cmType = '拒绝'
          upCheckMoney(this.checkObj).then(res=>{
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
    reSubmit(item){
      console.log(item)
      this.$router.push({ path: '/cooperationDetail/checking',query:{id:item.cmShopId,cid:item.cmId}})
    },
    getUserList(){
      getUserByList().then(res=>{
        this.userList = res
      })
    },
     getDeptList () {
      getDeptByList().then(res => {
        this.deptList = res
      })
    },
    getGroupList() {
      getGroupByList().then(res => {
        this.groupList = res
      })
    },
    showOtherRecords (cmShopId,shopName) {
      getGoodsDetail(cmShopId).then(res=>{
        if (res[0]) {
           res.forEach((item,index)=>{
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
            this.otherRecordsTableData = res
            console.log(res)
        }
       
      })
      this.otherRecordsVisiable = true
    },
    bindData () {
      const page = this.page.pageNum
      const rows = this.page.pageSize
      const params = this.form
      this.loading = true
      getCheckmonkeyNum(params, page, rows).then(res=>{
          this.cmFwPrice = res
      })
      getCheckmonkeyPage(params, page, rows,this.form.cmApplyTimeEnd,this.form.cmBackTimeEnd).then(res => {
          res.rows.forEach((item,index)=>{
              item.cmApplyTime =item.cmApplyTime? this.getMyDate(item.cmApplyTime):''
              item.cmBackTime =  item.cmBackTime?this.getMyDate(item.cmBackTime):''
              this.groupList.forEach(obj=>{
                if(item.cmSellDept == obj.groupId && item.cmDept == obj.groupDeptId){
                  item.cmSellDeptName = obj.groupName
                }
              })
              this.userList.forEach(obj=>{
                if(item.cmUserId ==obj.id ){
                  item.cmUserName = obj.username
                }
              })
              this.deptList.forEach(obj=>{
                if(item.cmDept == obj.deptId){
                  item.cmDeptName = obj.deptName
                }
              })
            })
            
        console.log(res)
        this.checkingTableData = res.rows
        this.page.total = res.total
        this.loading = false
      })
        .catch(() => {
          this.loading = false
        })
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
}
.link {
  color: blue;
  text-decoration: underline;
  cursor: pointer;
}
.el-date-editor.el-input, .el-date-editor.el-input__inner {
  width: 130px;
}
</style>
