<template>
  <div class="wrap">
    <div class="form_box">
        <el-form ref="loginForm" :rules="rules" :model="loginForm">
          <h1 class="title">
           嘿购科技客户信息管理系统
          </h1>
          <el-form-item prop="username">
            <el-input v-model="loginForm.username" class="form_input" prefix-icon="el-icon-user-solid"></el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input type="password" @keyup.enter.native="submit" show-password v-model="loginForm.password" prefix-icon="el-icon-key"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button :loading="loading" type="primary" style="width: 100%;height: 50px;" @click="submit">登录</el-button>
          </el-form-item>
        </el-form>
    </div>
  </div>
</template>

<script>
import { setUser } from '@/utils/auth'
import { reqLogin } from '@/api'
import { Base64 } from 'js-base64'
export default {
  data () {
    const passwordValidator = (rule, value, callback) => {
      let result = /^[A-Za-z0-9]+$/g.test(value)
      if (result) {
        callback()
      } else {
        callback(new Error('请输入3~21位的数字和字母组合密码'))
      }
    }
    return {
      loginForm: {
        username: undefined,
        password: undefined
      },
      loading: false,
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 3, max: 21, message: '请输入3~21位的数字和字母组合密码', trigger: 'change' },
          { validator: passwordValidator, trigger: 'change' }
        ]
      }
    }
  },
  methods: {
    submit () {
      console.log('submit()', this.loginForm.username, this.loginForm.password)
      this.$refs.loginForm.validate(valid => {
        if (valid) {
          this.loading = true
          // const user = this.loginForm
          // this.savaUser2Cookie(user)
          // this.loading = false
          // this.$sucmsg('登录成功!')
          // this.$router.replace({ path: '/home' })
          this.loginForm.password = Base64.encode(this.loginForm.password)
          reqLogin(this.loginForm).then(res => {
            // console.log(res)
              this.loading = false
            if(res.success){
               const { username, realname, phone, deptId, groupId, id,type} = res.data
              const user = { username, realname, phone, deptId, groupId, id,type }
              this.savaUser2Cookie(user)
              this.$sucmsg('登录成功!')
              this.$router.replace({ path: '/home' })
            }else{
               this.$message.error("账号密码错误");
            }
          })
            .catch(err => {
              this.loginForm.password = undefined
              this.loading = false
            })
        }
      })
    },
    savaUser2Cookie (user) {
      user = JSON.stringify(user)
      setUser(user)
    }
  }
}
</script>

<style lang="less" scoped>
.wrap {
  background: #2D3A4B;
  height: 100%;
  display: flex;
  .form_box {
    margin: auto;
    margin-top: 200px;
    width: 450px;
    color: #fff;
    .title {
      font-size: 28px;
      font-weight: 800;
      text-align: center;
      padding-bottom: 30px;
    }
    /deep/ .el-input__icon {
      font-size: 19px;
      padding: 0 5px;
    }
    /deep/ .el-input__inner {
      background: #283443;
      color: #fff;
      border: 1px solid #3E4957;
      height: 50px;
      font-size: 19px;
      padding: 0 45px
    }
    /deep/ input__inner:focus {
      border-color: #2D3A4B;
    }
    .form_input {
      background: #2D3A4B;
    }
  }
}
</style>
