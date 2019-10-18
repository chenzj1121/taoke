package com.luoshi.service;
import java.util.List;
import com.luoshi.pojo.TbSysUser;

import entity.PageResult;
import entity.Result;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SysUserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbSysUser> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbSysUser sysUser);
	
	
	/**
	 * 修改
	 */
	public void update(TbSysUser sysUser);
	

	/**
	 * 根据名字获取实体
	 * @param integer
	 * @return
	 */
	public TbSysUser findByName(String username);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(int [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbSysUser sysUser, int pageNum,int pageSize);

    Result getUserByName(TbSysUser tbSysUser);

    List<TbSysUser> getUserByDeptIdAndGroupId(Integer deptId, Integer groupId);


	TbSysUser findOne(int id);


	TbSysUser findByUsernameAndPwd(String username, String password);
}
