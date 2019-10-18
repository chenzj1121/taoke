<template>
  <div class="home_wrap">
    <el-row>
      <el-button type="primary" size="mini" style="float:right;margin-bottom:20px;" @click="nav2WriteTarget">目标填写</el-button>
    </el-row>
    <el-row>
      <el-table :data="tableData" border size="mini">
        <el-table-column align="center" label="当月工作进度表">
          <el-table-column>目标</el-table-column>
          <el-table-column label="月目标" prop="target"></el-table-column>
          <el-table-column label="应完成" prop="shouldBeDone"></el-table-column>
          <el-table-column label="实际完成" prop="hasDone"></el-table-column>
          <el-table-column label="完成率" prop="donePercent"></el-table-column>
          <el-table-column label="实际进度目标进度差" prop="diff"></el-table-column>
          <el-table-column label="目标进度" prop="plannedSpeed"></el-table-column>
          <el-table-column label="本月天数" prop="monthDays"></el-table-column>
          <el-table-column label="日期" prop="day"></el-table-column>
        </el-table-column>
      </el-table>
    </el-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      tableData: []
    }
  },
  methods: {
    nav2WriteTarget () {
      this.$router.push({ path: '/customer/writeTarget' })
    }
  }
}
</script>

<style scoped>
.home_wrap {
  width: 100%;
  height: 100%;
}
</style>
