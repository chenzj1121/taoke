<template>
  <div class="wrap">
    <div class="content">
      <el-form ref="form" :model="form" label-width="120px" size="mini">
        <el-form-item label="商家客户：">
          <el-input  v-model="form.coopCustomer" disabled/>
        </el-form-item>
        <el-form-item label="零点提报：">
          <el-radio label="零点" name="zero" v-model="form.coopZero" />
          <el-radio label="非零点" name="zero" v-model="form.coopZero" />
        </el-form-item>
        <el-form-item prop="coopGoodsTitle" label="商品标题：" :rules="[
            { required: true, message: '请输入商品标题' },
            { min: 10, max: 20, message: '商品标题在10~20字之间', trigger: 'blur' }
          ]">
          <el-input  v-model="form.coopGoodsTitle" />
        </el-form-item>
        <el-form-item label="商品ID：">
          <div class="flex"> 
            <el-input  v-model="form.coopGoodsId" type="number" />
            <el-button type="primary" @click="checkGood(form.coopGoodsId)" >检测</el-button>
            <el-button type="primary" @click="viewGood(form.coopGoodsId)" >查看商品</el-button>
          </div>
        </el-form-item>
        <el-form-item label="商品活动：" value="常规单">
          <el-radio   label="常规单" v-model="form.coopActivity"/>
          <el-radio   label="聚划算" v-model="form.coopActivity"/>
          <el-radio   label="淘抢购" v-model="form.coopActivity"/>
        </el-form-item>
        <el-form-item label="商品分类：">
          <el-select   v-model="form.coopShopFl">
             <el-option v-for="(item,index) in optionList" :key="index" :value="item.id" :label="item.name">{{item.name}}</el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="coopMainpicture" label="商品主图：" :rules="[{ required: true, message: '请输入商品主图' }]">
          <div class="flex">
            <el-input  v-model="form.coopMainpicture"></el-input>
            <el-button type="primary" @click="viewMainPic(form.coopMainpicture)">查看主图</el-button>
          </div>
        </el-form-item>
        <el-form-item label="商品营销图：">
          <div class="flex">
            <el-input  v-model="form.coopPicture"></el-input>
            <el-button type="primary" @click="viewMainPic(form.coopPicture)">查看营销图</el-button>
          </div>
        </el-form-item>
        <el-form-item label="推广文案：">
          <el-input  type="textarea" v-model="form.coopPromotion"></el-input>
        </el-form-item>
        <el-form-item label="特色文案：">
          <el-input  type="textarea" v-model="form.coopColor"></el-input>
        </el-form-item>
        <el-form-item label="开始时间">
          <el-radio   v-model="form.beginTime" label="立即开始"></el-radio>
          <el-radio   v-model="form.beginTime" label="预告"></el-radio>
        </el-form-item>
        <el-form-item prop="coopStarttime" label="预告时间" v-if="form.beginTime === '预告'" :rules="[{ required: true, message: '请输入预告时间' }]">
          <el-date-picker
          
            v-model="form.coopStarttime"
            type="date"
            placeholder="选择日期"
            >
          </el-date-picker>
        </el-form-item>
        <!-- <el-form-item label="优惠券类型：">
          <el-radio label="普通券、新版妈妈券" v-model="form.name"/>
          <el-radio label="妈妈券（无链接）" v-model="form.name"/>
        </el-form-item> -->
        <el-form-item label="优惠券名称：">
          <el-input  v-model="form.coopYhqName"></el-input>
        </el-form-item>
        <el-form-item label="优惠券链接：">
          <div class="flex">
            <el-input  v-model="form.coopCoupon"></el-input>
            <el-button type="primary"  @click="viewGood(form.coopCoupon,1)">查看优惠券</el-button>
          </div>
        </el-form-item>
        <el-form-item prop="coopYhqnums" label="优惠券总量：" :rules="[{ required: true, message: '请输入优惠卷总量' }]" >
          <div class="flex">
            <el-input  type="number" v-model="form.coopYhqnums" ></el-input>
            <!-- <span style="width: 130px;">数量大于等于600</span> -->
          </div>
        </el-form-item>
          <el-form-item prop="coopAlterprice" label="券后价：" :rules="[{ required: true, message: '请输入券后价格' }]">
          <el-input  type="number" v-model="form.coopAlterprice"></el-input>
        </el-form-item>
        <el-form-item prop="coopYjscale" label="佣金比例：" v-if="form.beginTime === '预告'" :rules="[{ required: true, message: '请输入佣金比例' }]">
          <el-input  type="number" v-model="form.coopYjscale"></el-input>
        </el-form-item>
        <el-form-item  prop="coopServiceFee" label="服务费单价：" :rules="[{ required: true, message: '请输入服务单价' }]">
          <el-input  v-model="form.coopServiceFee"></el-input>
        </el-form-item>
        <el-form-item prop="coopEndtime" label="结束时间：" :rules="[{ required: true, message: '请输入结束时间' }]">
          <el-date-picker
          
            v-model="form.coopEndtime"
            type="date"
            placeholder="请选择日期"
            >
          </el-date-picker>
        </el-form-item>
        <el-form-item prop="coopPerTime" label="预汇款时间：" :rules="[{ required: true, message: '请输入预汇款时间' }]">
          <el-date-picker
          
            v-model="form.coopPerTime"
            type="date"
            placeholder="请选择日期"
            >
          </el-date-picker>
        </el-form-item>
        <el-form-item label="备注">
          <el-input  type="textarea" v-model="form.coopMessage"></el-input>
        </el-form-item>
        <el-form-item label="券面额：">
          <el-input  type="number" v-model="form.coopCouponNum"></el-input>
        </el-form-item>
        <el-form-item label="淘宝价：">
          <el-input  type="number" v-model="form.coopTapbaoPrice"></el-input>
        </el-form-item>
        <el-form-item label="拍几件：" >
          <el-input  type="number" v-model="form.coopPayNum"></el-input>
        </el-form-item>
        <el-form-item label="线上线下结算：">
          <el-radio   label="线上结算" v-model="form.coopPayType"/>
          <el-radio   label="线下结算" v-model="form.coopPayType"/>
        </el-form-item>
        <el-form-item prop="coopHeadId" label="团长ID" v-if="form.coopPayType === '线上结算'" :rules="form.coopPayType === '线上结算'?[{ required: true, message: '请输入团长ID' }]:''">
          <el-input  type="txt" v-model="form.coopHeadId"/>
        </el-form-item>
        <el-form-item label="上传实拍图：">
          <div class="flex">
            <el-input  v-model="form.coopRealShot"></el-input>
            <!-- <el-input  v-model="form.coopRealShot"></el-input>
            <el-input  v-model="form.coopRealShot"></el-input>
            <el-input  v-model="form.coopRealShot"></el-input> -->
          </div>
        </el-form-item>
        <!-- <el-form-item label="选择平台：">
          <el-radio label="大淘客" v-model="form.name"/>
          <el-radio label="选单网" v-model="form.name"/>
          <el-radio label="好单库" v-model="form.name"/>
        </el-form-item> -->
        <el-form-item v-if="!check&&!view">
          <el-button type="primary" @click="submit">{{isUpadte==true?'修改':'提交'}}</el-button>
          <el-button @click="back">返回</el-button>
        </el-form-item>
      </el-form>
      <div class="checkBtn" v-if="check || view">
      <el-button type="primary" v-if="check" @click="pass">通过</el-button>
      <el-button type="danger" v-if="check" @click="reject">退回</el-button>
      <el-button type="warning" @click="back">返回</el-button>
      </div>
    </div>
    <el-dialog title="拒绝理由" :visible.sync="dialogTableVisible">
      <el-input
      type="textarea"
      :rows="2"
      placeholder="请输入拒绝理由"
      v-model="form.coopShenheBz">
    </el-input>
     <iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe>    
      <form enctype="multipart/form-data" target="nm_iframe" style="display:inline;">
      <input type="file" class="yhq" name="file" @change="upload" style="display:none" >
        <div class="picBox"  @click="openPic">
        点击添加图片
        <img class="showPic" src="" >
      </div>
     </form>
    <div style="padding:20px 0;">
    <el-button type="primary" @click="rejectSub" >提交</el-button>
    <el-button type="success" @click="dialogTableVisible=false">返回</el-button>
    </div>
    </el-dialog>
  </div>
