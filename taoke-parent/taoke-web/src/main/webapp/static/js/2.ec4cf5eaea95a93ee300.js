webpackJsonp([2],{"3Ss2":function(t,e){},"3VrM":function(t,e){},"7Otq":function(t,e,n){t.exports=n.p+"static/img/logo.8fcc38d.png"},H6TN:function(t,e){},jCj4:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i={props:["type"],updated:function(){console.log(this.type)}},s={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("el-menu",{staticClass:"el-menu-demo",attrs:{"default-active":"home",mode:"horizontal","background-color":"#5197D7","text-color":"#fff",router:"","active-text-color":"#ffd04b"}},[n("el-menu-item",{attrs:{index:"/home"}},[t._v("系统首页")]),t._v(" "),1==t.type||0==t.type||2==t.type?n("el-submenu",{attrs:{index:"2"}},[n("template",{slot:"title"},[t._v("客户信息")]),t._v(" "),n("el-menu-item",{attrs:{index:"/customer"}},[t._v("私海客户")]),t._v(" "),n("el-menu-item",{attrs:{index:"/public"}},[t._v("公海客户")]),t._v(" "),n("el-menu-item",{attrs:{index:"/cooperationDetail"}},[t._v("合作明细")]),t._v(" "),n("el-menu-item",{attrs:{index:"/checkingManage"}},[t._v("查款管理")]),t._v(" "),n("el-menu-item",{attrs:{index:"/moneyBack"}},[t._v("返/退款")]),t._v(" "),n("el-menu-item",{attrs:{index:"/afterDetail"}},[t._v("后台明细")])],2):t._e(),t._v(" "),n("el-submenu",{attrs:{index:"3"}},[n("template",{slot:"title"},[t._v("系统管理")]),t._v(" "),0==t.type||1==t.type||4==t.type?n("el-menu-item",{attrs:{index:"/systemManager/userList"}},[t._v("用户管理")]):t._e(),t._v(" "),n("el-menu-item",{attrs:{index:"/systemManager/own"}},[t._v("个人设置")]),t._v(" "),n("el-menu-item",{attrs:{index:"/systemManager/modifyPassword"}},[t._v("密码修改")]),t._v(" "),0==t.type?n("el-menu-item",{attrs:{index:"/systemManager/dept"}},[t._v("部门管理")]):t._e(),t._v(" "),0==t.type?n("el-menu-item",{attrs:{index:"/systemManager/group"}},[t._v("小组管理")]):t._e()],2),t._v(" "),0==t.type||4==t.type||5==t.type?n("el-submenu",{attrs:{index:"4"}},[n("template",{slot:"title"},[t._v("提报管理")]),t._v(" "),n("el-menu-item",{attrs:{index:"/tiBao/index"}},[t._v("提报管理")]),t._v(" "),0==t.type||4==t.type?n("el-menu-item",{attrs:{index:"/tiBao/userList"}},[t._v("提报人员管理")]):t._e()],2):t._e()],1)},staticRenderFns:[]};var a=n("C7Lr")(i,s,!1,function(t){n("piyq")},null,null).exports,r=n("tvpV"),o={data:function(){return{userInfo:{}}},mounted:function(){this.userInfo=Object(r.b)()},methods:{logout:function(){var t=this;this.$confirm("确认退出吗？",{}).then(function(){Object(r.a)(),setTimeout(function(){t.$router.replace({path:"/login"})},300)})}}},l={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"wrap"},[n("i",{staticClass:"el-icon-user-solid"}),t._v(" "),n("div",[t._v("欢迎")]),t._v(" "),n("div",{staticStyle:{padding:"0 10px"}},[t._v(t._s(t.userInfo.username))]),t._v(" "),n("div",{staticStyle:{"margin-right":"10px"}},[t._v("使用网上办公平台")]),t._v(" "),n("div",{staticStyle:{cursor:"pointer"},on:{click:t.logout}},[t._v("退出系统")])])},staticRenderFns:[]};var u=n("C7Lr")(o,l,!1,function(t){n("3VrM")},"data-v-dc6bcdf6",null).exports,c=n("7Otq"),m=n.n(c),v={components:{Menu:a,Logout:u},data:function(){return this.type=Object(r.b)().type,{logoUrl:m.a,type:0}},mounted:function(){this.type=Object(r.b)().type}},_={render:function(){var t=this.$createElement,e=this._self._c||t;return e("el-container",[e("el-header",[e("el-row",{staticClass:"content_bar",attrs:{type:"flex",justify:"space-between",align:"middle"}},[e("el-col",[e("Menu",{staticClass:"menu",attrs:{type:this.type}})],1),this._v(" "),e("el-col",{staticClass:"logout_col"},[e("Logout")],1)],1)],1),this._v(" "),e("el-main",[e("router-view",{attrs:{type:this.type}})],1)],1)},staticRenderFns:[]};var d=n("C7Lr")(v,_,!1,function(t){n("3Ss2"),n("H6TN")},"data-v-c37aab70",null);e.default=d.exports},piyq:function(t,e){}});
//# sourceMappingURL=2.ec4cf5eaea95a93ee300.js.map