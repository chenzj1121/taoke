<template>
  <div>
    <div class="title">退/返款操作</div>
    <el-form
      inline
      size="mini"
      label-width="100px">
      <el-form-item label="店铺名称：">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="商品ID：">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="优惠券名称：">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="上线时间：">
        <el-date-picker v-model="form.name"></el-date-picker>
      </el-form-item>
      <el-form-item label="下线时间：">
        <el-date-picker v-model="form.name"></el-date-picker>
      </el-form-item>
      <el-form-item label="状态：">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in statusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="primary">查询</el-button>
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
      <el-table-column prop="dep" label="销售部"></el-table-column>
      <el-table-column prop="group" label="组别"></el-table-column>
      <el-table-column prop="creater" label="销售人"></el-table-column>
      <el-table-column label="店铺名称">
        <template slot-scope="scope">
          <span class="link" @click="showMoreRecords(scope.row.bmId)">{{scope.row.bmShopName}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="bmShopName" label="商品ID"></el-table-column>
      <el-table-column prop="bmYhqName" label="优惠券名称"></el-table-column>
      <el-table-column prop="bmOnlineTime" label="上线时间"></el-table-column>
      <el-table-column prop="bmOfflineTime" label="下线时间"></el-table-column>
      <el-table-column prop="bmType" label="操作类型"></el-table-column>
      <el-table-column prop="bmMakeMoney" label="打款金额"></el-table-column>
      <el-table-column prop="bmBackMoney" label="返/退款金额"></el-table-column>
      <el-table-column prop="bmSurplus" label="剩余金额"></el-table-column>
      <el-table-column prop="bmBackAccountNumber" label="打款账户">
        <template slot-scope="scope">
          <span class="link" @click="showAccountInfo(scope.row.id)">{{scope.row.bmBackAccountNumber}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="bmMakeTime" label="打款时间"></el-table-column>
      <el-table-column prop="bmCreateTime" label="申请时间"></el-table-column>
      <el-table-column prop="bmText" label="备注"></el-table-column>
      <el-table-column prop="bmYhqPhoto" label="优惠券图片">
        <template slot-scope="scope">
          <img src="http://iph.href.lu/200x200"  min-width="70" height="70">
        </template>
      </el-table-column>
      <el-table-column prop="bmConfirmType" label="确认状态"></el-table-column>
      <el-table-column prop="bm_back_type" label="再次提交">
        
      </el-table-column>
      <el-table-column prop="bmMakePhoto" label="打款截图">
         <template slot-scope="scope">
          <img src="http://iph.href.lu/200x200"  min-width="70" height="70">
        </template>
      </el-table-column>
    </el-table>
    <Page style="text-align:right;margin-top:10px;" :page="page" @change="bindData"/>

    <el-dialog
      title="此店铺下同属这笔款的商品记录"
      width="80%"
      :visible.sync="moreRecordsByShopVisiable">
      <el-row type="flex" justify="space-between">
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
      </el-row>
      <el-table
        style="width: 100%;"
        size="mini"
        :data="moreRecordsByShopTableData">
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column label="店铺名称" prop="bmShopName"></el-table-column>
        <el-table-column label="商品ID" prop="bmGoodsId"></el-table-column>
        <el-table-column label="优惠券名称" prop="name"></el-table-column>
        <el-table-column label="上线时间" prop="name"></el-table-column>
        <el-table-column label="下线时间" prop="name"></el-table-column>
        <el-table-column label="操作类型" prop="name"></el-table-column>
        <el-table-column label="打款金额" prop="name"></el-table-column>
        <el-table-column label="打款账户" prop="name"></el-table-column>
        <el-table-column label="打款日期" prop="name"></el-table-column>
        <el-table-column label="转入账户" prop="name"></el-table-column>
        <el-table-column label="打款日期" prop="name"></el-table-column>
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
        <el-form-item label="销售花名："><span>{{ accountInfo.name }}</span></el-form-item>
        <el-form-item label="返/退款金额："><span>{{ accountInfo.name }}</span></el-form-item>
        <el-form-item label="打款账户："><span>{{ accountInfo.name }}</span></el-form-item>
        <el-form-item label="打款账号："><span>{{ accountInfo.name }}</span></el-form-item>
        <el-form-item label="返款比例："><span>{{ accountInfo.name }}</span></el-form-item>
        <el-form-item label="退款银行："><span>{{ accountInfo.name }}</span></el-form-item>
        <el-form-item label="备注："><span>{{ accountInfo.name }}</span></el-form-item>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
import {getBackMoney,getUserByList, getDeptByList,getGroupByList} from '@/api'
import Page from '@/components/page'
export default {
    components: {
    Page
  },
  data () {
    return {
      form: {},
      moneyBackTableData: [
        // { name: 'name', id: 1 }
      ], // 返款的表格数据
      statusOptions: [
        { label: '全部', value: 'name' },
        { label: '待确认', value: 'name' },
        { label: '已确认', value: 'name' },
        { label: '退回', value: 'name' },
        { label: '已打款', value: 'name' }
      ],
      moreRecordsByShopVisiable: false,
      moreRecordsByShopTableData: [
        { name: 'name', id: 1 }
      ], // 此店铺下同属这笔款的商品列表数据
      originTableData: [
        { name: 'name', id: 1 }
      ], // 返款来源表格数据
      accountInfoVisiable: false,
      accountInfo: {
        name: 'name'
      },
      loading: false,
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
       page1: {
        pageSize: 5,
        pageNum: 1,
        total: 10
      },
       userList:[],
      groupList:[],
      deptList:[],
    }
  },
  mounted(){
    this.getUserList()
    this.getDeptList()
    this.getGroupList()
    this.bindData()
  },
  methods: {
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
                item[obj] = this.getMyDate(item[obj])
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
    showMoreRecords (id) {
      this.moreRecordsByShopVisiable = true
    },
    showAccountInfo () {
      this.accountInfoVisiable = true
    },
    getMyDate(str) {
    var oDate = new Date(str)
    let oYear = oDate.getFullYear()
    let oMonth = oDate.getMonth()+1
    let oDay = oDate.getDate()
    let oTime = oYear +'-'+ oMonth +'-'+oDay
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
