<template>
  <div>
    <el-row class="form_row">
      <el-form inline size="mini" ref="form" :model="form">
          <!-- <el-form-item label="下次跟进时间:" label-width="100px">
            <el-date-picker
              v-model="form.name"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item> -->
          <!-- <el-form-item label="回款时间:" label-width="80px">
            <el-date-picker
              v-model="form.name"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item> -->
          <el-form-item prop="createTime" label="创建时间:" label-width="80px">
            <el-date-picker
              v-model="form.createTime"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item>
            <span style="position:relative;top:5px;left:-5px;">至</span>
          <el-form-item prop="outlineTimeEnd">
            <el-date-picker
              v-model="form.createTimeEnd"
              type="date"
              value-format='timestamp'
              placeholder="选择日期">
            </el-date-picker>
         </el-form-item>
          <el-form-item prop="refundsMoney" label="回款金额:" label-width="80px"> 
            <el-input v-model="form.refundsMoney" type="number"  ></el-input>
          </el-form-item>
          <span style="position:relative;top:5px;left:-5px;">到</span>
          <el-form-item prop="MaxMoney">
            <el-input v-model="form.shopMaxMoney" type="number"  ></el-input>
          </el-form-item>
         <br>
          <el-form-item prop="maturity" label="成熟度:" label-width="80px">
            <el-select v-model="form.maturity" value="0">
              <el-option v-for="(option, index) in maturities" :key="index" :value="option">{{ option }}</el-option>
            </el-select>
          </el-form-item>
          <!-- <el-form-item label="主营:" label-width="50px">
            <el-input :value="form.name"></el-input>
          </el-form-item> -->
          <!-- <el-form-item label="店铺信息查询:" label-width="100px">
            <div class="flex">
              <el-select value="0">
                <el-option value="0" label="店铺名称"></el-option>
                <el-option value="1" label="旺旺号"></el-option>
              </el-select>
              <el-input :value="form.name"></el-input>
            </div>
          </el-form-item> -->
          <el-form-item prop="shopName" label="店铺名称:" label-width="80px">
            <el-input v-model="form.shopName"></el-input>
          </el-form-item>
          <el-form-item prop="wangwangaccount" label="旺旺号:" label-width="80px">
            <el-input v-model="form.wangwangaccount"></el-input>
          </el-form-item>
            <el-form-item prop="coopId" label="合作产品ID:" label-width="100px">
            <el-input v-model="form.coopId"></el-input>
          </el-form-item>
          <br>
         
          <!-- <el-form-item  label="运营QQ:" label-width="80px">
            <el-input :value="form.name"></el-input>
          </el-form-item> -->
        
          <div v-if="type==0 || type==1">
          <el-form-item label="部门:" label-width="80px" v-if="isBoss">
            <div>
              <el-select v-model="form.shopDeptId" placeholder="请选择" @change="getGroup(form.shopDeptId)" >
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  deptList" :key="i" :value="item.deptId" :label="item.deptName"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="组别:" label-width="60px" v-if="isBoss">
            <div>
              <el-select v-model="form.shopGroupId" placeholder="请选择" @change="getMember(form.shopDeptId,form.shopGroupId)" >
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
          </div>
          <br>
          <!-- <el-form-item label="资料类型:" label-width="80px">
            <div>
              <el-select value="0">
                <el-option value="0" label="123"></el-option>
              </el-select>
            </div>
          </el-form-item>
           <el-form-item label="资料数量:" label-width="80px">
            <el-input :value="form.name" type="number"></el-input>
          </el-form-item> -->
      </el-form>
      <el-row>
        <el-button size="mini" type="primary" @click="()=>{this.page={pageSize: 10,pageNum: 1,total: 10};this.bindData();}">查询</el-button>
        <el-button  size="mini" @click="() => {this.form = {};this.page={pageSize: 10,pageNum: 1,total: 10};this.bindData();}">重置</el-button>
        <el-button type="success" size="mini" @click="addCustomer">新建</el-button>
        <!-- <el-button type="warning" size="mini">导入</el-button> -->
        <!-- <el-button type="primary" size="mini">模板下载</el-button> -->
        <el-button type="warning" size="mini" @click="transTo">转入公海</el-button>
      </el-row>
    </el-row>
    <el-row>
      <el-table
        ref="table"
        size="mini"
        :header-cell-style="{ textAlign: 'center', background: '#eee' }"
        :cell-style="{ textAlign: 'center' }"
        :data="tableData"
        tooltip-effect="dark"
        style="width: 100%;"
        v-loading="loading"
        @selection-change="handleSelectionChange"
      >
        <el-table-column type="selection"/>
        <el-table-column type="index" label="序号"/>
        <el-table-column prop="dep" label="所属小组"/>
        <el-table-column prop="creater" label="所属人员"/>
        <el-table-column prop="group" label="所属部门"/>
        <el-table-column label="店铺名称">
          <template slot-scope="scope">
            <span class="shopName" @click="nav2ShopDetail(scope.row.id)">{{scope.row.shopName}}</span>
          </template>
        </el-table-column>
        <el-table-column prop="wangwangaccount" label="旺旺账号"/>
        <el-table-column prop="maturity" label="成熟度"/>
        <el-table-column prop="shopOperateQq" label="运营QQ"/>
        <el-table-column prop="nextTime" label="跟进时间"/>
        <el-table-column prop="followUpRecord" label="跟进记录"/>
        <el-table-column prop="refundsTime" label="回款时间"/>
        <el-table-column prop="refundsMoney" label="回款金额"/>
        <el-table-column prop="shopType" label="店铺类型"/>
        <el-table-column prop="name" label="运营名称"/>
        <el-table-column prop="shopOperatePhone" label="运营电话"/>
        <!-- <el-table-column prop="dataType" label="资料类型"/>
        <el-table-column prop="operatorUserId" label="操作人"/>
        <el-table-column prop="name" label="打标类型"/> -->
        <el-table-column label="操作" width="250px">
          <template slot-scope="scope">
            <div class="operates">
              <el-row>
                <el-button type="primary" size="mini" @click="submitReport(scope.row)">提报</el-button>
                <el-button type="warning" size="mini" @click="nav2Update(scope.row.id)">修改</el-button>
                <el-button type="primary" size="mini" @click="followRecord(scope.row)">跟进记录</el-button>
                <!-- <el-button type="danger" size="mini" @click="del(scope.row)">删除</el-button> -->
              </el-row>
            </div>
          </template>
        </el-table-column>
      </el-table>
      <!-- <el-pagination
        background
        class="pagination"
        layout="prev, pager, next"
        :current-page="page.pageNum"
        :page-size="page.pageSize"
        @current-change="bindData"
        :total="30">
      </el-pagination> -->
      <pagination class="pagination" :page="page" @change="bindData"/>
    </el-row>
  </div>
