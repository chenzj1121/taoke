webpackJsonp([7],{"0hLR":function(e,t){},"22IH":function(e,t,l){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=l("gyMJ"),o=l("js5j"),r=l("tvpV"),i={components:{Page:o.a},data:function(){return{form:{},departmentOptions:[],groupOptions:[],principalOptions:[],statusOptions:[{label:"订单结算",value:"订单结算"},{label:"订单付款",value:"订单付款"},{label:"订单成功",value:"订单成功"},{label:"订单失效",value:"订单失效"}],orderByOptions:[{label:"全部",value:"全部"},{label:"由高到低",value:"由高到低"},{label:"由低到高",value:"由低到高"}],afterDetailTableData:[],page:{pageSize:10,pageNum:1,total:10},userList:[],deptList:[],groupList:[],gruopList2:[],memberList:[],type:2}},mounted:function(){this.type=Object(r.b)().type,this.getUserList(),this.getGroupList(),this.getDeptList(),this.getDetailList()},methods:{openFile:function(){document.getElementById("filebox").click()},upload:function(e){document.getElementById("form");var t=new FormData,l=document.getElementsByName("file")[0].files[0],o=l.name.split(".")[1],r=l.name.split(".")[0];"xls"==o||"xlsx"==o?(t.append(r,l),Object(a.R)(t).then(function(e){})):this.$errmsg("请上传excel格式文件")},downloadFile:function(){window.open(a.a+"/backgroundDetails/download.do?filename=moban.xls","_blank")},getUserList:function(){var e=this;Object(a.K)().then(function(t){e.userList=t})},getDeptList:function(){var e=this;Object(a.w)().then(function(t){e.deptList=t})},getGroupList:function(){var e=this;Object(a.B)().then(function(t){e.groupList=t})},getDetailList:function(){var e=this,t={};t.sysUser=this.form,t.pageNum=this.page.pageNum,t.pageSize=this.page.pageSize,Object(a.y)(this.form,this.page.pageNum,this.page.pageSize).then(function(t){t.rows.forEach(function(t,l){e.groupList.forEach(function(e){t.deptId==e.groupDeptId&&t.groupId==e.groupId&&(t.groupName=e.groupName,t.deptName=e.groupName)}),e.userList.forEach(function(e){t.useId==e.id&&(t.creater=e.username)})}),e.page.total=t.total,e.afterDetailTableData=t.rows})},getGroup:function(e){var t=this;this.form.groupId=null,this.form.useId&&(this.form.useId=null),this.gruopList2=[],this.memberList=[],e&&this.groupList.map(function(l){l.groupDeptId==e&&t.gruopList2.push(l)})},getMember:function(e,t){var l=this;console.log(e,t),this.form.useId&&(this.form.useId=null),this.memberList=[],e&&t&&Object(a.D)(e,t).then(function(e){l.memberList=e})}}},s={render:function(){var e=this,t=e.$createElement,l=e._self._c||t;return l("div",[l("div",{staticClass:"title"},[e._v("后台明细")]),e._v(" "),l("el-form",{attrs:{inline:"",size:"mini"}},[2!=e.type?l("div",[l("el-form-item",{attrs:{label:"销售部"}},[l("el-select",{attrs:{placeholder:"请选择"},on:{change:function(t){return e.getGroup(e.form.deptId)}},model:{value:e.form.deptId,callback:function(t){e.$set(e.form,"deptId",t)},expression:"form.deptId"}},[l("el-option",{attrs:{value:"",label:"全部"}}),e._v(" "),e._l(e.deptList,function(e,t){return l("el-option",{key:t,attrs:{value:e.deptId,label:e.deptName}})})],2)],1),e._v(" "),l("el-form-item",{attrs:{label:"组别"}},[l("el-select",{attrs:{placeholder:"请选择"},on:{change:function(t){return e.getMember(e.form.deptId,e.form.groupId)}},model:{value:e.form.groupId,callback:function(t){e.$set(e.form,"groupId",t)},expression:"form.groupId"}},[l("el-option",{attrs:{value:"",label:"全部"}}),e._v(" "),e._l(e.gruopList2,function(e,t){return l("el-option",{key:t,attrs:{value:e.groupId,label:e.groupName}})})],2)],1),e._v(" "),l("el-form-item",{attrs:{label:"责任人"}},[l("el-select",{attrs:{placeholder:"请选择"},model:{value:e.form.useId,callback:function(t){e.$set(e.form,"useId",t)},expression:"form.useId"}},[l("el-option",{attrs:{value:"",label:"全部"}}),e._v(" "),e._l(e.memberList,function(e,t){return l("el-option",{key:t,attrs:{value:e.id,label:e.username}})})],2)],1)],1):e._e(),e._v(" "),l("el-form-item",{attrs:{label:"店铺名称"}},[l("el-input",{model:{value:e.form.shopName,callback:function(t){e.$set(e.form,"shopName",t)},expression:"form.shopName"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"商品ID"}},[l("el-input",{model:{value:e.form.goodsId,callback:function(t){e.$set(e.form,"goodsId",t)},expression:"form.goodsId"}})],1),e._v(" "),l("br"),e._v(" "),l("el-form-item",{attrs:{label:"结算时间"}},[l("el-col",{attrs:{span:11}},[l("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",placeholder:"开始日期"},model:{value:e.form.createTime,callback:function(t){e.$set(e.form,"createTime",t)},expression:"form.createTime"}})],1),e._v(" "),l("el-col",{staticClass:"line",attrs:{span:2}},[e._v("至")]),e._v(" "),l("el-col",{attrs:{span:11}},[l("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",placeholder:"结束时间"},model:{value:e.form.clickTime,callback:function(t){e.$set(e.form,"clickTime",t)},expression:"form.clickTime"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"订单号搜索"}},[l("el-input",{model:{value:e.form.orderId,callback:function(t){e.$set(e.form,"orderId",t)},expression:"form.orderId"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"状态"}},[l("el-select",{model:{value:e.form.ordersType,callback:function(t){e.$set(e.form,"ordersType",t)},expression:"form.ordersType"}},e._l(e.statusOptions,function(e,t){return l("el-option",{key:t,attrs:{label:e.label,value:e.value}})}),1)],1),e._v(" "),l("el-form-item",{attrs:{label:"结算金额排序"}},[l("el-select",{model:{value:e.form.sort,callback:function(t){e.$set(e.form,"sort",t)},expression:"form.sort"}},e._l(e.orderByOptions,function(e,t){return l("el-option",{key:t,attrs:{label:e.label,value:e.value}})}),1)],1),e._v(" "),l("br"),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.getDetailList}},[e._v("查询")])],1),e._v(" "),l("el-form-item",{attrs:{label:"付款服务费总额"}},[l("el-input",{model:{value:e.form.pay,callback:function(t){e.$set(e.form,"pay",t)},expression:"form.pay"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"结算服务费总额"}},[l("el-input",{model:{value:e.form.payMoney,callback:function(t){e.$set(e.form,"payMoney",t)},expression:"form.payMoney"}})],1),e._v(" "),l("el-form-item",[l("span",[e._v("驳回消息 0 条")]),e._v(" "),l("span",{staticClass:"link"},[e._v("点击查看")])]),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.downloadFile}},[e._v("下载表格")]),e._v(" "),l("iframe",{staticStyle:{display:"none"},attrs:{id:"id_iframe",name:"nm_iframe"}}),e._v(" "),l("form",{staticStyle:{display:"inline"},attrs:{enctype:"multipart/form-data",target:"nm_iframe",id:"form"}},[l("input",{staticStyle:{display:"none"},attrs:{type:"file",name:"file",id:"filebox"},on:{change:e.upload}}),e._v(" "),l("input",{attrs:{type:"hidden",id:"ssFile",name:"ssFile"}}),e._v(" "),l("el-button",{attrs:{size:"small",type:"primary"},on:{click:e.openFile}},[e._v("导入表格")])],1)],1)],1),e._v(" "),l("el-table",{attrs:{data:e.afterDetailTableData,size:"mini"}},[l("el-table-column",{attrs:{type:"index",label:"序号"}}),e._v(" "),l("el-table-column",{attrs:{label:"所属部门",prop:"deptName"}}),e._v(" "),l("el-table-column",{attrs:{label:"组别",prop:"groupName"}}),e._v(" "),l("el-table-column",{attrs:{label:"责任人",prop:"creater"}}),e._v(" "),l("el-table-column",{attrs:{label:"店铺名称",prop:"shopName"}}),e._v(" "),l("el-table-column",{attrs:{label:"商品ID",prop:"goodsId"}}),e._v(" "),l("el-table-column",{attrs:{label:"订单数",prop:"goodsCounts"}}),e._v(" "),l("el-table-column",{attrs:{label:"服务费比例",prop:"ordersFl"}}),e._v(" "),l("el-table-column",{attrs:{label:"付款金额",prop:"pay"}}),e._v(" "),l("el-table-column",{attrs:{label:"付款服务费",prop:"payAbout"}}),e._v(" "),l("el-table-column",{attrs:{label:"结算金额",prop:"payMoney"}}),e._v(" "),l("el-table-column",{attrs:{label:"结算服务费",prop:"moneyAbout"}})],1),e._v(" "),l("Page",{staticStyle:{"text-align":"right","margin-top":"10px"},attrs:{page:e.page},on:{change:e.getDetailList}})],1)},staticRenderFns:[]};var n=l("C7Lr")(i,s,!1,function(e){l("0hLR")},"data-v-bbf00f10",null);t.default=n.exports}});
//# sourceMappingURL=7.c2beb5321ab4addfaae8.js.map