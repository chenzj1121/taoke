package com.luoshi.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbSysRolePrivMapper;
import com.luoshi.pojo.TbSysRolePriv;
import com.luoshi.pojo.TbSysRolePrivExample;
import com.luoshi.pojo.TbSysRolePrivExample.Criteria;
import com.luoshi.service.SysRolePrivService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SysRolePrivServiceImpl implements SysRolePrivService {

	@Autowired
	private TbSysRolePrivMapper sysRolePrivMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSysRolePriv> findAll() {
		return sysRolePrivMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSysRolePriv> page=   (Page<TbSysRolePriv>) sysRolePrivMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSysRolePriv sysRolePriv) {
		sysRolePrivMapper.insert(sysRolePriv);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSysRolePriv sysRolePriv){
		sysRolePrivMapper.updateByPrimaryKey(sysRolePriv);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSysRolePriv findOne(int id){
		return sysRolePrivMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			sysRolePrivMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSysRolePriv sysRolePriv, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSysRolePrivExample example=new TbSysRolePrivExample();
		Criteria criteria = example.createCriteria();
		
		if(sysRolePriv!=null){			
				
		}
		
		Page<TbSysRolePriv> page= (Page<TbSysRolePriv>)sysRolePrivMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
