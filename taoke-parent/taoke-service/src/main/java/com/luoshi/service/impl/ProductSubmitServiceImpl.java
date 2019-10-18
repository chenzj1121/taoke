package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbProductSubmitMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbProductSubmit;
import com.luoshi.pojo.TbProductSubmitExample;
import com.luoshi.service.ProductSubmitService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ProductSubmitServiceImpl implements ProductSubmitService {

	@Autowired
	private TbProductSubmitMapper productSubmitMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbProductSubmit> findAll() {
		return productSubmitMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbProductSubmit> page=   (Page<TbProductSubmit>) productSubmitMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbProductSubmit productSubmit) {
		productSubmitMapper.insert(productSubmit);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbProductSubmit productSubmit){
		productSubmitMapper.updateByPrimaryKey(productSubmit);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbProductSubmit findOne(int id){
		return productSubmitMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			productSubmitMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbProductSubmit productSubmit, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbProductSubmitExample example=new TbProductSubmitExample();
		com.luoshi.pojo.TbProductSubmitExample.Criteria criteria = example.createCriteria();
		
		if(productSubmit!=null){			
						if(productSubmit.getCustomName()!=null && productSubmit.getCustomName().length()>0){
				criteria.andCustomNameLike("%"+productSubmit.getCustomName()+"%");
			}
			if(productSubmit.getZeroSubmit()!=null && productSubmit.getZeroSubmit().length()>0){
				criteria.andZeroSubmitLike("%"+productSubmit.getZeroSubmit()+"%");
			}
			if(productSubmit.getShopTitle()!=null && productSubmit.getShopTitle().length()>0){
				criteria.andShopTitleLike("%"+productSubmit.getShopTitle()+"%");
			}
			if(productSubmit.getShopActive()!=null && productSubmit.getShopActive().length()>0){
				criteria.andShopActiveLike("%"+productSubmit.getShopActive()+"%");
			}
			if(productSubmit.getShopItem()!=null && productSubmit.getShopItem().length()>0){
				criteria.andShopItemLike("%"+productSubmit.getShopItem()+"%");
			}
			if(productSubmit.getShopMainPic()!=null && productSubmit.getShopMainPic().length()>0){
				criteria.andShopMainPicLike("%"+productSubmit.getShopMainPic()+"%");
			}
			if(productSubmit.getShopMarketPic()!=null && productSubmit.getShopMarketPic().length()>0){
				criteria.andShopMarketPicLike("%"+productSubmit.getShopMarketPic()+"%");
			}
			if(productSubmit.getExtensionStrategy()!=null && productSubmit.getExtensionStrategy().length()>0){
				criteria.andExtensionStrategyLike("%"+productSubmit.getExtensionStrategy()+"%");
			}
			if(productSubmit.getCharacteristicStrategy()!=null && productSubmit.getCharacteristicStrategy().length()>0){
				criteria.andCharacteristicStrategyLike("%"+productSubmit.getCharacteristicStrategy()+"%");
			}
			if(productSubmit.getStartTime()!=null && productSubmit.getStartTime().length()>0){
				criteria.andStartTimeLike("%"+productSubmit.getStartTime()+"%");
			}
			if(productSubmit.getCouponType()!=null && productSubmit.getCouponType().length()>0){
				criteria.andCouponTypeLike("%"+productSubmit.getCouponType()+"%");
			}
			if(productSubmit.getCouponName()!=null && productSubmit.getCouponName().length()>0){
				criteria.andCouponNameLike("%"+productSubmit.getCouponName()+"%");
			}
			if(productSubmit.getCouponUrl()!=null && productSubmit.getCouponUrl().length()>0){
				criteria.andCouponUrlLike("%"+productSubmit.getCouponUrl()+"%");
			}
			if(productSubmit.getCouponCount()!=null && productSubmit.getCouponCount().length()>0){
				criteria.andCouponCountLike("%"+productSubmit.getCouponCount()+"%");
			}
			if(productSubmit.getCouponPrice()!=null && productSubmit.getCouponPrice().length()>0){
				criteria.andCouponPriceLike("%"+productSubmit.getCouponPrice()+"%");
			}
			if(productSubmit.getServicePrice()!=null && productSubmit.getServicePrice().length()>0){
				criteria.andServicePriceLike("%"+productSubmit.getServicePrice()+"%");
			}
			if(productSubmit.getEndTime()!=null && productSubmit.getEndTime().length()>0){
				criteria.andEndTimeLike("%"+productSubmit.getEndTime()+"%");
			}
			if(productSubmit.getReturnMoneyTime()!=null && productSubmit.getReturnMoneyTime().length()>0){
				criteria.andReturnMoneyTimeLike("%"+productSubmit.getReturnMoneyTime()+"%");
			}
			if(productSubmit.getRemarks()!=null && productSubmit.getRemarks().length()>0){
				criteria.andRemarksLike("%"+productSubmit.getRemarks()+"%");
			}
			if(productSubmit.getTaobaoPrice()!=null && productSubmit.getTaobaoPrice().length()>0){
				criteria.andTaobaoPriceLike("%"+productSubmit.getTaobaoPrice()+"%");
			}
			if(productSubmit.getBuyCount()!=null && productSubmit.getBuyCount().length()>0){
				criteria.andBuyCountLike("%"+productSubmit.getBuyCount()+"%");
			}
			if(productSubmit.getSettlementType()!=null && productSubmit.getSettlementType().length()>0){
				criteria.andSettlementTypeLike("%"+productSubmit.getSettlementType()+"%");
			}
			if(productSubmit.getUploadPic()!=null && productSubmit.getUploadPic().length()>0){
				criteria.andUploadPicLike("%"+productSubmit.getUploadPic()+"%");
			}
			if(productSubmit.getPlatform()!=null && productSubmit.getPlatform().length()>0){
				criteria.andPlatformLike("%"+productSubmit.getPlatform()+"%");
			}
	
		}
		
		Page<TbProductSubmit> page= (Page<TbProductSubmit>)productSubmitMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
