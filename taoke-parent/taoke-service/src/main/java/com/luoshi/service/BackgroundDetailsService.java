package com.luoshi.service;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.luoshi.pojo.TbBackgroundDetails;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface BackgroundDetailsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbBackgroundDetails> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbBackgroundDetails backgroundDetails);
	
	
	/**
	 * 修改
	 */
	public void update(TbBackgroundDetails backgroundDetails);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbBackgroundDetails findOne(int id);
	
	
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
	public PageResult findPage(TbBackgroundDetails backgroundDetails, int pageNum,int pageSize);


	public void doImport(InputStream ins) throws IOException;



	
}
