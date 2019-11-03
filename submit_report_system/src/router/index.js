import Vue from 'vue'
import Router from 'vue-router'
import Layout from '@/Layout'
import {getUser}　from "../utils/auth/index"

Vue.use(Router)
function shouWei(to,from,next){
  if(getUser().type==0 ||getUser().type==1 ||getUser().type==4){
    next()
  }else{
    alert("对不起，你没有权限")
    next('/home')
  }
}

export default new Router({
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: () => import('@/pages/login')
    },
    {
      path: '/',
      name: 'home',
      component: () => import('@/MainLayout'),
      children: [
        {
          path: '/home',
          name: 'home',
          component: () => import('@/pages/home')
        },
        {
          path:'/tiBao',
          name: 'tiBao',
          component: Layout,
          redirect:'/tiBao/index',
          children:[{
            path:'index',
            name:'tiBaoIndex',
            component: () => import('@/pages/tiBao')
          },
          {
            path:'userList',
            name:'tiBaoUser',
            beforeEnter: (to, from, next) => {shouWei(to,from,next)},
            component: () => import('@/pages/tiBao/userList')
          }
          ]
        },
        {
          // 私海客户
          path: '/customer',
          name: 'customer',
          component: Layout,
          redirect: 'customer/index',
          children: [
            {
              path: 'index',
              name: 'customerIndex',
              component: () => import('@/pages/customer')
            },
            {
              path: 'add',
              name: 'customerAdd',
              component: () => import('@/pages/customer/add')
            },
            {
              path: 'update',
              name: 'customerUpdate',
              component: () => import('@/pages/customer/update')
            },
            {
              // 提报
              path: 'cooperationDetail',
              name: 'cooperationDetail',
              component: () => import('@/pages/customer/cooperationDetail')
            },
            {
              // 填写目标
              path: 'writeTarget',
              name: 'writeTarget',
              component: () => import('@/pages/customer/writeTarget')
            },
            {
              // 跟进记录
              path: 'followRecord',
              name: 'followRecord',
              component: () => import('@/pages/customer/followRecord')
            }
          ]
        },
        {
          // 商店详情
          path: 'shopDetail',
          name: 'shopDetail',
          component: () => import('@/pages/shopDetail')
        },
        {
          // 公海客户
          path: '/public',
          name: 'public',
          redirect: 'public/index',
          component: Layout,
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/public')
            },
            {
              path: 'add',
              name: 'add',
              component: () => import('@/pages/public/add')
            },
            {
              path: 'update',
              name: 'updatePublic',
              component: () => import('@/pages/shopDetail/update/index')
            }
          ]
        },
        {
          path: '/cooperationDetail',
          name: 'cooperationDetail',
          component: Layout,
          redirect: 'cooperationDetail/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/cooperationDetail')
            },
            {
              path: 'checking',
              name: 'check',
              component: () => import('@/pages/cooperationDetail/checking')
            },
            {
              path:'backmoney',
              name:'backmoney',
              component: () => import('@/pages/cooperationDetail/backMoney/index')
            }
          ]
        },
        {
          path: '/checkingManage',
          name: 'checkingManage',
          component: Layout,
          redirect: 'checkingManage/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/checkingManage')
            }
          ]
        },
        {
          path: '/moneyBack',
          name: 'moneyBack',
          component: Layout,
          redirect: 'moneyBack/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/moneyBack')
            }
          ]
        },
        {
          path: '/afterDetail',
          name: 'afterDetail',
          component: Layout,
          redirect: 'afterDetail/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/afterDetail')
            }
          ]
        },
        {
          path: '/systemManager/userList',
          name: 'userList',
          beforeEnter: (to, from, next) => {shouWei(to,from,next)},
          component: Layout,
          redirect: 'systemManager/userList/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/systemManager/userList'),
            },
            {
              path: 'addUser',
              name: 'addUser',
              component: () => import('@/pages/systemManager/userList/addUser'),
            },
            {
              path: 'updUser',
              name: 'updUser',
              component: () => import('@/pages/systemManager/userList/updUser'),
            }
          ]
        },
        {
          path: '/systemManager/own',
          name: 'own',
          component: Layout,
          redirect: 'systemManager/own/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/systemManager/own')
            }
          ]
        },
        {
          path: '/systemManager/modifyPassword',
          name: 'modifyPassword',
          component: Layout,
          redirect: 'systemManager/modifyPassword/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/systemManager/modifyPassword')
            }
          ]
        },
        {
          path: '/systemManager/dept',
          name: 'dept',
          component: Layout,
          beforeEnter: (to, from, next) => {shouWei(to,from,next)},
          redirect: 'systemManager/dept/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/systemManager/dept')
            }
          ]
        },
        {
          path: '/systemManager/group',
          name: 'group',
          component: Layout,
          beforeEnter: (to, from, next) => {shouWei(to,from,next)},
          redirect: 'systemManager/group/index',
          children: [
            {
              path: 'index',
              name: 'index',
              component: () => import('@/pages/systemManager/group')
            }
          ]
        }
      ]
    },
    {
      path: '/404',
      name: '404',
      component: () => import('@/pages/404')
    },
    { path: '*', redirect: '/404', hidden: true }
  ]
})
