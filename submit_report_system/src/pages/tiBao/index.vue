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
      <div v-if="type ==4||type==0" >
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
          </div>
      <br>
      <el-form-item>
        <el-button type="primary" @click="bindData">查询</el-button>
        <el-button @click="() => {this.form = {}; this.bindData()}">重置</el-button>
      </el-form-item>
       <el-form-item v-if="type ==4||type==0">
        <el-button type="primary" @click="distribution">手动分配</el-button>
        <el-button type="primary" @click="batchReview">批量审核</el-button>
      </el-form-item>
    </el-form>
     <el-table
        style="width: 100%;"
        :row-style="{maxHeight:'80px'}"
        :header-cell-style="{ textAlign: 'center', background: '#eee' }"
         size="mini"
        v-loading="loading"
        :data="cooperationDetailTableData"
        ref="multipleTable"
        @selection-change="handleSelectionChange"
      >
        <el-table-column type="selection" width="55"></el-table-column>
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column label="提交时间" prop="coopTbtime"></el-table-column>
        <el-table-column label="审核时间" prop="coopShenheTime"></el-table-column>
        <el-table-column label="店铺名称" prop="coopCustomer"></el-table-column>
        <el-table-column label="活动类型" prop="coopActivity"></el-table-column>
        <el-table-column label="商品ID" prop="coopGoodsId"></el-table-column>
        <el-table-column label="券后价" prop="coopAlterprice"></el-table-column>
        <el-table-column label="佣金比例" prop="coopYjscale"></el-table-column>
        <el-table-column label="优惠券信息" prop="coopYhqName"></el-table-column>
        <el-table-column label="商品主图"  prop="coopMainpicture">
            <template slot-scope="scope" >
                <!-- <img :src="scope.row.coopMainpicture" min-width="50" height="50" alt=""> -->
                 <el-image 
                      style="width: 60px; height: 60px"
                      :src="scope.row.coopMainpicture" 
                      :preview-src-list="[`${scope.row.coopMainpicture}`]">
                  </el-image>
            </template>
        </el-table-column>
        <el-table-column label="营销主图"   prop="coopPicture">
             <template slot-scope="scope" >
                <!-- <img :src="scope.row.coopPicture" min-width="60" height="60" alt=""> -->
                  <el-image 
                      style="width: 60px; height: 60px"
                      :src="scope.row.coopPicture" 
                      :preview-src-list="[`${scope.row.coopPicture}`]">
                  </el-image>
            </template>
        </el-table-column>
        <el-table-column label="部门" prop="bumen"></el-table-column>
        <!-- <el-table-column label="组别" prop="dakuanriqi"></el-table-column> -->
        <el-table-column label="销售人员" prop="xiaoshou"></el-table-column>
        <el-table-column label="上线时间" prop="coopStarttime"></el-table-column>
        <el-table-column label="是否零点提报" prop="coopZero"></el-table-column>
        <el-table-column label="提报状态" prop="coopTbtype">
           <template slot-scope="scope" >
             <p :class="scope.row.coopTbtype=='待审核'?'shenhe':'jieshu'">{{scope.row.coopTbtype}}</p>
             <p class="checkReject" v-if="scope.row.coopTbtype=='拒绝'" @click="checkReason(scope.row)">(查看)</p>
           </template>
        </el-table-column>
        <el-table-column label="提报人员" prop="shenhe"></el-table-column>
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
    <Page style="text-align: right;margin-top: 10px;" :page="page" @change="bindData" />
    <ReasonBox v-if="viewReason" @func="closeBox" :data='reason'/>
     <el-dialog title="分配员工" :visible.sync="fenpei">
       <el-form>
         <el-form-item label="组别:" label-width="60px">
              <el-select v-model="form.shopGroupId" placeholder="请选择" @change="getMember(form.coopDeptId,form.shopGroupId)">
                <el-option v-for="(item,i) in  gruopList2" :key="i" :value="item.groupId" :label="item.groupName"></el-option>
              </el-select>
          </el-form-item>
          <el-form-item label="部门人员:" label-width="80px">
              <el-select v-model="form.coopUserId" placeholder="请选择" >
                <el-option v-for="(item,i) in  memberList" :key="i" :value="item.id" :label="item.username"></el-option>
              </el-select>
          </el-form-item>
          <el-button type="primary" size="mini" @click="fenpeiUser">确定</el-button>
          </el-form>
     </el-dialog>
    </div>
