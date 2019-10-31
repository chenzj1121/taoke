<template>
    <div>
        <div class="title">提报管理</div>
         <el-form inline size="mini" label-position="left" label-width="120px;" ref="form" :model="form">
      <el-form-item label="店铺名称：">
        <el-input v-model="form.coopCustomer"></el-input>
      </el-form-item>
      <el-form-item label="商品ID：">
        <el-input v-model="form.coopGoodsId"></el-input>
      </el-form-item>
      <br>
      <el-form-item label="提交时间：">
        <el-date-picker
          v-model="form.coopTbTime"
          type="date">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="TbMaxTime"
          type="date">
        </el-date-picker>
      </el-form-item>
      <br>
       <el-form-item label="上线时间：">
        <el-date-picker
          v-model="form.coopStartTime"
          type="date">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.coopStartTimeEnd"
          type="date">
        </el-date-picker>
      </el-form-item>
      <br>
       <el-form-item label="下线时间：">
        <el-date-picker
          v-model="form.coopEndTime"
          type="date">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.coopEndTimeEnd"
          type="date">
        </el-date-picker>
      </el-form-item>
      <br>
      <el-form-item label="部门:" label-width="60px">
            <div>
              <el-select v-model="form.coopDeptId" placeholder="请选择" @change="getGroup(form.coopDeptId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  deptList" :key="i" :value="item.deptId" :label="item.deptName"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="组别:" label-width="60px">
            <div>
              <el-select v-model="form.shopGroupId" placeholder="请选择" @change="getMember(form.coopDeptId,form.shopGroupId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  gruopList2" :key="i" :value="item.groupId" :label="item.groupName"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="部门人员:" label-width="80px">
            <div>
              <el-select v-model="form.coopUserId" placeholder="请选择" >
                <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  memberList" :key="i" :value="item.id" :label="item.username"></el-option>
              </el-select>
            </div>
          </el-form-item>
      <br>
      <el-form-item>
        <el-button type="primary" @click="bindData">查询</el-button>
        <el-button @click="() => {this.form = {}; this.bindData()}">重置</el-button>
      </el-form-item>
       <el-form-item>
        <el-button type="primary">手动分配</el-button>
        <el-button type="primary">批量审核</el-button>
      </el-form-item>
    </el-form>
     <el-table
        style="width: 100%;"
        :row-style="{maxHeight:'80px'}"
        :header-cell-style="{ textAlign: 'center', background: '#eee' }"
         size="mini"
        v-loading="loading"
        :data="cooperationDetailTableData"
      >
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column label="提交时间" prop="coopTbtime"></el-table-column>
        <el-table-column label="审核时间" prop="shengheTime"></el-table-column>
        <el-table-column label="店铺名称" prop="coopCustomer"></el-table-column>
        <el-table-column label="活动类型" prop="coopActivity"></el-table-column>
        <el-table-column label="商品ID" prop="coopGoodsId"></el-table-column>
        <el-table-column label="券后价" prop="coopAlterprice"></el-table-column>
        <el-table-column label="佣金比例" prop="coopYjscale"></el-table-column>
        <el-table-column label="优惠券信息" prop="coopYhqName"></el-table-column>
        <el-table-column label="商品主图"  prop="coopMainpicture">
            <template slot-scope="scope" >
                <img :src="scope.row.coopMainpicture" min-width="50" height="50" alt="">
            </template>
        </el-table-column>
        <el-table-column label="营销主图"   prop="coopPicture">
             <template slot-scope="scope" >
                <img :src="scope.row.coopPicture" min-width="50" height="50" alt="">
            </template>
        </el-table-column>
        <el-table-column label="部门" prop="coopDeptId"></el-table-column>
        <!-- <el-table-column label="组别" prop="dakuanriqi"></el-table-column> -->
        <el-table-column label="销售人员" prop="coopUserId"></el-table-column>
        <el-table-column label="上线时间" prop="coopStarttime"></el-table-column>
        <el-table-column label="是否零点提报" prop="coopZero"></el-table-column>
        <el-table-column label="提报状态" prop="coopTbtype">
           <template slot-scope="scope" >
             <p :class="scope.row.coopTbtype=='待审核'?'shenhe':'jieshu'">{{scope.row.coopTbtype}}</p>
             <p class="checkReject" v-if="scope.row.coopTbtype=='拒绝'">(查看)</p>
           </template>
        </el-table-column>
        <el-table-column label="提报人员" prop="coopShenheId"></el-table-column>
        <el-table-column label="审核" >
           <template slot-scope="scope" >
            <p v-if="scope.row.coopTbtype=='拒绝' ||scope.row.coopTbtype=='通过' ">已审核</p> 
            <el-button  v-if="scope.row.coopTbtype=='待审核'" type="primary" size="mini" @click="check(scope.row.coopId)">审核</el-button>
          </template>
        </el-table-column>
        <el-table-column label="查看">
         <template slot-scope="scope" >
            <el-button type="primary" size="mini" @click="viewCoop(scope.row.coopId)">查看</el-button>
         </template>
        </el-table-column>
      </el-table>
    <Page style="text-align: right;margin-top: 10px;" :page="page" @change="bineData()" />
    </div>
