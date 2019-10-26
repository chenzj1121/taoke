package com.luoshi.service.impl;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbFollowUpRecordMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbFollowUpRecord;
import com.luoshi.pojo.TbFollowUpRecordExample;
import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.FollowUpRecordService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class FollowUpRecordServiceImpl implements FollowUpRecordService {

	@Autowired
	private TbFollowUpRecordMapper followUpRecordMapper;
	@Autowired
	private HttpServletRequest request;
	/**
	 * 查询全部
	 */
	@Override
	public List<TbFollowUpRecord> findAll() {
		return followUpRecordMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbFollowUpRecord> page=   (Page<TbFollowUpRecord>) followUpRecordMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbFollowUpRecord followUpRecord) {
		followUpRecordMapper.insert(followUpRecord);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbFollowUpRecord followUpRecord){
		followUpRecordMapper.updateByPrimaryKey(followUpRecord);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbFollowUpRecord findOne(int id){
		return followUpRecordMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			followUpRecordMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbFollowUpRecord followUpRecord, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbFollowUpRecordExample example=new TbFollowUpRecordExample();
		com.luoshi.pojo.TbFollowUpRecordExample.Criteria criteria = example.createCriteria();
		HttpSession session = request.getSession();
		TbSysUser user = (TbSysUser) session.getAttribute("user");
		if(followUpRecord!=null){
			
			if(followUpRecord.getRecord()!=null && followUpRecord.getRecord().length()>0){
				criteria.andRecordLike("%"+followUpRecord.getRecord()+"%");
			}
			if(followUpRecord.getMaturity()!=null && followUpRecord.getMaturity().length()>0){
				criteria.andMaturityLike("%"+followUpRecord.getMaturity()+"%");
			}
	
		}
		
		Page<TbFollowUpRecord> page= (Page<TbFollowUpRecord>)followUpRecordMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
