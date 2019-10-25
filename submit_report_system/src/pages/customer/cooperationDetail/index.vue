<template>
  <div class="wrap">
    <div class="content">
      <el-form ref="form" :model="form" label-width="120px" size="mini">
        <el-form-item label="商家客户：">
          <el-input v-model="shopDetail.shopName" disabled/>
        </el-form-item>
        <el-form-item label="零点提报：">
          <el-radio label="零点" name="zero" v-model="form.coopZero"/>
          <el-radio label="非零点" name="zero" v-model="form.coopZero"/>
        </el-form-item>
        <el-form-item prop="goodTitle" label="商品标题：" :rules="[
            { required: true, message: '请输入商品标题' },
            { min: 10, max: 20, message: '商品标题在10~20字之间', trigger: 'blur' }
          ]">
          <el-input v-model="form.goodTitle"/>
        </el-form-item>
        <el-form-item label="商品ID：">
          <div class="flex">
            <el-input v-model="form.coopGoodsId" type="number"/>
            <el-button type="primary" @click="checkGood(form.coopGoodsId)">检测</el-button>
            <el-button type="primary" @click="viewGood(form.coopGoodsId)">查看商品</el-button>
          </div>
        </el-form-item>
        <el-form-item label="商品活动：" value="常规单">
          <el-radio label="常规单" v-model="form.coopActivity"/>
          <el-radio label="聚划算" v-model="form.coopActivity"/>
          <el-radio label="淘抢购" v-model="form.coopActivity"/>
        </el-form-item>
        <el-form-item label="商品分类：">
          <el-select v-model="form.coopFl">
             <el-option v-for="(item,index) in optionList" :key="index" :value="item.id" :label="item.name">{{item.name}}</el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="coopMainPicture" label="商品主图：" :rules="[{ required: true, message: '请输入商品主图' }]">
          <div class="flex">
            <el-input v-model="form.coopMainPicture"></el-input>
            <el-button type="primary" @click="viewMainPic(form.coopMainPicture)">查看主图</el-button>
          </div>
        </el-form-item>
        <el-form-item label="商品营销图：">
          <div class="flex">
            <el-input v-model="form.coopPicture"></el-input>
            <el-button type="primary" @click="viewMainPic(form.coopPicture)">查看营销图</el-button>
          </div>
        </el-form-item>
        <el-form-item label="推广文案：">
          <el-input type="textarea" v-model="form.coopPromotion"></el-input>
        </el-form-item>
        <el-form-item label="特色文案：">
          <el-input type="textarea" v-model="form.coopColor"></el-input>
        </el-form-item>
        <el-form-item label="开始时间">
          <el-radio v-model="form.beginTime" label="立即开始"></el-radio>
          <el-radio v-model="form.beginTime" label="预告"></el-radio>
        </el-form-item>
        <el-form-item prop="coopStartTime" label="预告时间" v-if="form.beginTime === '预告'" :rules="[{ required: true, message: '请输入预告时间' }]">
          <el-date-picker
            v-model="form.coopStartTime"
            type="date"
            placeholder="选择日期"
            value-format="timestamp">
          </el-date-picker>
        </el-form-item>
        <!-- <el-form-item label="优惠券类型：">
          <el-radio label="普通券、新版妈妈券" v-model="form.name"/>
          <el-radio label="妈妈券（无链接）" v-model="form.name"/>
        </el-form-item> -->
        <el-form-item label="优惠券名称：">
          <el-input v-model="form.coopYhqName"></el-input>
        </el-form-item>
        <el-form-item label="优惠券链接：">
          <div class="flex">
            <el-input v-model="form.coopCoupon"></el-input>
            <el-button type="primary"  @click="viewGood(form.coopCoupon)">查看优惠券</el-button>
          </div>
        </el-form-item>
        <el-form-item prop="coopYhqNums" label="优惠券总量：" :rules="[{ required: true, message: '请输入优惠卷总量' }]" >
          <div class="flex">
            <el-input type="number" v-model="form.coopYhqNums" ></el-input>
            <!-- <span style="width: 130px;">数量大于等于600</span> -->
          </div>
        </el-form-item>
          <el-form-item prop="coopAlterPrice" label="券后价：" :rules="[{ required: true, message: '请输入券后价格' }]">
          <el-input type="number" v-model="form.coopAlterPrice"></el-input>
        </el-form-item>
        <el-form-item prop="coopYjScale" label="佣金比例：" v-if="form.beginTime === '预告'" :rules="[{ required: true, message: '请输入佣金比例' }]">
          <el-input type="number" v-model="form.coopYjScale"></el-input>
        </el-form-item>
        <el-form-item  prop="coopServiceFee" label="服务费单价：" :rules="[{ required: true, message: '请输入服务单价' }]">
          <el-input v-model="form.coopServiceFee"></el-input>
        </el-form-item>
        <el-form-item prop="coopEndTime" label="结束时间：" :rules="[{ required: true, message: '请输入结束时间' }]">
          <el-date-picker
            v-model="form.coopEndTime"
            type="date"
            placeholder="请选择日期"
            value-format="timestamp">
          </el-date-picker>
        </el-form-item>
        <el-form-item prop="coopPerTime" label="预汇款时间：" :rules="[{ required: true, message: '请输入预汇款时间' }]">
          <el-date-picker
            v-model="form.coopPerTime"
            type="date"
            placeholder="请选择日期"
            value-format="timestamp">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="备注">
          <el-input type="textarea" v-model="form.coopMessage"></el-input>
        </el-form-item>
        <el-form-item label="券面额：">
          <el-input type="number" v-model="form.coopCouponNum"></el-input>
        </el-form-item>
        <el-form-item label="淘宝价：">
          <el-input type="number" v-model="form.coopTapbaoPrice"></el-input>
        </el-form-item>
        <el-form-item label="拍几件：" >
          <el-input type="number" v-model="form.coopPayNum"></el-input>
        </el-form-item>
        <el-form-item label="线上线下结算：">
          <el-radio label="线上结算" v-model="form.settleStatus"/>
          <el-radio label="线下结算" v-model="form.settleStatus"/>
        </el-form-item>
        <el-form-item prop="coopHeadId" label="团长ID" v-if="form.settleStatus === '线上结算'" :rules="form.settleStatus === '线上结算'?[{ required: true, message: '请输入团长ID' }]:''">
          <el-input type="number" v-model="form.coopHeadId"/>
        </el-form-item>
        <el-form-item label="上传实拍图：">
          <div class="flex">
            <el-input v-model="form.coopRealShot"></el-input>
            <el-input v-model="form.coopRealShot"></el-input>
            <el-input v-model="form.coopRealShot"></el-input>
            <el-input v-model="form.coopRealShot"></el-input>
          </div>
        </el-form-item>
        <!-- <el-form-item label="选择平台：">
          <el-radio label="大淘客" v-model="form.name"/>
          <el-radio label="选单网" v-model="form.name"/>
          <el-radio label="好单库" v-model="form.name"/>
        </el-form-item> -->
        <el-form-item>
          <el-button type="primary" @click="submit">提交</el-button>
          <el-button @click="back">返回</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import {getSysRole,getGoodsInfo,addCoop} from '@/api'
