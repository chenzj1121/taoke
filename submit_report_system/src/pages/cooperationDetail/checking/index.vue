<template>
  <div>
    <el-form
      inline
      size="mini"
      label-position="left"
      label-width="150px">
      <el-form-item label="推广店铺：">
        <el-input v-model="shopDetail.shopName" disabled></el-input>
      </el-form-item>
      <el-form-item label="店铺多选：">
        <el-select multiple v-model="form.shop" >
          <el-option v-for="(option, index) in sameShop" :key="index" :label="option.shopName" :value="option.id"></el-option>
        </el-select>
      </el-form-item>
      <br/>
      <el-form-item label="商品信息：">
        <el-dialog
          title="店铺下的商品合作记录"
          :visible.sync="dialogVisible"
          width="80%">
         <el-table :data="coopDetail"
          @selection-change="handleSelectionChange"
          ref="coopTable"
         >
          <el-table-column type="selection" width="55"></el-table-column>
          <el-table-column label="序号" type="index"></el-table-column>
          <el-table-column prop="coopCustomer" label="店铺名称" ></el-table-column>
          <el-table-column prop="coopGoodsId" label="商品ID" ></el-table-column>
          <el-table-column prop="coopStarttime" label="上线时间" ></el-table-column>
          <el-table-column prop="coopEndtime" label="下线时间" ></el-table-column>
          <el-table-column prop="coopYhqName" label="优惠券名称" ></el-table-column>
          <el-table-column prop="coopServiceFee" label="服务费单价" ></el-table-column>
        </el-table>
          <Page style="text-align: right;margin-top: 10px;" :page="page" @change="getCoopDetail"/>
          <el-button  @click="saveCoop" >保存</el-button>
        </el-dialog>
        <el-button type="primary" @click="dialogVisible = true">新建</el-button>
        <el-button type="success">一键保存</el-button>
         <el-table
         style="margin-top:20px;width:1000px"
           :data="multipleSelection"
            :row-style="{ textAlign:'center' }"
            :header-cell-style="{ textAlign: 'center', background: '#eee' }"
            v-if="multipleSelection[0]?true:false">
           <el-table-column prop="coopGoodsId" label="商品ID"></el-table-column>
           <el-table-column prop="coopStarttime" label="推广开始时间"></el-table-column>
           <el-table-column prop="coopEndtime" label="推广结束时间"></el-table-column>
           <el-table-column  label="优惠卷名称">
                 <template slot-scope="scope">
                    <el-input v-model="scope.row.goodsYhqName" ></el-input>
                 </template>
           </el-table-column>
           <el-table-column  label="结算量">
            <template slot-scope="scope">
                    <el-input v-model="scope.row.goodsNums" ></el-input>
                 </template>
           </el-table-column>
           <el-table-column prop="coopServiceFee" label="服务费单价"></el-table-column>
           <el-table-column  label="单品结算金额">
            <template slot-scope="scope">
                    <el-input v-model="scope.row.goodsPayMoney" ></el-input>
                 </template>
           </el-table-column >
            <!-- <el-table-column label="操作">
            <span>保存</span>
          </el-table-column> -->
         </el-table>
         <el-button type="primary" @click="addGoods">保存</el-button>
      </el-form-item>
      <br/>
      <el-form-item label="优惠券名称：" :rules="[{ required: true, message: '不能为空' }]">
        <el-input v-model="form.cmYhqName"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="结算金额：" :rules="[{ required: true, message: '不能为空' }]">
        <el-input v-model="form.cmJsMoney" type="number"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="是否填写返款：" :rules="[{ required: true, message: '不能为空' }]">
        <el-radio v-model="form.isChecking" :label="true">是</el-radio>
        <el-radio v-model="form.isChecking" :label="false">否</el-radio>
      </el-form-item>
      <br/>
      <div v-if="form.isChecking">
        <el-form-item label="销售花名：" :rules="[{ required: true, message: '不能为空' }]">
          <el-input v-model="form.bmUserName"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款比例：" :rules="[{ required: true, message: '不能为空' }]">
          <el-input v-model="form.bmBackBl"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款金额：" :rules="[{ required: true, message: '不能为空' }]">
          <el-input v-model="form.bmBackMoney"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款银行：" :rules="[{ required: true, message: '不能为空' }]">
          <el-radio v-model="form.isAlipay" label="支付宝">支付宝</el-radio>
          <el-radio v-model="form.isAlipay" label="银行卡">银行卡</el-radio>
        </el-form-item>
        <el-form-item v-if="form.isChecking && form.isAlipay=='银行卡'" :rules="[{ required: true, message: '不能为空' }]">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款账户：" :rules="[{ required: true, message: '不能为空' }]">
          <el-input v-model="form.bmBackAccount"></el-input>
        </el-form-item>
        <br/>
        <el-form-item label="返款账号：" :rules="[{ required: true, message: '不能为空' }]">
          <el-input v-model="form.bmBackAccountumber"></el-input>
        </el-form-item>
        <br/>
      </div>
      <el-form-item label="优惠券使用情况截图：">
        <!-- <el-upload
          action="https://jsonplaceholder.typicode.com/posts/"
          list-type="picture-card">
          <i class="el-icon-plus"></i>
        </el-upload> -->
          <iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe>    
        <form enctype="multipart/form-data" target="nm_iframe" style="display:inline">
        <input type="file" class="yhq" name="file" @change="upload" style="display:none" data-id="1" >
         <div class="picBox"  @click="openPic">
          点击添加图片
          <img class="showPic" src="" >
        </div>
        </form>
       
      </el-form-item>
      <br/>
      <el-form-item label="打款截图：">
        <form enctype="multipart/form-data" target="nm_iframe" style="display:inline">
        <input type="file" class="yhq" name="file" @change="upload" style="display:none" data-id="2" >
         <div class="picBox"  @click="openPic">
          点击添加图片
          <img class="showPic" src="" >
        </div>
        </form>
      </el-form-item>
      <br/>
      <el-form-item label="转入账户">
        <el-select v-model="form.cmLoadCustomer">
          <el-option v-for="(option, index) in accountOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <br/>
      <el-form-item label="查款备注：">
        <el-input type="textarea" v-model="form.cmText"></el-input>
      </el-form-item>
      <br/>
      <div v-if="form.isChecking">
        <el-form-item label="返款备注：">
          <el-input type="textarea" v-model="form.name"></el-input>
        </el-form-item>
        <br/>
      </div>
      <el-form-item>
        <el-button type="primary" @click="addCheck">保存</el-button>
        <el-button @click="back">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import { getMoreShop,getHisCoop,addCheckMoney,findCoop,getShopById,addBackMoney,addGoodsDetail,uploadPic} from '@/api'
