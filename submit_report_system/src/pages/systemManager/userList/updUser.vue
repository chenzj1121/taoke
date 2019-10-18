<template>
  <div class="wrap">
    <div class="title">添加用户</div>
    <div class="content" v-loading="loading">
      <el-form ref="form" :model="form" label-width="120px" label-position="left" size="mini">
        <el-form-item prop="username" label="用户名:" required>
          <el-input v-model="form.username"></el-input>
        </el-form-item>
        <el-form-item prop="realname" label="真实姓名:" required>
            <el-input v-model="form.realname"></el-input>
        </el-form-item>
        <el-form-item label="密码:" prop="password">
          <el-input v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item label="电话:" prop="phone">
          <el-input v-model="form.phone"></el-input>
        </el-form-item>
        <el-form-item label="部门:" prop="deptId">
          <el-select v-model="form.deptId"  clearable>
            <el-option v-for="(dept, index) in deptList" :key="index" :label="dept.deptName" :value="dept.deptId"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="小组:" prop="groupId">
          <el-select v-model="form.groupId"  clearable>
            <el-option v-for="(group, index) in groupList" :key="index" :label="group.groupName" :value="group.groupId"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="用户角色:" prop="userRole">
          <!-- <el-input v-model="form.userRole"></el-input> -->
          <el-select v-model="form.userRole">
            <el-option v-for="(role, index) in roleList" :key="index" :value="role.value" :label="role.label"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="createUser">立即创建</el-button>
          <el-button @click="back">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import { updUser, getDeptByList, getGroupByList, getUserById } from '@/api/index'
import roleList from '@/assets/role.js'
import { Base64 } from 'js-base64'
export default {
  data () {
    return {
      id: this.$route.query.id,
      roleList,
      form: {},
      deptList: [],
      groupList: [],
      loading: false
    }
  },
  created () {
    this.getGroupList()
    this.getDeptList()
    this.bindData()
  },
  methods: {
    getDeptList () {
      getDeptByList().then(res => {
        this.deptList = res
      })
    },
    getGroupList () {
      getGroupByList().then(res => {
        this.groupList = res
      })
    },
    bindData () {
      const id = this.id
      this.loading = true
      getUserById(id).then(response => {
        this.form = response
        const password = this.form.password
        const result = Base64.decode(password)
        this.form.password = result
        this.loading = false
      })
        .catch(() => {
          this.loading = false
        })
    },
    createUser () {
      this.form.password = Base64.encode(this.form.password)
      updUser(this.form).then(res => {
        this.$sucmsg('修改成功')
        this.back()
      })
    },
    back () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped lang='less'>
.wrap{
  padding: 30px;
  .title{
    color: #000;
    margin-bottom: 20px;
    font-family: 700;
  }
  .content{
    width: 60%;
    .oneline{
      width: 100%;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
  }
}
</style>
