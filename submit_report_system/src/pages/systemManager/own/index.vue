<template>
  <div class="wrap">
    <div class="title">个人设置</div>
    <div class="content">
      <el-form ref="user" :model="user" label-width="120px" label-position="left" size="mini">
        <el-form-item prop="username" label="用户名:" required>
          <el-input v-model="user.username"></el-input>
        </el-form-item>
        <el-form-item prop="realname" label="真实姓名:" required>
            <el-input v-model="user.realname"></el-input>
        </el-form-item>
        <el-form-item label="电话:" prop="phone">
          <el-input v-model="user.phone"></el-input>
        </el-form-item>
        <el-form-item label="部门:" prop="deptId">
          <el-select v-model="user.deptId" disabled  clearable>
            <el-option v-for="(dept, index) in deptList" :key="index" :label="dept.deptName" :value="dept.deptId"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="小组:" prop="groupId">
          <el-select v-model="user.groupId" disabled clearable>
            <el-option v-for="(group, index) in groupList" :key="index" :label="group.groupName" :value="group.groupId"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="用户角色:" prop="userRole">
          <el-input v-model="user.userRole"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="updUserById">保存</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import { getUser, setUser } from '@/utils/auth'
import { updUser, getDeptByList, getGroupByList } from '@/api/index'
export default {
  data () {
    return {
      user: getUser() || {},
      groupList: [],
      deptList: []
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
    getGroupList () {
      getGroupByList().then(res => {
        this.groupList = res
      })
    },
    updUserById () {
      console.log(this.user)
      updUser(this.user).then(res => {
        this.savaUser2Cookie(this.user)
        this.$message({
          message: '恭喜你，保存成功',
          type: 'success'
        })
      })
    },
    savaUser2Cookie (user) {
      user = JSON.stringify(user)
      setUser(user)
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
