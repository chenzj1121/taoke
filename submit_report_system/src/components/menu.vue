<template>
  <el-menu
    default-active="home"
    class="el-menu-demo"
    mode="horizontal"
    background-color="#5197D7"
    text-color="#fff"
    router
    active-text-color="#ffd04b"
  >
    <el-menu-item index="/home">系统首页</el-menu-item>
    <el-submenu index="2" v-if="type==1 || type==0|| type ==2">
      <template slot="title" >客户信息</template>
      <el-menu-item index="/customer">私海客户</el-menu-item>
      <el-menu-item index="/public" v-if="type==0 ||type==1">公海客户</el-menu-item>
      <el-menu-item index="/cooperationDetail">合作明细</el-menu-item>
      <el-menu-item index="/checkingManage">查款管理</el-menu-item>
      <el-menu-item index="/moneyBack">返/退款</el-menu-item>
      <el-menu-item index="/afterDetail">后台明细</el-menu-item>
    </el-submenu>
    <el-submenu index="3">
      <template slot="title">系统管理</template>
      <el-menu-item index="/systemManager/userList" v-if="type==0 ||type==1 || type==4">用户管理</el-menu-item>
      <el-menu-item index="/systemManager/own">个人设置</el-menu-item>
      <el-menu-item index="/systemManager/modifyPassword">密码修改</el-menu-item>
      <el-menu-item index="/systemManager/dept" v-if="type==0">部门管理</el-menu-item>
      <el-menu-item index="/systemManager/group" v-if="type==0">小组管理</el-menu-item>
    </el-submenu>
     <el-submenu index="4"  v-if="type==0 ||type==4 || type==5">
      <template slot="title" >提报管理</template>
      <el-menu-item index="/tiBao/index"  >提报管理</el-menu-item>
      <el-menu-item index="/tiBao/userList" v-if="type==0 ||type==4">提报人员管理</el-menu-item>
    </el-submenu>
  </el-menu>
</template>

<script>
export default {
  props:["type"],
  updated(){
  console.log(this.type)
  },
  // computed: {
  //   admin(){
  //     return this.type  
  //   }
  // }
}

</script>

<style>
</style>
