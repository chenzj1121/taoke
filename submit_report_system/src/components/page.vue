<template>
  <div>
    <el-pagination
        background
        class="pagination"
        layout="prev, pager, next"
        :current-page="page.pageNum"
        :page-size="page.pageSize"
        @current-change="handleCurrentChange"
        :total="page.total">
      </el-pagination>
  </div>
</template>

<script>
export default {
  props: ['page'],
  data () {
    return {
    }
  },
  methods: {
    handleCurrentChange (option) {
      if (!option) {
        this.page.pageNum = 1
      }
      this.page.pageNum = option
      this.$emit('change')
    }
  }
}
</script>

<style scoped lang='less'>

</style>
