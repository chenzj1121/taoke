webpackJsonp([9],{"UeX+":function(t,e){},j7QU:function(t,e,o){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=o("gyMJ"),i={data:function(){return{showGroupAdd:!1,showGroupUpd:!1,group:{},page:{pageSize:10,pageNum:1},form:{},op:{group_name:"like"},orderBy:"create_time",groupList:[],userList:[],deptList:[]}},methods:{getDeptList:function(){var t=this;Object(r.q)().then(function(e){t.deptList=e})},getUserList:function(){var t=this;Object(r.B)().then(function(e){t.userList=e})},getGroupList:function(){var t=this,e={};e.form=this.form,e.page=this.page,e.op=this.op,e.orderBy=this.orderBy,Object(r.v)(e).then(function(e){t.groupList=e})},createGroup:function(){this.showGroupAdd=!0},addGroup:function(){var t=this;Object(r.c)(this.group).then(function(e){t.$message("添加成功"),t.group={},t.showGroupAdd=!1,t.getGroupList()})},delGroup:function(t){var e=this;console.log(this.groupList),this.$confirm("此操作将删除此部门, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(r.j)([t]).then(function(t){e.getGroupList()}),e.$message({type:"success",message:"删除成功!"})}).catch(function(){e.$message({type:"info",message:"已取消"})})},updGroup:function(t){this.group=t,this.showGroupUpd=!0},modifyGroup:function(){var t=this;Object(r.F)(this.group).then(function(e){t.$message("修改成功"),t.group={},t.showGroupUpd=!1,t.getGroupList()})}},created:function(){this.getGroupList(),this.getUserList(),this.getDeptList()}},n={render:function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",[o("el-row",[o("el-form",{attrs:{"label-width":"100px",inline:"",size:"mini"}},[o("el-form-item",{attrs:{label:"小组名称:"}},[o("el-input",{model:{value:t.form.group_name,callback:function(e){t.$set(t.form,"group_name",e)},expression:"form.group_name"}})],1),t._v(" "),o("el-form-item",[o("el-button",{attrs:{type:"primary"},on:{click:t.getGroupList}},[t._v("查询")]),t._v(" "),o("el-button",{attrs:{type:"warning"},on:{click:t.createGroup}},[t._v("新建")])],1)],1)],1),t._v(" "),o("el-table",{staticStyle:{width:"100%"},attrs:{data:t.groupList,"header-cell-style":{textAlign:"center",background:"#eee"},"cell-style":{textAlign:"center"},size:"mini"}},[o("el-table-column",{attrs:{type:"selection",width:"55"}}),t._v(" "),o("el-table-column",{attrs:{label:"序号",type:"index"}}),t._v(" "),o("el-table-column",{attrs:{label:"小组名称",prop:"groupName"}}),t._v(" "),o("el-table-column",{attrs:{label:"所属部门",prop:"dept.deptName"}}),t._v(" "),o("el-table-column",{attrs:{label:"创建时间",prop:"createTime"}}),t._v(" "),o("el-table-column",{attrs:{label:"修改小组"},scopedSlots:t._u([{key:"default",fn:function(e){return[o("span",{staticClass:"linkSpan",on:{click:function(o){return t.updGroup(e.row)}}},[o("el-tag",[t._v("修改小组")])],1)]}}])}),t._v(" "),o("el-table-column",{attrs:{label:"删除小组"},scopedSlots:t._u([{key:"default",fn:function(e){return[o("span",{staticClass:"linkSpan",on:{click:function(o){return t.delGroup(e.row.groupId)}}},[o("el-tag",[t._v("删除小组")])],1)]}}])})],1),t._v(" "),o("el-dialog",{attrs:{title:"创建小组",visible:t.showGroupAdd,width:"30%"},on:{"update:visible":function(e){t.showGroupAdd=e}}},[o("el-form",{attrs:{"label-width":"80px"}},[o("el-form-item",{attrs:{label:"小组名称",required:""}},[o("el-input",{model:{value:t.group.groupName,callback:function(e){t.$set(t.group,"groupName",e)},expression:"group.groupName"}})],1),t._v(" "),o("el-form-item",{attrs:{label:"所属部门",required:""}},[o("el-select",{model:{value:t.group.groupDeptId,callback:function(e){t.$set(t.group,"groupDeptId",e)},expression:"group.groupDeptId"}},t._l(t.deptList,function(t,e){return o("el-option",{key:e,attrs:{label:t.deptName,value:t.deptId}})}),1)],1)],1),t._v(" "),o("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[o("el-button",{attrs:{type:"primary"},on:{click:t.addGroup}},[t._v("确 定")]),t._v(" "),o("el-button",{attrs:{type:"primary"},on:{click:function(e){t.showGroupAdd=!1}}},[t._v("取 消")])],1)],1),t._v(" "),o("el-dialog",{attrs:{title:"修改小组",visible:t.showGroupUpd,width:"40%"},on:{"update:visible":function(e){t.showGroupUpd=e}}},[o("el-form",{attrs:{"label-width":"80px"}},[o("el-form-item",{attrs:{label:"小组名称",required:""}},[o("el-input",{model:{value:t.group.groupName,callback:function(e){t.$set(t.group,"groupName",e)},expression:"group.groupName"}})],1),t._v(" "),o("el-form-item",{attrs:{label:"所属部门",required:""}},[o("el-select",{model:{value:t.group.groupDeptId,callback:function(e){t.$set(t.group,"groupDeptId",e)},expression:"group.groupDeptId"}},t._l(t.deptList,function(t,e){return o("el-option",{key:e,attrs:{label:t.deptName,value:t.deptId}})}),1)],1)],1),t._v(" "),o("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[o("el-button",{attrs:{type:"primary"},on:{click:t.modifyGroup}},[t._v("确 定")]),t._v(" "),o("el-button",{attrs:{type:"primary"},on:{click:function(e){t.showGroupUpd=!1}}},[t._v("取 消")])],1)],1)],1)},staticRenderFns:[]};var l=o("C7Lr")(i,n,!1,function(t){o("UeX+")},"data-v-9aeaa0fa",null);e.default=l.exports}});
//# sourceMappingURL=9.f0bdbc84213f132d0bc6.js.map