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
            <el-input v-model="form.wangwangaccount"></el-input>
            <el-button type="primary">检测</el-button>
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
          <el-button type="primary" @click="onSubmit">更新</el-button>
          <el-button @click="back">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import { updateShop, getShopById } from '@/api'
import maturity from '@/assets/maturity'
export default {
  data () {
    return {
      id: this.$route.query.id || 0,
      form: {},
      maturities: maturity,
      status: ['淘宝', '天猫']
    }
  },
  mounted () {
    this.bindData()
  },
  methods: {
    bindData () {
      const id = this.id
      getShopById(id).then(response => {
        if (response) {
          this.form = response
        } else {
          this.$errmsg('暂无数据')
        }
      })
    },
    onSubmit () {
      this.$refs.form.validate(valid => {
        if (valid) {
          console.log('params', this.form)
          const shop = this.form
          updateShop(shop).then(response => {
            if (response.success) {
              this.$sucmsg('修改成功')
              this.$refs.form.resetFields()
              this.$router.push({ path: '/customer/index' })
            } else {
              this.$errmsg('修改失败')
              this.$refs.form.resetFields()
            }
          })
        }
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
