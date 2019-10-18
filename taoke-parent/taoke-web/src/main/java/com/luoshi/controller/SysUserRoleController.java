package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbSysUserRole;
import com.luoshi.service.SysUserRoleService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sysUserRole")
public class SysUserRoleController {

	@Autowired
	private SysUserRoleService sysUserRoleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSysUserRole> findAll(){			
		return sysUserRoleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sysUserRoleService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sysUserRole
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSysUserRole sysUserRole){
		try {
			sysUserRoleService.add(sysUserRole);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sysUserRole
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSysUserRole sysUserRole){
		try {
			sysUserRoleService.update(sysUserRole);
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
	public TbSysUserRole findOne(int id){
		return sysUserRoleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			sysUserRoleService.delete(ids);
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
	public PageResult search(@RequestBody TbSysUserRole sysUserRole, int page, int rows  ){
		return sysUserRoleService.findPage(sysUserRole, page, rows);		
	}
	
}
