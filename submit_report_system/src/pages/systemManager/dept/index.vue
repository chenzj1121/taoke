<template>
  <div>
    <el-row>
      <el-form
        label-width="100px"
        inline
        size="mini">
        <el-form-item label="部门名称:">
          <el-input v-model="form.deptName"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="getDeptList">查询</el-button>
          <el-button type="warning" @click="createDept">新建</el-button>
        </el-form-item>
      </el-form>
    </el-row>
    <el-table
      :data="deptList"
      :header-cell-style="{ textAlign: 'center', background: '#eee' }"
      :cell-style="{ textAlign: 'center' }"
      size="mini"
      style="width: 100%;">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="序号" type="index"></el-table-column>
      <el-table-column label="部门名称" prop="deptName"></el-table-column>
      <el-table-column label="创建时间" prop="createTime"></el-table-column>
      <el-table-column label="修改部门">
        <template slot-scope="scope">
          <el-button size="mini" type="warning" @click="updDept(scope.row)">修改</el-button>
        </template>
      </el-table-column>
      <el-table-column label="删除部门">
        <template slot-scope="scope">
          <el-button size="mini" type="danger" @click="delDept(scope.row.deptId)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <Page style="text-align: right;margin-top:10px;" :page="page" @change="getDeptList"/>
    <el-dialog
      title="创建部门"
      :visible.sync="showDeptAdd"
      width="30%">
      <el-form label-width="80px">
        <el-form-item label="部门名称" required>
          <el-input v-model="dept.deptName"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="addDept">确 定</el-button>
        <el-button type="primary" @click="showDeptAdd = false">取 消</el-button>
      </span>
    </el-dialog>
    <el-dialog
      title="修改部门"
      :visible.sync="showDeptUpd"
      width="40%">
      <el-form label-width="80px">
        <el-form-item label="部门名称" required>
          <el-input v-model="dept.deptName"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="modifyDept">确 定</el-button>
        <el-button type="primary" @click="showDeptUpd = false">取 消</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import { getDeptByPage, delDeptById, addDept, updDept } from '@/api/index'
import Page from '@/components/page'
export default {
  components: {
    Page
  },
  data () {
    return {
      showDeptAdd: false,
      showDeptUpd: false,
      dept: {},
      page: {
        pageSize: 10,
        pageNum: 1,
        total: 10
      },
      form: {},
      deptList: []
    }
  },
  methods: {
    getDeptList () {
      getDeptByPage(this.form, this.page.pageNum, this.page.pageSize).then(res => {
        this.deptList = res.rows
        this.page.total = res.total
      })
    },
    createDept () {
      this.showDeptAdd = true
    },
    addDept () {
      addDept(this.dept).then(res => {
        this.$message('添加成功')
        this.dept = {}
        this.showDeptAdd = false
        this.getDeptList()
      })
    },
    delDept (id) {
      console.log(id)
      this.$confirm('此操作将删除此部门, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        delDeptById([id]).then(res => {
          this.getDeptList()
        })
        this.$message({
          type: 'success',
          message: '删除成功!'
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消'
        })
      })
    },
    updDept (data) {
      this.dept = data
      this.showDeptUpd = true
    },
    modifyDept () {
      updDept(this.dept).then(res => {
        this.$message('修改成功')
        this.dept = {}
        this.showDeptUpd = false
        this.getDeptList()
      })
    }
  },
  created () {
    this.getDeptList()
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
