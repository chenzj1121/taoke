<template>
  <div>
    <el-form
      inline
      size="mini"
      label-position="left"
      label-width="150px">
      <el-form-item label="推广店铺：">
        <el-input v-model="form.name" disabled></el-input>
      </el-form-item>
      <el-form-item label="店铺多选：">
        <el-select multiple v-model="form.shops">
          <el-option v-for="(option, index) in shopOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <br/>
      <el-form-item label="商品信息：">
        <el-button type="primary">新建</el-button>
        <el-button type="success">一键保存</el-button>
      </el-form-item>
      <br/>
      <el-form-item label="优惠券名称：" required>
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="结算金额：" required>
        <el-input v-model="form.name" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="是否填写返款：" required>
        <el-radio v-model="form.isChecking" :label="true">是</el-radio>
        <el-radio v-model="form.isChecking" :label="false">否</el-radio>
      </el-form-item>
      <br/>
      <div v-if="form.isChecking">
        <el-form-item label="销售花名：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款比例：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款金额：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款银行：" required>
          <el-radio v-model="form.isAlipay" :label="true">支付宝</el-radio>
          <el-radio v-model="form.isAlipay" :label="false">银行卡</el-radio>
        </el-form-item>
        <el-form-item v-if="form.isChecking && !form.isAlipay" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款账户：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款账号：" required>
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
      </div>
      <el-form-item label="优惠券使用情况截图：">
        <el-upload
          action="https://jsonplaceholder.typicode.com/posts/"
          list-type="picture-card">
          <i class="el-icon-plus"></i>
        </el-upload>
      </el-form-item>
      <br/>
      <el-form-item label="打款截图：">
        <el-upload
          action="https://jsonplaceholder.typicode.com/posts/"
          list-type="picture-card">
          <i class="el-icon-plus"></i>
        </el-upload>
      </el-form-item>
      <br/>
      <el-form-item label="转入账户">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in accountOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <br/>
      <el-form-item label="查款备注：">
        <el-input type="textarea" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <div v-if="form.isChecking">
        <el-form-item label="查款备注：">
          <el-input type="textarea" v-model="form.name"></el-input>
        </el-form-item>
        <br/>
      </div>
      <el-form-item>
        <el-button type="primary">保存</el-button>
        <el-button @click="back">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {
        isChecking: false,
        isAlipay: true
      },
      shopOptions: [
        { label: 'name', value: 'name' }
      ],
      accountOptions: [
        { label: '支付宝', value: 'name' },
        { label: '银行卡', value: 'name' },
        { label: '对公银行卡', value: 'name' }
      ],
      imageUrl: undefined
    }
  },
  methods: {
    back () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped lang='less'>
  .avatar-uploader .el-upload {
    border: 1px dashed #d9d9d9;
    border-radius: 6px;
    cursor: pointer;
    position: relative;
    overflow: hidden;
  }
  .avatar-uploader .el-upload:hover {
    border-color: #409EFF;
  }
  .avatar-uploader-icon {
    font-size: 28px;
    color: #8c939d;
    width: 178px;
    height: 178px;
    line-height: 178px;
    text-align: center;
  }
  .avatar {
    width: 178px;
    height: 178px;
    display: block;
  }
</style>
