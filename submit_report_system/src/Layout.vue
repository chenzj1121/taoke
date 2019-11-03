<template>
  <router-view/>
</template>

<script>
import {getDeptByList} from "@/api"
/* eslint-disable */
/**
 * @description 简单的显示路由的组件
 */
export default {
  mounted(){
    getDeptByList().then(res=>{
      res.forEach(item => {
          if (item.deptName=='提报组') {
            sessionStorage.setItem("deptId",item.deptId)
          }
      });
      
    })
          console.log(sessionStorage.deptId)

  },
  methods:{

  }
}
</script>

<style scoped lang='less'>

</style>
