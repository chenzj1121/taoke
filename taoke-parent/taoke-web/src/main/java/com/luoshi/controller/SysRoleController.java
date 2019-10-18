package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbSysRole;
import com.luoshi.service.SysRoleService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

	@Autowired
	private SysRoleService sysRoleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSysRole> findAll(){			
		return sysRoleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sysRoleService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sysRole
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSysRole sysRole){
		try {
			sysRoleService.add(sysRole);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sysRole
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSysRole sysRole){
		try {
			sysRoleService.update(sysRole);
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
	public TbSysRole findOne(int id){
		return sysRoleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			sysRoleService.delete(ids);
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
	public PageResult search(@RequestBody TbSysRole sysRole, int page, int rows  ){
		return sysRoleService.findPage(sysRole, page, rows);		
	}
	
}
