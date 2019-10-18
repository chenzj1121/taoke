<template>
  <div class="wrap">
    <el-row>
      <div class="title">跟进记录</div>
    </el-row>
    <el-row>
      <el-form label-width="120px" size="mini" label-position="left">
        <el-form-item label="跟进记录：">
          <el-input :autosize="{ minRows: 6 }" type="textarea" v-model="form.name"/>
        </el-form-item>
        <el-form-item label="下次跟进时间：">
          <el-date-picker
            v-model="form.date"
            type="date"
            placeholder="选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="客户成熟度：">
          <el-select v-model="form.name" placeholder="请选择">
            <el-option
              v-for="item in options"
              :key="item.value"
              :label="item.label"
              :value="item.value">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary">提交</el-button>
          <el-button @click="back">返回</el-button>
        </el-form-item>
      </el-form>
    </el-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {
        date: Date.now()
      },
      options: [
        { label: '', value: '' }
      ]
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
.wrap{
  width: 60%;
  .title {
    font-size: 20px;
    font-weight: 600;
    margin-bottom: 50px;
  }
}
</style>
