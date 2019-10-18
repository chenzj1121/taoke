// 这个模块是对axios的封装 用于在发送请求时做相关的统一处理
import axios from 'axios'
import Vue from 'vue'

export default function ajax (url, data = {}, type = 'GET') {
  return new Promise((resolve, reject) => {
    let promise
    const header = { contentType: 'application/json;charset=UTF-8' }
    if (type === 'GET' || type === 'get') {
      promise = axios.get(url, {
        params: data
      }, header)
    } else {
      promise = axios.post(url, data, header)
    }

    promise.then(response => {
      const data = response.data
      resolve(data)
    })
      .catch(err => {
        if (err.response.data && err.response.data.message) {
          Vue.prototype.$message.error(err.response.data.message)
        } else {
          Vue.prototype.$message.error('there is something warn')
        }
        reject(err)
      })
  })
}
