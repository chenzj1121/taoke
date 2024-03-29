package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbFollowUpRecord;
import com.luoshi.service.FollowUpRecordService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/followUpRecord")
public class FollowUpRecordController {

	@Autowired
	private FollowUpRecordService followUpRecordService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbFollowUpRecord> findAll(){			
		return followUpRecordService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return followUpRecordService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param followUpRecord
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbFollowUpRecord followUpRecord){
		try {
			followUpRecordService.add(followUpRecord);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param followUpRecord
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbFollowUpRecord followUpRecord){
		try {
			followUpRecordService.update(followUpRecord);
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
	public TbFollowUpRecord findOne(int id){
		return followUpRecordService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			followUpRecordService.delete(ids);
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
	public PageResult search(@RequestBody TbFollowUpRecord followUpRecord, int page, int rows  ){
		return followUpRecordService.findPage(followUpRecord, page, rows);		
	}
	
}
