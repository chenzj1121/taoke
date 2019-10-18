package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbCoopMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbCoop;
import com.luoshi.pojo.TbCoopExample;
import com.luoshi.service.CoopService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CoopServiceImpl implements CoopService {

	@Autowired
	private TbCoopMapper coopMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCoop> findAll() {
		return coopMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCoop> page=   (Page<TbCoop>) coopMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCoop coop) {
		coopMapper.insert(coop);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCoop coop){
		coopMapper.updateByPrimaryKey(coop);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCoop findOne(int id){
		return coopMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			coopMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCoop coop, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCoopExample example=new TbCoopExample();
		com.luoshi.pojo.TbCoopExample.Criteria criteria = example.createCriteria();
		
		if(coop!=null){			
						if(coop.getCoopType()!=null && coop.getCoopType().length()>0){
				criteria.andCoopTypeLike("%"+coop.getCoopType()+"%");
			}
			
			if(coop.getCoopCustomer()!=null && coop.getCoopCustomer().length()>0){
				criteria.andCoopCustomerLike("%"+coop.getCoopCustomer()+"%");
			}
			
			if(coop.getCoopActivity()!=null && coop.getCoopActivity().length()>0){
				criteria.andCoopActivityLike("%"+coop.getCoopActivity()+"%");
			}
			if(coop.getCoopZero()!=null && coop.getCoopZero().length()>0){
				criteria.andCoopZeroLike("%"+coop.getCoopZero()+"%");
			}
			
			if(coop.getCoopYhqName()!=null && coop.getCoopYhqName().length()>0){
				criteria.andCoopYhqNameLike("%"+coop.getCoopYhqName()+"%");
			}
			if(coop.getCoopMessage()!=null && coop.getCoopMessage().length()>0){
				criteria.andCoopMessageLike("%"+coop.getCoopMessage()+"%");
			}
			if(coop.getCoopShop()!=null && coop.getCoopShop().length()>0){
				criteria.andCoopShopLike("%"+coop.getCoopShop()+"%");
			}
			
	
		}
		
		Page<TbCoop> page= (Page<TbCoop>)coopMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
