<template>
  <div>
    <el-row>
      <el-form
        label-width="100px"
        inline
        size="mini">
        <el-form-item label="小组名称:">
          <el-input v-model="form.group_name"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="getGroupList">查询</el-button>
          <el-button type="warning" @click="createGroup">新建</el-button>
        </el-form-item>
      </el-form>
    </el-row>
    <el-table
      :data="groupList"
      :header-cell-style="{ textAlign: 'center', background: '#eee' }"
      :cell-style="{ textAlign: 'center' }"
      size="mini"
      style="width: 100%;">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="序号" type="index"></el-table-column>
      <el-table-column label="小组名称" prop="groupName"></el-table-column>
      <el-table-column label="所属部门" prop="dept.deptName"></el-table-column>
      <el-table-column label="创建时间" prop="createTime"></el-table-column>
      <el-table-column label="修改小组">
        <template slot-scope="scope">
          <span class="linkSpan" @click="updGroup(scope.row)"><el-tag>修改小组</el-tag></span>
        </template>
      </el-table-column>
      <el-table-column label="删除小组">
        <template slot-scope="scope">
          <span class="linkSpan" @click="delGroup(scope.row.groupId)"><el-tag>删除小组</el-tag></span>
        </template>
      </el-table-column>
    </el-table>
    <el-dialog
      title="创建小组"
      :visible.sync="showGroupAdd"
      width="30%">
      <el-form label-width="80px">
        <el-form-item label="小组名称" required>
          <el-input v-model="group.groupName"></el-input>
        </el-form-item>
        <el-form-item label="所属部门" required>
          <el-select v-model="group.groupDeptId">
            <el-option v-for="(dept, index) in deptList" :key="index" :label="dept.deptName" :value="dept.deptId"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="addGroup">确 定</el-button>
        <el-button type="primary" @click="showGroupAdd = false">取 消</el-button>
      </span>
    </el-dialog>
    <el-dialog
      title="修改小组"
      :visible.sync="showGroupUpd"
      width="40%">
      <el-form label-width="80px">
        <el-form-item label="小组名称" required>
          <el-input v-model="group.groupName"></el-input>
        </el-form-item>
        <el-form-item label="所属部门" required>
          <el-select v-model="group.groupDeptId">
            <el-option v-for="(dept, index) in deptList" :key="index" :label="dept.deptName" :value="dept.deptId"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="modifyGroup">确 定</el-button>
        <el-button type="primary" @click="showGroupUpd = false">取 消</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import { getGroupByPage, getUserByList, addGroup, updGroup, delGroupById, getDeptByList } from '@/api/index'
export default {
  data () {
    return {
      showGroupAdd: false,
      showGroupUpd: false,
      group: { },
      page: {
        pageSize: 10,
        pageNum: 1
      },
      form: { },
      op: {
        group_name: 'like'
      },
      orderBy: 'create_time',
      groupList: [],
      userList: [],
      deptList: []
    }
  },
  methods: {
    getDeptList () {
      getDeptByList().then(res => {
        this.deptList = res
      })
    },
    getUserList () {
      getUserByList().then(res => {
        this.userList = res
      })
    },
    getGroupList () {
      var param = {}
      param.form = this.form
      param.page = this.page
      param.op = this.op
      param.orderBy = this.orderBy
      getGroupByPage(param).then(res => {
        this.groupList = res
      })
    },
    createGroup () {
      this.showGroupAdd = true
    },
    addGroup () {
      addGroup(this.group).then(res => {
        this.$message('添加成功')
        this.group = {}
        this.showGroupAdd = false
        this.getGroupList()
      })
    },
    delGroup (id) {
      console.log(id)
      this.$confirm('此操作将删除此部门, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        delGroupById(id).then(res => {
          this.getGroupList()
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
    updGroup (data) {
      this.group = data
      this.showGroupUpd = true
    },
    modifyGroup () {
      updGroup(this.group).then(res => {
        this.$message('修改成功')
        this.group = {}
        this.showGroupUpd = false
        this.getGroupList()
      })
    }
  },
  created () {
    this.getGroupList()
    this.getUserList()
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
