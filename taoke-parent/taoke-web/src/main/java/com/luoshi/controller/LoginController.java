package com.luoshi.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.SysUserService;

import entity.Result;

/**
 * @Auther: 无聊的人
 * @Date: 2019/10/15
 * @Description: com.luoshi.controller
 */
@RestController
public class LoginController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login")
    public Result login(@RequestBody TbSysUser tbSysUser) {
    	try {
    	//创建令牌
//    	UsernamePasswordToken upt = new UsernamePasswordToken(tbSysUser.getUsername(),tbSysUser.getPassword());
//    	//获得主题subject
//    	Subject subject=SecurityUtils.getSubject();
//    	//执行login方法
//    	subject.login(upt);
    	
        Result result = sysUserService.getUserByName(tbSysUser);
        HttpSession session = request.getSession();
        session.setAttribute("user", result.getData());
    	return result;
    	}catch (Exception e) {
    	return ajaxReturn(false,"登陆失败");
		}
    }
    
    public Result ajaxReturn(boolean success, String message){
		//返回前端的JSON数据
    	Result result=new Result();
		result.setMessage(message);
		result.setSuccess(success);
		return result;
		
	}
  
}
