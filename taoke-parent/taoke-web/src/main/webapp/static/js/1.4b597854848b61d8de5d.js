webpackJsonp([1],{"3Fbq":function(t,e){},"3VrM":function(t,e){},"7Otq":function(t,e,n){t.exports=n.p+"static/img/logo.8fcc38d.png"},BQ11:function(t,e){},jCj4:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i={props:["type"],updated:function(){console.log(this.type)}},s={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("el-menu",{staticClass:"el-menu-demo",attrs:{"default-active":"home",mode:"horizontal","background-color":"#5197D7","text-color":"#fff",router:"","active-text-color":"#ffd04b"}},[n("el-menu-item",{attrs:{index:"/home"}},[t._v("系统首页")]),t._v(" "),n("el-submenu",{attrs:{index:"2"}},[n("template",{slot:"title"},[t._v("客户信息")]),t._v(" "),n("el-menu-item",{attrs:{index:"/customer"}},[t._v("私海客户")]),t._v(" "),n("el-menu-item",{attrs:{index:"/public"}},[t._v("公海客户")]),t._v(" "),n("el-menu-item",{attrs:{index:"/cooperationDetail"}},[t._v("合作明细")]),t._v(" "),n("el-menu-item",{attrs:{index:"/checkingManage"}},[t._v("查款管理")]),t._v(" "),n("el-menu-item",{attrs:{index:"/moneyBack"}},[t._v("返/退款")]),t._v(" "),n("el-menu-item",{attrs:{index:"/afterDetail"}},[t._v("后台明细")])],2),t._v(" "),n("el-submenu",{attrs:{index:"3"}},[n("template",{slot:"title"},[t._v("系统管理")]),t._v(" "),2!=t.type?n("el-menu-item",{attrs:{index:"/systemManager/userList"}},[t._v("用户管理")]):t._e(),t._v(" "),n("el-menu-item",{attrs:{index:"/systemManager/own"}},[t._v("个人设置")]),t._v(" "),n("el-menu-item",{attrs:{index:"/systemManager/modifyPassword"}},[t._v("密码修改")]),t._v(" "),2!=t.type?n("el-menu-item",{attrs:{index:"/systemManager/dept"}},[t._v("部门管理")]):t._e(),t._v(" "),2!=t.type?n("el-menu-item",{attrs:{index:"/systemManager/group"}},[t._v("小组管理")]):t._e()],2)],1)},staticRenderFns:[]};var r=n("C7Lr")(i,s,!1,function(t){n("BQ11")},null,null).exports,a=n("tvpV"),o={data:function(){return{userInfo:{}}},mounted:function(){this.userInfo=Object(a.b)()},methods:{logout:function(){var t=this;this.$confirm("确认退出吗？",{}).then(function(){Object(a.a)(),setTimeout(function(){t.$router.replace({path:"/login"})},300)})}}},l={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"wrap"},[n("i",{staticClass:"el-icon-user-solid"}),t._v(" "),n("div",[t._v("欢迎")]),t._v(" "),n("div",{staticStyle:{padding:"0 10px"}},[t._v(t._s(t.userInfo.username))]),t._v(" "),n("div",{staticStyle:{"margin-right":"10px"}},[t._v("使用网上办公平台")]),t._v(" "),n("div",{staticStyle:{cursor:"pointer"},on:{click:t.logout}},[t._v("退出系统")])])},staticRenderFns:[]};var u=n("C7Lr")(o,l,!1,function(t){n("3VrM")},"data-v-dc6bcdf6",null).exports,c=n("7Otq"),v=n.n(c),m={components:{Menu:r,Logout:u},data:function(){return this.type=Object(a.b)().type,{logoUrl:v.a,type:0}},mounted:function(){this.type=Object(a.b)().type}},d={render:function(){var t=this.$createElement,e=this._self._c||t;return e("el-container",[e("el-header",[e("el-row",{staticClass:"content_bar",attrs:{type:"flex",justify:"space-between",align:"middle"}},[e("el-col",[e("Menu",{staticClass:"menu",attrs:{type:this.type}})],1),this._v(" "),e("el-col",{staticClass:"logout_col"},[e("Logout")],1)],1)],1),this._v(" "),e("el-main",[e("router-view")],1)],1)},staticRenderFns:[]};var _=n("C7Lr")(m,d,!1,function(t){n("lvUC"),n("3Fbq")},"data-v-4bef400a",null);e.default=_.exports},lvUC:function(t,e){}});
//# sourceMappingURL=1.4b597854848b61d8de5d.js.map