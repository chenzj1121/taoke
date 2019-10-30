package com.luoshi.service.impl;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbCheckmoneysMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbCheckmoneys;
import com.luoshi.pojo.TbCheckmoneysExample;
import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.CheckmoneysService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CheckmoneysServiceImpl implements CheckmoneysService {

	@Autowired
	private TbCheckmoneysMapper checkmoneysMapper;
	@Autowired
	private HttpServletRequest request;
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCheckmoneys> findAll() {
		return checkmoneysMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCheckmoneys> page=   (Page<TbCheckmoneys>) checkmoneysMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCheckmoneys checkmoneys) {
		checkmoneysMapper.insert(checkmoneys);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCheckmoneys checkmoneys){
		checkmoneysMapper.updateByPrimaryKey(checkmoneys);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCheckmoneys findOne(int id){
		return checkmoneysMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			checkmoneysMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCheckmoneys checkmoneys, int pageNum, int pageSize,Date maxTime,Date backTime) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCheckmoneysExample example=new TbCheckmoneysExample();
		com.luoshi.pojo.TbCheckmoneysExample.Criteria criteria = example.createCriteria();
		HttpSession session = request.getSession();
		TbSysUser user = (TbSysUser) session.getAttribute("user");
		example.setOrderByClause("cm_id DESC");
		if(checkmoneys!=null){		
			if(user.getType().equals("2")) {
				criteria.andCmUserIdEqualTo(user.getId());
			}
			//申请时间
			if(checkmoneys.getCmApplyTime()!=null){
				criteria.andCmApplyTimeGreaterThan(checkmoneys.getCmApplyTime());
			}
			if(maxTime!=null) {
				criteria.andCmApplyTimeLessThanOrEqualTo(maxTime);
			}
			//到款时间
			if(checkmoneys.getCmBackTime()!=null) {
				criteria.andCmBackTimeGreaterThanOrEqualTo(checkmoneys.getCmBackTime());
			}
			if(backTime!=null) {
				criteria.andCmBackTimeLessThanOrEqualTo(backTime);
			}
			//状态
			if(checkmoneys.getCmType()!=null) {
				criteria.andCmTypeEqualTo(checkmoneys.getCmType());
			}
			//结算金额排序
			
			System.out.println("传递"+checkmoneys.getCmJsMoney());
			String string = String.valueOf(checkmoneys.getCmJsMoney());
			if(checkmoneys.getCmJsMoney()!=null) {
				if("1.0".equals(string)) {
					example.setOrderByClause("cm_js_money ASC");
				}else if("2.0".equals(string)) {
					example.setOrderByClause("cm_js_money DESC");
				}
				
			}
			if(checkmoneys.getCmType()!=null) {
				criteria.andCmTypeEqualTo(checkmoneys.getCmType());
			}
			
			//店铺名称
			if(checkmoneys.getCmShopName()!=null && checkmoneys.getCmShopName().length()>0){
				criteria.andCmShopNameLike("%"+checkmoneys.getCmShopName()+"%");
			}
			if(checkmoneys.getCmShopType()!=null && checkmoneys.getCmShopType().length()>0){
				criteria.andCmShopTypeLike("%"+checkmoneys.getCmShopType()+"%");
			}
			if(checkmoneys.getCmYhqPhoto()!=null && checkmoneys.getCmYhqPhoto().length()>0){
				criteria.andCmYhqPhotoLike("%"+checkmoneys.getCmYhqPhoto()+"%");
			}
			if(checkmoneys.getCmLoadCustomer()!=null && checkmoneys.getCmLoadCustomer().length()>0){
				criteria.andCmLoadCustomerLike("%"+checkmoneys.getCmLoadCustomer()+"%");
			}
			if(checkmoneys.getCmType()!=null && checkmoneys.getCmType().length()>0){
				criteria.andCmTypeLike("%"+checkmoneys.getCmType()+"%");
			}
			if(checkmoneys.getCmYhqName()!=null && checkmoneys.getCmYhqName().length()>0){
				criteria.andCmYhqNameLike("%"+checkmoneys.getCmYhqName()+"%");
			}
			if(checkmoneys.getCmText()!=null && checkmoneys.getCmText().length()>0){
				criteria.andCmTextLike("%"+checkmoneys.getCmText()+"%");
			}
			if(checkmoneys.getCmYhqType()!=null && checkmoneys.getCmYhqType().length()>0){
				criteria.andCmYhqTypeLike("%"+checkmoneys.getCmYhqType()+"%");
			}
	
		}
		
		Page<TbCheckmoneys> page= (Page<TbCheckmoneys>)checkmoneysMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
