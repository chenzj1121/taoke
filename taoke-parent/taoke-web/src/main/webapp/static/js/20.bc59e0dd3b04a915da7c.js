webpackJsonp([20],{"6GKp":function(e,l){},aOAL:function(e,l,a){"use strict";Object.defineProperty(l,"__esModule",{value:!0});var t={data:function(){return{form:{isChecking:!1,isAlipay:!0},shopOptions:[{label:"name",value:"name"}],accountOptions:[{label:"支付宝",value:"name"},{label:"银行卡",value:"name"},{label:"对公银行卡",value:"name"}],imageUrl:void 0}},methods:{back:function(){this.$router.go(-1)}}},r={render:function(){var e=this,l=e.$createElement,a=e._self._c||l;return a("div",[a("el-form",{attrs:{inline:"",size:"mini","label-position":"left","label-width":"150px"}},[a("el-form-item",{attrs:{label:"推广店铺："}},[a("el-input",{attrs:{disabled:""},model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"店铺多选："}},[a("el-select",{attrs:{multiple:""},model:{value:e.form.shops,callback:function(l){e.$set(e.form,"shops",l)},expression:"form.shops"}},e._l(e.shopOptions,function(e,l){return a("el-option",{key:l,attrs:{label:e.label,value:e.value}})}),1)],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"商品信息："}},[a("el-button",{attrs:{type:"primary"}},[e._v("新建")]),e._v(" "),a("el-button",{attrs:{type:"success"}},[e._v("一键保存")])],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"优惠券名称：",required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"结算金额：",required:""}},[a("el-input",{attrs:{type:"number"},model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"是否填写返款：",required:""}},[a("el-radio",{attrs:{label:!0},model:{value:e.form.isChecking,callback:function(l){e.$set(e.form,"isChecking",l)},expression:"form.isChecking"}},[e._v("是")]),e._v(" "),a("el-radio",{attrs:{label:!1},model:{value:e.form.isChecking,callback:function(l){e.$set(e.form,"isChecking",l)},expression:"form.isChecking"}},[e._v("否")])],1),e._v(" "),a("br"),e._v(" "),e.form.isChecking?a("div",[a("el-form-item",{attrs:{label:"销售花名：",required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"返款比例：",required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"返款金额：",required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"返款银行：",required:""}},[a("el-radio",{attrs:{label:!0},model:{value:e.form.isAlipay,callback:function(l){e.$set(e.form,"isAlipay",l)},expression:"form.isAlipay"}},[e._v("支付宝")]),e._v(" "),a("el-radio",{attrs:{label:!1},model:{value:e.form.isAlipay,callback:function(l){e.$set(e.form,"isAlipay",l)},expression:"form.isAlipay"}},[e._v("银行卡")])],1),e._v(" "),e.form.isChecking&&!e.form.isAlipay?a("el-form-item",{attrs:{required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1):e._e(),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"返款账户：",required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"返款账号：",required:""}},[a("el-input",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br")],1):e._e(),e._v(" "),a("el-form-item",{attrs:{label:"优惠券使用情况截图："}},[a("el-upload",{attrs:{action:"https://jsonplaceholder.typicode.com/posts/","list-type":"picture-card"}},[a("i",{staticClass:"el-icon-plus"})])],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"打款截图："}},[a("el-upload",{attrs:{action:"https://jsonplaceholder.typicode.com/posts/","list-type":"picture-card"}},[a("i",{staticClass:"el-icon-plus"})])],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"转入账户"}},[a("el-select",{model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}},e._l(e.accountOptions,function(e,l){return a("el-option",{key:l,attrs:{label:e.label,value:e.value}})}),1)],1),e._v(" "),a("br"),e._v(" "),a("el-form-item",{attrs:{label:"查款备注："}},[a("el-input",{attrs:{type:"textarea"},model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br"),e._v(" "),e.form.isChecking?a("div",[a("el-form-item",{attrs:{label:"查款备注："}},[a("el-input",{attrs:{type:"textarea"},model:{value:e.form.name,callback:function(l){e.$set(e.form,"name",l)},expression:"form.name"}})],1),e._v(" "),a("br")],1):e._e(),e._v(" "),a("el-form-item",[a("el-button",{attrs:{type:"primary"}},[e._v("保存")]),e._v(" "),a("el-button",{on:{click:e.back}},[e._v("返回")])],1)],1)],1)},staticRenderFns:[]};var o=a("C7Lr")(t,r,!1,function(e){a("6GKp")},"data-v-256d23da",null);l.default=o.exports}});
//# sourceMappingURL=20.bc59e0dd3b04a915da7c.js.map