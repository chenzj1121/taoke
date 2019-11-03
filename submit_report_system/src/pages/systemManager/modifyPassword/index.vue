<template>
  <div class="wrap">
    <div class="title">密码修改</div>
    <div class="content">
      <el-form ref="user" :model="user" label-width="120px" label-position="left" size="mini">
        <el-form-item prop="username" label="用户名:" required>
          <el-input v-model="user.username" ></el-input>
        </el-form-item>
        <el-form-item prop="password" label="密码:" required style="display:none">
            <el-input v-model="user.password" :auto-complete="false"></el-input>
        </el-form-item>
        <el-form-item label="新密码" prop="newPassword">
            <el-input type="password" v-model="newPassword" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="确认密码" prop="newPasswordConfirm">
            <el-input type="password" v-model="newPasswordConfirm" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="updPasswordById">保存</el-button>
          <el-button @click="back">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import { getUser, setUser } from '@/utils/auth'
import { updUser, getUserById } from '@/api/index'
export default {
  data () {
    return {
      user: {},
      newPassword: '',
      newPasswordConfirm: ''
    }
  },
  created () {
    getUserById(getUser().id).then(res => {
      this.user = res
    })
  },
  methods: {
    updPasswordById () {
      if (this.newPassword === '') {
        this.$message.error('请填写新密码')
      } else if (this.newPassword.length < 6) {
        this.$message.error('密码必须为六位以上')
      } else if (this.newPasswordConfirm === '') {
        this.$message.error('请再次填写新密码')
      } else if (this.newPassword !== this.newPasswordConfirm) {
        this.$message.error('两次密码填写不一致')
        this.newPasswordConfirm = ''
      } else {
        this.user.password = this.newPassword
        updUser(this.user).then(res => {
          this.savaUser2Cookie(this.user)
          this.$message({
            message: '恭喜你，保存成功',
            type: 'success'
          })
          this.newPasswordConfirm = ''
          this.newPassword = ''
        })
      }
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
