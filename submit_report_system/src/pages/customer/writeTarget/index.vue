<template>
  <div class="wrap">
    <div class="title">
      目标填写及分解
    </div>
    <el-form :model="form" ref="form" inline size="mini" label-width="170px"  label-position="left">
      <el-form-item prop="writeTime" label="当前填写目标时间：">
        <el-date-picker type="month" v-model="form.writeTime"/>
      </el-form-item>
      <br/>
      <el-form-item prop="target" label="月到账目标："
        :rules="targetValidator">
        <el-input v-model="form.target" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="targetOnlineWeek1" label="(第一周)周 在线 目标：">
        <el-input v-model="form.targetOnlineWeek1" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="targetIncomeWeek1" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.targetIncomeWeek1" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="targetOnlineWeek2" label="(第二周)周 在线 目标：">
        <el-input v-model="form.targetOnlineWeek2" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="targetIncomeWeek2" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.targetIncomeWeek2" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="targetOnlineWeek3" label="(第三周)周 在线 目标：">
        <el-input v-model="form.targetOnlineWeek3" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="targetIncomeWeek3" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.targetIncomeWeek3" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="targetOnlineWeek4" label="(第四周)周 在线 目标：">
        <el-input v-model="form.targetOnlineWeek4" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="targetIncomeWeek4" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.targetIncomeWeek4" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="targetOnlineWeek5" label="(第五周)周 在线 目标：">
        <el-input v-model="form.targetOnlineWeek5" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="targetIncomeWeek5" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.targetIncomeWeek5" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item>
        <el-button type="primary" @click="submit">提交</el-button>
        <el-button @click="back">取消</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  data () {
    const countValid = (rule, value, callback) => {
      let { targetIncomeWeek1, targetIncomeWeek2, targetIncomeWeek3, targetIncomeWeek4, targetIncomeWeek5 } = this.form
      targetIncomeWeek1 = parseInt(targetIncomeWeek1)
      targetIncomeWeek2 = parseInt(targetIncomeWeek2)
      targetIncomeWeek3 = parseInt(targetIncomeWeek3)
      targetIncomeWeek4 = parseInt(targetIncomeWeek4)
      targetIncomeWeek5 = parseInt(targetIncomeWeek5)
      value = parseInt(value)
      const count = targetIncomeWeek1 + targetIncomeWeek2 + targetIncomeWeek3 + targetIncomeWeek4 + targetIncomeWeek5
      if (value === count) {
        callback()
      } else {
        callback(new Error('月到账目标应当等于每一周的到账目标之和'))
      }
    }
    return {
      form: {
        writeTime: Date.now()
      },
      targetValidator: [
        { required: true, message: '月到账目标不能为空' },
        { validator: countValid, trigger: 'submit' }
      ]
    }
  },
  methods: {
    submit () {
      this.$refs.form.validate(valid => {
      })
    },
    back () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped lang='less'>
.title {
  font-size: 20px;
  padding-bottom: 20px;
}
</style>
