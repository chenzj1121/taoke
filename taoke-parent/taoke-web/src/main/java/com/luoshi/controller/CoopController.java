package com.luoshi.controller;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dtk.util.HttpUtils;
import com.dtk.util.SignMD5Util;
import com.luoshi.pojo.TbCoop;
import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.CoopService;
import com.luoshi.service.SysUserService;

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
	
	@Autowired
	private SysUserService sysUserService;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCoop> findAll(){			
		return coopService.findAll();
	}
	
	/**
	 * 返回通过店铺数
	 * @return
	 */
	@RequestMapping("/getNums")
	public int  getNums(@RequestBody TbCoop coop){
		
		return coopService.getNums(coop);
		
		//return 	
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
//	        System.out.println(SignMD5Util.getSignStr(paraMap,appSecret));
//	        System.out.println(host);
//	        System.out.println(paraMap);
//	        System.out.println(HttpUtils.sendGet(host,paraMap));
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
//	@RequestMapping("/add")
//	public Result add(@RequestBody TbCoop coop,@RequestParam(value="file",required=false) MultipartFile[] file){
//		try {
//			 //定义序号
//		    int count=1;
//		    for (MultipartFile mf : file) {
//			if(!mf.isEmpty()){
//				// 使用UUID给图片重命名，并去掉四个“-”
//				String name = UUID.randomUUID().toString().replaceAll("-", "");
//				// 获取文件的扩展名
//				String ext = FilenameUtils.getExtension(mf
//				.getOriginalFilename());  
//				// 设置图片上传路径
//				String url = request.getSession().getServletContext()
//				.getRealPath("/upload");
//				System.out.println(url);
//				// 以绝对路径保存重名命后的图片
//				mf.transferTo(new File(url + "/" + name + "." + ext));
//				// 把图片存储路径保存到数据库
//				String path="upload/" + name + "." + ext;
//				if(count==1){
//					//
//					coop.setCoopMainpicture(path);
//				}else if(count==2){
//					coop.setCoopPicture(path);
//				}else if(count==3){
//					coop.setCoopRealShot(path);
//				}
//			}  
//			count++;
//		}  
//			coopService.add(coop);
//			return new Result(true, "增加成功");
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new Result(false, "增加失败");
//		}
//	}
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
	
	
	@RequestMapping("/up")
	public Result up(@RequestParam(value="file",required=false) MultipartFile file){
		try {

				// 使用UUID给图片重命名，并去掉四个“-”
				String name = UUID.randomUUID().toString().replaceAll("-", "");
				// 获取文件的扩展名
				String ext = FilenameUtils.getExtension(file.getOriginalFilename());  
				// 设置图片上传路径
				String url = request.getSession().getServletContext().getRealPath("/upload");
				System.out.println(url);
				// 以绝对路径保存重名命后的图片
				file.transferTo(new File(url + "/" + name + "." + ext));
				// 把图片存储路径保存到数据库
				String path="upload/" + name + "." + ext;
				return new Result(true, path);
		} catch (Exception e) {
			e.printStackTrace();
			   return new Result(false, "上传失败");
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
	 * 审核
	 * @param coop
	 * @return
	 */
	@RequestMapping("/shenhe")
	public Result shenhe(@RequestBody TbCoop coop){
		try {
			TbCoop tbCoop = coopService.findOne(coop.getCoopId());
			if(tbCoop.getCoopTbtype().equals("待修改")) {
				return new Result(false, "已撤回，无法审核");
			}else{
			HttpSession session = request.getSession();
			TbSysUser user = (TbSysUser) session.getAttribute("user");
			coop.setCoopShenheId(user.getId());
			coop.setCoopShenheTime(new Date());
			coop.setCoopUserId(coop.getCoopUserId());
			coopService.update(coop);
			
			Integer id = coop.getCoopShenheId();
			TbSysUser user2 = sysUserService.findOne(id);
			if(user2.getNowTb()!=null){
			user2.setNowTb(user2.getNowTb()-1);
			}
			sysUserService.update(user2);
			return new Result(true, "审核成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "审核失败");
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
	 * 分配提报人员
	 * @param coop
	 * @return
	 */
	@RequestMapping("/fenpei")
	public Result shenhe(int [] coopids, int userId){
		try {
			TbSysUser user = sysUserService.findOne(userId);
			int i = coopids.length;
			if(user.getMaxTb()==null){
				user.setMaxTb(40);
			}
		    if (user.getNowTb()==null){
		    	user.setNowTb(0);
		    }
			if(user.getMaxTb()>=user.getNowTb()+i){
			coopService.fenpei(coopids,userId);
			}else{
				return new Result(false, "分配失败，已超过最大上限");
			}
			return new Result(true, "分配成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "分配失败");
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
	public PageResult search(@RequestBody TbCoop coop, int page, int rows ){
		return coopService.findPage(coop, page, rows);	
		//return null;
	}
	
}
