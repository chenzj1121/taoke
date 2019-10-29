package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbGroupMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbGroup;
import com.luoshi.pojo.TbGroupExample;
import com.luoshi.service.GroupService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private TbGroupMapper groupMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGroup> findAll() {
		TbGroupExample example=new TbGroupExample();
		com.luoshi.pojo.TbGroupExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("group_id DESC");
		return groupMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbGroup> page=   (Page<TbGroup>) groupMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbGroup group) {
		groupMapper.insert(group);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbGroup group){
		groupMapper.updateByPrimaryKey(group);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbGroup findOne(int id){
		return groupMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			groupMapper.deleteByPrimaryKey(id);
		}		
	}


   /* @Override
    public List<TbGroup> getGroupByDeptId(Integer deptId) {
        TbGroupExample example=new TbGroupExample();
        com.luoshi.pojo.TbGroupExample.Criteria criteria = example.createCriteria();

        criteria.andGroupDeptIdEqualTo(deptId);
        return groupMapper.selectByExample(example);
    }*/

    @Override
	public PageResult findPage(TbGroup group, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbGroupExample example=new TbGroupExample();
		com.luoshi.pojo.TbGroupExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("group_id DESC");
		if(group!=null){			
						if(group.getGroupName()!=null && group.getGroupName().length()>0){
				criteria.andGroupNameLike("%"+group.getGroupName()+"%");
			}
	
		}
		
		Page<TbGroup> page= (Page<TbGroup>)groupMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<TbGroup> findByDept(int deptId) {
		TbGroupExample example=new TbGroupExample();
        com.luoshi.pojo.TbGroupExample.Criteria criteria = example.createCriteria();

        criteria.andGroupDeptIdEqualTo(deptId);
        return groupMapper.selectByExample(example);
	}
	
}
