<template>
  <div class="wrap">
    <div class="title">私海客户信息</div>
    <div class="content">
      <el-form ref="form" :model="form" label-width="120px" label-position="left" size="mini">
        <el-form-item prop="shopName" label="店铺名称：" :rules="[{ required: true, message: '店铺名称不能为空' }]">
          <el-input v-model="form.shopName"></el-input>
        </el-form-item>
        <el-form-item prop="wangwangaccount" label="旺旺账号：" :rules="[{ required: true, message: '旺旺账号不能为空' }]">
          <div class="oneline">
            <el-input v-model="form.wangwangaccount" type="text"></el-input>
            <el-button :type="btn.type" @click="checkWang" :loading="btn.load">{{btn.txt}}</el-button>
          </div>
        </el-form-item>
        <el-form-item prop="shopBoss" label="店铺老板：">
          <el-input v-model="form.shopBoss"></el-input>
        </el-form-item>
        <el-form-item prop="shopQq" label="店铺QQ：">
          <el-input v-model="form.shopQq"></el-input>
        </el-form-item>
        <el-form-item prop="shopUrl" label="店铺链接：" :rules="[{ required: true, message: '店铺链接不能为空' }]">
          <el-input v-model="form.shopUrl"></el-input>
        </el-form-item>
        <el-form-item prop="maturity" label="成熟度：" :rules="[{ required: true, message: '成熟度不能为空' }]">
          <el-select v-model="form.maturity" style="width: 100%">
            <el-option v-for="(maturity, index) in maturities" :key="index" :value="maturity">{{ maturity }}</el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="shopType" label="店铺类型：" :rules="[{ required: true, message: '店铺类型不能为空' }]">
          <el-select v-model="form.shopType" style="width: 100%">
            <el-option v-for="(item, index) in status" :key="index" :value="item">{{ item }}</el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="mainOperate" label="主营：">
          <el-input v-model="form.mainOperate"></el-input>
        </el-form-item>
        <!-- <el-form-item prop="name" label="运营名称：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item prop="name" label="运营QQ：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item> -->
        <el-form-item prop="shopWx" label="运营微信：" :rules="[{ required: true, message: '运营微信不能为空' }]">
          <el-input v-model="form.shopWx"></el-input>
        </el-form-item>
        <el-form-item prop="shopOperatePhone" label="运营电话：" :rules="[{ required: true, message: '运营电话不能为空' }]">
          <el-input v-model="form.shopOperatePhone"></el-input>
        </el-form-item>
        <el-form-item prop="shopPhone" label="店铺电话：">
          <el-input v-model="form.shopPhone"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">立即创建</el-button>
          <el-button @click="back">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import { addShop,checkWangWang } from '@/api'
import maturity from '@/assets/maturity'
import {getUser} from "../../utils/auth"
export default {
  data () {
    return {
      form: {},
      maturities: maturity,
      status: ['淘宝', '天猫'],
      btn:{
        type:"primary",
        txt:"检测",
        load:false,
      },
      flag:false,
    }
  },
  mounted(){
    console.log(getUser())
  },
  methods: {
    onSubmit () {
      if(this.flag){
      this.$refs.form.validate(valid => {
        if (valid) {
          this.form.shopDeptId = getUser().deptId;
          this.form.shopGroupId = getUser().groupId;
          this.form.shopUserId2 = getUser().id;
          this.form.shopUseId = getUser().id;
          console.log('params', this.form)
          this.form.privateType = '1'
          addShop(this.form).then(response => {
            if (response.success) {
              this.$sucmsg('添加成功')
              this.$refs.form.resetFields()
              this.$router.push({ path: '/customer/index' })
            } else {
              this.$errmsg('添加失败')
              this.$refs.form.resetFields()
            }
          })
        }
      })
      }else{
        this.$errmsg("请验证旺旺号")
      }
    },
    back () {
      this.$router.go(-1)
    },
    checkWang(){
      this.form.wangwangaccount = this.form.wangwangaccount.toString()
      this.btn.load = true
      checkWangWang(this.form.wangwangaccount).then(res=>{
      this.btn.load = false
        if(res<=3){
          this.btn.type = "success";
          this.btn.txt = "成功"
          this.flag = true;
        }else{
          this.btn.type = "danger";
          this.flag = false;
        }

      })
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
