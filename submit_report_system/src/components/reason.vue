<template>
    <div id="reasonBox">
        <div class="mainBox">
            <div class="title1">
                <p>拒绝理由</p>
                <div class="shenheInfo">
                    <p>审核人：{{data.coopUser}}</p>
                    <p>审核时间：{{data.coopShenheTime}}</p>
                 </div>
            </div>
          
            <el-input
            style="width:450px;padding:0 10px;"
            type="textarea"
            :rows="3"
            placeholder="请输入内容"
            v-model="data.coopShenheBz"
            disabled>
            </el-input>
            <div class="reasonPic">
                <p>点击查看大图：</p>
            <el-image 
            style="width: 150px; height: 150px;margin:10px auto;"
            :src="PRE_URL+'/'+data.coopBeiyong" 
            :preview-src-list="[`${this.PRE_URL}/${this.data.coopBeiyong}`]">
            </el-image>
            </div>
           <p id="closeBtn" @click="close">关闭</p>
        </div>
    </div>
</template>
<script>
import {PRE_URL} from "@/api"
export default {
    props:['data'],
    data(){
        return{
            PRE_URL ,
        }
    },
    created(){
            this.data.coopShenheTime = this.getMyDate(this.data.coopShenheTime)
            // this.userList.forEach(item=>{
            //     if (data.coopShenheId==item.id) {
            //         data.coopShenheId = item.username
            //     }
            // })
    },
    methods:{
        close(){
            this.$emit("func",false)
        },
         getMyDate(str) {
    var oDate = new Date(str)
    let oYear = oDate.getFullYear()
    let oMonth = oDate.getMonth()+1
    let oDay = oDate.getDate()
    let oHour =oDate.getHours()
    let oMin = oDate.getMinutes()
    if (oMin <10) {
      oMin = "0"+oMin
    }
    let oTime = oYear +'-'+ oMonth +'-'+oDay+" "+oHour+":"+oMin
    return oTime;
    }
    }

}
</script>
<style scoped>
    #reasonBox{
        position: fixed;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        z-index: 999;
        background:rgba(0, 0, 0, .3);
        color: #606266;
    }
    .mainBox{
        width: 500px;
        height: 400px;
        margin:  auto;
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        background: #fff;
        padding: 30px 10px;
        border-radius: 10px;
    }
    .title1{
        text-align: left;
        padding: 10px;
        font-size: 18px;
     }
     .shenheInfo{
         font-size: 14px;
         padding: 10px;
     }
     .shenheInfo p{
         padding: 5px;
     }
     .reasonPic{
           padding: 10px;
           margin-top: 10px;
           font-size: 14px;
           display: flex;
           justify-content:space-around;
           align-items: center;
     }
     #closeBtn{
         position: absolute;
         right: 0;
         top: 0;
         padding: 10px;
         cursor: pointer;
         color: gray;
     }
</style>