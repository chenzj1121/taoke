package com.luoshi.controller;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.luoshi.pojo.TbBackgroundDetails;
import com.luoshi.pojo.TbCoop;
import com.luoshi.service.BackgroundDetailsService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/backgroundDetails")
public class BackgroundDetailsController {

	@Autowired
	private BackgroundDetailsService backgroundDetailsService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBackgroundDetails> findAll(){			
		return backgroundDetailsService.findAll();
	}
	
//	/**
//	 * 返回通过店铺数
//	 * @return
//	 */
//	@RequestMapping("/getNums")
//	public int  getNums(){			
//		return backgroundDetailsService.getNums();
//	}
	
	/**
	 * 根据用户id和商品id返回明细
	 * @return
	 */
	@RequestMapping("/findByGoodId")
	public List<TbBackgroundDetails> findByGoodId(Integer useId,Long goodsId ){			
		return backgroundDetailsService.findByGoodId(useId,goodsId);
	}
	
	/**
	 * 返回付款服务费总额
	 * @return
	 */
	@RequestMapping("/payMoney")
	public Double  payMoney(@RequestBody TbBackgroundDetails backgroundDetails){
		
		return backgroundDetailsService.payMoney(backgroundDetails,"pay");
		
		//return 	
	}
	
	/**
	 * 返回结算服务费总额
	 * @return
	 */
	@RequestMapping("/jsMoney")
	public Double  jsMoney(@RequestBody TbBackgroundDetails backgroundDetails){
		
		return backgroundDetailsService.payMoney(backgroundDetails,"js");
		
		//return 	
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return backgroundDetailsService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param backgroundDetails
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBackgroundDetails backgroundDetails){
		try {
			backgroundDetailsService.add(backgroundDetails);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param backgroundDetails
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBackgroundDetails backgroundDetails){
		try {
			backgroundDetailsService.update(backgroundDetails);
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
	public TbBackgroundDetails findOne(int id){
		return backgroundDetailsService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			backgroundDetailsService.delete(ids);
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
	public PageResult search(@RequestBody TbBackgroundDetails backgroundDetails, int page, int rows  ){
		return backgroundDetailsService.findPage(backgroundDetails, page, rows);		
	}
	
	
	/**
	 * 文件下载
     * @throws IOException 
     */
    @RequestMapping(value="/download")
    public void download(@RequestParam(value="filename")String filename,
       HttpServletRequest request,
       HttpServletResponse response) throws IOException {
        //模拟文件，myfile.txt为需要下载的文件  
        String path = request.getSession().getServletContext().getRealPath("statics/moban")+"/"+filename;  
        //获取输入流  
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(path)));
        //转码，免得文件名中文乱码  
        filename = URLEncoder.encode(filename,"UTF-8");  
        //设置文件下载头  
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("multipart/form-data");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
    }
    /**
      * 文件上传
     * @param request
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping("/upload")
    public Result importExcel(@RequestParam("filebox") MultipartFile file,HttpServletRequest request,
    		HttpServletResponse response, String goodsType) throws Exception{
    	Result rs = new Result();
		int code = 200;
		
		//判断文件是否为空
		if(file.isEmpty()){
			rs.setMessage("文件是空");
			rs.setSuccess(false);
			return rs;
		}
		
		//判断文件类型是否错误(xlsx/xls)
/*		if(file.getOriginalFilename().indexOf("xls")<0||file.getOriginalFilename().indexOf("xlsx")<0){
			rs.setMessage("文件类型错误");
			rs.setSuccess(false);
			return rs;
		}
		*/
		
		//存入本地文件夹
//		String path = request.getSession().getServletContext().getRealPath("/")+"upload/"+file.getOriginalFilename();
//		try{
//			file.transferTo(new File(path));
//		}catch (IllegalStateException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		File localFile = new File(path);
		//InputStream ins = file.getInputStream();
		//读取excel文档  
		return backgroundDetailsService.doImport(file,goodsType);
		
		//这里的result就是整个excel的数据。根据需求自行确定校验规则及后续加数据库等操作
		}
    
    public Result ajaxReturn(boolean success, String message){
		//返回前端的JSON数据
    	Result result=new Result();
		result.setMessage(message);
		result.setSuccess(success);
		return result;
		
	}
	
}
