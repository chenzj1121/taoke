<template>
    <div>
        <div class="title">提报管理</div>
         <el-form inline size="mini" label-position="left" label-width="120px;">
      <el-form-item label="店铺名称：">
        <el-input v-model="form.cmShopName"></el-input>
      </el-form-item>
      <el-form-item label="商品ID：">
        <el-input v-model="form.cmYhqName"></el-input>
      </el-form-item>
      <el-form-item label="提交时间：">
        <el-date-picker
          v-model="form.cmApplyTimeBegin"
          type="date">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.cmApplyTimeEnd"
          type="date">
        </el-date-picker>
      </el-form-item>
       <el-form-item label="上线时间：">
        <el-date-picker
          v-model="form.cmApplyTimeBegin"
          type="date">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.cmApplyTimeEnd"
          type="date">
        </el-date-picker>
      </el-form-item>
       <el-form-item label="下线时间：">
        <el-date-picker
          v-model="form.cmApplyTimeBegin"
          type="date">
        </el-date-picker>
      </el-form-item>
      <span style="position:relative;top:5px;left:-2px;">至</span>
      <el-form-item>
        <el-date-picker
          v-model="form.cmApplyTimeEnd"
          type="date">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="部门:" label-width="60px">
            <div>
              <el-select v-model="form.shopDeptId" placeholder="请选择" @change="getGroup(form.shopDeptId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  deptList" :key="i" :value="item.deptId" :label="item.deptName"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="组别:" label-width="60px">
            <div>
              <el-select v-model="form.shopGroupId" placeholder="请选择" @change="getMember(form.shopDeptId,form.shopGroupId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  gruopList2" :key="i" :value="item.groupId" :label="item.groupName"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="部门人员:" label-width="80px">
            <div>
              <el-select v-model="form.shopUserId2" placeholder="请选择" >
                <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  memberList" :key="i" :value="item.id" :label="item.username"></el-option>
              </el-select>
            </div>
          </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="bindData">查询</el-button>
        <el-button @click="() => {this.form = {}; this.bindData()}">重置</el-button>
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
        <el-table-column label="组别" prop="dakuanriqi"></el-table-column>
        <el-table-column label="销售人员" prop="coopUserId"></el-table-column>
        <el-table-column label="上线时间" prop="coopStarttime"></el-table-column>
        <el-table-column label="是否零点提报" prop="dakuanriqi"></el-table-column>
        <el-table-column label="提报状态" prop="coopZero"></el-table-column>
        <el-table-column label="提报人员" prop="tibao"></el-table-column>
        <el-table-column label="审核" >
            <el-button>审核</el-button>
        </el-table-column>
        <el-table-column label="查看">
            <el-button>查看</el-button>
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
            cooperationDetailTableData:[]
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
    getUserList(){
      getUserByList().then(res=>{
        this.userList = res
      })
    },
    getGroup(id){
        this.form.shopGroupId = null;
        if( this.form.shopUserId2){ this.form.shopUserId2 = null;}
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
        if( this.form.shopUserId2){ this.form.shopUserId2 = null;}
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
      getCooperationPage(form, page, rows).then(res => {
         res.rows.forEach((item,index)=>{
        //    let list =["coopEndtime","coopStarttime","coopTbtime"]
        //    list.forEach(obj=>{
        //      item[obj] = this.getMyDate(item[obj])
        //     // console.log(oTime)
        //    })
            // item.coopEndtime = new Date(item.coopEndtime);
            // item.coopStarttime = new Date(item.coopStarttime);
            // item.coopTbtime = new Date(item.coopTbtime)
              this.deptList.forEach(obj=>{
                if(item.coopDeptId == obj.deptId ){
                  item.coopDeptId = obj.deptName
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
</style>