package com.luoshi.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbCheckmoneys;
import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.CheckmoneysService;
import com.luoshi.service.SysUserService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/checkmoneys")
public class CheckmoneysController {

	@Autowired
	private CheckmoneysService checkmoneysServiceImpl;
	
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCheckmoneys> findAll(){	
		return checkmoneysServiceImpl.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return checkmoneysServiceImpl.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param checkmoneys
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCheckmoneys checkmoneys){
		try {
			if(checkmoneys.getCmUserId()!=null){
				Integer id = checkmoneys.getCmUserId();
				TbSysUser user = sysUserService.findOne(id);
				checkmoneys.setCmDeptId(user.getDeptId());
				checkmoneys.setCmGroupId(user.getGroupId());
			}
			checkmoneysServiceImpl.add(checkmoneys);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param checkmoneys
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCheckmoneys checkmoneys){
		try {
			checkmoneysServiceImpl.update(checkmoneys);
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
	public TbCheckmoneys findOne(int id){
		return checkmoneysServiceImpl.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			checkmoneysServiceImpl.delete(ids);
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
	public PageResult search(@RequestBody TbCheckmoneys checkmoneys, int page, int rows ){
		return checkmoneysServiceImpl.findPage(checkmoneys, page, rows);		
	}
	/**
	 * 服务费金额统计
	 * @param checkmoneys
	 * @param page
	 * @param rows
	 * @param maxTime
	 * @param backTime
	 * @return
	 */
	@RequestMapping("/serviceFee")
	public double serviceFee(@RequestBody TbCheckmoneys checkmoneys, int page, int rows ){
		double i=0;
		List<TbCheckmoneys> List = checkmoneysServiceImpl.serviceFee(checkmoneys);
		if(List.size()>0){
		for (TbCheckmoneys tbCheckmoneys : List) {
			if(tbCheckmoneys.getCmJsMoney()==null){
				i=i;
			}else{
			i=(double) (i+tbCheckmoneys.getCmJsMoney());
			}
		}
		}
		return i;
	}
	
}
