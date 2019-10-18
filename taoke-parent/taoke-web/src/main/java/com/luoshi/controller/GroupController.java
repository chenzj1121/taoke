package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbGroup;
import com.luoshi.service.GroupService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/group")
public class GroupController {

	@Autowired
	private GroupService groupService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbGroup> findAll(){			
		return groupService.findAll();
	}

    @RequestMapping("getGroupByDeptId")
    public List<TbGroup> getGroupByDeptId(@RequestParam("deptId")Integer deptId) {
	    return groupService.getGroupByDeptId(deptId);
    }
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return groupService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param group
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbGroup group){
		try {
			groupService.add(group);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param group
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbGroup group){
		try {
			groupService.update(group);
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
	public TbGroup findOne(int id){
		return groupService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			groupService.delete(ids);
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
	public PageResult search(@RequestBody TbGroup group, int pageNum, int pageSize  ){
		System.out.println("123");
		System.out.println("123"+pageNum);
		System.out.println(pageSize);
		return groupService.findPage(group, pageNum, pageSize);		
	}
	
}
