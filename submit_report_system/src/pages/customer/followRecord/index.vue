<template>
  <div class="wrap">
    <el-row>
      <div class="title">跟进记录</div>
    </el-row>
    <el-row>
      <el-form label-width="120px" size="mini" label-position="left"  ref="form" :rules="rules" :model="form">
        <el-form-item prop="record" label="跟进记录:">
          <el-input type="textarea" v-model="form.record"/>
        </el-form-item>
        <el-form-item label="下次跟进时间：">
          <el-date-picker
            v-model="date"
            type="date"
            placeholder="选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item  prop="maturity" label="客户成熟度:">
            <el-select v-model="form.maturity" style="width: 100%" >
              <el-option v-for="(maturity, index) in maturities" :key="index" :value="maturity">{{ maturity }}</el-option>
           </el-select>
          <!-- <el-select v-model="form.name" placeholder="请选择">
            <el-option
              v-for="item in options"
              :key="item.value"
              :label="item.label"
              :value="item.value">
            </el-option>
          </el-select> -->
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submit">提交</el-button>
          <el-button @click="back">返回</el-button>
        </el-form-item>
      </el-form>
    </el-row>
  </div>
</template>

<script>
import maturity from '@/assets/maturity'
import { addRecord,findRecord } from '@/api'
export default {
  data () {
    return {
      date: Date.now(),
      form: {
        productSubmitId:null,
        maturity:null,
        record:null,
        followUpTime:null,
      },
      options: [
        { label: '', value: '' }
      ],
       maturities: maturity,
       rules:{         
         record:[{ required: true, message: '记录不可为空',trigger: 'submit,blur,change'}],
         maturity:[{ required: true, message: '选择成熟度',trigger: 'submit,blur,change'}]
       }
    }
  },
  mounted(){
    this.form.productSubmitId= this.$route.query.id
    if(!this.form.productSubmitId){
      this.$alert('无参数，请返回', '提示', {
          confirmButtonText: '确定',
          callback: action => {
           this.$router.push({path:"/customer"})
          }
        });
    }
    // this.find()
  },
  methods: {
    back () {
      this.$router.go(-1)
    },
    submit(){
       this.$refs.form.validate((valid) => {
            if (valid) {   
              let time = new Date(this.date)
              this.form.followUpTime = time.getFullYear()+"-"+(time.getMonth()+1)+"-"+time.getDate();
              addRecord(this.form).then(res=>{
                if(res.success){
                  this.$sucmsg(res.message)
                  this.$router.push({path:"/customer"})
                }
              })
            }
        });
    },
    find(){
      findRecord(this.form.productSubmitId).then(res=>{
        console.log(res)
      })
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
