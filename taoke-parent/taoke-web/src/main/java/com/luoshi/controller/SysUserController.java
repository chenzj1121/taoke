package com.luoshi.controller;
import java.util.List;

import com.luoshi.pojo.TbGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.SysUserService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSysUser> findAll(){			
		return sysUserService.findAll();
	}

    @RequestMapping("getUserByDeptIdAndGroupId")
    public List<TbSysUser> getGroupByDept(@RequestParam("deptId")Integer deptId, @RequestParam("groupId")Integer groupId) {
        System.out.println(deptId);
        return sysUserService.getUserByDeptIdAndGroupId(deptId, groupId);
    }

	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sysUserService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sysUser
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSysUser sysUser){
		try {
			sysUserService.add(sysUser);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sysUser
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSysUser sysUser){
		try {
			sysUserService.update(sysUser);
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
	public TbSysUser findOne(int id){
		return sysUserService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			sysUserService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbSysUser sysUser, Integer pageNum, Integer pageSize  ){
		return sysUserService.findPage(sysUser, pageNum, pageSize);
	}

}
