package com.luoshi.service.impl;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.luoshi.pojo.TbGroupExample;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbSysUserMapper;
import com.luoshi.pojo.TbSysRolePrivExample.Criteria;
import com.luoshi.pojo.TbSysUser;
import com.luoshi.pojo.TbSysUserExample;
import com.luoshi.service.SysUserService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private TbSysUserMapper sysUserMapper;
	@Autowired
	private HttpServletRequest request;
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSysUser> findAll() {
		TbSysUserExample example=new TbSysUserExample();
		com.luoshi.pojo.TbSysUserExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("id DESC");
		return sysUserMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSysUser> page=   (Page<TbSysUser>) sysUserMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSysUser sysUser) {
		if(sysUser.getType()==null ){
		sysUser.setType("0");
		}
		sysUserMapper.insert(sysUser);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSysUser sysUser){
		sysUserMapper.updateByPrimaryKey(sysUser);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSysUser findOne(int id){
		return sysUserMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			sysUserMapper.deleteByPrimaryKey(id);
		}		
	}


    @Override
    public List<TbSysUser> getUserByDeptIdAndGroupId(Integer deptId, Integer groupId) {
        TbSysUserExample example=new TbSysUserExample();
        TbSysUserExample.Criteria criteria = example.createCriteria();
        criteria.andDeptIdEqualTo(deptId).andGroupIdEqualTo(groupId);
        return sysUserMapper.selectByExample(example);
    }

    @Override
    public Result getUserByName(TbSysUser tbSysUser) {
	    Result result = new Result();
        TbSysUserExample example=new TbSysUserExample();
        TbSysUserExample.Criteria criteria = example
                .createCriteria()
                .andUsernameEqualTo(tbSysUser.getUsername())
                .andPasswordEqualTo(tbSysUser.getPassword());
        List<TbSysUser> tbSysUsers = sysUserMapper.selectByExample(example);
        if(tbSysUsers.size() > 0) {
            result.setSuccess(true);
            result.setData(tbSysUsers.get(0));
        } else {
            result.setSuccess(false);
        }
        return result;
    }

    @Override
	public PageResult findPage(TbSysUser sysUser, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSysUserExample example=new TbSysUserExample();
		com.luoshi.pojo.TbSysUserExample.Criteria criteria = example.createCriteria();
		
		HttpSession session = request.getSession();
		TbSysUser user = (TbSysUser) session.getAttribute("user");
		example.setOrderByClause("id DESC");
		if(sysUser!=null){
			if(user.getType().equals("1")){
				criteria.andGroupIdEqualTo(user.getGroupId());
			}
			if(sysUser.getSalt()!=null && sysUser.getSalt().length()>0){
				criteria.andSaltLike("%"+sysUser.getSalt()+"%");
			}
			if(sysUser.getUsername()!=null && sysUser.getUsername().length()>0){
				criteria.andUsernameLike("%"+sysUser.getUsername()+"%");
			}
			if(sysUser.getPassword()!=null && sysUser.getPassword().length()>0){
				criteria.andPasswordLike("%"+sysUser.getPassword()+"%");
			}
			if(sysUser.getRealname()!=null && sysUser.getRealname().length()>0){
				criteria.andRealnameLike("%"+sysUser.getRealname()+"%");
			}
			if(sysUser.getPhone()!=null && sysUser.getPhone().length()>0){
				criteria.andPhoneLike("%"+sysUser.getPhone()+"%");
			}
			if(sysUser.getType()!=null && sysUser.getType().length()>0){
				criteria.andTypeLike("%"+sysUser.getType()+"%");
			}
			if(sysUser.getDeptId()!=null){
				criteria.andDeptIdEqualTo(sysUser.getDeptId());
			}
	
		}
		
		Page<TbSysUser> page= (Page<TbSysUser>)sysUserMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public TbSysUser findByName(String username) {
		TbSysUser sysUser=new TbSysUser();
		TbSysUserExample example=new TbSysUserExample();
		com.luoshi.pojo.TbSysUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		// TODO Auto-generated method stub
		return (TbSysUser) sysUserMapper.selectByExample(example);
	}
	
	@Override
	public TbSysUser findByUsernameAndPwd(String username,String password) {
		TbSysUser sysUser=new TbSysUser();
		TbSysUserExample example=new TbSysUserExample();
		com.luoshi.pojo.TbSysUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		// TODO Auto-generated method stub
		return (TbSysUser) sysUserMapper.selectByExample(example);
	}
	
}