import {getUser} from "@/utils/auth"
import Page from '@/components/page'
export default {
   components: {
    Page
  },
  data () {
    return {
      form: {
        isChecking: false,
        isAlipay: true
      },
      accountOptions: [
        { label: '支付宝', value: '支付宝' },
        { label: '银行卡', value: '银行卡' },
        { label: '对公银行卡', value: '对公银行卡' }
      ],
      imageUrl: undefined,
      sameShop:[],
      coopDetail:[],
      multipleSelection :[],
      page: {
        pageSize: 5,
        pageNum: 1,
        total: 0
      },
      dialogVisible:false,
      shopDetail:{},
      userInfo:{},

    }
  },
  mounted(){
    if (!this.$route.query.id) {
      this.$router.go(-1);
      this.$errmsg("失去店铺数据,请重新进入")
    }
    this.getShop(this.$route.query.id)
    this.userInfo= getUser()
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
      // let form = document.getElementById("form")
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
              if (type==1) {
                this.form.cmYhqPhoto = res.message
              }else{
                this.form.cmYhqType = res.message
              }
            }else{
              this.$errmsg(res.message)
            }
            console.log(res)
          })
         }
        },
    addGoods(){
      this.multipleSelection.forEach((item,index)=>{
        item.goodsId =  item.coopGoodsId
        item.goodsStarttime = item.coopStarttime
        item.goodsEndtime =item.coopEndtime
        item.goodsPayMoney = item.coopServiceFee
        item.goodsShopId = this.$route.query.id
        item.goodsDeptId =this.userInfo.deptId
        item.goodsGroupId =this.userInfo.groupId
        item.goodsUserId =this.userInfo.id
        item.goodsService = item.coopServiceFee
        // item.goodsShopName = item.coopCustomer
        addGoodsDetail(item).then(res=>{
            if (res.success) {
              this.$sucmsg("商品信息，第"+index+"条数据传输成功")
            }else{
               this.$errmsg("商品信息，第"+index+"条数据传输失败")
            }
        })  
      })
      console.log(this.multipleSelection)
    },
    getShop(id){
        getShopById(id).then(res=>{
          if (res) {
              this.getShopByName(res.shopBoss)
              this.getCoopDetail(this.$route.query.id,res.shopName)
              this.shopDetail = res
          }else{
            this.$errmsg("未找到信息")
          }
         
        })
    },
    getMyDate(str) {
    var oDate = new Date(str)
    let oYear = oDate.getFullYear()
    let oMonth = oDate.getMonth()+1
    let oDay = oDate.getDate()
    let oTime = oYear +'-'+ oMonth +'-'+oDay
    return oTime;
    },
    addCheck(){
      this.form.cmUserId = this.userInfo.id
      this.form.cmSellDept = this.userInfo.groupId
      this.form.cmDept = this.userInfo.deptId;
      this.form.cmShopName =this.shopDetail.shopName
      this.form.cmShopId = this.shopDetail.id
      this.form.cmApplyTime = new Date()
      console.log(this.form)
      console.log(this.userInfo)
      addCheckMoney(this.form).then(res=>{
        if (res.success) {
            this.$sucmsg(res.message)
        }else{
            this.$errmsg(res.message)
        }
      })
      if (this.form.isChecking) {
       this.addBack()
      }
    },
    addBack(){
        this.form.bmUserId = this.userInfo.id
        this.form.bmGroupId = this.userInfo.groupId
        this.form.bmDeptId = this.userInfo.deptId;
        this.form.bmShopName =this.shopDetail.shopName
        this.form.bmJsMoney = this.form.cmJsMoney
        this.form.bmYhqName =this.form.cmYhqName
        this.form.bmBackType = this.form.isAlipay
            addBackMoney(this.form).then(res=>{
            if (res.success) {
                  this.$sucmsg(res.message)
              }else{
                  this.$errmsg(res.message)
              }
            })
    },
    handleSelectionChange(val) {
        this.multipleSelection = val;
    },
    saveCoop(){
      // console.log(this.multipleSelection)
      this.dialogVisible = false
    },
    getCoopDetail(coopBossId,coopCustomer){
      getHisCoop({coopBossId,coopCustomer},this.page.pageNum,this.page.pageSize).then(res=>{
        res.rows.forEach(item=>{
          item.coopStarttime = this.getMyDate(item.coopStarttime)
          item.coopEndtime = this.getMyDate(item.coopEndtime)
        })
        console.log(res.rows)
          this.coopDetail = res.rows
          this.page.total = res.total
      })
    },
    getShopByName(name){
      getMoreShop({shopBoss:name},1,100).then(res=>{
        // console.log(res)
        this.sameShop = res.rows
      })
    },
    back () {
      this.$router.go(-1)
    }
  }
}

</script>

<style scoped lang='less'>
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
  .showPic{
    width: 180px;
    height: 180px;
    position: absolute;
    top: 0;
    left: 0;
    display: none;
  }
}
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
