<template>
  <div>
    <el-form
      :model="form"
      ref="form"
      inline
      label-width="120px"
      size="mini">
      <el-form-item label="店铺名称">
        <el-input :disabled="!writeable" v-model="form.shopName"></el-input>
      </el-form-item>
      <el-form-item label="旺旺账号">
        <el-input :disabled="!writeable" v-model="form.wangwangaccount"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="推广产品">
        <el-input :disabled="!writeable" v-model="form.shopProduct" type="number"></el-input>
      </el-form-item>
      <el-form-item label="创建人">
        <el-input :disabled="!writeable" v-model="form.shopUseId"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="店铺联系人">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="店铺电话">
        <el-input :disabled="!writeable" v-model="form.shopPhone"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="所属部门">
        <el-input :disabled="!writeable" v-model="form.shopDeptId"></el-input>
      </el-form-item>
      <el-form-item label="所属人员">
        <el-input :disabled="!writeable" v-model="form.shopUserId2"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="成熟度">
        <el-input :disabled="!writeable" v-model="form.maturity"></el-input>
      </el-form-item>
      <el-form-item label="店铺QQ">
        <el-input :disabled="!writeable" v-model="form.shopQq"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="店铺类型">
        <el-input :disabled="!writeable" v-model="form.shopType"></el-input>
      </el-form-item>
      <el-form-item label="主营">
        <el-input :disabled="!writeable" v-model="form.mainOperate"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="下次跟进时间">
        <el-input :disabled="!writeable" v-model="form.nextTime"></el-input>
      </el-form-item>
      <el-form-item label="跟进记录">
        <el-input :disabled="!writeable" v-model="form.followUpRecord"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="回款时间">
        <el-input :disabled="!writeable" v-model="form.refundsTime"></el-input>
      </el-form-item>
      <el-form-item label="回款金额">
        <el-input :disabled="!writeable" v-model="form.refundsMoney"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="创建时间">
        <el-input :disabled="!writeable" v-model="form.createTime"></el-input>
      </el-form-item>
      <el-form-item label="运营名称">
        <el-input :disabled="!writeable" v-model="form.shopName"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="运营电话">
        <el-input :disabled="!writeable" v-model="form.shopOperatePhone"></el-input>
      </el-form-item>
      <el-form-item label="运营微信">
        <el-input :disabled="!writeable" v-model="form.shopWx"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="运营QQ">
        <el-input :disabled="!writeable" v-model="form.shopOperateQq"></el-input>
      </el-form-item>
      <el-form-item label="结算方式">
        <el-input :disabled="!writeable" v-model="form.shopJstype"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="实拍图">
        <el-input :disabled="!writeable" v-model="form.shopRealShooting"></el-input>
      </el-form-item>

    </el-form>
  </div>
</template>

<script>
export default {
  props: ['form', 'writeable'],
  data () {
    return {
    }
  }
}
</script>

<style scoped lang='less'>

</style>
