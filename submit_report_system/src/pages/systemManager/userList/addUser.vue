<template>
  <div class="wrap">
    <div class="title">添加用户</div>
    <div class="content">
      <el-form ref="form" :model="form" label-width="120px" label-position="left" size="mini">
        <el-form-item prop="username" label="用户名:" :rules="[
          { required: true, message: '用户名不能为空' }
        ]">
          <el-input v-model="form.username"></el-input>
        </el-form-item>
        <el-form-item prop="realname" label="真实姓名:" :rules="[
          { required: true, message: '真实姓名不能为空' }
        ]">
            <el-input v-model="form.realname"></el-input>
        </el-form-item>
        <el-form-item label="密码:" prop="password" :rules="[
          { required: true, message: '密码不能为空' }
        ]">
          <el-input v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item label="电话:" prop="phone">
          <el-input v-model="form.phone"></el-input>
        </el-form-item>
        <el-form-item label="部门:" prop="deptId">
          <el-select v-model="form.deptId"  clearable @change="getGroup">
            <el-option v-for="(dept, index) in deptList" :key="index" :label="dept.deptName" :value="dept.deptId"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="小组:" prop="groupId">
          <el-select v-model="form.groupId"  clearable>
            <el-option v-for="(group, index) in groupList2" :key="index" :label="group.groupName" :value="group.groupId"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="用户角色:" prop="type">
          <!-- <el-input v-model="form.userRole"></el-input> -->
          <el-select v-model="form.type">
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
import { addUser, getDeptByList, getGroupByList } from '@/api/index'
import roleList from '@/assets/role.js'
import { Base64 } from 'js-base64'
export default {
  data () {
    return {
      form: {
      },
      roleList,
      groupList: [],
      deptList: [],
      groupList2:[],
    }
  },
  created () {
    this.getGroupList()
    this.getDeptList()
  },
  methods: {
    getDeptList () {
      getDeptByList().then(res => {
        this.deptList = res
      })
    },
    getGroup(){
      this.groupList2 = []
      if (this.form.groupId) {
        this.form.groupId = null;
      }
      this.groupList.forEach(item=>{
        if (item.groupDeptId == this.form.deptId) {
          this.groupList2.push(item)
        }
      })
    },
    getGroupList () {
      getGroupByList().then(res => {
        console.log(res)
        this.groupList = res
      })
    },
    createUser () {
      // this.form.type = this.form.type?this.form.type:2
      this.form.maxTb = (this.form.type==4 || this.form.type==5)?20:'';
      this.form.nowTb = (this.form.type==4 || this.form.type==5)?0:'';
      this.form.password = Base64.encode(this.form.password)
      this.form.salt = '0'
      addUser(this.form).then(res => {
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
