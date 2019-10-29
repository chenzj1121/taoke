package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbSysPrivMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbSysPriv;
import com.luoshi.pojo.TbSysPrivExample;
import com.luoshi.service.SysPrivService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SysPrivServiceImpl implements SysPrivService {

	@Autowired
	private TbSysPrivMapper sysPrivMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSysPriv> findAll() {
		return sysPrivMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSysPriv> page=   (Page<TbSysPriv>) sysPrivMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSysPriv sysPriv) {
		sysPrivMapper.insert(sysPriv);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSysPriv sysPriv){
		sysPrivMapper.updateByPrimaryKey(sysPriv);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSysPriv findOne(int id){
		return sysPrivMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			sysPrivMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSysPriv sysPriv, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSysPrivExample example=new TbSysPrivExample();
		com.luoshi.pojo.TbSysPrivExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("id DESC");
		if(sysPriv!=null){			
						if(sysPriv.getName()!=null && sysPriv.getName().length()>0){
				criteria.andNameLike("%"+sysPriv.getName()+"%");
			}
			if(sysPriv.getUrl()!=null && sysPriv.getUrl().length()>0){
				criteria.andUrlLike("%"+sysPriv.getUrl()+"%");
			}
	
		}
		
		Page<TbSysPriv> page= (Page<TbSysPriv>)sysPrivMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
