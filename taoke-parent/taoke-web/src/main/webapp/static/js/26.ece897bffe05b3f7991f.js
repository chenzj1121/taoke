webpackJsonp([26],{"6ej2":function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=o("gyMJ"),s=o("SdV4"),a={data:function(){return{form:{},maturities:s.a,status:["淘宝","天猫"],btn:{type:"primary",txt:"检测",load:!1},flag:!1}},methods:{checkWang:function(){var e=this;this.form.wangwangaccount=this.form.wangwangaccount.toString(),this.btn.load=!0,Object(r.l)(this.form.wangwangaccount).then(function(t){e.btn.load=!1,t<=3?(e.btn.type="success",e.btn.txt="成功",e.flag=!0):(e.$errmsg("账号已存在超过3次"),e.btn.type="danger",e.flag=!1)})},onSubmit:function(){var e=this;this.flag&&this.$refs.form.validate(function(t){t&&(console.log("params",e.form),e.form.privateType="0",Object(r.i)(e.form).then(function(t){t.success?(e.$sucmsg("添加成功"),e.$refs.form.resetFields(),e.$router.push({path:"/customer/index"})):(e.$errmsg("添加失败"),e.$refs.form.resetFields())}))})},back:function(){this.$router.go(-1)}}},l={render:function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"wrap"},[o("div",{staticClass:"title"},[e._v("公海客户信息")]),e._v(" "),o("div",{staticClass:"content"},[o("el-form",{ref:"form",attrs:{model:e.form,"label-width":"120px","label-position":"left",size:"mini"}},[o("el-form-item",{attrs:{prop:"shopName",label:"店铺名称：",rules:[{required:!0,message:"店铺名称不能为空"}]}},[o("el-input",{model:{value:e.form.shopName,callback:function(t){e.$set(e.form,"shopName",t)},expression:"form.shopName"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"wangwangaccount",label:"旺旺账号：",rules:[{required:!0,message:"旺旺账号不能为空"}]}},[o("div",{staticClass:"oneline"},[o("el-input",{model:{value:e.form.wangwangaccount,callback:function(t){e.$set(e.form,"wangwangaccount",t)},expression:"form.wangwangaccount"}}),e._v(" "),o("el-button",{attrs:{type:e.btn.type,loading:e.btn.load},on:{click:e.checkWang}},[e._v(e._s(e.btn.txt))])],1)]),e._v(" "),o("el-form-item",{attrs:{prop:"shopBoss",label:"店铺老板："}},[o("el-input",{model:{value:e.form.shopBoss,callback:function(t){e.$set(e.form,"shopBoss",t)},expression:"form.shopBoss"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopQq",label:"店铺QQ："}},[o("el-input",{model:{value:e.form.shopQq,callback:function(t){e.$set(e.form,"shopQq",t)},expression:"form.shopQq"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopUrl",label:"店铺链接：",rules:[{required:!0,message:"店铺链接不能为空"}]}},[o("el-input",{model:{value:e.form.shopUrl,callback:function(t){e.$set(e.form,"shopUrl",t)},expression:"form.shopUrl"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"maturity",label:"成熟度：",rules:[{required:!0,message:"成熟度不能为空"}]}},[o("el-select",{staticStyle:{width:"100%"},model:{value:e.form.maturity,callback:function(t){e.$set(e.form,"maturity",t)},expression:"form.maturity"}},e._l(e.maturities,function(t,r){return o("el-option",{key:r,attrs:{value:t}},[e._v(e._s(t))])}),1)],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopType",label:"店铺类型：",rules:[{required:!0,message:"店铺类型不能为空"}]}},[o("el-select",{staticStyle:{width:"100%"},model:{value:e.form.shopType,callback:function(t){e.$set(e.form,"shopType",t)},expression:"form.shopType"}},e._l(e.status,function(t,r){return o("el-option",{key:r,attrs:{value:t}},[e._v(e._s(t))])}),1)],1),e._v(" "),o("el-form-item",{attrs:{prop:"mainOperate",label:"主营："}},[o("el-input",{model:{value:e.form.mainOperate,callback:function(t){e.$set(e.form,"mainOperate",t)},expression:"form.mainOperate"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopWx",label:"运营微信：",rules:[{required:!0,message:"运营微信不能为空"}]}},[o("el-input",{model:{value:e.form.shopWx,callback:function(t){e.$set(e.form,"shopWx",t)},expression:"form.shopWx"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopOperatePhone",label:"运营电话：",rules:[{required:!0,message:"运营电话不能为空"}]}},[o("el-input",{model:{value:e.form.shopOperatePhone,callback:function(t){e.$set(e.form,"shopOperatePhone",t)},expression:"form.shopOperatePhone"}})],1),e._v(" "),o("el-form-item",{attrs:{prop:"shopPhone",label:"店铺电话："}},[o("el-input",{model:{value:e.form.shopPhone,callback:function(t){e.$set(e.form,"shopPhone",t)},expression:"form.shopPhone"}})],1),e._v(" "),o("el-form-item",[o("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("立即创建")]),e._v(" "),o("el-button",{on:{click:e.back}},[e._v("取消")])],1)],1)],1)])},staticRenderFns:[]};var n=o("C7Lr")(a,l,!1,function(e){o("Jegv")},"data-v-15b5d980",null);t.default=n.exports},Jegv:function(e,t){}});
//# sourceMappingURL=26.ece897bffe05b3f7991f.js.map