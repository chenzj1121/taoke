webpackJsonp([5],{"AM/9":function(e,t){},hq8V:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=a("gyMJ"),i={components:{Page:a("js5j").a},data:function(){return{loading:!1,page:{pageSize:10,pageNum:1,total:10},form:{deptId:sessionStorage.deptId?sessionStorage.deptId:""},userList:[],groupList:[],groupList2:[],line:!1,max:0,userInfo:{},deptId:sessionStorage.deptId}},mounted:function(){sessionStorage.deptId?(this.getGroupList(),this.bindData()):this.$message("无提报组信息")},methods:{updateMax:function(){var e=this;Object(n.V)(this.userInfo).then(function(t){t.success?(e.$sucmsg(t.message),e.line=!1,e.bindData()):e.$errmsg(t.message)})},resize:function(e){this.line=!0,this.userInfo=e},getTibaoGroup:function(){Object(n.F)().then(function(e){})},getGroupList:function(){var e=this;Object(n.E)(this.form.deptId).then(function(t){e.groupList=t})},bindData:function(){var e=this,t=this.form,a=this.page.pageNum,i=this.page.pageSize;this.loading=!0,Object(n.P)(t,a,i).then(function(t){e.loading=!1,t.rows.forEach(function(t){e.groupList.forEach(function(e){t.groupId==e.groupId&&(t.group=e.groupName)})}),e.userList=t.rows,console.log(t)})}}},o={render:function(){var e=this,t=this,a=t.$createElement,n=t._self._c||a;return n("div",[n("div",{staticClass:"title"},[t._v("提报用户管理")]),t._v(" "),n("el-form",{ref:"form",attrs:{inline:"",size:"mini","label-position":"left","label-width":"120px;",model:t.form}},[n("el-form-item",{attrs:{label:"组别 ：","label-width":"60px"}},[n("div",[n("el-select",{attrs:{placeholder:"请选择"},model:{value:t.form.groupId,callback:function(e){t.$set(t.form,"groupId",e)},expression:"form.groupId"}},[n("el-option",{attrs:{value:"",label:"全部"}}),t._v(" "),t._l(t.groupList,function(e,t){return n("el-option",{key:t,attrs:{value:e.groupId,label:e.groupName}})})],2)],1)]),t._v(" "),n("el-form-item",[n("el-button",{attrs:{type:"primary"},on:{click:t.bindData}},[t._v("查询")]),t._v(" "),n("el-button",{on:{click:function(){e.form={deptId:e.deptId},e.bindData()}}},[t._v("重置")])],1)],1),t._v(" "),n("el-table",{directives:[{name:"loading",rawName:"v-loading",value:t.loading,expression:"loading"}],staticStyle:{width:"100%"},attrs:{"row-style":{maxHeight:"80px",textAlign:"center"},"header-cell-style":{textAlign:"center",background:"#eee"},size:"mini",data:t.userList}},[n("el-table-column",{attrs:{type:"index",label:"序号"}}),t._v(" "),n("el-table-column",{attrs:{label:"组别",prop:"group"}}),t._v(" "),n("el-table-column",{attrs:{label:"姓名",prop:"realname"}}),t._v(" "),n("el-table-column",{attrs:{label:"手机",prop:"phone"}}),t._v(" "),n("el-table-column",{attrs:{label:"未审核单数",prop:"nowTb"}}),t._v(" "),n("el-table-column",{attrs:{label:"分配顺序",prop:"shengheTime"}}),t._v(" "),n("el-table-column",{attrs:{label:"账号",prop:"username"}}),t._v(" "),n("el-table-column",{attrs:{label:"待审核上限",prop:"maxTb"}}),t._v(" "),n("el-table-column",{attrs:{label:"设置审核上限数量",prop:"shengheTime"},scopedSlots:t._u([{key:"default",fn:function(e){return[n("el-button",{attrs:{type:"primary",size:"mini"},on:{click:function(a){return t.resize(e.row)}}},[t._v("上限单量设置")])]}}])})],1),t._v(" "),n("Page",{staticStyle:{"text-align":"right","margin-top":"10px"},attrs:{page:t.page},on:{change:function(e){return t.bineData()}}}),t._v(" "),n("el-dialog",{attrs:{title:"设置上限",visible:t.line},on:{"update:visible":function(e){t.line=e}}},[n("div",{staticClass:"max"},[n("el-input",{staticStyle:{width:"50px"},attrs:{placeholder:"请输入内容"},model:{value:t.userInfo.maxTb,callback:function(e){t.$set(t.userInfo,"maxTb",e)},expression:"userInfo.maxTb"}}),t._v(" "),n("el-button",{staticStyle:{"margin-left":"100px"},attrs:{size:"mini"},on:{click:t.updateMax}},[t._v("修改")])],1)])],1)},staticRenderFns:[]};var l=a("C7Lr")(i,o,!1,function(e){a("AM/9"),a("rzlh")},"data-v-a903e864",null);t.default=l.exports},rzlh:function(e,t){}});
//# sourceMappingURL=5.33df21bf0522fdc89606.js.map