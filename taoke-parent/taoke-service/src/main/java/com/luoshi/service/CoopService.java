package com.luoshi.service;
import java.util.Date;
import java.util.List;
import com.luoshi.pojo.TbCoop;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CoopService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCoop> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCoop coop);
	
	
	/**
	 * 修改
	 */
	public void update(TbCoop coop);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCoop findOne(int id);
	
	
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
	//public PageResult findPage(TbCoop coop, int pageNum,int pageSize, Date TbMaxTime, Date maxStartTime, Date endTime);


	 public PageResult findPage(TbCoop coop, int page, int rows);


	public void fenpei(int[] coopids, int userId);


	public int getNums(TbCoop coop);




	
}
