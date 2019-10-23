<template>
  <div>
    <el-row>
      <el-form
        label-width="100px"
        inline
        size="mini">
        <el-form-item label="用户登录名:">
          <el-input v-model="form.username"/>
        </el-form-item>
        <el-form-item label="真实姓名:">
          <el-input v-model="form.realname"/>
        </el-form-item>
        <el-form-item label="所属部门:">
          <el-input v-model="form.deptId"/>
        </el-form-item>
        <el-form-item label="所属部门:">
          <el-input v-model="form.groupId"/>
        </el-form-item>
        
        <br/>
        <el-form-item label="用户权限:">
          <el-input v-model="form.userRole"/>
        </el-form-item>
        <el-form-item label="手机号码:">
          <el-input v-model="form.phone"/>
        </el-form-item>
        <el-form-item label="员工类型:">
          <el-select v-model="form.type" clearable>
            <el-option v-for="(userType, index) in userTypeList" :key="index" :label="userType.label" :value="userType.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="getUserList">查询</el-button>
          <el-button @click="reset">重置</el-button>
          <el-button type="warning" @click="createUser">新建</el-button>
        </el-form-item>
      </el-form>
    </el-row>
    <el-table
      :data="userList"
      v-loading="loading"
      :header-cell-style="{ textAlign: 'center', background: '#eee' }"
      :cell-style="{ textAlign: 'center' }"
      size="mini"
      style="width: 100%;">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="序号" type="index"></el-table-column>
      <el-table-column label="登录账号" prop="username"></el-table-column>
      <el-table-column label="真实姓名" prop="realname"></el-table-column>
      <el-table-column label="所属单位" prop="" width="200">
        <template slot-scope="scope">
         {{scope.row.groupName}}
        </template>
      </el-table-column>
      <el-table-column label="用户权限" prop="userRole"></el-table-column>
      <el-table-column label="手机号码" prop="phone"></el-table-column>
      <el-table-column label="是否新人">
        <template slot-scope="scope">
          <el-tag v-if="scope.row.type === ''" type="primary" disable-transitions>全部员工</el-tag>
          <el-tag v-if="scope.row.type === '0'" type="primary" disable-transitions>新员工</el-tag>
          <el-tag v-if="scope.row.type === '1'" type="warning" disable-transitions>老员工</el-tag>
        </template>
      </el-table-column>
      <el-table-column label="查看密码">
        <template slot-scope="scope">
          <span class="linkSpan" @click="getPassword(scope.row)"><el-tag type="success">查看</el-tag></span>
        </template>
      </el-table-column>
      <el-table-column label="新人转换">
        <template slot-scope="scope">
          <el-button type="primary" size="mini" :disabled="scope.row.type === '1'" @click="transformUserType(scope.row)">转换</el-button>
        </template>
      </el-table-column>
      <el-table-column label="修改">
        <template slot-scope="scope">
          <el-button type="warning" size="mini" @click="updUserById(scope.row.id)">修改</el-button>
        </template>
      </el-table-column>
      <el-table-column label="注销">
        <template slot-scope="scope">
          <span v-if="scope.row.isDelete === 0" class="linkSpan" @click="logoutUser(scope.row)"><el-tag>已激活</el-tag></span>
          <span v-if="scope.row.isDelete === 1" class="linkSpan" @click="logoutUser(scope.row)"><el-tag type="danger">已注销</el-tag></span>
        </template>
      </el-table-column> 
    </el-table>
    <Page style="text-align: right;margin-top: 10px;" :page="page" @change="getUserList"/>
    <el-dialog
      title="提示"
      :visible.sync="showPassword"
      @closed="resetPassword(user)"
      width="30%">
      <el-form label-width="80px" :model="user">
        <el-form-item label="用户姓名">
          <el-input v-model="user.username" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item label="真实姓名">
          <el-input v-model="user.realname" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input v-model="user.password" :disabled="true"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="showPassword = false">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import Page from '@/components/page'
import { getUserByPage, updUser, getDeptByList,getGroupByList  } from '@/api/index'
import { Base64 } from 'js-base64'
export default {
  components: {
    Page
  },
  data () {
    return {
      showPassword: false,
      showUserTypeTransform: false,
      loading: false,
      user: '',
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
      form: { },
      op: {
        realname: 'like',
        phone: 'like'
      },
      orderBy: 'create_time',
      userTypeList: [
        { label: '全部员工', value: '' },
        { label: '新员工', value: 0 },
        { label: '老员工', value: 1 }
      ],
      userList: [],
      deptList: [],
      groupList:[]
    }
  },
  methods: {
    getDeptList () {
      getDeptByList().then(res => {
        this.deptList = res
      })
    },
    getgroupList () {
      getGroupByList().then(res => {
        this.groupList = res
      })
    },
    getUserList () {
      var param = {}
      param.sysUser = this.form
      param.pageNum = this.page.pageNum
      param.pageSize = this.page.pageSize
      // var myJsonString = JSON.stringify(array)
      // param.op = this.op
      // param.orderBy = this.orderBy
      // debugger
      this.loading = true
      getUserByPage(this.form, this.page.pageNum, this.page.pageSize).then(res => {
        res.rows.forEach((item,index)=>{
              this.groupList.forEach(obj=>{
                if(item.deptId == obj.groupDeptId && item.groupId == obj.groupId ){item.groupName = obj.groupName}
              })
          })
        this.userList = res.rows
          console.log(this.userList)
        this.page.total = res.total
        this.loading = false
      })
        .catch(() => {
          this.loading = false
        })
    },
    getPassword (data) {
      this.showPassword = true
      data.password = Base64.decode(data.password)
      this.user = data
    },
    reset () {
      this.form = {}
      this.getUserList()
    },
    resetPassword (user) {
      user.password = Base64.encode(user.password)
    },
    transformUserType (data) {
      this.$confirm('此操作将改变员工状态, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        if (data.type === 1) {
          data.type = 0
        } else {
          data.type = 1
        }
        updUser(data).then(res => {
          this.getUserList()
        })
        this.$message({
          type: 'success',
          message: '改变成功!'
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消'
        })
      })
    },
    logoutUser (data) {
      this.$confirm('此操作将改变员工状态, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        if (data.isDelete === 1) {
          data.isDelete = 0
        } else {
          data.isDelete = 1
        }
        updUser(data).then(res => {
          this.getUserList()
        })
        this.$message({
          type: 'success',
          message: '改变员工状态成功!'
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消'
        })
      })
    },
    createUser () {
      this.$router.push({ path: 'addUser' })
    },
    updUserById (id) {
      this.$router.push({ path: 'updUser', query: {id} })
    }
  },
  mounted () {
    this.getDeptList()
    this.getgroupList()
    this.getUserList()
  }
}
</script>

<style scoped lang='less'>
.linkSpan {
  color: blue;
  width: 100%;
  text-decoration: underline;
  cursor: pointer;
}
</style>
