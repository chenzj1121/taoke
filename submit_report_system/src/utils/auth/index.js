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
let allDay =7
export const setUser = user => {
  Cookie.set(USER, user,{ 
    expires : allDay 
})
}

// 删除cookie中的登录信息 退出登陆时使用
export const deleteUser = () => {
  Cookie.remove(USER)
}

export const getMyDate =(str)=> {
      var oDate = new Date(str)
      let oYear = oDate.getFullYear()
      let oMonth = oDate.getMonth()+1
      let oDay = oDate.getDate()
      let oHour =oDate.getHours()
      let oMin = oDate.getMinutes()
      let oTime = oYear +'-'+ oMonth +'-'+oDay+" "+oHour+":"+oMin
      return oTime;
      }
