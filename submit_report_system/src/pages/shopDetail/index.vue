<template>
  <div>
    <el-row>
      <el-button size="mini" @click="back">返回</el-button>
      <el-button type="primary" size="mini" @click="updateInfo">信息修改</el-button>
    </el-row>
    <el-row>
      <div class="title">项目基本信息</div>
      <Form :form="form" :writeable="false"/>
    </el-row>
    <el-row>
      <hr/>
      <el-button size="mini" type="primary" @click="nav2CooperationDetail">订单提报</el-button>
      <el-button size="mini" type="primary">查款</el-button>
      <el-button size="mini" type="primary">合同单录入</el-button>
      <div class="title">合作记录</div>
      <el-table
        size="mini"
        border
        :data="cooperationRecordTableData"
        style="width: 100%;">
        <el-table-column type="selection" width="55"></el-table-column>
        <el-table-column label="序号" type="index"></el-table-column>
        <el-table-column label="提报状态" prop="name"></el-table-column>
        <el-table-column label="平台状态" prop="name"></el-table-column>
        <el-table-column label="商品主图" prop="name"></el-table-column>
        <el-table-column label="商品活动" prop="name"></el-table-column>
        <el-table-column label="商品ID" prop="name"></el-table-column>
        <el-table-column label="券后价" prop="name"></el-table-column>
        <el-table-column label="优惠券总量" prop="name"></el-table-column>
        <el-table-column label="佣金比例" prop="name"></el-table-column>
        <el-table-column label="结算金额" prop="name"></el-table-column>
        <el-table-column label="回款金额" prop="name"></el-table-column>
        <el-table-column label="服务费" prop="name"></el-table-column>
      </el-table>
    </el-row>
    <el-row>
      <div class="title">跟进记录</div>
      <el-table
        size="mini"
        border
        :data="followRecordTableData"
        style="width: 100%;">
        <el-table-column label="序号" type="index"></el-table-column>
        <el-table-column label="跟进时间" prop="name"></el-table-column>
        <el-table-column label="跟进记录" prop="name"></el-table-column>
        <el-table-column label="操作人" prop="name"></el-table-column>
        </el-table>
    </el-row>
    <el-row>
      <div class="title">历史记录</div>
      <el-table
        size="mini"
        border
        :data="historyRecordTableData"
        style="width: 100%;">
        <el-table-column label="序号" type="index"></el-table-column>
        <el-table-column label="修改时间" prop="name"></el-table-column>
        <el-table-column label="负责人" prop="name"></el-table-column>
        <el-table-column label="修改内容" prop="name"></el-table-column>
        </el-table>
    </el-row>
  </div>
</template>

<script>
/**
 * @description 商店详情
 */
import Form from './form'
export default {
  components: {
    Form
  },
  data () {
    return {
      form: {},
      id: this.$route.query.id || 1,
      writeable: false,
      cooperationRecordTableData: [],
      followRecordTableData: [],
      historyRecordTableData: []
    }
  },
  methods: {
    updateInfo () {
      // this.writeable = true
    },
    nav2CooperationDetail () {
      const { id } = this
      this.$router.push({path: '/customer/cooperationDetail', query: { id }})
    },
    back () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped lang='less'>
.title {
  font-size: 18px;
  font-weight: 600;
  text-align: center;
  margin: 15px 0;
  background: #eee;
  padding: 10px 0;
}
</style>
