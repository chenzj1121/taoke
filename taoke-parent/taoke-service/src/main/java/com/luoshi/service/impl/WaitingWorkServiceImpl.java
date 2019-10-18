package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbWaitingWorkMapper;
import com.luoshi.pojo.TbSysRolePrivExample.Criteria;
import com.luoshi.pojo.TbWaitingWork;
import com.luoshi.pojo.TbWaitingWorkExample;
import com.luoshi.service.WaitingWorkService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class WaitingWorkServiceImpl implements WaitingWorkService {

	@Autowired
	private TbWaitingWorkMapper waitingWorkMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbWaitingWork> findAll() {
		return waitingWorkMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbWaitingWork> page=   (Page<TbWaitingWork>) waitingWorkMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbWaitingWork waitingWork) {
		waitingWorkMapper.insert(waitingWork);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbWaitingWork waitingWork){
		waitingWorkMapper.updateByPrimaryKey(waitingWork);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbWaitingWork findOne(Long id){
		return waitingWorkMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			waitingWorkMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbWaitingWork waitingWork, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbWaitingWorkExample example=new TbWaitingWorkExample();
		com.luoshi.pojo.TbWaitingWorkExample.Criteria criteria = example.createCriteria();
		
		if(waitingWork!=null){			
						if(waitingWork.getWork()!=null && waitingWork.getWork().length()>0){
				criteria.andWorkLike("%"+waitingWork.getWork()+"%");
			}
			if(waitingWork.getWorkType()!=null && waitingWork.getWorkType().length()>0){
				criteria.andWorkTypeLike("%"+waitingWork.getWorkType()+"%");
			}
			if(waitingWork.getWorkStatus()!=null && waitingWork.getWorkStatus().length()>0){
				criteria.andWorkStatusLike("%"+waitingWork.getWorkStatus()+"%");
			}
	
		}
		
		Page<TbWaitingWork> page= (Page<TbWaitingWork>)waitingWorkMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		
	
}
