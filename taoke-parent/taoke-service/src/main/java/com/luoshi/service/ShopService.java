package com.luoshi.service;
import java.util.List;
import com.luoshi.pojo.TbShop;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ShopService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbShop> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbShop shop);
	
	
	/**
	 * 修改
	 */
	public void update(TbShop shop);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbShop findOne(int id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(int [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbShop shop, int pageNum,int pageSize);

    List<String> checkWangWangAccount(String wangwangAccount);
}
