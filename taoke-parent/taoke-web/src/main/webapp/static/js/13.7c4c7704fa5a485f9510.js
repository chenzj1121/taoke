webpackJsonp([13],{g4j4:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var s=r("3cXf"),l=r.n(s),a=r("tvpV"),u=r("gyMJ"),o={data:function(){return{user:Object(a.b)()||{},groupList:[],deptList:[]}},created:function(){this.getGroupList(),this.getDeptList()},methods:{getDeptList:function(){var e=this;Object(u.q)().then(function(t){e.deptList=t})},getGroupList:function(){var e=this;Object(u.u)().then(function(t){e.groupList=t})},updUserById:function(){var e=this;console.log(this.user),Object(u.G)(this.user).then(function(t){e.savaUser2Cookie(e.user),e.$message({message:"恭喜你，保存成功",type:"success"})})},savaUser2Cookie:function(e){e=l()(e),Object(a.c)(e)},back:function(){this.$router.go(-1)}}},n={render:function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"wrap"},[r("div",{staticClass:"title"},[e._v("个人设置")]),e._v(" "),r("div",{staticClass:"content"},[r("el-form",{ref:"user",attrs:{model:e.user,"label-width":"120px","label-position":"left",size:"mini"}},[r("el-form-item",{attrs:{prop:"username",label:"用户名:",required:""}},[r("el-input",{model:{value:e.user.username,callback:function(t){e.$set(e.user,"username",t)},expression:"user.username"}})],1),e._v(" "),r("el-form-item",{attrs:{prop:"realname",label:"真实姓名:",required:""}},[r("el-input",{model:{value:e.user.realname,callback:function(t){e.$set(e.user,"realname",t)},expression:"user.realname"}})],1),e._v(" "),r("el-form-item",{attrs:{label:"电话:",prop:"phone"}},[r("el-input",{model:{value:e.user.phone,callback:function(t){e.$set(e.user,"phone",t)},expression:"user.phone"}})],1),e._v(" "),r("el-form-item",{attrs:{label:"部门:",prop:"deptId"}},[r("el-select",{attrs:{disabled:"",clearable:""},model:{value:e.user.deptId,callback:function(t){e.$set(e.user,"deptId",t)},expression:"user.deptId"}},e._l(e.deptList,function(e,t){return r("el-option",{key:t,attrs:{label:e.deptName,value:e.deptId}})}),1)],1),e._v(" "),r("el-form-item",{attrs:{label:"小组:",prop:"groupId"}},[r("el-select",{attrs:{disabled:"",clearable:""},model:{value:e.user.groupId,callback:function(t){e.$set(e.user,"groupId",t)},expression:"user.groupId"}},e._l(e.groupList,function(e,t){return r("el-option",{key:t,attrs:{label:e.groupName,value:e.groupId}})}),1)],1),e._v(" "),r("el-form-item",{attrs:{label:"用户角色:",prop:"userRole"}},[r("el-input",{model:{value:e.user.userRole,callback:function(t){e.$set(e.user,"userRole",t)},expression:"user.userRole"}})],1),e._v(" "),r("el-form-item",[r("el-button",{attrs:{type:"primary"},on:{click:e.updUserById}},[e._v("保存")])],1)],1)],1)])},staticRenderFns:[]};var i=r("C7Lr")(o,n,!1,function(e){r("kkEP")},"data-v-5e68a04c",null);t.default=i.exports},kkEP:function(e,t){}});
//# sourceMappingURL=13.7c4c7704fa5a485f9510.js.map