</template>
<script>
import Page from '@/components/page'
import ReasonBox from "@/components/reason"
import {getUserByList,getDeptByList,getGroupByList,getUserById,getGroupMember,getCooperationPage,updateCoop,fenpei} from '@/api'
import {getUser} from "@/utils/auth"
import axios from "axios"

export default {
    components:{
        Page,
        ReasonBox
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
            viewReason:false,
            reason:{},
            multipleSelection: [],
            sucList:0,
            errList:0,
            length:0,
            fenpei:false,
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
      fenpeiUser(){
        if (this.form.coopUserId) {
          let list = [];
            this.multipleSelection.forEach((item,index)=>{
              if (item.coopTbtype=='待审核') {
                   fenpei(item.coopId,this.form.coopUserId).then(res=>{
                        console.log(res)
                        if (res.success) {
                          this.$success(res.message)
                        }else{
                          this.$errmsg(res.message)
                        }
                    })
                // item.coopShenheId = this.form.coopUserId
                // item.coopTbtime = new Date(item.coopTbtime)
                // item.coopStarttime = new Date(item.coopStarttime)
                // item.coopShenheTime = new Date(item.coopShenheTime)
                // this.update(item,index)
              }else{
                this.$message("第"+(index*1+1)+'条已被审核,无法分配')
              }
            })
           
            this.form = {}
            this.bindData()
            this.fenpei = false;
        }else{
          this.$errmsg("请选择员工")
        }
          
      },
      distribution(){
        if (this.multipleSelection[0]) {
          this.getGroup(4);
          this.form.coopDeptId = 4;
          this.fenpei = true;
        }else{
          this.$message("请选择目标")
        }
      },
      handleSelectionChange(val){
        this.multipleSelection = val;
        this.length = this.multipleSelection.length
      },
      batchReview(){
        if (this.length==0) {
          this.$message("请选择目标")
        }else{
         this.$confirm(`您即将批量通过${this.length}该条提报, 是否继续?`, '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
              this.multipleSelection.forEach((item,index)=>{
              item.coopShenheId = getUser().id;
              item.coopShenheTime = new Date();
              item.coopTbtype = "通过";
              item.coopTbtime = new Date(item.coopTbtime)
              item.coopStarttime = new Date(item.coopStarttime)
              item.coopShenheTime = new Date(item.coopShenheTime)
              this.update(item,index)
           })
          this.bindData()
        }).catch(() => {
         
        });
        }
        
      },
      async update(item,index){
          updateCoop(item).then(res=>{
              if (res.success) {
                this.sucList+=1
              }else{
                 this.$errmsg("第"+index+1+"条数据，店铺：【"+item.coopCustomer+"】"+res.message)
                this.errList+=1
              }
               if ((index+1) ==this.length ) {
                this.$alert(`${this.sucList}条数据批量处理完毕，${this.errList}条失败`, '提示', {
                confirmButtonText: '确定',
                })
              }
            }) 
      },
      checkReason(data){
        this.viewReason = true;
        this.reason =data;
      },
      closeBox(data){
        console.log(data)
        this.viewReason = data
      },
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
             item.coopTbtime = item.coopTbtime?this.getMyDate(item.coopTbtime):''
             item.coopStarttime = item.coopStarttime?this.getMyDate(item.coopStarttime):''
             item.coopShenheTime = item.coopShenheTime?this.getMyDate(item.coopShenheTime):''
              this.deptList.forEach(obj=>{
                if(item.coopDeptId == obj.deptId ){
                  item.bumen = obj.deptName
                }
              })
              this.userList.forEach(obj=>{
                if(item.coopUserId ==obj.id ){
                  item.xiaoshou = obj.username
                }
                if (item.coopShenheId==obj.id) {
                  item.shenhe = obj.username
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
<style>
.el-table td,.el-table th{
  text-align: center !important;
}
</style>