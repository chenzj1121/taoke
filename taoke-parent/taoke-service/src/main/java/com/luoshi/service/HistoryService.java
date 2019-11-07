package com.luoshi.service;
import java.util.List;
import com.luoshi.pojo.TbHistory;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface HistoryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbHistory> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbHistory history);
	
	
	/**
	 * 修改
	 */
	public void update(TbHistory history);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbHistory findOne(int id);
	
	
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
	public PageResult findPage(TbHistory history, int pageNum,int pageSize);
	
}
