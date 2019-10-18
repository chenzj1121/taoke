<template>
  <div>
    <el-form
      :model="form"
      ref="form"
      inline
      label-width="120px"
      size="mini">
      <el-form-item label="店铺名称">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="旺旺账号">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="推广产品">
        <el-input :disabled="!writeable" v-model="form.name" type="number"></el-input>
      </el-form-item>
      <el-form-item label="创建人">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="店铺联系人">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="店铺电话">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="所属部门">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="所属人员">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="成熟度">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="店铺QQ">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="店铺类型">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="主营">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="下次跟进时间">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="跟进记录">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="回款时间">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="汇款金额">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="创建时间">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="运营名称">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="运营电话">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="运营微信">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="运营QQ">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="结算方式">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
      </el-form-item>
      <br/>
      <el-form-item label="实拍图">
        <el-input :disabled="!writeable" v-model="form.name"></el-input>
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
