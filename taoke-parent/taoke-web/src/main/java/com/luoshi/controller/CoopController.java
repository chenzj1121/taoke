package com.luoshi.controller;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtk.util.HttpUtils;
import com.dtk.util.SignMD5Util;
import com.luoshi.pojo.TbCoop;
import com.luoshi.service.CoopService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/coop")
public class CoopController {

	@Autowired
	private CoopService coopService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCoop> findAll(){			
		return coopService.findAll();
	}
	private static final String appSecret = "b94fd7405747ca971f22f0f0ed4b37fb";//应用sercret
    private static final String appKey = "5db14111720ce"; //应用key
    private static final String host = "https://openapi.dataoke.com/api/goods/get-goods-details";//应用服务接口
	/**
	 * 返回大淘客商品信息
	 * 
	 */
	@RequestMapping("/findByGoodId")
	public String findPage(String goodsId){
		 TreeMap<String,String> paraMap = new TreeMap<>();
		 
	        paraMap.put("version","v1.0.0");
	        paraMap.put("appKey","5db14111720ce");
	        paraMap.put("goodsId",goodsId);
	        paraMap.put("sign", SignMD5Util.getSignStr(paraMap,appSecret));
	        System.out.println(SignMD5Util.getSignStr(paraMap,appSecret));
	        System.out.println(host);
	        System.out.println(paraMap);
	        System.out.println(HttpUtils.sendGet(host,paraMap));
	        String string = HttpUtils.sendGet(host,paraMap);
	        return string;
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return coopService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param coop
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCoop coop){
		try {
			coopService.add(coop);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param coop
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCoop coop){
		try {
			coopService.update(coop);
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
	public TbCoop findOne(int id){
		return coopService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			coopService.delete(ids);
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
	public PageResult search(@RequestBody TbCoop coop, int page, int rows  ){
		return coopService.findPage(coop, page, rows);		
	}
	
}
