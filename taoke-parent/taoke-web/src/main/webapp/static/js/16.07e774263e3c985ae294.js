webpackJsonp([16],{"9A2p":function(t,e){},USLx:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=n("gyMJ"),i={components:{Page:n("js5j").a},data:function(){return{showDeptAdd:!1,showDeptUpd:!1,dept:{},page:{pageSize:10,pageNum:1,total:10},form:{},deptList:[]}},methods:{getDeptList:function(){var t=this;Object(a.v)(this.form,this.page.pageNum,this.page.pageSize).then(function(e){t.deptList=e.rows,t.page.total=e.total})},createDept:function(){this.showDeptAdd=!0},addDept:function(){var t=this;Object(a.e)(this.dept).then(function(e){t.$message("添加成功"),t.dept={},t.showDeptAdd=!1,t.getDeptList()})},delDept:function(t){var e=this;console.log(t),this.$confirm("此操作将删除此部门, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(a.m)([t]).then(function(t){e.getDeptList()}),e.$message({type:"success",message:"删除成功!"})}).catch(function(){e.$message({type:"info",message:"已取消"})})},updDept:function(t){this.dept=t,this.showDeptUpd=!0},modifyDept:function(){var t=this;Object(a.L)(this.dept).then(function(e){t.$message("修改成功"),t.dept={},t.showDeptUpd=!1,t.getDeptList()})}},created:function(){this.getDeptList()}},o={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("el-row",[n("el-form",{attrs:{"label-width":"100px",inline:"",size:"mini"}},[n("el-form-item",{attrs:{label:"部门名称:"}},[n("el-input",{model:{value:t.form.deptName,callback:function(e){t.$set(t.form,"deptName",e)},expression:"form.deptName"}})],1),t._v(" "),n("el-form-item",[n("el-button",{attrs:{type:"primary"},on:{click:t.getDeptList}},[t._v("查询")]),t._v(" "),n("el-button",{attrs:{type:"warning"},on:{click:t.createDept}},[t._v("新建")])],1)],1)],1),t._v(" "),n("el-table",{staticStyle:{width:"100%"},attrs:{data:t.deptList,"header-cell-style":{textAlign:"center",background:"#eee"},"cell-style":{textAlign:"center"},size:"mini"}},[n("el-table-column",{attrs:{type:"selection",width:"55"}}),t._v(" "),n("el-table-column",{attrs:{label:"序号",type:"index"}}),t._v(" "),n("el-table-column",{attrs:{label:"部门名称",prop:"deptName"}}),t._v(" "),n("el-table-column",{attrs:{label:"创建时间",prop:"createTime"}}),t._v(" "),n("el-table-column",{attrs:{label:"修改部门"},scopedSlots:t._u([{key:"default",fn:function(e){return[n("el-button",{attrs:{size:"mini",type:"warning"},on:{click:function(n){return t.updDept(e.row)}}},[t._v("修改")])]}}])}),t._v(" "),n("el-table-column",{attrs:{label:"删除部门"},scopedSlots:t._u([{key:"default",fn:function(e){return[n("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(n){return t.delDept(e.row.deptId)}}},[t._v("删除")])]}}])})],1),t._v(" "),n("Page",{staticStyle:{"text-align":"right","margin-top":"10px"},attrs:{page:t.page},on:{change:t.getDeptList}}),t._v(" "),n("el-dialog",{attrs:{title:"创建部门",visible:t.showDeptAdd,width:"30%"},on:{"update:visible":function(e){t.showDeptAdd=e}}},[n("el-form",{attrs:{"label-width":"80px"}},[n("el-form-item",{attrs:{label:"部门名称",required:""}},[n("el-input",{model:{value:t.dept.deptName,callback:function(e){t.$set(t.dept,"deptName",e)},expression:"dept.deptName"}})],1)],1),t._v(" "),n("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[n("el-button",{attrs:{type:"primary"},on:{click:t.addDept}},[t._v("确 定")]),t._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:function(e){t.showDeptAdd=!1}}},[t._v("取 消")])],1)],1),t._v(" "),n("el-dialog",{attrs:{title:"修改部门",visible:t.showDeptUpd,width:"40%"},on:{"update:visible":function(e){t.showDeptUpd=e}}},[n("el-form",{attrs:{"label-width":"80px"}},[n("el-form-item",{attrs:{label:"部门名称",required:""}},[n("el-input",{model:{value:t.dept.deptName,callback:function(e){t.$set(t.dept,"deptName",e)},expression:"dept.deptName"}})],1)],1),t._v(" "),n("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[n("el-button",{attrs:{type:"primary"},on:{click:t.modifyDept}},[t._v("确 定")]),t._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:function(e){t.showDeptUpd=!1}}},[t._v("取 消")])],1)],1)],1)},staticRenderFns:[]};var l=n("C7Lr")(i,o,!1,function(t){n("9A2p")},"data-v-51899df1",null);e.default=l.exports}});
//# sourceMappingURL=16.07e774263e3c985ae294.js.map