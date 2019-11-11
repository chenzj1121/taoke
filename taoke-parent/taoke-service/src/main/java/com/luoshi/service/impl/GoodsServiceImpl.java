package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbGoodsMapper;
import com.luoshi.pojo.TbBackgroundDetailsExample.Criteria;
import com.luoshi.pojo.TbGoods;
import com.luoshi.pojo.TbGoodsExample;
import com.luoshi.pojo.TbSysUserExample;
import com.luoshi.service.GoodsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private TbGoodsMapper goodsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGoods> findAll() {
		TbGoodsExample example=new TbGoodsExample();
		com.luoshi.pojo.TbGoodsExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("goods_id DESC");
		return goodsMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbGoods> page=   (Page<TbGoods>) goodsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbGoods goods) {
		goodsMapper.insert(goods);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbGoods goods){
		goodsMapper.updateByPrimaryKey(goods);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbGoods findOne(Long id){
		return goodsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			goodsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageResult findPage(TbGoods goods, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbGoodsExample example=new TbGoodsExample();
		com.luoshi.pojo.TbGoodsExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("goods_id DESC");
		if(goods!=null){			
			if(goods.getGoodsYhqName()!=null && goods.getGoodsYhqName().length()>0){
				criteria.andGoodsYhqNameLike("%"+goods.getGoodsYhqName()+"%");
			}
			if(goods.getGoodsFid()!=null){
				criteria.andGoodsFidEqualTo(goods.getGoodsFid());
			}
	
		}
		
		Page<TbGoods> page= (Page<TbGoods>)goodsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<TbGoods> findByShop(int shopId) {
		TbGoodsExample example=new TbGoodsExample();
		com.luoshi.pojo.TbGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsShopIdEqualTo(shopId);
        return goodsMapper.selectByExample(example);
	}
	
}
