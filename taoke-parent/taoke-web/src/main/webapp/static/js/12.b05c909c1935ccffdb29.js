webpackJsonp([12],{EwCL:function(e,o){},jT7l:function(e,o,r){"use strict";Object.defineProperty(o,"__esModule",{value:!0});var s=r("3cXf"),n=r.n(s),t=r("tvpV"),i=r("gyMJ"),a=r("BvhE"),l={data:function(){return{loginForm:{username:void 0,password:void 0},loading:!1,rules:{username:[{required:!0,message:"请输入用户名",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:3,max:21,message:"请输入3~21位的数字和字母组合密码",trigger:"change"},{validator:function(e,o,r){/^[A-Za-z0-9]+$/g.test(o)?r():r(new Error("请输入3~21位的数字和字母组合密码"))},trigger:"change"}]}}},methods:{submit:function(){var e=this;console.log("submit()",this.loginForm.username,this.loginForm.password),this.$refs.loginForm.validate(function(o){o&&(e.loading=!0,e.loginForm.password=a.Base64.encode(e.loginForm.password),Object(i.Q)(e.loginForm).then(function(o){if(e.loading=!1,o.success){var r=o.data,s={username:r.username,realname:r.realname,phone:r.phone,deptId:r.deptId,groupId:r.groupId,id:r.id,type:r.type};e.savaUser2Cookie(s),e.$sucmsg("登录成功!"),e.$router.replace({path:"/home"})}else e.$message.error("账号密码错误")}).catch(function(o){console.log(o),e.loginForm.password=void 0,e.loading=!1}))})},savaUser2Cookie:function(e){e=n()(e),Object(t.c)(e)}}},u={render:function(){var e=this,o=e.$createElement,r=e._self._c||o;return r("div",{staticClass:"wrap"},[r("div",{staticClass:"form_box"},[r("el-form",{ref:"loginForm",attrs:{rules:e.rules,model:e.loginForm}},[r("h1",{staticClass:"title"},[e._v("\n          Login Form\n        ")]),e._v(" "),r("el-form-item",{attrs:{prop:"username"}},[r("el-input",{staticClass:"form_input",attrs:{"prefix-icon":"el-icon-user-solid"},model:{value:e.loginForm.username,callback:function(o){e.$set(e.loginForm,"username",o)},expression:"loginForm.username"}})],1),e._v(" "),r("el-form-item",{attrs:{prop:"password"}},[r("el-input",{attrs:{type:"password","show-password":"","prefix-icon":"el-icon-key"},nativeOn:{keyup:function(o){return!o.type.indexOf("key")&&e._k(o.keyCode,"enter",13,o.key,"Enter")?null:e.submit(o)}},model:{value:e.loginForm.password,callback:function(o){e.$set(e.loginForm,"password",o)},expression:"loginForm.password"}})],1),e._v(" "),r("el-form-item",[r("el-button",{staticStyle:{width:"100%",height:"50px"},attrs:{loading:e.loading,type:"primary"},on:{click:e.submit}},[e._v("登录")])],1)],1)],1)])},staticRenderFns:[]};var m=r("C7Lr")(l,u,!1,function(e){r("EwCL")},"data-v-784771e3",null);o.default=m.exports}});
//# sourceMappingURL=12.b05c909c1935ccffdb29.js.map