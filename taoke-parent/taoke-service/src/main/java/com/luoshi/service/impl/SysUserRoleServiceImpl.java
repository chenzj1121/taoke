package com.luoshi.service.impl;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbSysUserRoleMapper;
import com.luoshi.pojo.TbSysRolePrivExample.Criteria;
import com.luoshi.pojo.TbSysUserRole;
import com.luoshi.pojo.TbSysUserRoleExample;
import com.luoshi.service.SysUserRoleService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

	@Autowired
	private TbSysUserRoleMapper sysUserRoleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSysUserRole> findAll() {
		return sysUserRoleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSysUserRole> page=   (Page<TbSysUserRole>) sysUserRoleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSysUserRole sysUserRole) {
		sysUserRoleMapper.insert(sysUserRole);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSysUserRole sysUserRole){
		sysUserRoleMapper.updateByPrimaryKey(sysUserRole);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSysUserRole findOne(int id){
		return sysUserRoleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			sysUserRoleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSysUserRole sysUserRole, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSysUserRoleExample example=new TbSysUserRoleExample();
		com.luoshi.pojo.TbSysUserRoleExample.Criteria criteria = example.createCriteria();
		
		if(sysUserRole!=null){			
				
		}
		
		Page<TbSysUserRole> page= (Page<TbSysUserRole>)sysUserRoleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
