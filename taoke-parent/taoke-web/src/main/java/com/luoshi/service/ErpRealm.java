package com.luoshi.service;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.luoshi.pojo.TbSysUser;

public class ErpRealm extends AuthorizingRealm {
	

    @Autowired
    private SysUserService sysUserService;
    
	/**
	 * 授权
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("执行了授权");
		
		return null;
	}

	/**
	 * 认证
	 * @return null:认证失败, AuthenticationInfo实现类，认证成功
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("执行了认证的方法...");
		//通过令牌得到用户名和密码?
		UsernamePasswordToken upt = (UsernamePasswordToken)token;
		//得到密码
		String pwd = new String(upt.getPassword());
		//调用登录查询
		TbSysUser sysUser = sysUserService.findByUsernameAndPwd(upt.getUsername(),pwd);
		if(null != sysUser){
			//构造参数1： 主角=登陆用户
			//参数2：授权码：密码
			//参数3：realm的名称
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysUser,pwd,getName());
			return info;
		}
		return null;
	}

}
