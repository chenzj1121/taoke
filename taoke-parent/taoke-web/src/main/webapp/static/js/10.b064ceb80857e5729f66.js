webpackJsonp([10],{gLhU:function(e,o){},qbmt:function(e,o,t){"use strict";Object.defineProperty(o,"__esModule",{value:!0});t("Muz9");var r=t("gyMJ"),i=t("tvpV"),c={data:function(){return{form:{coopPayType:"线上结算",coopActivity:"常规单",beginTime:"立即开始",coopZero:"零点"},shopDetail:{},optionList:[],flag:!1,isUpadte:!1,check:!1,view:!1,disabled:!1,dialogTableVisible:!1}},mounted:function(){var e=this;this.getRole(),this.$route.query.coopId?(this.isUpadte=!0,this.getCoopDetail()):(this.$route.params||this.$alert("未检测到店铺","警告",{confirmButtonText:"确定",callback:function(o){e.$router.go(-1)}}),this.form.coopDeptId=Object(i.b)().deptId,this.form.coopGroupId=Object(i.b)().grouopId,this.form.coopUserId=Object(i.b)().id,this.shopDetail=this.$route.params,this.form.coopCustomer=this.shopDetail.shopName,this.form.coopBossId=this.shopDetail.id,this.form.coopBossName=this.shopDetail.shopBoss),this.$route.query.check&&(this.check=!0,this.disabled=!0),this.$route.query.view&&(this.view=!0,this.disabled=!0)},methods:{getObjectURL:function(e){var o=null;return void 0!=window.createObjcectURL?o=window.createOjcectURL(e):void 0!=window.URL?o=window.URL.createObjectURL(e):void 0!=window.webkitURL&&(o=window.webkitURL.createObjectURL(e)),o},openPic:function(e){e.currentTarget.previousElementSibling.click()},upload:function(e){var o=this,t=(e.currentTarget.parentElement,new FormData),i=document.getElementsByName("file")[0].files[0],c=i.name.split(".")[1];i.name.split(".")[0];if(/\.(gif|jpg|jpeg|png|GIF|JPG|JPEG|PNG)$/.test("."+c)){var a=this.getObjectURL(i),l=e.currentTarget.nextElementSibling.getElementsByClassName("showPic")[0],s=e.currentTarget.getAttribute("data-id");console.log(s),t.append("file",i),Object(r.Y)(t).then(function(e){e.success?(l.setAttribute("src",a),l.style.display="block",o.form.coopBeiyong=e.message):o.$errmsg(e.message),console.log(e)})}else this.$errmsg("请上传图片格式文件")},rejectSub:function(){this.form.coopShenheBz?(this.form.coopTbtype="拒绝",this.form.coopShenheId=Object(i.b)().id,this.form.coopShenheTime=new Date,this.update()):this.$errmsg("请输入拒绝理由")},pass:function(){var e=this;this.$confirm("您即将通过该条提报, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){e.form.coopShenheId=Object(i.b)().id,e.form.coopShenheTime=new Date,e.form.coopTbtype="通过",e.update()}).catch(function(){})},reject:function(){this.dialogTableVisible=!0},getCoopDetail:function(){var e=this;Object(r.s)(this.$route.query.coopId).then(function(o){o.beginTime=o.coopYjscale?"预告":"立即开始",e.form=o,e.check||(e.form.coopDeptId=Object(i.b)().deptId,e.form.coopGroupId=Object(i.b)().grouopId,e.form.coopUserId=Object(i.b)().id),console.log(e.form)})},update:function(){var e=this;Object(r.Q)(this.form).then(function(o){o.success?(e.$sucmsg("审核成功"),e.$router.go(-1)):e.$errmsg(o.message)})},checkGood:function(e){var o=this;e?Object(r.C)(e).then(function(e){0==e.code?(o.$sucmsg("验证完成，已上线"),o.form.coopPttype="已上线"):(o.$sucmsg("验证完成，未上线"),o.form.coopPttype="未上线"),o.flag=!0}):this.$message("请输入商品id")},viewGood:function(e,o){e?1==o?window.open(e):window.open("https://item.taobao.com/item.htm?ft=t&id="+e):this.$message("请先填写")},viewMainPic:function(e){e?window.open(e):this.$message("请先填写")},back:function(){this.$router.go(-1)},getRole:function(){var e=this;Object(r.L)().then(function(o){e.optionList=o})},submit:function(){var e=this;this.$refs.form.validate(function(o){o?e.flag?e.isUpadte?(e.form.coopTbtime=new Date,e.form.coopTbtype="待审核",e.form.coopShenheId=null,e.form.coopShenheTime=null,Object(r.V)(e.form).then(function(o){o.success?(e.$sucmsg(o.message),e.$router.go(-1)):e.$errmsg(o.message)})):("立即开始"===e.form.beginTime&&(e.form.coopStarttime=new Date),console.log(e.form),e.form.coopTbtime=new Date,e.form.coopTbtype="待审核",Object(r.d)(e.form).then(function(o){console.log(o),o.success?(e.$sucmsg(o.message),e.$router.go(-1)):e.$errmsg(o.message)})):e.$errmsg("请检测商品"):e.$message("请填写必填项")})}}},a={render:function(){var e=this,o=e.$createElement,t=e._self._c||o;return t("div",{staticClass:"wrap"},[t("div",{staticClass:"content"},[t("el-form",{ref:"form",attrs:{model:e.form,"label-width":"120px",size:"mini"}},[t("el-form-item",{attrs:{label:"商家客户："}},[t("el-input",{attrs:{disabled:""},model:{value:e.form.coopCustomer,callback:function(o){e.$set(e.form,"coopCustomer",o)},expression:"form.coopCustomer"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"零点提报："}},[t("el-radio",{attrs:{label:"零点",name:"zero"},model:{value:e.form.coopZero,callback:function(o){e.$set(e.form,"coopZero",o)},expression:"form.coopZero"}}),e._v(" "),t("el-radio",{attrs:{label:"非零点",name:"zero"},model:{value:e.form.coopZero,callback:function(o){e.$set(e.form,"coopZero",o)},expression:"form.coopZero"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"coopGoodsTitle",label:"商品标题：",rules:[{required:!0,message:"请输入商品标题"},{min:10,max:20,message:"商品标题在10~20字之间",trigger:"blur"}]}},[t("el-input",{model:{value:e.form.coopGoodsTitle,callback:function(o){e.$set(e.form,"coopGoodsTitle",o)},expression:"form.coopGoodsTitle"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"商品ID："}},[t("div",{staticClass:"flex"},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopGoodsId,callback:function(o){e.$set(e.form,"coopGoodsId",o)},expression:"form.coopGoodsId"}}),e._v(" "),t("el-button",{attrs:{type:"primary"},on:{click:function(o){return e.checkGood(e.form.coopGoodsId)}}},[e._v("检测")]),e._v(" "),t("el-button",{attrs:{type:"primary"},on:{click:function(o){return e.viewGood(e.form.coopGoodsId)}}},[e._v("查看商品")])],1)]),e._v(" "),t("el-form-item",{attrs:{label:"商品活动：",value:"常规单"}},[t("el-radio",{attrs:{label:"常规单"},model:{value:e.form.coopActivity,callback:function(o){e.$set(e.form,"coopActivity",o)},expression:"form.coopActivity"}}),e._v(" "),t("el-radio",{attrs:{label:"聚划算"},model:{value:e.form.coopActivity,callback:function(o){e.$set(e.form,"coopActivity",o)},expression:"form.coopActivity"}}),e._v(" "),t("el-radio",{attrs:{label:"淘抢购"},model:{value:e.form.coopActivity,callback:function(o){e.$set(e.form,"coopActivity",o)},expression:"form.coopActivity"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"商品分类："}},[t("el-select",{model:{value:e.form.coopShopFl,callback:function(o){e.$set(e.form,"coopShopFl",o)},expression:"form.coopShopFl"}},e._l(e.optionList,function(o,r){return t("el-option",{key:r,attrs:{value:o.id,label:o.name}},[e._v(e._s(o.name))])}),1)],1),e._v(" "),t("el-form-item",{attrs:{prop:"coopMainpicture",label:"商品主图：",rules:[{required:!0,message:"请输入商品主图"}]}},[t("div",{staticClass:"flex"},[t("el-input",{model:{value:e.form.coopMainpicture,callback:function(o){e.$set(e.form,"coopMainpicture",o)},expression:"form.coopMainpicture"}}),e._v(" "),t("el-button",{attrs:{type:"primary"},on:{click:function(o){return e.viewMainPic(e.form.coopMainpicture)}}},[e._v("查看主图")])],1)]),e._v(" "),t("el-form-item",{attrs:{label:"商品营销图："}},[t("div",{staticClass:"flex"},[t("el-input",{model:{value:e.form.coopPicture,callback:function(o){e.$set(e.form,"coopPicture",o)},expression:"form.coopPicture"}}),e._v(" "),t("el-button",{attrs:{type:"primary"},on:{click:function(o){return e.viewMainPic(e.form.coopPicture)}}},[e._v("查看营销图")])],1)]),e._v(" "),t("el-form-item",{attrs:{label:"推广文案："}},[t("el-input",{attrs:{type:"textarea"},model:{value:e.form.coopPromotion,callback:function(o){e.$set(e.form,"coopPromotion",o)},expression:"form.coopPromotion"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"特色文案："}},[t("el-input",{attrs:{type:"textarea"},model:{value:e.form.coopColor,callback:function(o){e.$set(e.form,"coopColor",o)},expression:"form.coopColor"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"开始时间"}},[t("el-radio",{attrs:{label:"立即开始"},model:{value:e.form.beginTime,callback:function(o){e.$set(e.form,"beginTime",o)},expression:"form.beginTime"}}),e._v(" "),t("el-radio",{attrs:{label:"预告"},model:{value:e.form.beginTime,callback:function(o){e.$set(e.form,"beginTime",o)},expression:"form.beginTime"}})],1),e._v(" "),"预告"===e.form.beginTime?t("el-form-item",{attrs:{prop:"coopStarttime",label:"预告时间",rules:[{required:!0,message:"请输入预告时间"}]}},[t("el-date-picker",{attrs:{type:"date",placeholder:"选择日期"},model:{value:e.form.coopStarttime,callback:function(o){e.$set(e.form,"coopStarttime",o)},expression:"form.coopStarttime"}})],1):e._e(),e._v(" "),t("el-form-item",{attrs:{label:"优惠券名称："}},[t("el-input",{model:{value:e.form.coopYhqName,callback:function(o){e.$set(e.form,"coopYhqName",o)},expression:"form.coopYhqName"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"优惠券链接："}},[t("div",{staticClass:"flex"},[t("el-input",{model:{value:e.form.coopCoupon,callback:function(o){e.$set(e.form,"coopCoupon",o)},expression:"form.coopCoupon"}}),e._v(" "),t("el-button",{attrs:{type:"primary"},on:{click:function(o){return e.viewGood(e.form.coopCoupon,1)}}},[e._v("查看优惠券")])],1)]),e._v(" "),t("el-form-item",{attrs:{prop:"coopYhqnums",label:"优惠券总量：",rules:[{required:!0,message:"请输入优惠卷总量"}]}},[t("div",{staticClass:"flex"},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopYhqnums,callback:function(o){e.$set(e.form,"coopYhqnums",o)},expression:"form.coopYhqnums"}})],1)]),e._v(" "),t("el-form-item",{attrs:{prop:"coopAlterprice",label:"券后价：",rules:[{required:!0,message:"请输入券后价格"}]}},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopAlterprice,callback:function(o){e.$set(e.form,"coopAlterprice",o)},expression:"form.coopAlterprice"}})],1),e._v(" "),"预告"===e.form.beginTime?t("el-form-item",{attrs:{prop:"coopYjscale",label:"佣金比例：",rules:[{required:!0,message:"请输入佣金比例"}]}},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopYjscale,callback:function(o){e.$set(e.form,"coopYjscale",o)},expression:"form.coopYjscale"}})],1):e._e(),e._v(" "),t("el-form-item",{attrs:{prop:"coopServiceFee",label:"服务费单价：",rules:[{required:!0,message:"请输入服务单价"}]}},[t("el-input",{model:{value:e.form.coopServiceFee,callback:function(o){e.$set(e.form,"coopServiceFee",o)},expression:"form.coopServiceFee"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"coopEndtime",label:"结束时间：",rules:[{required:!0,message:"请输入结束时间"}]}},[t("el-date-picker",{attrs:{type:"date",placeholder:"请选择日期"},model:{value:e.form.coopEndtime,callback:function(o){e.$set(e.form,"coopEndtime",o)},expression:"form.coopEndtime"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"coopPerTime",label:"预汇款时间：",rules:[{required:!0,message:"请输入预汇款时间"}]}},[t("el-date-picker",{attrs:{type:"date",placeholder:"请选择日期"},model:{value:e.form.coopPerTime,callback:function(o){e.$set(e.form,"coopPerTime",o)},expression:"form.coopPerTime"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"备注"}},[t("el-input",{attrs:{type:"textarea"},model:{value:e.form.coopMessage,callback:function(o){e.$set(e.form,"coopMessage",o)},expression:"form.coopMessage"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"券面额："}},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopCouponNum,callback:function(o){e.$set(e.form,"coopCouponNum",o)},expression:"form.coopCouponNum"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"淘宝价："}},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopTapbaoPrice,callback:function(o){e.$set(e.form,"coopTapbaoPrice",o)},expression:"form.coopTapbaoPrice"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"拍几件："}},[t("el-input",{attrs:{type:"number"},model:{value:e.form.coopPayNum,callback:function(o){e.$set(e.form,"coopPayNum",o)},expression:"form.coopPayNum"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"线上线下结算："}},[t("el-radio",{attrs:{label:"线上结算"},model:{value:e.form.coopPayType,callback:function(o){e.$set(e.form,"coopPayType",o)},expression:"form.coopPayType"}}),e._v(" "),t("el-radio",{attrs:{label:"线下结算"},model:{value:e.form.coopPayType,callback:function(o){e.$set(e.form,"coopPayType",o)},expression:"form.coopPayType"}})],1),e._v(" "),"线上结算"===e.form.coopPayType?t("el-form-item",{attrs:{prop:"coopHeadId",label:"团长ID",rules:"线上结算"===e.form.coopPayType?[{required:!0,message:"请输入团长ID"}]:""}},[t("el-input",{attrs:{type:"txt"},model:{value:e.form.coopHeadId,callback:function(o){e.$set(e.form,"coopHeadId",o)},expression:"form.coopHeadId"}})],1):e._e(),e._v(" "),t("el-form-item",{attrs:{label:"上传实拍图："}},[t("div",{staticClass:"flex"},[t("el-input",{model:{value:e.form.coopRealShot,callback:function(o){e.$set(e.form,"coopRealShot",o)},expression:"form.coopRealShot"}})],1)]),e._v(" "),e.check||e.view?e._e():t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:e.submit}},[e._v(e._s(1==e.isUpadte?"修改":"提交"))]),e._v(" "),t("el-button",{on:{click:e.back}},[e._v("返回")])],1)],1),e._v(" "),e.check||e.view?t("div",{staticClass:"checkBtn"},[e.check?t("el-button",{attrs:{type:"primary"},on:{click:e.pass}},[e._v("通过")]):e._e(),e._v(" "),e.check?t("el-button",{attrs:{type:"danger"},on:{click:e.reject}},[e._v("退回")]):e._e(),e._v(" "),t("el-button",{attrs:{type:"warning"},on:{click:e.back}},[e._v("返回")])],1):e._e()],1),e._v(" "),t("el-dialog",{attrs:{title:"拒绝理由",visible:e.dialogTableVisible},on:{"update:visible":function(o){e.dialogTableVisible=o}}},[t("el-input",{attrs:{type:"textarea",rows:2,placeholder:"请输入拒绝理由"},model:{value:e.form.coopShenheBz,callback:function(o){e.$set(e.form,"coopShenheBz",o)},expression:"form.coopShenheBz"}}),e._v(" "),t("iframe",{staticStyle:{display:"none"},attrs:{id:"id_iframe",name:"nm_iframe"}}),e._v(" "),t("form",{staticStyle:{display:"inline"},attrs:{enctype:"multipart/form-data",target:"nm_iframe"}},[t("input",{staticClass:"yhq",staticStyle:{display:"none"},attrs:{type:"file",name:"file"},on:{change:e.upload}}),e._v(" "),t("div",{staticClass:"picBox",on:{click:e.openPic}},[e._v("\n      点击添加图片\n      "),t("img",{staticClass:"showPic",attrs:{src:""}})])]),e._v(" "),t("div",{staticStyle:{padding:"20px 0"}},[t("el-button",{attrs:{type:"primary"},on:{click:e.rejectSub}},[e._v("提交")]),e._v(" "),t("el-button",{attrs:{type:"success"},on:{click:function(o){e.dialogTableVisible=!1}}},[e._v("返回")])],1)],1)],1)},staticRenderFns:[]};var l=t("C7Lr")(c,a,!1,function(e){t("gLhU")},"data-v-9bbc6da2",null);o.default=l.exports}});
//# sourceMappingURL=10.b064ceb80857e5729f66.js.map