import {getUser} from "@/utils/auth"
export default {
  data () {
    return {
      form: {
        settleStatus: "线上结算",
        coopActivity:"常规单",
        beginTime:"立即开始",
        coopZero:"零点"
      },
      shopDetail:{},
      optionList:[],
      flag:false,
    }
  },
  mounted(){
    this.form.coopDeptId=getUser().deptId
    this.form.coopUserId=getUser().id
    this.getRole()
    this.shopDetail = this.$route.params
    if(!this.shopDetail.shopName) {
       this.$alert('未检测到店铺', '警告', {
          confirmButtonText: '确定',
          callback: action => {
              this.$router.go(-1)
          }
        });
    }
  },
  methods: {
    checkGood(id){
        getGoodsInfo(id).then(res=>{
          if(res.code==0){
            this.$sucmsg(res.msg)
            this.flag = true
          }else{
            this.$errmsg(res.msg)
          }
        })
    },
    viewGood(id){
      if (id) {
         window.open(`https://item.taobao.com/item.htm?ft=t&id=${id}`);   
      }else{
        this.$message("请先填写")
      }
    },
    viewMainPic(str){
      if (str) {
        window.open(str)
      }else{
        this.$message("请先填写")
      }
    },
    back () {
      this.$router.go(-1)
    },
    getRole(){
      getSysRole().then(res=>{
      this.optionList = res
      })
    },
    submit(){
      this.$refs.form.validate(valid => {
        if(valid){
          if (this.flag) {
             console.log(this.form)
          addCoop(this.form).then(res=>{
            console.log(res)
          })
          }else{
            this.$message("请检测商品ID为正确ID")
          }
         
        }else{
          this.$message("请填写必填项")
        }
      })
    }
  }
}
</script>

<style scoped lang='less'>
.flex {
  display: flex;
  justify-content: center;
  align-items: center;
}
.content {
  width: 60%;
  margin: 0 auto;
}
</style>
