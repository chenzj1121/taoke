<template>
  <div>
    <div class="title">后台明细</div>
    <el-form inline size="mini">
      <el-form-item label="销售部">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in departmentOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="组别">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in groupOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="责任人">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in principalOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="店铺名称">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="商品ID">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="结算时间">
        <el-date-picker
          v-model="form.name"
          type="daterange"
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="订单号搜索">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="状态">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in statusOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="结算金额排序">
        <el-select v-model="form.name">
          <el-option v-for="(option, index) in orderByOptions" :key="index" :label="option.label" :value="option.value"></el-option>
        </el-select>
      </el-form-item>
      <br/>
      <el-form-item>
        <el-button type="primary">查询</el-button>
      </el-form-item>
      <el-form-item label="付款服务费总额">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="结算服务费总额">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item>
        <span>驳回消息 0 条</span>
        <span class="link">点击查看</span>
      </el-form-item>
    </el-form>
    <el-table
      :data="afterDetailTableData"
      size="mini">
      <el-table-column type="index" label="序号"></el-table-column>
      <el-table-column label="所属部门" prop="name"></el-table-column>
      <el-table-column label="组别" prop="name"></el-table-column>
      <el-table-column label="责任人" prop="name"></el-table-column>
      <el-table-column label="店铺名称" prop="name"></el-table-column>
      <el-table-column label="商品ID" prop="name"></el-table-column>
      <el-table-column label="订单数" prop="name"></el-table-column>
      <el-table-column label="服务费比例" prop="name"></el-table-column>
      <el-table-column label="付款金额" prop="name"></el-table-column>
      <el-table-column label="付款服务费" prop="name"></el-table-column>
      <el-table-column label="结算金额" prop="name"></el-table-column>
      <el-table-column label="结算服务费" prop="name"></el-table-column>
    </el-table>
    <el-pagination
      style="text-align: right;margin-top:10px;"
      background
      layout="prev, pager, next"
      :total="1000">
    </el-pagination>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {},
      departmentOptions: [],
      groupOptions: [],
      principalOptions: [],
      statusOptions: [
        { label: '订单结算', value: '订单结算' },
        { label: '订单付款', value: '订单付款' },
        { label: '订单成功', value: '订单成功' },
        { label: '订单失效', value: '订单失效' }
      ],
      orderByOptions: [
        { label: '全部', value: '全部' },
        { label: '由高到低', value: '由高到低' },
        { label: '由低到高', value: '由低到高' }
      ],
      afterDetailTableData: []
    }
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
