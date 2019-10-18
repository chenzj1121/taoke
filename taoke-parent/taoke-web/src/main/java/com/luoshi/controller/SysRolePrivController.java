package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbSysRolePriv;
import com.luoshi.service.SysRolePrivService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sysRolePriv")
public class SysRolePrivController {

	@Autowired
	private SysRolePrivService sysRolePrivService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSysRolePriv> findAll(){			
		return sysRolePrivService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sysRolePrivService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sysRolePriv
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSysRolePriv sysRolePriv){
		try {
			sysRolePrivService.add(sysRolePriv);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sysRolePriv
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSysRolePriv sysRolePriv){
		try {
			sysRolePrivService.update(sysRolePriv);
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
	public TbSysRolePriv findOne(int id){
		return sysRolePrivService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			sysRolePrivService.delete(ids);
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
	public PageResult search(@RequestBody TbSysRolePriv sysRolePriv, int page, int rows  ){
		return sysRolePrivService.findPage(sysRolePriv, page, rows);		
	}
	
}
