<template>
  <div>
    <div class="title">后台明细</div>
    <el-form inline size="mini">
      <div v-if="type==0 || type ==1">
      <el-form-item label="销售部" v-if="isBoss">
       <el-select v-model="form.deptId" placeholder="请选择" @change="getGroup(form.deptId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  deptList" :key="i" :value="item.deptId" :label="item.deptName"></el-option>
              </el-select>
      </el-form-item>
      <el-form-item label="组别" v-if="isBoss">
         <el-select v-model="form.groupId" placeholder="请选择" @change="getMember(form.deptId,form.groupId)">
              <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  gruopList2" :key="i" :value="item.groupId" :label="item.groupName"></el-option>
              </el-select>
      </el-form-item>
      <el-form-item label="责任人">
        <el-select v-model="form.useId" placeholder="请选择">
                <el-option value="" label="全部"></el-option>
                <el-option v-for="(item,i) in  memberList" :key="i" :value="item.id" :label="item.username"></el-option>
              </el-select>
      </el-form-item>
      </div>
      <el-form-item label="店铺名称">
        <el-input v-model="form.shopName"></el-input>
      </el-form-item>
      <el-form-item label="商品ID">
        <el-input v-model="form.goodsId"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="结算时间">
        <!-- <el-date-picker
          v-model="form.createTime"
          type="date"
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期">
        </el-date-picker> -->
          <el-col :span="11">
         <el-date-picker type="date" placeholder="开始日期" v-model="form.createTime" style="width: 100%;"   value-format='timestamp'></el-date-picker>
        </el-col>
        <el-col class="line" :span="2">至</el-col>
        <el-col :span="11">
          <el-date-picker  type="date" placeholder="结束时间" v-model="form.maxJsTime" style="width: 100%;"   value-format='timestamp'></el-date-picker>
        </el-col>
      </el-form-item>
      <el-form-item label="订单号搜索">
        <el-input v-model="form.orderId"></el-input>
      </el-form-item>
      <el-form-item label="状态">
        <el-select v-model="form.goodsType">
          <el-option v-for="(option, index) in statusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="结算金额排序">
        <el-select v-model="form.sort">
          <el-option v-for="(option, index) in orderByOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <br/>
      <el-form-item>
        <el-button type="primary" @click="getDetailList">查询</el-button>
      </el-form-item>
      <el-form-item label="付款服务费总额">
        <el-input v-model="payNum"></el-input>
      </el-form-item>
      <el-form-item label="结算服务费总额">
        <el-input v-model="jsNum"></el-input>
      </el-form-item>
      <el-form-item>
        <span>驳回消息 0 条</span>
        <span class="link">点击查看</span>
      </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="downloadFile">下载表格</el-button>
          <iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe>    
        <form enctype="multipart/form-data" target="nm_iframe" id="form" style="display:inline">
          <!-- <el-button size="small" type="primary">点击上传</el-button> -->
           <input type="file"  name="file" style="display:none" id="filebox" @change="upload">
            <input type="hidden"  id="ssFile" name="ssFile">
          <el-button size="mini" type="primary" @click="openFile" v-if="type==0">导入表格</el-button>

          <!-- <input type="submit" @click="upload"> -->
        </form> 
          <!-- <el-button size="small" type="primary" @click="upload">点击上传</el-button>
        <input class="easyui-filebox" type="file" name="file1" id="file1">
        用于文件名回显 -->
        </el-form-item>
    </el-form>
    <el-table
      :data="afterDetailTableData"
      size="mini">
      <el-table-column type="index" label="序号"></el-table-column>
      <el-table-column label="所属部门" prop="deptName"></el-table-column>
      <el-table-column label="组别" prop="groupName"></el-table-column>
      <el-table-column label="责任人" prop="creater"></el-table-column>
      <el-table-column label="订单状态" prop="goodsType"></el-table-column>
      <el-table-column label="店铺名称" prop="shopName"></el-table-column>
      <el-table-column label="商品ID" prop="goodsId"></el-table-column>
      <el-table-column label="订单数" prop="goodsCounts"></el-table-column>
      <el-table-column label="服务费比例" prop="ordersFl"></el-table-column>
      <el-table-column label="付款金额" prop="pay"></el-table-column>
      <el-table-column label="付款服务费" prop="payAbout"></el-table-column>
      <el-table-column label="结算金额" prop="payMoney"></el-table-column>
      <el-table-column label="结算服务费" prop="moneyAbout"></el-table-column>
    </el-table>
    <!-- <el-pagination
      style="text-align: right;margin-top:10px;"
      background
      layout="prev, pager, next"
      :total="1000">
    </el-pagination> -->
    <Page style="text-align: right;margin-top: 10px;" :page="page" @change="getDetailList" />
  </div>
</template>

