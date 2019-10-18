package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbSysRoleMapper;
import com.luoshi.pojo.TbSysRole;
import com.luoshi.pojo.TbSysRoleExample;
import com.luoshi.pojo.TbSysRolePrivExample.Criteria;
import com.luoshi.service.SysRoleService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private TbSysRoleMapper sysRoleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSysRole> findAll() {
		return sysRoleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSysRole> page=   (Page<TbSysRole>) sysRoleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSysRole sysRole) {
		sysRoleMapper.insert(sysRole);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSysRole sysRole){
		sysRoleMapper.updateByPrimaryKey(sysRole);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSysRole findOne(int id){
		return sysRoleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			sysRoleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSysRole sysRole, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSysRoleExample example=new TbSysRoleExample();
		com.luoshi.pojo.TbSysRoleExample.Criteria criteria = example.createCriteria();
		
		if(sysRole!=null){			
						if(sysRole.getRole()!=null && sysRole.getRole().length()>0){
				criteria.andRoleLike("%"+sysRole.getRole()+"%");
			}
			if(sysRole.getName()!=null && sysRole.getName().length()>0){
				criteria.andNameLike("%"+sysRole.getName()+"%");
			}
			if(sysRole.getDescription()!=null && sysRole.getDescription().length()>0){
				criteria.andDescriptionLike("%"+sysRole.getDescription()+"%");
			}
	
		}
		
		Page<TbSysRole> page= (Page<TbSysRole>)sysRoleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
