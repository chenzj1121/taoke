import ajax from './axios'

const PRE_URL = '/api'

export const reqLogin = (user) => ajax(PRE_URL + '/login.do', user, 'post')

export const getUserByPage = (sysUser, pageNum, pageSize) => ajax(PRE_URL + `/sysUser/search.do?pageNum=${pageNum}&pageSize=${pageSize}`, sysUser, 'post')

export const updUser = (param) => ajax(PRE_URL + '/sysUser/update.do', param, 'post')

export const addUser = (param) => ajax(PRE_URL + '/sysUser/add.do', param, 'post')

export const getUserById = (id) => ajax(PRE_URL + '/sysUser/findOne.do?id=' + id, 'get')

export const getDeptByPage = (param, page, rows) => ajax(PRE_URL + `/dept/search.do?page=${page}&rows=${rows}`, param, 'post')

export const getDeptByList = () => ajax(PRE_URL + '/dept/findAll.do', '', 'post')

export const getDeptById = (param) => ajax(PRE_URL + '/dept/gfindOne.do?id=' + param, 'get')

export const delDeptById = (param) => ajax(PRE_URL + '/dept/delete.do?ids=' + param, 'post')

export const addDept = (param) => ajax(PRE_URL + '/dept/add.do', param, 'post')

export const updDept = (param) => ajax(PRE_URL + '/dept/update.do', param, 'post')

export const getUserByList = () => ajax(PRE_URL + '/sysUser/findAll.do', '', 'post')

export const getGroupByPage = (param) => ajax(PRE_URL + '/group/findAll.do', param, 'post')

export const getGroupByList = () => ajax(PRE_URL + '/group/findAll.do', '', 'get')

export const getGroupById = (param) => ajax(PRE_URL + '/group/findOne.do?id=' + param, 'get')

export const delGroupById = (param) => ajax(PRE_URL + '/group/delete.do?id=' + param, 'get')

export const addGroup = (param) => ajax(PRE_URL + '/group/add.do', param, 'post')

export const updGroup = (param) => ajax(PRE_URL + '/group/update.do', param, 'post')

export const getShopList = (shop, page, rows) => ajax(PRE_URL + `/shop/search.do?page=${page}&rows=${rows}`, shop, 'post')

export const getShopById = id => ajax(PRE_URL + `/shop/findOne.do`, { id })

export const addShop = (shop) => ajax(PRE_URL + `/shop/add.do`, shop, 'post')

export const updateShop = shop => ajax(PRE_URL + `/shop/update.do`, shop, 'post')

export const deleteShopById = id => ajax(PRE_URL + `/shop/delete.do?ids=${id}`, 'post')

export const getCooperationPage = (form, page, rows) => ajax(PRE_URL + `/coop/search.do?page=${page}&rows=${rows}`, form, 'post')

export const getCheckmonkeyPage = (form, page, rows) => ajax(PRE_URL + `/checkmoneys/search.do?page=${page}&rows=${rows}`, form, 'post')

//10-18 lambor
export const addTarget = (target) => ajax(PRE_URL + '/userWorkTargetMonth/add.do',target, 'post')
export const updateTarget = (target) => ajax(PRE_URL + '/userWorkTargetMonth/update.do',target, 'post')
export const findTarget = (userId,year,month) => ajax(PRE_URL + '/userWorkTargetMonth/findOneByYearAndMonth.do?userId='+userId+"&year="+year+"&month="+month,'post')
export const addRecord = (target) => ajax(PRE_URL + '/followUpRecord/add.do',target,'post')
export const findRecord = (id) => ajax(PRE_URL + '/followUpRecord/findOne.do?id='+id,'get')
