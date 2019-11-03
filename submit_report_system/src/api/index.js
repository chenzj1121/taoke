import ajax from './axios'

// const PRE_URL 

export const PRE_URL = '/api'
//export const PRE_URL = ''

export const reqLogin = (user) => ajax(PRE_URL+'/login.do', user, 'post')

export const getUserByPage = (sysUser, pageNum, pageSize) => ajax(PRE_URL+`/sysUser/search.do?pageNum=${pageNum}&pageSize=${pageSize}`, sysUser, 'post')

export const updUser = (param) => ajax(PRE_URL+'/sysUser/update.do', param, 'post')

export const addUser = (param) => ajax(PRE_URL+'/sysUser/add.do', param, 'post')

export const getUserById = (id) => ajax(PRE_URL+'/sysUser/findOne.do?id=' + id, 'get')

export const getDeptByPage = (param, page, rows) => ajax(PRE_URL+`/dept/search.do?page=${page}&rows=${rows}`, param, 'post')

export const getDeptByList = () => ajax(PRE_URL+'/dept/findAll.do', '', 'post')

export const getDeptById = (param) => ajax(PRE_URL+'/dept/findOne.do?id=' + param, 'get')

export const delDeptById = (param) => ajax(PRE_URL+'/dept/delete.do?ids=' + param, 'post')

export const addDept = (param) => ajax(PRE_URL+'/dept/add.do', param, 'post')

export const updDept = (param) => ajax(PRE_URL+'/dept/update.do', param, 'post')

export const getUserByList = () => ajax(PRE_URL+'/sysUser/findAll.do', '', 'post')

export const getGroupByPage = (param) => ajax(PRE_URL+'/group/findAll.do', param, 'post')

// export const getGroupByList = () => ajax(PRE_URL+'/dept/findAll.do', '', 'post')
export const getGroupByList = () => ajax(PRE_URL+'/group/findAll.do', '', 'post')

export const getGroupById = (param) => ajax(PRE_URL+'/group/findOne.do?id=' + param, 'get')

export const getGroupByDeptId = (param) => ajax(PRE_URL+'/group/findByDept.do?deptId=' + param, 'get')

export const delGroupById = (param) => ajax(PRE_URL+'/group/delete.do?ids=' + param, 'get')

export const addGroup = (param) => ajax(PRE_URL+'/group/add.do', param, 'post')

export const updGroup = (param) => ajax(PRE_URL+'/group/update.do', param, 'post')

export const getShopList = (shop, page, rows) => ajax(PRE_URL+`/shop/search.do?page=${page}&rows=${rows}`, shop, 'post')

export const getShopById = id => ajax(PRE_URL+`/shop/findOne.do`, { id })

export const addShop = (shop) => ajax(PRE_URL+`/shop/add.do`, shop, 'post')

export const updateShop = shop => ajax(PRE_URL+`/shop/update.do`, shop, 'post')

export const deleteShopById = id => ajax(PRE_URL+`/shop/delete.do?ids=${id}`, 'post')

export const getCooperationPage = (form, page, rows,TbMaxTime,maxStartTime,endTime) => ajax(PRE_URL+`/coop/search.do?page=${page}&rows=${rows}`, form, 'post')

export const getCheckmonkeyPage = (form, page, rows) => ajax(PRE_URL+`/checkmoneys/search.do?page=${page}&rows=${rows}`, form, 'post')

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

export const updateCoop = (param) => ajax(PRE_URL + '/coop/update.do', param, 'post')

export const delCoopById = (param) => ajax(PRE_URL + '/coop/delete.do?ids=' + param, 'post')

export const fenpei = (coopids,userId) => ajax(PRE_URL + `/coop/fenpei.do?coopids=${coopids}&userId=${userId}`, 'get')

























