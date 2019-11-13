package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luoshi.pojo.TbBackmoney;
import com.luoshi.service.BackmoneyService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/backmoney")
public class BackmoneyController {

	@Autowired
	private BackmoneyService backmoneyService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBackmoney> findAll(){		
		System.out.println("123");
		return backmoneyService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return backmoneyService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param backmoney
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBackmoney backmoney){
		try {
			backmoneyService.add(backmoney);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param backmoney
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBackmoney backmoney){
		try {
			backmoneyService.update(backmoney);
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
	public TbBackmoney findOne(int id){
		return backmoneyService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			backmoneyService.delete(ids);
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
	public PageResult search(@RequestBody TbBackmoney backmoney, int page, int rows  ){
		return backmoneyService.findPage(backmoney, page, rows);		
	}
	
}
