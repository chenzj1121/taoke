package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbBackmoneyMapper;
import com.luoshi.pojo.TbBackmoney;
import com.luoshi.pojo.TbBackmoneyExample;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.service.BackmoneyService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BackmoneyServiceImpl implements BackmoneyService {

	@Autowired
	private TbBackmoneyMapper backmoneyMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBackmoney> findAll() {
		return backmoneyMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbBackmoney> page=   (Page<TbBackmoney>) backmoneyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBackmoney backmoney) {
		backmoneyMapper.insert(backmoney);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbBackmoney backmoney){
		backmoneyMapper.updateByPrimaryKey(backmoney);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbBackmoney findOne(int id){
		return backmoneyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			backmoneyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbBackmoney backmoney, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBackmoneyExample example=new TbBackmoneyExample();
		Criteria criteria = example.createCriteria();
		
		if(backmoney!=null){			
						if(backmoney.getBmShopName()!=null && backmoney.getBmShopName().length()>0){
				criteria.andBmShopNameLike("%"+backmoney.getBmShopName()+"%");
			}
			if(backmoney.getBmYhqName()!=null && backmoney.getBmYhqName().length()>0){
				criteria.andBmYhqNameLike("%"+backmoney.getBmYhqName()+"%");
			}
			if(backmoney.getBmType()!=null && backmoney.getBmType().length()>0){
				criteria.andBmTypeLike("%"+backmoney.getBmType()+"%");
			}
			if(backmoney.getBmMakeAccount()!=null && backmoney.getBmMakeAccount().length()>0){
				criteria.andBmMakeAccountLike("%"+backmoney.getBmMakeAccount()+"%");
			}
			if(backmoney.getBmText()!=null && backmoney.getBmText().length()>0){
				criteria.andBmTextLike("%"+backmoney.getBmText()+"%");
			}
			if(backmoney.getBmYhqPhoto()!=null && backmoney.getBmYhqPhoto().length()>0){
				criteria.andBmYhqPhotoLike("%"+backmoney.getBmYhqPhoto()+"%");
			}
			if(backmoney.getBmConfirmType()!=null && backmoney.getBmConfirmType().length()>0){
				criteria.andBmConfirmTypeLike("%"+backmoney.getBmConfirmType()+"%");
			}
			if(backmoney.getBmMakePhoto()!=null && backmoney.getBmMakePhoto().length()>0){
				criteria.andBmMakePhotoLike("%"+backmoney.getBmMakePhoto()+"%");
			}
			if(backmoney.getBmByzd()!=null && backmoney.getBmByzd().length()>0){
				criteria.andBmByzdLike("%"+backmoney.getBmByzd()+"%");
			}
			if(backmoney.getBmBackType()!=null && backmoney.getBmBackType().length()>0){
				criteria.andBmBackTypeLike("%"+backmoney.getBmBackType()+"%");
			}
			if(backmoney.getBmUserName()!=null && backmoney.getBmUserName().length()>0){
				criteria.andBmUserNameLike("%"+backmoney.getBmUserName()+"%");
			}
			if(backmoney.getBmBackBl()!=null && backmoney.getBmBackBl().length()>0){
				criteria.andBmBackBlLike("%"+backmoney.getBmBackBl()+"%");
			}
			if(backmoney.getBmBackAccount()!=null && backmoney.getBmBackAccount().length()>0){
				criteria.andBmBackAccountLike("%"+backmoney.getBmBackAccount()+"%");
			}
			if(backmoney.getBmBackAccountNumber()!=null && backmoney.getBmBackAccountNumber().length()>0){
				criteria.andBmBackAccountNumberLike("%"+backmoney.getBmBackAccountNumber()+"%");
			}
	
		}
		
		Page<TbBackmoney> page= (Page<TbBackmoney>)backmoneyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
