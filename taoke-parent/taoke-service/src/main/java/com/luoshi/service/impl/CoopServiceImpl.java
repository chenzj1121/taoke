package com.luoshi.service.impl;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbCoopMapper;
import com.luoshi.mapper.TbSysUserMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbCoop;
import com.luoshi.pojo.TbCoopExample;
import com.luoshi.pojo.TbSysUser;
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
	@Autowired
	private TbSysUserMapper sysUserMapper;
	@Autowired
	private HttpServletRequest request;
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
	public PageResult findPage(TbCoop coop, int pageNum, int pageSize,Date TbMaxTime,Date maxStartTime,Date endTime) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCoopExample example=new TbCoopExample();
		com.luoshi.pojo.TbCoopExample.Criteria criteria = example.createCriteria();
		HttpSession session = request.getSession();
		TbSysUser user = (TbSysUser) session.getAttribute("user");
		example.setOrderByClause("coop_id DESC");
		if(coop!=null){	
			if(user.getType().equals("2")) {
				criteria.andCoopUserIdEqualTo(user.getId());
			}
			//提报状态
			if(coop.getCoopType()!=null && coop.getCoopType().length()>0){
				criteria.andCoopTypeEqualTo(coop.getCoopType());
			}
			//活动类型
			if(coop.getCoopActivity()!=null && coop.getCoopActivity().length()>0){
				criteria.andCoopActivityEqualTo(coop.getCoopActivity());
			}
			//提报时间
			if(coop.getCoopTbtime()!=null){
				criteria.andCoopTbtimeGreaterThanOrEqualTo(coop.getCoopTbtime());
			}
			//提报时间
			if(TbMaxTime!=null){
				criteria.andCoopTbtimeLessThanOrEqualTo(TbMaxTime);
			}
			//上线时间区间
			if(coop.getCoopStarttime()!=null) {
				criteria.andCoopStarttimeGreaterThanOrEqualTo(coop.getCoopStarttime());
			}
			//上线时间
			if(maxStartTime!=null) {
				criteria.andCoopStarttimeLessThanOrEqualTo(maxStartTime);
			}
			//goodsId
			if(coop.getCoopGoodsId()!=null){
				criteria.andCoopGoodsIdEqualTo(coop.getCoopGoodsId());
			}
			//下线时间
			if(coop.getCoopEndtime()!=null) {
				criteria.andCoopEndtimeGreaterThan(coop.getCoopEndtime());
			}
			//下线时间
			if(endTime!=null) {
				criteria.andCoopEndtimeLessThanOrEqualTo(endTime);
			}
			//责任人
			if(coop.getCoopUserId()!=null) {
				criteria.andCoopUserIdEqualTo(coop.getCoopUserId());
			}
			//是否查款
			if(coop.getCoopCheckMoney()!=null) {
				criteria.andCoopCheckMoneyEqualTo(coop.getCoopCheckMoney());
			}
			//结算类型
			if(coop.getCoopPayType()!=null) {
				criteria.andCoopPayTypeEqualTo(coop.getCoopPayType());
			}
			if(coop.getCoopCustomer()!=null && coop.getCoopCustomer().length()>0){
				criteria.andCoopCustomerLike("%"+coop.getCoopCustomer()+"%");
			}
			//是否零点
			if(coop.getCoopZero()!=null && coop.getCoopZero().length()>0){
				criteria.andCoopZeroEqualTo(coop.getCoopZero());
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

		@Override
		public void fenpei(int[] coopids, int userId) {
			for(int id:coopids){
				TbCoop coop = coopMapper.selectByPrimaryKey(id);
				if(coop.getCoopShenheId()!=null){
					Integer userId2 = coop.getCoopShenheId();
					TbSysUser user = sysUserMapper.selectByPrimaryKey(userId2);
					user.setNowTb(user.getNowTb()-1);
					sysUserMapper.updateByPrimaryKey(user);
				}
				coop.setCoopShenheId(userId);
				TbSysUser user2 = sysUserMapper.selectByPrimaryKey(userId);
				user2.setNowTb(user2.getNowTb()+1);
				coopMapper.updateByPrimaryKey(coop);
				
			}	
			
		}
	
}
