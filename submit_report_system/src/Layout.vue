<template>
  <router-view/>
</template>

<script>
import {getDeptByList} from "@/api"
import { getUser } from '@/utils/auth'
/* eslint-disable */
/**
 * @description 简单的显示路由的组件
 */
export default {
  mounted(){
    getDeptByList().then(res=>{
      res.forEach(item => {
          if (item.deptName=='支持部') {
            sessionStorage.setItem("coopDeptId",item.deptId)
          }
      });
    })
    sessionStorage.setItem("userDeptId",getUser().deptId)
    sessionStorage.setItem("userGroupId",getUser().groupId)

  },
  methods:{

  }
}
</script>

<style scoped lang='less'>

</style>
