<template>
    <div>
        <div class="title">提报用户管理</div>
        <el-form inline size="mini" label-position="left" label-width="120px;" ref="form" :model="form">
            <el-form-item label="组别 ：" label-width="60px" >
            <div>
              <el-select  v-model="form.groupId" placeholder="请选择">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  groupList" :key="i" :value="item.groupId" :label="item.groupName"></el-option>
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
        :row-style="{maxHeight:'80px',textAlign:'center'}"
        :header-cell-style="{ textAlign: 'center', background: '#eee' }"
         size="mini"
        v-loading="loading"
        :data="userList"
      >
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column label="组别" prop="groupId"></el-table-column>
        <el-table-column label="姓名" prop="realname"></el-table-column>
        <el-table-column label="手机" prop="phone"></el-table-column>
        <el-table-column label="未审核单数" prop="shengheTime"></el-table-column>
        <el-table-column label="分配顺序" prop="shengheTime"></el-table-column>
        <el-table-column label="账号" prop="username"></el-table-column>
        <el-table-column label="待审核上限" prop="shengheTime"></el-table-column>
        <el-table-column label="设置审核上限数量" prop="shengheTime">
            <template slot-scope="scope" >
                <a href="#">上限单量设置</a>
            </template>
        </el-table-column>
   </el-table>
    <Page style="text-align: right;margin-top: 10px;" :page="page" @change="bineData()" />
    </div>
</template>
<script>
import {getUserByPage,getGroupByDeptId,getGroupByList} from '@/api'
import Page from '@/components/page'
export default {
    components:{
        Page,
    },
    data(){
        return{
            loading:false,
             page: {
                pageSize: 10,
                pageNum: 1,
                total: 10
            },
            form:{
                deptId:4,
            },
            userList:[],
            groupList:[],
            groupList2:[],
        }
    },
    mounted(){
        this.getGroupList()
        this.bindData()
    },
    methods:{
        getTibaoGroup(){
            getGroupByList().then(res=>{

            })
        },
        getGroupList(){
            getGroupByDeptId(this.form.deptId).then( res=>{
                this.groupList = res
            })
        },
        bindData(){
             const form = this.form
            const page = this.page.pageNum
            const rows = this.page.pageSize
            this.loading = true
            getUserByPage(form,page,rows).then(res=>{
                this.loading = false;
                res.rows.forEach(item=>{
                    this.groupList.forEach(obj=>{
                    if (item.groupId == obj.groupId) {
                        item.groupId = obj.groupName
                        }
                    })
                })
                this.userList = res.rows
                console.log(res)
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