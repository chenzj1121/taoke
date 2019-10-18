<template>
  <div>
    <el-row>
      <el-form
        label-width="100px"
        inline
        size="mini">
        <el-form-item label="创建时间：">
          <el-date-picker type="date" v-model="form.createTime"/>
        </el-form-item>
        <el-form-item label="主营：">
          <el-input v-model="form.mainOperate"/>
        </el-form-item>
        <el-form-item label="店铺QQ：">
          <el-input v-model="form.shopQq"/>
        </el-form-item>
        <br/>
        <el-form-item label="店铺名称：">
          <el-input v-model="form.shopName"/>
        </el-form-item>
        <el-form-item label="旺旺账号：">
          <el-input v-model="form.wangwangaccount"/>
        </el-form-item>
        <el-form-item label="店铺类型：">
          <el-select v-model="form.shopType">
            <el-option v-for="(option, index) in options" :key="index" :label="option.label" :value="option.value"></el-option>
          </el-select>
        </el-form-item>
        <br/>
        <el-form-item label="运营微信：">
          <el-input v-model="form.shopWx"/>
        </el-form-item>
        <!-- <el-form-item label="运营QQ：">
          <el-input v-model="form.name"/>
        </el-form-item> -->
        <el-form-item>
          <el-button type="primary" @click="bindData">查询</el-button>
          <el-button @click="() => {this.form = {};this.bindData()}">重置</el-button>
          <el-button type="warning" @click="nav2Add">新建</el-button>
        </el-form-item>
      </el-form>
    </el-row>
    <el-table
      :data="publicCustomerTableData"
      v-loading="loading"
      :header-cell-style="{ textAlign: 'center', background: '#eee' }"
      :cell-style="{ textAlign: 'center' }"
      size="mini"
      style="width: 100%;">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="序号" type="index"></el-table-column>
      <el-table-column label="店铺名称">
        <template slot-scope="scope">
          <span class="linkSpan" @click="nav2ShopDetailById(scope.row.id)">{{ scope.row.shopName }}</span>
        </template>
      </el-table-column>
      <el-table-column label="旺旺账号" prop="wangwangaccount"></el-table-column>
      <el-table-column label="成熟度" prop="maturity"></el-table-column>
      <el-table-column label="店铺类型" prop="shopType"></el-table-column>
      <el-table-column label="主营" prop="mainOperate"></el-table-column>
      <el-table-column label="运营名称" prop="name"></el-table-column>
      <el-table-column label="商品数量" prop="name"></el-table-column>
      <el-table-column label="店铺QQ" prop="shopQq"></el-table-column>
      <el-table-column label="运营QQ" prop="name"></el-table-column>
      <el-table-column label="运营微信" prop="shopWx"></el-table-column>
      <el-table-column label="运营电话" prop="shopOperatePhone"></el-table-column>
      <el-table-column label="店铺电话" prop="shopPhone"></el-table-column>
      <el-table-column label="领取">
        <template>
          <span class="linkSpan">领取</span>
        </template>
      </el-table-column>
    </el-table>
    <!-- <el-pagination
      background
      style="float:right;margin-top:10px;"
      layout="prev, pager, next"
      :total="100">
    </el-pagination> -->
    <Page style="text-align:right;margin-top:10px;" :page="page" @change="bindData"/>
  </div>
</template>

<script>
import Page from '@/components/page'
import { getShopList } from '@/api'
export default {
  components: {
    Page
  },
  mounted () {
    this.bindData()
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
      options: [
        { label: '是', value: true },
        { label: '否', value: false }
      ],
      publicCustomerTableData: []
    }
  },
  methods: {
    nav2ShopDetailById (id) {
      this.$router.push({path: '/shopDetail', query: { id }})
    },
    nav2Add () {
      this.$router.push({ path: 'add' })
    },
    bindData () {
      this.loading = true
      this.form.privateType = '0'
      getShopList(this.form, this.page.pageNum, this.page.pageSize).then(response => {
        // debugger
        this.page.total = response.total
        this.publicCustomerTableData = response.rows
        this.loading = false
      })
        .catch(() => {
          this.loading = false
        })
    }
  }
}
</script>

<style scoped lang='less'>
.linkSpan {
  color: blue;
  width: 100%;
  text-decoration: underline;
  cursor: pointer;
}
</style>
