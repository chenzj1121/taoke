package com.luoshi.controller;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.luoshi.pojo.TbShop;
import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.ShopService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	private ShopService shopService;
	@Autowired
    private HttpServletRequest request;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbShop> findAll(){			
		return shopService.findAll();
	}

	/**
	 * 查询旺旺账号
	 * @param wangwangAccount
	 * @return
	 */
    @RequestMapping("/getWangwangAccountCounts")
    public int  getSubmitAccountNameList(@RequestParam("wangwangAccount") String wangwangAccount) {
    	int size = shopService.checkWangWangAccount(wangwangAccount).size();
        return size;
    }
    
    /**
	 * 查询店铺名
	 * @param wangwangAccount
	 * @return
	 */
    @RequestMapping("/getWangwangAccountCounts")
    public List  getSubmitshopNameList(@RequestParam("shopName") String shopName) {
    	return  shopService.checkshopName(shopName);
    }
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return shopService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param shop
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbShop shop){
		System.out.println(shop.toString());
		try {
			shopService.add(shop);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param shop
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbShop shop){
		try {
			shopService.update(shop);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 提报
	 * @param shop
	 * @return
	 */
	@RequestMapping("/tibao")
	public Result tibao(@RequestBody TbShop shop){
		try {
			shop.setShopTbType("1");
			shop.setShopTbTime(new Date());
			HttpSession session = request.getSession();
			TbSysUser user = (TbSysUser) session.getAttribute("user");
			shop.setShopTbId(user.getId());
			shopService.update(shop);
			return new Result(true, "提报成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "提报失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	@ResponseBody
	public TbShop findOne(int id){
		return shopService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			shopService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbShop shop, int page, int rows){
		return shopService.findPage(shop,page, rows);		
	}
	
}
