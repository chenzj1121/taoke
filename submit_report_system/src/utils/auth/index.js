// 这个模块用于将登陆的信息存放到cookie中 依赖于js-cookie工具库
import Cookie from 'js-cookie'

const USER = 'user'

// 从cookie中读取登录信息
export const getUser = () => {
  let result = Cookie.get(USER)
  if (result) {
    // 如果cookie中没有登陆信息 返回值为undefined underfined 用JSON解析时会报错 所以增加判断
    result = JSON.parse(result)
  }
  return result
}

// 向cookie中增加登陆信息
export const setUser = user => {
  Cookie.set(USER, user)
}

// 删除cookie中的登录信息 退出登陆时使用
export const deleteUser = () => {
  Cookie.remove(USER)
}
