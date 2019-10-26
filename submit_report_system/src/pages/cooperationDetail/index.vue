<template>
  <div>
    <el-row>
      <el-form
        inline
        :model="form"
        ref="form"
        size="mini">
        <el-form-item prop="coopType" label="提报状态">
          <el-select v-model="form.coopType">
            <el-option v-for="(option, index) in submitOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="活动类型">
          <el-select v-model="form.name">
            <el-option v-for="(option, index) in actionOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="回款状态">
          <el-select v-model="form.name">
            <el-option v-for="(option, index) in paybackOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="提报时间">
           <el-date-picker
              v-model="form.name"
              type="daterange"
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期">
            </el-date-picker>
        </el-form-item>
        <br/>
        <el-form-item prop="onlineTimeBegin" label="上线时间">
           <el-date-picker
              v-model="form.onlineTimeBegin"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <span style="position:relative;top:5px;left:-5px;">至</span>
        <el-form-item prop="onlineTimeEnd">
            <el-date-picker
              v-model="form.onlineTimeEnd"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <el-form-item prop="shopName" label="店铺名称">
          <el-input v-model="form.shopName"/>
        </el-form-item>
        <el-form-item prop="shopId" label="商品ID">
          <el-input v-model="form.shopId"/>
        </el-form-item>
        <el-form-item prop="coopZero" label="是否零点">
          <el-select v-model="form.coopZero">
            <el-option v-for="(option, index) in isZeroOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <br/>
        <el-form-item prop="outlineTimeBegin" label="下线时间">
           <el-date-picker
              v-model="form.outlineTimeBegin"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <span style="position:relative;top:5px;left:-5px;">至</span>
        <el-form-item prop="outlineTimeEnd">
            <el-date-picker
              v-model="form.outlineTimeEnd"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <el-form-item prop="coopUserId" label="责任人">
          <el-select v-model="form.name">
            <el-option v-for="(option, index) in dutyPersonOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="是否查款">
          <el-select v-model="form.name">
            <el-option v-for="(option, index) in isExamineOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item prop="name" label="结算类型">
          <el-select v-model="form.name">
            <el-option v-for="(option, index) in settleStatusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="bindData">查询</el-button>
          <el-button @click="() => {this.form = {};this.bindData()}">重置</el-button>&nbsp;&nbsp;&nbsp;
          <span>驳回消息 0 条</span>
          <span class="link">点击查看</span>
          &nbsp;&nbsp;
          <!-- <el-button type="primary">下载模板</el-button>
          <el-button type="warning">上传数据</el-button> -->
          <span style="font-size: 12px;">店铺数： 123</span>
        </el-form-item>
      </el-form>
      <el-table
        style="width: 100%;"
        v-loading="loading"
        :data="cooperationDetailTableData"
        size="mini">
        <el-table-column type="selection"></el-table-column>
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column prop="coopType" label="提报状态"></el-table-column>
        <el-table-column prop="coopPttype" label="平台状态"></el-table-column>
        <el-table-column prop="coopCustomer" label="商家客户"></el-table-column>
        <el-table-column prop="coopMainpicture" label="商家主图">
                <template   slot-scope="scope">            
                    <img :src="scope.row.coopMainpicture"  min-width="70" height="70" />
                </template>   
        </el-table-column>
        <el-table-column prop="coopActivity" label="商家活动"></el-table-column>
        <el-table-column prop="coopGoodsId" label="商品ID"></el-table-column>
        <el-table-column prop="coopZero" label="零点提报"></el-table-column>
        <el-table-column prop="coopAlterprice" label="券后价"></el-table-column>
        <el-table-column prop="coopYhqnums" label="优惠券总量"></el-table-column>
        <el-table-column prop="coopYjscale" label="佣金比例"></el-table-column>
        <el-table-column prop="coopTbtime" label="提报时间"  width="100px"></el-table-column>
        <el-table-column prop="coopStarttime" label="上线时间" width="100px"></el-table-column>
        <el-table-column prop="coopEndtime" label="结束时间"  width="100px"></el-table-column>
        <el-table-column prop="coopBack" label="回款金额"></el-table-column>
        <el-table-column prop="coopDeptId" label="部门"></el-table-column>
        <el-table-column prop="coopUser" label="责任人"></el-table-column>
        <el-table-column prop="coopYhqName" label="优惠券名称"></el-table-column>
        <el-table-column prop="coopMessage" label="备注"></el-table-column>
        <el-table-column prop="name" label="操作" width="360px">
          <template slot-scope="scope">
            <span class="flex">
              <el-button size="mini" type="primary" @click="viewGood(scope.row.coopGoodsId)">查看商品</el-button>
              <el-button size="mini">撤回</el-button>
              <el-button size="mini" type="warning">重新提报</el-button>
              <el-button size="mini" type="primary" @click="nav2Checking(scope.row)">查款</el-button>
              <el-button size="mini" type="warning">返/退款</el-button>
            </span>
          </template>
        </el-table-column>
      </el-table>
      <Page style="text-align:right;margin-top:10px;" :page="page" @change="bindData"/>
    </el-row>
  </div>
