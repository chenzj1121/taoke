import router from './router'
import { getUser } from '@/utils/auth'

router.beforeEach((to, from, next) => {
  const result = isLogin()
  if (result && to.path !== '/login') {
    // 如果当前已经登陆且没有请求login页面
    if (to.path === '/') {
      next({ path: '/home' })
    } else {
      next()
    }
  } else if (to.path === '/login') {
    if (result) {
      // 如果当前已经登陆并且请求login页面的话 重定向到home页面
      next({ path: '/home' })
    } else {
      next()
    }
  } else {
    next({ path: '/login' })
  }

  function isLogin () {
    return getUser()
  }
})
