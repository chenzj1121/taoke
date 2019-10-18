package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbWaitingWork;
import com.luoshi.service.WaitingWorkService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/waitingWork")
public class WaitingWorkController {

	@Autowired
	private WaitingWorkService waitingWorkService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbWaitingWork> findAll(){			
		return waitingWorkService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return waitingWorkService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param waitingWork
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbWaitingWork waitingWork){
		try {
			waitingWorkService.add(waitingWork);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param waitingWork
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbWaitingWork waitingWork){
		try {
			waitingWorkService.update(waitingWork);
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
	public TbWaitingWork findOne(Long id){
		return waitingWorkService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			waitingWorkService.delete(ids);
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
	public PageResult search(@RequestBody TbWaitingWork waitingWork, int page, int rows  ){
		return waitingWorkService.findPage(waitingWork, page, rows);		
	}
	
}
