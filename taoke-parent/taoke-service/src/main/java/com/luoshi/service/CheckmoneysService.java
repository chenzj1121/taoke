package com.luoshi.service;
import java.util.Date;
import java.util.List;
import com.luoshi.pojo.TbCheckmoneys;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CheckmoneysService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCheckmoneys> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCheckmoneys checkmoneys);
	
	
	/**
	 * 修改
	 */
	public void update(TbCheckmoneys checkmoneys);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCheckmoneys findOne(int id);
	
	
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
	public PageResult findPage(TbCheckmoneys checkmoneys, int pageNum,int pageSize);


	public List serviceFee(TbCheckmoneys checkmoneys);


	
}
