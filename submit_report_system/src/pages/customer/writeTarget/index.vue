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
      <br/>
      <el-form-item prop="firstWeek" label="(第一周)周 在线 目标：">
        <el-input v-model="form.firstWeek" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="firstWeekCustom" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.firstWeekCustom" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="secondWeek" label="(第二周)周 在线 目标：">
        <el-input v-model="form.secondWeek" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="secondWeekCustom" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.secondWeekCustom" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="thirdWeek" label="(第三周)周 在线 目标：">
        <el-input v-model="form.thirdWeek" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="thirdWeekCustom" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.thirdWeekCustom" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="fourthWeek" label="(第四周)周 在线 目标：">
        <el-input v-model="form.fourthWeek" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="fourthWeekCustom" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.fourthWeekCustom" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item prop="fifthWeek" label="(第五周)周 在线 目标：">
        <el-input v-model="form.fifthWeek" type="number"></el-input>
      </el-form-item>
      <el-form-item prop="fifthWeekCustom" label="周 到账 目标："
        :rules="{ required: true, message: '周到账目标不能为空' }">
        <el-input v-model="form.fifthWeekCustom" type="number"></el-input>
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
import { addTarget } from '@/api'
import { getUser } from '../../../utils/auth/index'
export default {
  data () {
    const countValid = (rule, value, callback) => {
      let {firstWeek,secondWeek,thirdWeek,fourthWeek,fifthWeek} = this.form
      this.form.firstWeek = parseInt(firstWeek)
      this.form.secondWeek = parseInt(secondWeek)
      this.form.thirdWeek = parseInt(thirdWeek)
      this.form.fourthWeek = parseInt(fourthWeek)
      this.form.fifthWeek = parseInt(fifthWeek)
      value = parseInt(value)
      const count = this.form.firstWeek + this.form.secondWeek + this.form.thirdWeek + this.form.fourthWeek + this.form.fifthWeek
      if (value === count) {
        this.form.workTarget = count
        callback()
      } else {
        callback(new Error('月到账目标应当等于每一周的在线目标之和'))
      }
    }
    return {
      form: {
        writeTime: Date.now(),
        firstWeek:null,
        secondWeek:null,
        thirdWeek:null,
        fourthWeek:null,
        fifthWeek:null	,
        workTarget:null	,
        year:null	,
        month:null	,
        userId:null	,
        firstWeekCustom:null,
        secondWeekCustom:null,
        thirdWeekCustom:null,
        fourthWeekCustom:null,
        fifthWeekCustom:null
      },
      targetValidator: [
        { required: true, message: '月到账目标不能为空' },
        { validator: countValid, trigger: 'submit' }
      ]
    }
  },
  mounted(){
    this.form.userId= getUser().id
  },
  methods: {
    submit () {
      this.$refs.form.validate(valid => {
        if(valid){  
          let time = new Date(this.form.writeTime)
          this.form.year = time.getFullYear()
          this.form.month = (time.getMonth()+1)
          addTarget(this.form).then(res=>{
            if(res.success){
              this.$message({
                message: res.message,
                type: 'success'
              });
              this.$router.go(-1);
            }else{
              this.$message.error(res.message);
            }
          })

        }else{
            this.$message.error('请检查错误');
        }
      })
    },
    back () {
      this.$router.go(-1)
    }
  },
  filters:{
    showYears:function(data){
     return  data.substr(1)
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