</template>

<script>
import {getUserByList, getShopList, deleteShopById,updateShop,getDeptByList,getGroupByList,getUserById,getGroupMember} from '@/api'
import { getUser } from '@/utils/auth'
import pagination from '@/components/page'
import maturities from '@/assets/maturity'
export default {
  components: {
    pagination,
  },
  data () {
    return {
      form: {
        shopDeptId:getUser().type==0?null:getUser().deptId,
        shopGroupId:getUser().type==0?null:getUser().groupId,
      },
      tableData: [],
      maturities: maturities,
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 0
      },
      deptList:{},
      groupList:{},
      loading: false,
      multipleSelection: [],
      list:[],
      flag:true,
      userList:[],
      gruopList2:[],//部门联动-小组
      memberList:[],//部门联动-员工
      deptList2:[],
      type:2,
      isBoss:false,
    }
  },
  mounted () {
    this.type = getUser().type;
    this.getDeptList()
    this.getUserList()
    this.getGroupList()
    this.bindData()
    if (this.type==0) {
      this.isBoss =true
    }else{
      this.form.deptId = getUser().deptId
      this.form.groupId = getUser().groupId
      this.getMember( this.form.deptId,this.form.groupId)
    }
  },
  methods: {
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
    submitReport (item) {
      console.log(item)
      this.$router.push({ path: '/customer/cooperationDetail',name:'cooperationDetail' ,params:item})
    },
    handleSelectionChange (val) {
       this.multipleSelection = val;
    },
    followRecord (opt) {
      console.log(opt)
      this.$router.push({ path: '/customer/followRecord',query:{id:opt.id}})
    },
    addCustomer () {
      this.$router.push({ path: '/customer/add' })
    },
    nav2ShopDetail (id) {
      this.$router.push({path: '/shopDetail', query: { id }})
    },
    nav2Update (id) {
      this.$router.push({path: 'update', query: { id }})
    },
    del (option) {
      this.$confirm(`是否删除【${option.shopName}】?`, '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.delete(option.id)
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        })
      })
    },
    delete (id) {
      deleteShopById(id).then(response => {
        if (response.success) {
          this.$sucmsg('删除成功')
        } else {
          this.$errmsg('删除失败')
        }
        this.bindData()
      })
    },
    bindData () {
      const shop = this.form
      const page = this.page.pageNum
      const rows = this.page.pageSize
      this.loading = true
      shop.privateType = '1'
      getShopList(shop, page, rows,shop.MaxMoney).then(res => {
        this.tableData = res.rows
        console.log(res.rows)
          res.rows.forEach((item,index)=>{
                item.nextTime = item.nextTime?this.getMyDate(item.nextTime):null
                item.refundsTime = item.refundsTime?this.getMyDate(item.refundsTime):null
                // item.shopGroupId = parseInt(item.shopGroupId)
              this.groupList.forEach(obj=>{
                if(item.shopDeptId == obj.groupDeptId && item.shopGroupId == obj.groupId){
                  item.group = obj.groupName
                }
              })
              this.userList.forEach(obj=>{
                if(item.shopUserId2 ==obj.id ){
                  item.creater = obj.username
                }
              })
              this.deptList.forEach(obj=>{
                if(item.shopDeptId == obj.deptId){
                  item.dep = obj.deptName
                }
              })
              // getUserById(item.shopUserId2).then(obj=>{
              //   this.tableData[index].creater = obj.username;
              // })
          })
               this.tableData = res.rows

        this.page.total = res.total
        this.loading = false
      
      })
        .catch(() => {
          this.loading = false
        })
    },
    transTo(){
      let flag  = true;
      if(this.multipleSelection[0]){
        for(let i=0;i<this.multipleSelection.length;i++){
         this.multipleSelection[i].privateType = 0;
         this.multipleSelection[i].nextTime = new Date(this.multipleSelection[i].nextTime)
          this.multipleSelection[i].shopGroupId = "";
           this.multipleSelection[i].shopDeptId =""; 
             this.multipleSelection[i].shopUserId =""; 
         updateShop(this.multipleSelection[i]).then(res=>{
           if(res.success){
              // this.$sucmsg(res.message)
           }else{
             this.$errmsg(res.message)
             let flag = false;
           }
         })
        }
      this.bindData();
    if(flag)
    {this.$sucmsg("修改成功")}
      }else{
        this.$message("请选择店铺")
      }

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
  },
  watch:{
    tableData(val){
      this.tableData = val
      // console.log(val)
    },
     deep:true
  },
 
}
</script>

<style scoped>
.pagination {
  margin-top: 20px;
  float: right;
}
.form_row {
  margin-bottom: 20px;
}
.flex {
  display: flex;
  justify-content: center;
}
.flex span {
  padding: 0 20px;
}
.el-date-editor.el-input {
  width: 130px;
}
.el-select {
  width: 140px;
}
.operates {
  display: flex;
}
.operates .el-button+.el-button {
  margin-left: 0;
}
.shopName {
  color: #587CA9;
  text-decoration: underline;
  cursor: pointer;
}
</style>
