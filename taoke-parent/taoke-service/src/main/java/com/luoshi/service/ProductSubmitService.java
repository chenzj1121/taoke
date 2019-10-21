package com.luoshi.service;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.luoshi.pojo.TbProductSubmit;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ProductSubmitService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbProductSubmit> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbProductSubmit productSubmit);
	
	
	/**
	 * 修改
	 */
	public void update(TbProductSubmit productSubmit);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbProductSubmit findOne(int id);
	
	
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
	public PageResult findPage(TbProductSubmit productSubmit, int pageNum,int pageSize);


	/**
	 * 导入xsl文件
	 * @param ins
	 * @throws IOException 
	 */
	public void doImport(InputStream ins) throws IOException;
	
}