</template>

<script>
import Page from '@/components/page'
import { getCooperationPage ,getDeptByList,getUserByList} from '@/api'
export default {
  components: {
    Page
  },
  data () {
    return {
      form: {},
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
      loading: false,
      submitOptions: [ // 提报状态options
        { label: '全部', value: '全部' },
        { label: '品控驳回', value: '品控驳回' },
        { label: '大淘客平台审核中', value: '大淘客平台审核中' },
        { label: '大淘客平台驳回', value: '大淘客平台驳回' },
        { label: '大淘客在线', value: '大淘客在线' },
        { label: '大淘客下线', value: '大淘客下线' }
      ],
      actionOptions: [ // 活动类型
        { label: '全部', value: '全部' },
        { label: '聚划算', value: '聚划算' },
        { label: '淘抢购', value: '淘抢购' },
        { label: '常规推广', value: '常规推广' }
      ],
      paybackOptions: [ // 回款状态
        { label: '全部', value: '全部' },
        { label: '已回款', value: '已回款' },
        { label: '待回款', value: '待回款' },
        { label: '推广中', value: '推广中' }
      ],
      isZeroOptions: [ // 是否零点
        { label: '全部', value: '全部' },
        { label: '非零点', value: '非零点' },
        { label: '零点', value: '零点' }
      ],
      dutyPersonOptions: [
        { label: '全部', value: '全部' }
      ],
      isExamineOptions: [ // 是否查款
        { label: '全部', value: '全部' },
        { label: '已查款', value: '已查款' },
        { label: '未查款', value: '未查款' }
      ],
      settleStatusOptions: [ // 结算类型
        { label: '全部', value: '全部' },
        { label: '线上结算', value: '线上结算' },
        { label: '线下结算', value: '线下结算' }
      ],
      cooperationDetailTableData: [],
      userList:[],
      // groupList:{},
      deptList:[],
    }
  },
  mounted () {
    this.getUserList()
    this.getDeptList()
    this.bindData()
  },
  methods: {
   
    viewGood(id){
         window.open(`https://item.taobao.com/item.htm?ft=t&id=${id}`);   
    },
      getDeptList () {
      getDeptByList().then(res => {
        // console.log(res)
        this.deptList = res
      })
    },
      getUserList(){
      getUserByList().then(res=>{
        this.userList = res
      })
    },
    //  getGroupList() {
    //   getGroupByList().then(res => {
    //     this.groupList = res
    //   })
    // },
    bindData () {
      const form = this.form
      const page = this.page.pageNum
      const rows = this.page.pageSize
      this.loading = true
      getCooperationPage(form, page, rows).then(res => {
         res.rows.forEach((item,index)=>{
           let list =["coopEndtime","coopStarttime","coopTbtime"]
           list.forEach(obj=>{
             item[obj] = this.getMyDate(item[obj])
            // console.log(oTime)
           })
            // item.coopEndtime = new Date(item.coopEndtime);
            // item.coopStarttime = new Date(item.coopStarttime);
            // item.coopTbtime = new Date(item.coopTbtime)
              this.deptList.forEach(obj=>{
                if(item.coopDeptId == obj.deptId ){
                  item.coopDeptId = obj.deptName
                }
              })
              this.userList.forEach(obj=>{
                if(item.coopUserId ==obj.id ){
                  item.coopUser = obj.username
                }
              })
   
          })
        console.log(res)

        this.cooperationDetailTableData = res.rows
        this.page.total = res.total
        this.loading = false
      })
        .catch(() => {
          this.loading = false
        })
    },
    nav2Checking (obj) {
      this.$router.push({path: 'checking',name:"check",params:obj})
    },
  getMyDate(str) {
    var oDate = new Date(str)
    let oYear = oDate.getFullYear()
    let oMonth = oDate.getMonth()+1
    let oDay = oDate.getDate()
    let oTime = oYear +'-'+ oMonth +'-'+oDay
    return oTime;
    }

  }
}
</script>

<style scoped lang='less'>
.link {
  color: blue;text-decoration:underline;cursor:pointer;
}
.flex {
  display: flex;
  // justify-content: space-between;
}
.el-button+.el-button {
  margin-left: 2px;
}
</style>