</template>

<script>
import axios from 'axios'
import {getSysRole,getGoodsInfo,addCoop,findCoopById,updateCoop,uploadPic,shenhe} from '@/api'
import {getUser} from "@/utils/auth"
export default {
  data () {
    return {
      form: {
        coopPayType: "线上结算",
        coopActivity:"常规单",
        beginTime:"立即开始",
        coopZero:"零点"
      },
      shopDetail:{},
      optionList:[],
      flag :false,
      isUpadte:false,
      check:false,
      view:false,
      disabled:false,
      dialogTableVisible:false
    }
  },
  mounted(){
    
    this.getRole()
    if (this.$route.query.coopId) {
      this.isUpadte = true;
      this.getCoopDetail();
    }else{
      if(!this.$route.params) {
       this.$alert('未检测到店铺', '警告', {
          confirmButtonText: '确定',
          callback: action => {
              this.$router.go(-1)
          }
        });
      }
      this.form.coopDeptId=getUser().deptId
      this.form.coopGroupId = getUser().grouopId
      this.form.coopUserId=getUser().id
      this.shopDetail = this.$route.params
      this.form.coopCustomer = this.shopDetail.shopName;
      this.form.coopBossId = this.shopDetail.id
      this.form.coopBossName = this.shopDetail.shopBoss
    }
    if (this.$route.query.check) {
        this.check = true
        this.disabled = true
     
    }
    if (this.$route.query.view) {
        this.view = true
        this.disabled = true

    }
  },
  methods: {
     getObjectURL(file) {  
    var url = null;  
    if (window.createObjcectURL != undefined) {  
        url = window.createOjcectURL(file);  
    } else if (window.URL != undefined) {  
        url = window.URL.createObjectURL(file);  
    } else if (window.webkitURL != undefined) {  
        url = window.webkitURL.createObjectURL(file);  
    }  
    return url;  
   },
   openPic(e){
       e.currentTarget.previousElementSibling.click()
   },
    upload(e){
          let form  = e.currentTarget.parentElement
          let formData = new FormData() ;
          let file = document.getElementsByName("file")[0].files[0]
          let fileType = file.name.split(".")[1]
          let fileName = file.name.split(".")[0]
         if(!/\.(gif|jpg|jpeg|png|GIF|JPG|JPEG|PNG)$/.test('.'+fileType)){
            this.$errmsg("请上传图片格式文件")
         }else{
           let url = this.getObjectURL(file)
           let picBox = e.currentTarget.nextElementSibling.getElementsByClassName("showPic")[0]
           let type = e.currentTarget.getAttribute("data-id")
           console.log(type)
           formData.append('file',file);
          uploadPic(formData).then(res=>{
            if (res.success) {
              picBox.setAttribute("src",url)
              picBox.style.display = 'block'
                this.form.coopBeiyong = res.message
            }else{
              this.$errmsg(res.message)
            }
            console.log(res)
          })
         }
      },
    rejectSub(){
       if (this.form.coopShenheBz) {
        this.form.coopTbtype = "拒绝"
        this.form.coopShenheId = getUser().id;
        this.form.coopShenheTime = new Date();
         this.update()
       }else{
         this.$errmsg("请输入拒绝理由")
       }
    },
    pass(){
          this.$confirm('您即将通过该条提报, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
            this.form.coopShenheId = getUser().id;
            this.form.coopShenheTime = new Date();
            this.form.coopTbtype = "通过"
            this.update()
            
        }).catch(() => {
         
        });
    },
    reject(){
      this.dialogTableVisible = true
    },
    getCoopDetail(){
      findCoopById(this.$route.query.coopId).then(res=>{
        res.beginTime =res.coopYjscale?"预告":'立即开始'
        this.form = res
        if (this.check) {
        }else{
          this.form.coopDeptId=getUser().deptId
          this.form.coopGroupId = getUser().grouopId
          this.form.coopUserId=getUser().id
        }
       
        console.log(this.form)
      })
    },
    update(){
         shenhe(this.form).then(res=>{
            if (res.success) {
              this.$sucmsg("审核成功")
              this.$router.go(-1)
            }else{
              this.$errmsg(res.message)
            }
          })
    },
    checkGood(id){
      if (id) {
        getGoodsInfo(id).then(res=>{
          if(res.code==0){
            this.$sucmsg("验证完成，已上线")
            this.form.coopPttype = "已上线"
          }else{
            this.$sucmsg("验证完成，未上线")
            this.form.coopPttype = "未上线"
          }
          this.flag = true;
        })
      }else{
        this.$message("请输入商品id")
      }
        
    },
    viewGood(id,type){
      if (id) {
        if (type==1) {
          window.open(id)
        }else{
         window.open(`https://item.taobao.com/item.htm?ft=t&id=${id}`);   
        }
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
            if (this.isUpadte) {
              this.form.coopTbtime = new Date()
              this.form.coopTbtype = '待审核'
              this.form.coopShenheId = null;
              this.form.coopShenheTime = null;
              updateCoop(this.form).then(res=>{
                if (res.success) {
                  this.$sucmsg(res.message)
                  this.$router.go(-1)
                }else {
                  this.$errmsg(res.message)
                }
              })
            }else{
              if (this.form.beginTime === '立即开始') {
                this.form.coopStarttime = new Date() //若立即开始
              }
              console.log(this.form)
              this.form.coopTbtime = new Date()
              this.form.coopTbtype = '待审核'
              addCoop(this.form).then(res=>{
                console.log(res)
                if (res.success) {
                  this.$sucmsg(res.message)
                  this.$router.go(-1)
                }else {
                  this.$errmsg(res.message)
                }
              })
            }
          }else{
            this.$errmsg("请检测商品")
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
.checkBtn{
  display: flex;
  justify-content: flex-end;
  padding: 20px 0;
}
.picBox{
  width: 180px;
  height: 180px;
  border: 1px solid #ddd;
  border-radius: 10px;
  text-align: center;
  line-height: 180px;
  color: #409EFF;
  cursor: pointer;
  position: relative;
  margin-top: 20px;
  .showPic{
    width: 180px;
    height: 180px;
    position: absolute;
    top: 0;
    left: 0;
    display: none;
  }
}
</style>
