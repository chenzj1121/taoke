package com.luoshi.controller;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 3c7077c984229c6ff4408cd8b4c4a38c0e32208e
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.luoshi.pojo.TbProductSubmit;
import com.luoshi.service.ProductSubmitService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/productSubmit")
public class ProductSubmitController {

	@Autowired
	private ProductSubmitService productSubmitService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbProductSubmit> findAll(){			
		return productSubmitService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return productSubmitService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param productSubmit
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbProductSubmit productSubmit){
		try {
			productSubmitService.add(productSubmit);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
     * 保存商品
     * @param image
     * @param product
     * @param map
     * @return
     * @throws IOException
     */
    @RequestMapping("/addProduct.do")
    public Result fileUpload(MultipartFile file,TbProductSubmit productSubmit,HttpServletRequest request) throws IOException {

        /**
          * 上传图片
         */
        //图片上传成功后，将图片的地址写到数据库
        String filePath =  request.getSession().getServletContext().getRealPath("/")+"upload/"+file.getOriginalFilename();//保存图片的路径
        //获取原始图片的拓展名
        String originalFilename = file.getOriginalFilename();
        //新的文件名字
        String newFileName = UUID.randomUUID()+originalFilename;
        //封装上传文件位置的全路径
        File targetFile = new File(filePath,newFileName); 
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        productSubmit.setShopMainPic(newFileName);
        
        /**
         * 保存商品
         */
//        productService.save(product);
//        return "redirect:/list.do"; 
        try {
			productSubmitService.add(productSubmit);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
    }
	
	/**
	 * 修改
	 * @param productSubmit
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbProductSubmit productSubmit){
		try {
			productSubmitService.update(productSubmit);
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
	public TbProductSubmit findOne(int id){
		return productSubmitService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			productSubmitService.delete(ids);
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
	public PageResult search(@RequestBody TbProductSubmit productSubmit, int page, int rows  ){
		return productSubmitService.findPage(productSubmit, page, rows);		
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
        String path = request.getSession().getServletContext().getRealPath("statics\\moban")+"\\"+filename;  
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
<<<<<<< HEAD
    /**
      * 文件上传
     * @param request
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping("/upload")
    public Result importExcel(@RequestParam("file") MultipartFile file,HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
    	Result rs = new Result();
		int code = 200;
		
		//判断文件是否为空
		if(file.isEmpty()){
			rs.setMessage("文件是空");
			rs.setSuccess(false);
			return rs;
		}
		
		//判断文件类型是否错误(xlsx/xls)
		if(file.getOriginalFilename().indexOf("xlsx")<0||file.getOriginalFilename().indexOf("xls")<0){
			rs.setMessage("文件类型错误");
			rs.setSuccess(false);
			return rs;
		}
		
		
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
		InputStream ins = file.getInputStream();
		//读取excel文档  
		productSubmitService.doImport(ins);
		
		//这里的result就是整个excel的数据。根据需求自行确定校验规则及后续加数据库等操作
		return null;
		}
    
    public Result ajaxReturn(boolean success, String message){
		//返回前端的JSON数据
    	Result result=new Result();
		result.setMessage(message);
		result.setSuccess(success);
		return result;
		
	}
=======
>>>>>>> 3c7077c984229c6ff4408cd8b4c4a38c0e32208e
	
}
