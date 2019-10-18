//package com.luoshi.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.luoshi.pojo.TbSysUser;
//import com.luoshi.service.SysUserService;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//	 @Autowired
//	 private SysUserService sysUserService;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws 
//	UsernameNotFoundException {
//		System.out.println("经过了UserDetailsServiceImpl");
//		
//		//构建角色列表
//		List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
//		grantedAuths.add(new SimpleGrantedAuthority("ROLE_SELLER"));
//		//得到用户对象
//		TbSysUser sysUser=sysUserService.findByName(username);
//		if(sysUser!=null) {
//			if(sysUser != null) {
//				return new User(username,sysUser.getPassword(),grantedAuths);
//			}else {
//				return null;
//			}
//		}else {
//			return null;
//		}
///*		List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();  
//        grantedAuths.add(new SimpleGrantedAuthority("ROLE_SELLER"));          
//        return new User(username,"123456", grantedAuths);*/
//
//	}
//
//	public SysUserService getSysUserService() {
//		return sysUserService;
//	}
//
//	public void setSysUserService(SysUserService sysUserService) {
//		this.sysUserService = sysUserService;
//	}
//
//	
//	
//
//}
