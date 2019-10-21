<template>
  <div class="home_wrap">
    <el-row>
      <el-button type="primary" size="mini" style="float:right;margin-bottom:20px;" @click="nav2WriteTarget">目标填写</el-button>
    </el-row>
    <el-row> 
      <el-table :data="tableData" border size="mini" align="center"  v-loading="loading"  :header-cell-style="tableHeaderColor"  :row-style="tableRowStyle">
        <el-table-column align="center" label="当月工作进度表">
          <el-table-column align="center">目标</el-table-column>
          <el-table-column label="月目标" prop="target" align="center" class="big"></el-table-column>
          <el-table-column label="应完成" prop="shouldBeDone"  align="center"></el-table-column>
          <el-table-column label="实际完成" prop="hasDone"  align="center"></el-table-column>
          <el-table-column label="完成率" prop="donePercent"  align="center"></el-table-column>
           <el-table-column label="实际进度目标进度差"  align="center"> <el-table-column prop="diff"  align="center"></el-table-column> <el-table-column prop="diff2"  align="center"></el-table-column></el-table-column>
          <el-table-column label="目标进度" prop="plannedSpeed"  align="center"></el-table-column>
          <el-table-column label="本月天数" prop="monthDays"  align="center"></el-table-column>
          <el-table-column label="日期" prop="day"  align="center"></el-table-column>
        </el-table-column>
      </el-table>
    </el-row>
  </div>
</template>

<script>
import { findTarget } from '@/api'
import {getUser} from '../../utils/auth'
export default {
  data () {
    return {
      tableData: [],
      loading:true
    }
  },
  mounted(){
    let userId = getUser().id;
    let date = new Date();
    let month = date.getMonth()+1;
    let year = date.getFullYear()
     let data = {
       userId,
       month,
       year
    }
    findTarget(userId,year,month).then(res=>{
      this.loading = false
      let list = {
        target: res.workTarget,
      }
      let nowDay = date.getDate();
      let fullDay = new Date(date.getFullYear(),(date.getMonth()+1),0).getDate() //当月总天数
      list.shouldBeDone = (list.target/fullDay*nowDay).toFixed(2);
      list.hasDone = res.firstWeekCustom+res.secondWeekCustom+res.thirdWeekCustom+res.fourthWeekCustom+res.fifthWeekCustom
      list.donePercent = (list.hasDone/list.target*100).toFixed(2)+"%";
      list.diff = (list.target - list.hasDone)>0?"-"+ (list.target - list.hasDone):"+"+ (list.target - list.hasDone)*(-1)
      list.plannedSpeed = (nowDay/fullDay*100).toFixed(2)+"%"
      list.monthDays = fullDay;
      list.day =nowDay;
      list.diff2 = ((list.hasDone/list.target-nowDay/fullDay)*100).toFixed(2)+"%"
      this.tableData.push(list)
      
    })
  },
  methods: {
    nav2WriteTarget () {
      this.$router.push({ path: '/customer/writeTarget' })
    },
    tableHeaderColor(row,column,rowIndex,columnIndex){
        return 'font-wight:800;font-size:20px;text-align:center;'
    },
     tableRowStyle({row,rowIndex}){
                return 'font-size:15px;background:yellow;font-weight:800'
      },
  }
}
</script>

<style >
.home_wrap {
  width: 100%;
  height: 100%;
}

</style>
