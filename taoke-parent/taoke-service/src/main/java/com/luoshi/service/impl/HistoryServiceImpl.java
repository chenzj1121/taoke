package com.luoshi.service.impl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbHistoryMapper;
import com.luoshi.pojo.TbHistory;
import com.luoshi.pojo.TbHistoryExample;
import com.luoshi.pojo.TbHistoryExample.Criteria;
import com.luoshi.service.HistoryService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private TbHistoryMapper historyMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbHistory> findAll() {
		return historyMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbHistory> page=   (Page<TbHistory>) historyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbHistory history) {
		history.setUpdateTime(new Date());
		historyMapper.insert(history);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbHistory history){
		historyMapper.updateByPrimaryKey(history);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbHistory findOne(int id){
		return historyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			historyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbHistory history, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbHistoryExample example=new TbHistoryExample();
		Criteria criteria = example.createCriteria();
		
		if(history!=null){			
		    if(history.getUpdateText()!=null && history.getUpdateText().length()>0){
				criteria.andUpdateTextLike("%"+history.getUpdateText()+"%");
			}
			if(history.getBeiyong()!=null && history.getBeiyong().length()>0){
				criteria.andBeiyongLike("%"+history.getBeiyong()+"%");
			}
			if(history.getShopId()!=null ){
				criteria.andShopIdEqualTo(history.getShopId());
			}
	
		}
		
		Page<TbHistory> page= (Page<TbHistory>)historyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		
	
}
