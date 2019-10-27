import ajax from './axios'

// const PRE_URL 

export const PRE_URL = '/api'

export const reqLogin = (user) => ajax('/login.do', user, 'post')

export const getUserByPage = (sysUser, pageNum, pageSize) => ajax(`/sysUser/search.do?pageNum=${pageNum}&pageSize=${pageSize}`, sysUser, 'post')

export const updUser = (param) => ajax('/sysUser/update.do', param, 'post')

export const addUser = (param) => ajax('/sysUser/add.do', param, 'post')

export const getUserById = (id) => ajax('/sysUser/findOne.do?id=' + id, 'get')

export const getDeptByPage = (param, page, rows) => ajax(`/dept/search.do?page=${page}&rows=${rows}`, param, 'post')

export const getDeptByList = () => ajax('/dept/findAll.do', '', 'post')

export const getDeptById = (param) => ajax('/dept/gfindOne.do?id=' + param, 'get')

export const delDeptById = (param) => ajax('/dept/delete.do?ids=' + param, 'post')

export const addDept = (param) => ajax('/dept/add.do', param, 'post')

export const updDept = (param) => ajax('/dept/update.do', param, 'post')

export const getUserByList = () => ajax('/sysUser/findAll.do', '', 'post')

export const getGroupByPage = (param) => ajax('/group/findAll.do', param, 'post')

// export const getGroupByList = () => ajax('/dept/findAll.do', '', 'post')
export const getGroupByList = () => ajax('/group/findAll.do', '', 'post')

export const getGroupById = (param) => ajax('/group/findOne.do?id=' + param, 'get')

export const delGroupById = (param) => ajax('/group/delete.do?ids=' + param, 'get')

export const addGroup = (param) => ajax('/group/add.do', param, 'post')

export const updGroup = (param) => ajax('/group/update.do', param, 'post')

export const getShopList = (shop, page, rows) => ajax(`/shop/search.do?page=${page}&rows=${rows}`, shop, 'post')

export const getShopById = id => ajax(`/shop/findOne.do`, { id })

export const addShop = (shop) => ajax(`/shop/add.do`, shop, 'post')

export const updateShop = shop => ajax(`/shop/update.do`, shop, 'post')

export const deleteShopById = id => ajax(`/shop/delete.do?ids=${id}`, 'post')

export const getCooperationPage = (form, page, rows) => ajax(`/coop/search.do?page=${page}&rows=${rows}`, form, 'post')

export const getCheckmonkeyPage = (form, page, rows) => ajax(`/checkmoneys/search.do?page=${page}&rows=${rows}`, form, 'post')

//10-18 lambor
export const addTarget = (target) => ajax(PRE_URL + '/userWorkTargetMonth/add.do',target, 'post')

export const updateTarget = (target) => ajax(PRE_URL + '/userWorkTargetMonth/update.do',target, 'post')

export const findTarget = (userId,year,month) => ajax(PRE_URL + '/userWorkTargetMonth/findOneByYearAndMonth.do?userId='+userId+"&year="+year+"&month="+month,'post')

export const addRecord = (target) => ajax(PRE_URL + '/followUpRecord/add.do',target,'post')

export const findRecord = (id) => ajax(PRE_URL + '/followUpRecord/findOne.do?id='+id,'get')

export const checkWangWang = (name) => ajax(PRE_URL + '/shop/getWangwangAccountCounts.do?wangwangAccount='+name,'post')

export const getDetail = (obj,page,rows) => ajax(PRE_URL + `/backgroundDetails/search.do?page=${page}&rows=${rows}`,obj,'post')

export const getGroupMember = (deptId,groupId) => ajax(PRE_URL + '/sysUser/getUserByDeptIdAndGroupId.do?deptId='+deptId+"&groupId="+groupId,'','post')

// export const getCoopDetail = (obj,page,rows)=>ajax(PRE_URL+`/coop/search.do?page=${page}&rows=${rows}`,obj,'post')
export const getBackMoney = (obj,page,rows) => ajax(PRE_URL + `/backmoney/search.do?page=${page}&rows=${rows}`,obj,'post')

// export const downloadDetail = (name) => ajax(PRE_URL + `/backgroundDetails/download.do?filename=moban.xls`,"",'post')
export const uploadDetail = (file) => ajax(PRE_URL + `/backgroundDetails/upload.do`,file,'post')

export const getSysRole = () => ajax(PRE_URL + `/sysRole/findAll.do`,'','post')

export const getGoodsInfo = (id) => ajax(PRE_URL + `/coop/findByGoodId.do?goodsId=${id}`,'','post')

export const addCoop = (obj) => ajax(PRE_URL + `/coop/add.do`,obj,'post')

export const getMoreShop = (obj,page,rows) => ajax(PRE_URL + `/shop/search.do?page=${page}&rows=${rows}`,obj,'post')

export const getHisCoop = (obj,page,rows) => ajax(PRE_URL + `/coop/search.do?page=${page}&rows=${rows}`,obj,'post')

export const addCheckMoney = (obj) => ajax(PRE_URL + `/checkmoneys/add.do`,obj,'post')

export const findCoop = (id) => ajax(PRE_URL + '/coop/findOne.do?id='+id,'post')

export const addBackMoney = (obj) => ajax(PRE_URL + `/backmoney/add.do`,obj,'post')

export const addGoodsDetail = (obj) => ajax(PRE_URL + `/goods/add.do`,obj,'post')

export const getGoodsDetail = (obj) => ajax(PRE_URL + `/goods/findByShop.do?shopId=${obj}`,'','post')

export const delUserById = (param) => ajax(PRE_URL + '/sysUser/delete.do?ids=' + param, 'post')

export const uploadPic = (param) => ajax(PRE_URL + '/coop/up.do', param, 'post')

export const findCoopById = (param) => ajax(PRE_URL + '/coop/findOne.do?id='+ param,'', 'post')






















