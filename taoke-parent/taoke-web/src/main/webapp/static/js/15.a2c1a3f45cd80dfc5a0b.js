webpackJsonp([15],{aOAL:function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var s=o("gyMJ"),a=o("tvpV"),l={components:{Page:o("js5j").a},data:function(){return{form:{isChecking:!1,isAlipay:!0},accountOptions:[{label:"支付宝",value:"支付宝"},{label:"银行卡",value:"银行卡"},{label:"对公银行卡",value:"对公银行卡"}],imageUrl:void 0,sameShop:[],coopDetail:[],multipleSelection:[],page:{pageSize:5,pageNum:1,total:0},dialogVisible:!1,shopDetail:{},userInfo:{},PRE_URL:s.a,isUpdate:!1}},mounted:function(){this.$route.query.id&&this.$route.query.cid||(this.$router.go(-1),this.$errmsg("失去店铺数据,请重新进入")),this.$route.query.cid&&(this.isUpdate=!0,this.getShop(this.$route.query.id)),this.getCM(this.$route.query.cid),this.userInfo=Object(a.b)()},methods:{getCM:function(e){var t=this;Object(s.s)(e).then(function(e){t.form=e,console.log(e);for(var o=document.getElementsByClassName("showPic"),s=0;s<2;s++)switch(s){case 0:e.cmYhqPhoto&&(o[0].style.display="block",o[0].setAttribute("src",t.PRE_URL+"/"+e.cmYhqPhoto));break;case 1:e.cmDkPhote&&(o[1].style.display="block",o[1].setAttribute("src",t.PRE_URL+"/"+e.cmDkPhote))}console.log(o)})},getObjectURL:function(e){var t=null;return void 0!=window.createObjcectURL?t=window.createOjcectURL(e):void 0!=window.URL?t=window.URL.createObjectURL(e):void 0!=window.webkitURL&&(t=window.webkitURL.createObjectURL(e)),t},openPic:function(e){e.currentTarget.previousElementSibling.click()},upload:function(e){var t=this,o=(e.currentTarget.parentElement,new FormData);console.log(e);var a=e.currentTarget.files[0],l=a.name.split(".")[1];a.name.split(".")[0];if(/\.(gif|jpg|jpeg|png|GIF|JPG|JPEG|PNG)$/.test("."+l)){var i=this.getObjectURL(a),r=e.currentTarget.nextElementSibling.getElementsByClassName("showPic")[0],n=e.currentTarget.getAttribute("data-id");console.log(n),o.append("file",a),Object(s.Z)(o).then(function(e){e.success?(r.setAttribute("src",i),r.style.display="block",1==n?t.form.cmYhqPhoto=e.message:t.form.cmDkPhote=e.message):t.$errmsg(e.message),console.log(e)})}else this.$errmsg("请上传图片格式文件")},addGoods:function(){var e=this;this.multipleSelection.forEach(function(t,o){t.goodsId=t.coopGoodsId,t.goodsStarttime=t.coopStarttime,t.goodsEndtime=t.coopEndtime,t.goodsPayMoney=t.coopServiceFee,t.goodsShopId=e.$route.query.id,t.goodsDeptId=e.userInfo.deptId,t.goodsGroupId=e.userInfo.groupId,t.goodsUserId=e.userInfo.id,t.goodsService=t.coopServiceFee,Object(s.f)(t).then(function(t){t.success?e.$sucmsg("商品信息，第"+o+"条数据传输成功"):e.$errmsg("商品信息，第"+o+"条数据传输失败")})}),console.log(this.multipleSelection)},getShop:function(e){var t=this;Object(s.K)(e).then(function(e){e?(t.getShopByName(e.shopBoss),t.getCoopDetail(t.$route.query.id,e.shopName),t.shopDetail=e):t.$errmsg("未找到信息")})},getMyDate:function(e){var t=new Date(e),o=t.getFullYear(),s=t.getMonth()+1,a=t.getDate(),l=t.getHours(),i=t.getMinutes();return i<10&&(i="0"+i),o+"-"+s+"-"+a+" "+l+":"+i},addCheck:function(){var e=this;this.form.cmApplyTime=new Date,this.isUpdate?Object(s.S)(this.form).then(function(t){t.success?e.$sucmsg(t.message):e.$errmsg(t.message)}):(this.form.cmUserId=this.userInfo.id,this.form.cmSellDept=this.userInfo.groupId,this.form.cmDept=this.userInfo.deptId,this.form.cmShopName=this.shopDetail.shopName,this.form.cmShopId=this.shopDetail.id,Object(s.c)(this.form).then(function(t){t.success?e.$sucmsg(t.message):e.$errmsg(t.message)}),this.form.isChecking&&this.addBack())},addBack:function(){var e=this;this.form.bmUserId=this.userInfo.id,this.form.bmGroupId=this.userInfo.groupId,this.form.bmDeptId=this.userInfo.deptId,this.form.bmShopName=this.shopDetail.shopName,this.form.bmJsMoney=this.form.cmJsMoney,this.form.bmYhqName=this.form.cmYhqName,this.form.bmBackType=this.form.isAlipay,this.form.bmYhqPhoto=this.form.cmYhqPhoto,this.form.bmMakePhoto=this.form.cmDkPhote,Object(s.b)(this.form).then(function(t){t.success?e.$sucmsg(t.message):e.$errmsg(t.message)})},handleSelectionChange:function(e){this.multipleSelection=e},saveCoop:function(){this.dialogVisible=!1},getCoopDetail:function(e,t){var o=this;Object(s.I)({coopBossId:e,coopCustomer:t},this.page.pageNum,this.page.pageSize).then(function(e){e.rows.forEach(function(e){e.coopStarttime=o.getMyDate(e.coopStarttime),e.coopEndtime=o.getMyDate(e.coopEndtime)}),console.log(e.rows),o.coopDetail=e.rows,o.page.total=e.total})},getShopByName:function(e){var t=this;Object(s.J)({shopBoss:e},1,100).then(function(e){t.sameShop=e.rows})},back:function(){this.$router.go(-1)}}},i={render:function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",[o("el-form",{attrs:{inline:"",size:"mini","label-position":"left","label-width":"150px"}},[o("el-form-item",{attrs:{label:"推广店铺："}},[o("el-input",{attrs:{disabled:""},model:{value:e.shopDetail.shopName,callback:function(t){e.$set(e.shopDetail,"shopName",t)},expression:"shopDetail.shopName"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"店铺多选："}},[o("el-select",{attrs:{multiple:""},model:{value:e.form.shop,callback:function(t){e.$set(e.form,"shop",t)},expression:"form.shop"}},e._l(e.sameShop,function(e,t){return o("el-option",{key:t,attrs:{label:e.shopName,value:e.id}})}),1)],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"商品信息："}},[o("el-dialog",{attrs:{title:"店铺下的商品合作记录",visible:e.dialogVisible,width:"80%"},on:{"update:visible":function(t){e.dialogVisible=t}}},[o("el-table",{ref:"coopTable",attrs:{data:e.coopDetail},on:{"selection-change":e.handleSelectionChange}},[o("el-table-column",{attrs:{type:"selection",width:"55"}}),e._v(" "),o("el-table-column",{attrs:{label:"序号",type:"index"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopCustomer",label:"店铺名称"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopGoodsId",label:"商品ID"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopStarttime",label:"上线时间"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopEndtime",label:"下线时间"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopYhqName",label:"优惠券名称"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopServiceFee",label:"服务费单价"}})],1),e._v(" "),o("Page",{staticStyle:{"text-align":"right","margin-top":"10px"},attrs:{page:e.page},on:{change:e.getCoopDetail}}),e._v(" "),o("el-button",{on:{click:e.saveCoop}},[e._v("保存")])],1),e._v(" "),o("el-button",{attrs:{type:"primary"},on:{click:function(t){e.dialogVisible=!0}}},[e._v("新建")]),e._v(" "),o("el-button",{attrs:{type:"success"}},[e._v("一键保存")]),e._v(" "),e.multipleSelection[0]?o("el-table",{staticStyle:{"margin-top":"20px",width:"1000px"},attrs:{data:e.multipleSelection,"row-style":{textAlign:"center"},"header-cell-style":{textAlign:"center",background:"#eee"}}},[o("el-table-column",{attrs:{prop:"coopGoodsId",label:"商品ID"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopStarttime",label:"推广开始时间"}}),e._v(" "),o("el-table-column",{attrs:{prop:"coopEndtime",label:"推广结束时间"}}),e._v(" "),o("el-table-column",{attrs:{label:"优惠卷名称"},scopedSlots:e._u([{key:"default",fn:function(t){return[o("el-input",{model:{value:t.row.goodsYhqName,callback:function(o){e.$set(t.row,"goodsYhqName",o)},expression:"scope.row.goodsYhqName"}})]}}],null,!1,1019091102)}),e._v(" "),o("el-table-column",{attrs:{label:"结算量"},scopedSlots:e._u([{key:"default",fn:function(t){return[o("el-input",{model:{value:t.row.goodsNums,callback:function(o){e.$set(t.row,"goodsNums",o)},expression:"scope.row.goodsNums"}})]}}],null,!1,678513916)}),e._v(" "),o("el-table-column",{attrs:{prop:"coopServiceFee",label:"服务费单价"}}),e._v(" "),o("el-table-column",{attrs:{label:"单品结算金额"},scopedSlots:e._u([{key:"default",fn:function(t){return[o("el-input",{model:{value:t.row.goodsPayMoney,callback:function(o){e.$set(t.row,"goodsPayMoney",o)},expression:"scope.row.goodsPayMoney"}})]}}],null,!1,2506658785)})],1):e._e(),e._v(" "),o("el-button",{attrs:{type:"primary"},on:{click:e.addGoods}},[e._v("保存")])],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"优惠券名称：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.cmYhqName,callback:function(t){e.$set(e.form,"cmYhqName",t)},expression:"form.cmYhqName"}})],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"结算金额：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{attrs:{type:"number"},model:{value:e.form.cmJsMoney,callback:function(t){e.$set(e.form,"cmJsMoney",t)},expression:"form.cmJsMoney"}})],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"是否填写返款：",rules:[{required:!0,message:"不能为空"}]}},[o("el-radio",{attrs:{label:!0,disabled:e.isUpdate},model:{value:e.form.isChecking,callback:function(t){e.$set(e.form,"isChecking",t)},expression:"form.isChecking"}},[e._v("是")]),e._v(" "),o("el-radio",{attrs:{label:!1,disabled:e.isUpdate},model:{value:e.form.isChecking,callback:function(t){e.$set(e.form,"isChecking",t)},expression:"form.isChecking"}},[e._v("否")])],1),e._v(" "),o("br"),e._v(" "),e.form.isChecking?o("div",[o("el-form-item",{attrs:{label:"销售花名：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.bmUserName,callback:function(t){e.$set(e.form,"bmUserName",t)},expression:"form.bmUserName"}})],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"返款比例：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.bmBackBl,callback:function(t){e.$set(e.form,"bmBackBl",t)},expression:"form.bmBackBl"}})],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"返款金额：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.bmBackMoney,callback:function(t){e.$set(e.form,"bmBackMoney",t)},expression:"form.bmBackMoney"}})],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"返款银行：",rules:[{required:!0,message:"不能为空"}]}},[o("el-radio",{attrs:{label:"支付宝"},model:{value:e.form.isAlipay,callback:function(t){e.$set(e.form,"isAlipay",t)},expression:"form.isAlipay"}},[e._v("支付宝")]),e._v(" "),o("el-radio",{attrs:{label:"银行卡"},model:{value:e.form.isAlipay,callback:function(t){e.$set(e.form,"isAlipay",t)},expression:"form.isAlipay"}},[e._v("银行卡")])],1),e._v(" "),e.form.isChecking&&"银行卡"==e.form.isAlipay?o("el-form-item",{attrs:{rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1):e._e(),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"返款账户：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.bmBackAccount,callback:function(t){e.$set(e.form,"bmBackAccount",t)},expression:"form.bmBackAccount"}})],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"返款账号：",rules:[{required:!0,message:"不能为空"}]}},[o("el-input",{model:{value:e.form.bmBackAccountumber,callback:function(t){e.$set(e.form,"bmBackAccountumber",t)},expression:"form.bmBackAccountumber"}})],1),e._v(" "),o("br")],1):e._e(),e._v(" "),o("el-form-item",{attrs:{label:"优惠券使用情况截图："}},[o("iframe",{staticStyle:{display:"none"},attrs:{id:"id_iframe",name:"nm_iframe"}}),e._v(" "),o("form",{staticStyle:{display:"inline"},attrs:{enctype:"multipart/form-data",target:"nm_iframe"}},[o("input",{staticClass:"yhq",staticStyle:{display:"none"},attrs:{type:"file",name:"file","data-id":"1"},on:{change:e.upload}}),e._v(" "),o("div",{staticClass:"picBox",on:{click:e.openPic}},[e._v("\n        点击添加图片\n        "),o("img",{staticClass:"showPic",attrs:{src:""}})])])]),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"打款截图："}},[o("form",{staticStyle:{display:"inline"},attrs:{enctype:"multipart/form-data",target:"nm_iframe"}},[o("input",{staticClass:"yhq",staticStyle:{display:"none"},attrs:{type:"file",name:"file","data-id":"2"},on:{change:e.upload}}),e._v(" "),o("div",{staticClass:"picBox",on:{click:e.openPic}},[e._v("\n        点击添加图片\n        "),o("img",{staticClass:"showPic",attrs:{src:""}})])])]),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"转入账户"}},[o("el-select",{model:{value:e.form.cmLoadCustomer,callback:function(t){e.$set(e.form,"cmLoadCustomer",t)},expression:"form.cmLoadCustomer"}},e._l(e.accountOptions,function(e,t){return o("el-option",{key:t,attrs:{label:e.label,value:e.value}})}),1)],1),e._v(" "),o("br"),e._v(" "),o("el-form-item",{attrs:{label:"查款备注："}},[o("el-input",{attrs:{type:"textarea"},model:{value:e.form.cmText,callback:function(t){e.$set(e.form,"cmText",t)},expression:"form.cmText"}})],1),e._v(" "),o("br"),e._v(" "),e.form.isChecking?o("div",[o("el-form-item",{attrs:{label:"返款备注："}},[o("el-input",{attrs:{type:"textarea"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),o("br")],1):e._e(),e._v(" "),o("el-form-item",[o("el-button",{attrs:{type:"primary"},on:{click:e.addCheck}},[e._v("保存")]),e._v(" "),o("el-button",{on:{click:e.back}},[e._v("返回")])],1)],1)],1)},staticRenderFns:[]};var r=o("C7Lr")(l,i,!1,function(e){o("yeTZ")},"data-v-57ff0db8",null);t.default=r.exports},yeTZ:function(e,t){}});
//# sourceMappingURL=15.a2c1a3f45cd80dfc5a0b.js.map