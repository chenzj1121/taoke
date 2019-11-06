<template>
  <div>
    <el-row>
      <el-button size="mini" @click="back">返回</el-button>
      <el-button type="primary" size="mini" @click="updateInfo">信息修改</el-button>
    </el-row>
    <el-row>
      <div class="title">项目基本信息</div>
      <Form :form="form" :writeable="false"/>
    </el-row>
    <el-row>
      <hr/>
      <el-button size="mini" type="primary" @click="nav2CooperationDetail">订单提报</el-button>
      <el-button size="mini" type="primary" @click="checkMoney">查款</el-button>
      <el-button size="mini" type="primary">合同单录入</el-button>
      <div class="title">合作记录</div>
      <el-table
        size="mini"
        border
        :data="cooperationRecordTableData"
        style="width: 100%;">
        <el-table-column type="selection" width="55"></el-table-column>
        <el-table-column label="序号" type="index"></el-table-column>
        <el-table-column label="提报状态" prop="name"></el-table-column>
        <el-table-column label="平台状态" prop="name"></el-table-column>
        <el-table-column label="商品主图" prop="name"></el-table-column>
        <el-table-column label="商品活动" prop="name"></el-table-column>
        <el-table-column label="商品ID" prop="name"></el-table-column>
        <el-table-column label="券后价" prop="name"></el-table-column>
        <el-table-column label="优惠券总量" prop="name"></el-table-column>
        <el-table-column label="佣金比例" prop="name"></el-table-column>
        <el-table-column label="结算金额" prop="name"></el-table-column>
        <el-table-column label="回款金额" prop="name"></el-table-column>
        <el-table-column label="服务费" prop="name"></el-table-column>
      </el-table>
    </el-row>
    <el-row>
      <div class="title">跟进记录</div>
      <el-table
        size="mini"
        border
        :data="followRecordTableData"
        style="width: 100%;">
        <el-table-column label="序号" type="index"></el-table-column>
        <el-table-column label="跟进时间" prop="name"></el-table-column>
        <el-table-column label="跟进记录" prop="name"></el-table-column>
        <el-table-column label="操作人" prop="name"></el-table-column>
        </el-table>
    </el-row>
    <el-row>
      <div class="title">历史记录</div>
      <el-table
        size="mini"
        border
        :data="historyRecordTableData"
        style="width: 100%;">
        <el-table-column label="序号" type="index"></el-table-column>
        <el-table-column label="修改时间" prop="name"></el-table-column>
        <el-table-column label="负责人" prop="name"></el-table-column>
        <el-table-column label="修改内容" prop="name"></el-table-column>
        </el-table>
    </el-row>
  </div>
</template>

<script>
/**
 * @description 商店详情
 */
import {getShopById,getCooperationPage,getDeptByList,getGroupByList,getUserByList } from "@/api"
import Form from './form'
export default {
  components: {
    Form
  },
  data () {
    return {
      form: {},
      id: this.$route.query.id || 1,
      writeable: false,
      cooperationRecordTableData: [],
      followRecordTableData: [],
      historyRecordTableData: [],
      shopInfo:{},
      deptList:[],
      groupList:[],
      userList:[],
    }
  },
  mounted(){
    this.getUserList()
    this.getGroupList()
    this.getDeptList()
    this.getShopInfo(this.$route.query.id)
  },
  methods: {
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
    checkMoney(){
      // getCooperationPage({shopBossId:this.form.id},1,10).then(res=>{
      //   console.log(res)

      // })
       this.$router.push({path: 'checking',name:"check",query: {id:this.form.id}})
    },
    getShopInfo(id){
      getShopById(id).then(item=>{
          this.groupList.forEach(obj=>{
            item.createTime = this.getMyDate(item.createTime)
            item.nextTime = this.getMyDate(item.nextTime)
                if(item.shopDeptId == obj.groupId && item.shopGroupId == obj.groupDeptId){
                  item.shopGroupId = obj.groupName
                }
              })
              this.userList.forEach(obj=>{
                if(item.shopUseId ==obj.id ){
                  item.shopUseId = obj.username
                }
                if (item.shopUserId2 == obj.id) {
                  item.shopUserId2 = obj.username
                }
              })
              this.deptList.forEach(obj=>{
                if(item.shopDeptId == obj.deptId){
                  item.shopDeptId = obj.deptName
                }
              })
        this.form = item
      })
    },
    updateInfo () {
      // this.writeable = true
      this.$router.push({path:"/pubilc/update",name:"updatePublic",query:{id:this.id}})
    },
    nav2CooperationDetail () {
      const id  = this.$route.query.id
      this.$router.push({path: '/customer/cooperationDetail',name:"cooperationDetail", params:this.form})
    },
    back () {
      this.$router.go(-1)
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
  font-size: 18px;
  font-weight: 600;
  text-align: center;
  margin: 15px 0;
  background: #eee;
  padding: 10px 0;
}
</style>
