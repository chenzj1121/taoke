<template>
  <el-container>
    <el-header>
      <!-- <el-row class="logo_bar">
        <img :src="logoUrl" alt="logo">
      </el-row> -->
      <el-row type="flex" justify="space-between" align="middle" class="content_bar">
        <el-col>
          <Menu class="menu" :type="type"/>
        </el-col>
        <el-col class="logout_col">
          <Logout/>
        </el-col>
      </el-row>
    </el-header>
    <el-main>
      <router-view :type="type"/>
    </el-main>
  </el-container>
</template>

<script>
/**
 * @description 主框架的路由组件
 */
import Menu from '@/components/menu.vue'
import Logout from '@/components/logout.vue'
import logo from '@/assets/logo.png'
import { getUser } from '@/utils/auth'
export default {
  components: { Menu, Logout },
  data () {
    this.type = getUser().type;
    return {
      logoUrl: logo,
      type:0,
    }
  },
  mounted(){
    this.type = getUser().type;
  },
}
</script>

<style>
.el-header {
  padding: 0;
  height: auto!important;
}
.el-container {
  height: 100%;
}
.el-menu.el-menu--horizontal {
  border: 0
}
</style>
<style scoped>
.logo_bar {
  background: #25629B;
}
.content_bar {
  /* margin-top: -50px; */
  align-items: stretch;
}
.logout_col {
  flex: 1;
}
.menu {
  padding-left: 20px;
}
</style>
