package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbDeptMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbDept;
import com.luoshi.pojo.TbDeptExample;
import com.luoshi.service.DeptService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private TbDeptMapper deptMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbDept> findAll() {
//		TbDeptExample example=new TbDeptExample();
//		com.luoshi.pojo.TbDeptExample.Criteria criteria = example.createCriteria();
//		
//		if(dept!=null){			
//						if(dept.getDeptName()!=null && dept.getDeptName().length()>0){
//				criteria.andDeptNameLike("%"+dept.getDeptName()+"%");
//			}
//	
//		}
		return deptMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbDept> page=   (Page<TbDept>) deptMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbDept dept) {
		deptMapper.insert(dept);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbDept dept){
		deptMapper.updateByPrimaryKey(dept);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbDept findOne(int id){
		return deptMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			deptMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbDept dept, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbDeptExample example=new TbDeptExample();
		com.luoshi.pojo.TbDeptExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("dept_id DESC");
		if(dept!=null){			
						if(dept.getDeptName()!=null && dept.getDeptName().length()>0){
				criteria.andDeptNameLike("%"+dept.getDeptName()+"%");
			}
	
		}
		Page<TbDept> page= (Page<TbDept>)deptMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