</template>
<script>
import Page from '@/components/page'
import {getUserByList,getDeptByList,getGroupByList,getUserById,getGroupMember,getCooperationPage} from '@/api'
import {getUser} from "@/utils/auth"

export default {
    components:{
        Page
    },
    data(){
        return{
            form:{},
            deptList:[],
            userList:[],
            gruopList2:[],//部门联动-小组
            memberList:[],//部门联动-员工
            type:2,
            page: {
                pageSize: 10,
                pageNum: 1,
                total: 10
            },
            loading:false,
            cooperationDetailTableData:[],
            TbMaxTime:null,
        }
    },
    mounted(){
        this.type = getUser().type;
        this.getDeptList()
        this.getUserList()
        this.getGroupList()
        this.bindData()
    },
    methods:{
      check(coopId){
        if (coopId) {
          this.$router.push({ path: '/customer/cooperationDetail',name:'cooperationDetail',query:{coopId,check:true}})
        }else{
          this.$errmsg("无数据")
        }
      },
      viewCoop(coopId){
        if (coopId) {
          this.$router.push({ path: '/customer/cooperationDetail',name:'cooperationDetail',query:{coopId,view:true}})
        }else{
          this.$errmsg("无数据")
        }
      },
    getUserList(){
      getUserByList().then(res=>{
        this.userList = res
      })
    },
    getGroup(id){
        this.form.shopGroupId = null;
        if( this.form.coopUserId){ this.form.coopUserId = null;}
        this.gruopList2 = []
        this.memberList = []
      if(id){
      this.groupList.map(item=>{
        if(item.groupDeptId==id){
          this.gruopList2.push(item)
        }
      })
      }
    },
    getMember(deptId,groupId){
        if( this.form.coopUserId){ this.form.coopUserId = null;}
      this.memberList = [];
      if(deptId && groupId){
        getGroupMember(deptId,groupId).then(res=>{
          this.memberList = res
        })
      }
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
    bindData(){
    const form = this.form
      const page = this.page.pageNum
      const rows = this.page.pageSize
      this.loading = true
      getCooperationPage(form, page,rows,this.TbMaxTime,this.form.coopStartTimeEnd,this.form.coopEndTimeEnd).then(res => {
         res.rows.forEach((item,index)=>{
             item.coopTbtime = this.getMyDate(item.coopTbtime)
             item.coopStarttime = this.getMyDate(item.coopStarttime)
            //  item.shengheTime
            // this.groupList.forEach((obj)=>{
            //      if(item.deptId == obj.groupDeptId && item.groupId ==obj.groupId){
            //           item.groupName = obj.groupName
            //           item.deptName = obj.groupName
            //       }
            //   })
              this.deptList.forEach(obj=>{
                if(item.coopDeptId == obj.deptId ){
                  item.coopDeptId = obj.deptName
                }
              })
              this.userList.forEach(obj=>{
                if(item.coopUserId ==obj.id ){
                  item.coopUserId = obj.username
                }
                if (item.coopShenheId==obj.id) {
                  item.coopShenheId = obj.username
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
<style scoped>
.title {
  padding: 10px;
  background: #eee;
  margin-bottom: 10px;
}
.shenhe{
  font-size:14px;
  color:"red";
  font-weight:bold;
}
.jieshu{
color: gray;
}
.checkReject{
  display:inline;
  cursor: pointer;
  color: blue;
}
</style>