<script>
import {getDetail,getDeptByList,getGroupByList,getUserById,getGroupMember,getUserByList,PRE_URL,uploadDetail,getPayMoney,getJsMoney} from "@/api/index"
import Page from '@/components/page'
import { getUser } from '@/utils/auth'
export default {
   components: {
    Page
  },
  data () {
    return {
      form: {
        goodsType:"订单结算",
        payNum:0,
        checkNum:0,
      },
      departmentOptions: [],
      groupOptions: [],
      principalOptions: [],
      statusOptions: [
        { label: '全部', value: null },
        { label: '订单结算', value: '订单结算' },
        { label: '订单付款', value: '订单付款' },
        // { label: '订单成功', value: '订单成功' },
        // { label: '订单失效', value: '订单失效' }
      ],
      orderByOptions: [
        { label: '全部', value: '全部' },
        { label: '由高到低', value: '由高到低' },
        { label: '由低到高', value: '由低到高' }
      ],
      afterDetailTableData: [],
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
      userList:[],
      deptList:[],
      groupList:[],
      gruopList2:[],//部门联动-小组
      memberList:[],//部门联动-员工
      type:2,
      isBoss:false,
      payNum:0,
      jsNum:0,
    }
  },
  mounted(){
    this.type = getUser().type
    this.getUserList()
    this.getGroupList()
    this.getDeptList()
    this.getDetailList()
    this.getPay()
    if (this.type==0) {
      this.isBoss =true
    }else{
      this.form.deptId = getUser().deptId
      this.form.groupId = getUser().groupId
      this.getMember( this.form.deptId,this.form.groupId)
    }
  },
  methods:{
    getPay(){
      getPayMoney(this.form).then(res=>{
        this.payNum = res
      })
    },
    getJs(){
      getJsMoney(this.form).then(res=>{
        this.jsNum = res
      })
    },
    openFile(){
      document.getElementById("filebox").click()
    },
    upload(e){
      // let index = e.currentTarget.getAttribute("data-id");
      // let file = e.currentTarget.files[0];
      // console.log(file)
      //  var file1 = document.getElementById("file1");  
      //   var ssFile = document.getElementById("ssFile");  
      //       ssFile.value = file1.value.substring(12);    //取出文件名，并赋值回显到文本框，用于向后台传文件名
      //   $.ajaxFileUpload({
      //       url : `${PRE_URL}/backgroundDetails/upload.do`, //用于文件上传的服务器端请求地址
      //       fileElementId : 'file1', //文件上传空间的id属性  <input type="file" id="file" name="file" />
      //       type : 'post',
      //       dataType : 'text', //返回值类型 一般设置为json
      //       success : function(data, status) //服务器成功响应处理函数
      //       {
      //           alert("文件上传成功");
      //       },
      //       error : function(data, status, e)//服务器响应失败处理函数
      //       {
      //           alert("文件上传失败");
      //       }
      //   });
      let form = document.getElementById("form")
      var formData = new FormData() ;
      let file = document.getElementsByName("file")[0].files[0]
      let fileType = file.name.split(".")[1]
      let fileName = file.name.split(".")[0]
      if(fileType=="xls" || fileType =="xlsx"){
        formData.append("filebox",file);
         uploadDetail(formData).then(res=>{
            if(res.success){
              this.$sucmsg(res.message)
            }else{
              this.$errmsg(res.message)
            }
          })
      }else{
        this.$errmsg("请上传excel格式文件")
      }   
      
    },
    downloadFile(){
      window.open(PRE_URL+"/backgroundDetails/download.do?filename=moban.xls", '_blank');
    },
      getUserList(){
      getUserByList().then(res=>{
        // console.log(res);
        this.userList = res
      })
    },
      getDeptList () {
      getDeptByList().then(res => {
        // console.log(res)
        this.deptList = res
      })
    },
    getGroupList() {
      getGroupByList().then(res => {
        // console.log(res)
        this.groupList = res
      })
    },
    getDetailList(){
      var param = {}
      param.sysUser = this.form
      param.pageNum = this.page.pageNum
      param.pageSize = this.page.pageSize
    getDetail(this.form,this.page.pageNum,this.page.pageSize).then(res=>{
       res.rows.forEach((item,index)=>{
              this.groupList.forEach((obj)=>{
                 if(item.deptId == obj.groupDeptId && item.groupId ==obj.groupId){
                      item.groupName = obj.groupName
                      item.deptName = obj.groupName
                  }
              })
                this.userList.forEach(obj=>{
                if(item.useId ==obj.id ){
                  item.creater = obj.username
                }
              })
          // this.form.payNum= (this.form.payNum+item.payAbout)

          })
          // this.form.payNum = this.form.payNum.toFixed(2)
          this.page.total = res.total
          this.afterDetailTableData = res.rows
    })
    },
      getGroup(id){
      // console.log(id)
  
        this.form.groupId = null;
        if( this.form.useId){ this.form.useId = null;}
        this.gruopList2 = []
        this.memberList = []
      if(id){
      //  this.form.shopDeptId =null;
      this.groupList.map(item=>{
        if(item.groupDeptId==id){
          this.gruopList2.push(item)
        }
      })
      }
    },
    getMember(deptId,groupId){
      console.log(deptId,groupId)
        if( this.form.useId){ this.form.useId = null;}
      this.memberList = [];
      if(deptId && groupId){
      //  this.form.groupId = null;
        getGroupMember(deptId,groupId).then(res=>{
          this.memberList = res
        })
      }
    },
  }
}
</script>

<style scoped lang='less'>
.title {
  padding: 10px;
  background: #eee;
  margin-bottom: 10px;
}
.link {
  color: blue;
  cursor: pointer;
  text-decoration: underline;
}
</style>
