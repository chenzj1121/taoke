// 这个模块用于想Vue的实例中增加方法

import Vue from 'vue'
import { Message } from 'element-ui'

// success的Message 基于ElementUI
Vue.prototype.$sucmsg = function (msg) {
  Message({
    message: msg,
    type: 'success'
  })
}

// warning的Message 基于ElementUI
Vue.prototype.$warnmsg = function (msg) {
  Message({
    message: msg,
    type: 'warning'
  })
}

// error的Message 基于ElementUI
Vue.prototype.$errmsg = function (msg) {
  Message({
    message: msg,
    type: 'error'
  })
}
