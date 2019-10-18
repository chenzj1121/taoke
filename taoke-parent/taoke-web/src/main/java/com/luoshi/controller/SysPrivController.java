package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbSysPriv;
import com.luoshi.service.SysPrivService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sysPriv")
public class SysPrivController {

	@Autowired
	private SysPrivService sysPrivService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSysPriv> findAll(){			
		return sysPrivService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sysPrivService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sysPriv
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSysPriv sysPriv){
		try {
			sysPrivService.add(sysPriv);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sysPriv
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSysPriv sysPriv){
		try {
			sysPrivService.update(sysPriv);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbSysPriv findOne(int id){
		return sysPrivService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			sysPrivService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbSysPriv sysPriv, int page, int rows  ){
		return sysPrivService.findPage(sysPriv, page, rows);		
	}
	
}
