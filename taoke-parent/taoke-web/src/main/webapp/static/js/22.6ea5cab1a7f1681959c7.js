webpackJsonp([22],{FP3a:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l=a("gyMJ"),n=a("tvpV"),r={data:function(){return{tableData:[],loading:!0}},mounted:function(){var e=this,t=Object(n.b)().id,a=new Date,r=a.getMonth()+1,o=a.getFullYear();Object(l.v)(t,o,r).then(function(t){if(t){var l={target:t.workTarget},n=a.getDate(),r=new Date(a.getFullYear(),a.getMonth()+1,0).getDate();l.shouldBeDone=(l.target/r*n).toFixed(2),l.hasDone=t.firstWeekCustom+t.secondWeekCustom+t.thirdWeekCustom+t.fourthWeekCustom+t.fifthWeekCustom,l.donePercent=(l.hasDone/l.target*100).toFixed(2)+"%",l.diff=l.target-l.hasDone>0?"-"+(l.target-l.hasDone):"+"+-1*(l.target-l.hasDone),l.plannedSpeed=(n/r*100).toFixed(2)+"%",l.monthDays=r,l.day=n,l.diff2=(100*(l.hasDone/l.target-n/r)).toFixed(2)+"%",e.tableData.push(l)}e.loading=!1})},methods:{nav2WriteTarget:function(){this.$router.push({path:"/customer/writeTarget"})},tableHeaderColor:function(e,t,a,l){return"font-wight:800;font-size:20px;text-align:center;"},tableRowStyle:function(e){e.row,e.rowIndex;return"font-size:15px;background:yellow;font-weight:800"}}},o={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"home_wrap"},[a("el-row",[a("el-button",{staticStyle:{float:"right","margin-bottom":"20px"},attrs:{type:"primary",size:"mini"},on:{click:e.nav2WriteTarget}},[e._v("目标填写")])],1),e._v(" "),a("el-row",[a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],attrs:{data:e.tableData,border:"",size:"mini",align:"center","header-cell-style":e.tableHeaderColor,"row-style":e.tableRowStyle}},[a("el-table-column",{attrs:{align:"center",label:"当月工作进度表"}},[a("el-table-column",{attrs:{align:"center"}},[e._v("目标")]),e._v(" "),a("el-table-column",{staticClass:"big",attrs:{label:"月目标",prop:"target",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"应完成",prop:"shouldBeDone",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"实际完成",prop:"hasDone",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"完成率",prop:"donePercent",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"实际进度目标进度差",align:"center"}},[a("el-table-column",{attrs:{prop:"diff",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{prop:"diff2",align:"center"}})],1),e._v(" "),a("el-table-column",{attrs:{label:"目标进度",prop:"plannedSpeed",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"本月天数",prop:"monthDays",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"日期",prop:"day",align:"center"}})],1)],1)],1)],1)},staticRenderFns:[]};var i=a("C7Lr")(r,o,!1,function(e){a("Qdgq")},null,null);t.default=i.exports},Qdgq:function(e,t){}});
//# sourceMappingURL=22.6ea5cab1a7f1681959c7.js.map