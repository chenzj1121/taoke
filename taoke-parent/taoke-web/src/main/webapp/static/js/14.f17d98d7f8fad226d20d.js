webpackJsonp([14],{"6L5Y":function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=o("gyMJ"),s=o("SdV4"),a=o("tvpV"),l={data:function(){return{form:{},maturities:s.a,status:["淘宝","天猫"],btn:{type:"primary",txt:"检测",load:!1},flag:!1}},mounted:function(){console.log(Object(a.b)())},methods:{onSubmit:function(){var e=this;this.flag?this.$refs.form.validate(function(t){t&&(e.form.shopDeptId=Object(a.b)().deptId,e.form.shopGroupId=Object(a.b)().groupId,e.form.shopUserId2=Object(a.b)().id,e.form.shopUseId=Object(a.b)().id,e.form.createTime=new Date,console.log("params",e.form),e.form.privateType="1",Object(r.i)(e.form).then(function(t){t.success?(e.$sucmsg("添加成功"),e.$refs.form.resetFields(),e.$router.push({path:"/customer/index"})):(e.$errmsg("添加失败"),e.$refs.form.resetFields())}))}):this.$errmsg("请验证旺旺号")},back:function(){this.$router.go(-1)},checkWang:function(){var e=this;this.form.wangwangaccount=this.form.wangwangaccount.toString(),this.btn.load=!0,Object(r.l)(this.form.wangwangaccount).then(function(t){e.btn.load=!1,t<=3?(e.btn.type="success",e.btn.txt="成功",e.flag=!0):(e.btn.type="danger",e.flag=!1)})}}},n={render:function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"wrap"},[o("div",{staticClass:"title"},[e._v("私海客户信息")]),e._v(" "),o("div",{staticClass:"content"},[o("el-form",{ref:"form",attrs:{model:e.form,"label-width":"120px","label-position":"left",size:"mini"}},[o("el-form-item",{attrs:{prop:"shopName",label:"店铺名称：",rules:[{required:!0,message:"店铺名称不能为空"}]}},[o("el-input",{model:{value:e.form.shopName,callback:function(t){e.$set(e.form,"shopName",t)},expression:"form.shopName"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"wangwangaccount",label:"旺旺账号：",rules:[{required:!0,message:"旺旺账号不能为空"}]}},[o("div",{staticClass:"oneline"},[o("el-input",{attrs:{type:"text"},model:{value:e.form.wangwangaccount,callback:function(t){e.$set(e.form,"wangwangaccount",t)},expression:"form.wangwangaccount"}}),e._v(" "),o("el-button",{attrs:{type:e.btn.type,loading:e.btn.load},on:{click:e.checkWang}},[e._v(e._s(e.btn.txt))])],1)]),e._v(" "),o("el-form-item",{attrs:{prop:"shopBoss",label:"店铺老板："}},[o("el-input",{model:{value:e.form.shopBoss,callback:function(t){e.$set(e.form,"shopBoss",t)},expression:"form.shopBoss"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopQq",label:"店铺QQ："}},[o("el-input",{model:{value:e.form.shopQq,callback:function(t){e.$set(e.form,"shopQq",t)},expression:"form.shopQq"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopUrl",label:"店铺链接：",rules:[{required:!0,message:"店铺链接不能为空"}]}},[o("el-input",{model:{value:e.form.shopUrl,callback:function(t){e.$set(e.form,"shopUrl",t)},expression:"form.shopUrl"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"maturity",label:"成熟度：",rules:[{required:!0,message:"成熟度不能为空"}]}},[o("el-select",{staticStyle:{width:"100%"},model:{value:e.form.maturity,callback:function(t){e.$set(e.form,"maturity",t)},expression:"form.maturity"}},e._l(e.maturities,function(t,r){return o("el-option",{key:r,attrs:{value:t}},[e._v(e._s(t))])}),1)],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopType",label:"店铺类型：",rules:[{required:!0,message:"店铺类型不能为空"}]}},[o("el-select",{staticStyle:{width:"100%"},model:{value:e.form.shopType,callback:function(t){e.$set(e.form,"shopType",t)},expression:"form.shopType"}},e._l(e.status,function(t,r){return o("el-option",{key:r,attrs:{value:t}},[e._v(e._s(t))])}),1)],1),e._v(" "),o("el-form-item",{attrs:{prop:"mainOperate",label:"主营："}},[o("el-input",{model:{value:e.form.mainOperate,callback:function(t){e.$set(e.form,"mainOperate",t)},expression:"form.mainOperate"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopWx",label:"运营微信：",rules:[{required:!0,message:"运营微信不能为空"}]}},[o("el-input",{model:{value:e.form.shopWx,callback:function(t){e.$set(e.form,"shopWx",t)},expression:"form.shopWx"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopOperatePhone",label:"运营电话：",rules:[{required:!0,message:"运营电话不能为空"}]}},[o("el-input",{model:{value:e.form.shopOperatePhone,callback:function(t){e.$set(e.form,"shopOperatePhone",t)},expression:"form.shopOperatePhone"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopPhone",label:"店铺电话："}},[o("el-input",{model:{value:e.form.shopPhone,callback:function(t){e.$set(e.form,"shopPhone",t)},expression:"form.shopPhone"}})],1),e._v(" "),o("el-form-item",[o("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("立即创建")]),e._v(" "),o("el-button",{on:{click:e.back}},[e._v("取消")])],1)],1)],1)])},staticRenderFns:[]};var i=o("C7Lr")(l,n,!1,function(e){o("KWIU")},"data-v-51a8951f",null);t.default=i.exports},KWIU:function(e,t){}});
//# sourceMappingURL=14.f17d98d7f8fad226d20d.js.map