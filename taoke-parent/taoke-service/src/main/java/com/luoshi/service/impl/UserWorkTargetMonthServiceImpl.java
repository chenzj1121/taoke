package com.luoshi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbUserWorkTargetMonthMapper;
import com.luoshi.pojo.TbSysRolePrivExample.Criteria;
import com.luoshi.pojo.TbUserWorkTargetMonth;
import com.luoshi.pojo.TbUserWorkTargetMonthExample;
import com.luoshi.service.UserWorkTargetMonthService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UserWorkTargetMonthServiceImpl implements UserWorkTargetMonthService {

	@Autowired
	private TbUserWorkTargetMonthMapper userWorkTargetMonthMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbUserWorkTargetMonth> findAll() {
		return userWorkTargetMonthMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbUserWorkTargetMonth> page=   (Page<TbUserWorkTargetMonth>) userWorkTargetMonthMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbUserWorkTargetMonth userWorkTargetMonth) {
		userWorkTargetMonthMapper.insert(userWorkTargetMonth);
	}


	/**
	 * 修改
	 */
	@Override
	public void update(TbUserWorkTargetMonth userWorkTargetMonth){
		userWorkTargetMonthMapper.updateByPrimaryKey(userWorkTargetMonth);
	}

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbUserWorkTargetMonth findOne(int id){
		return userWorkTargetMonthMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int [] ids) {
		for(int id:ids){
			userWorkTargetMonthMapper.deleteByPrimaryKey(id);
		}
	}


		@Override
	public PageResult findPage(TbUserWorkTargetMonth userWorkTargetMonth, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		TbUserWorkTargetMonthExample example=new TbUserWorkTargetMonthExample();
		com.luoshi.pojo.TbUserWorkTargetMonthExample.Criteria criteria = example.createCriteria();

		if(userWorkTargetMonth!=null){

		}

		Page<TbUserWorkTargetMonth> page= (Page<TbUserWorkTargetMonth>)userWorkTargetMonthMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

    @Override
    public TbUserWorkTargetMonth findOneByYearAndMonth(Integer userId, Integer year, Integer month) {
        TbUserWorkTargetMonthExample example = new TbUserWorkTargetMonthExample();
        TbUserWorkTargetMonthExample.Criteria criteria = example.createCriteria().andYearEqualTo(year).andMonthEqualTo(month).andUserIdEqualTo(userId);
        return userWorkTargetMonthMapper.selectByExample(example).get(0);
    }

    @Override
    public void updateOneByYearAndMonth(TbUserWorkTargetMonth tbUserWorkTargetMonth) {
        TbUserWorkTargetMonthExample example = new TbUserWorkTargetMonthExample();
        TbUserWorkTargetMonthExample.Criteria criteria = example.createCriteria()
                .andYearEqualTo(tbUserWorkTargetMonth.getYear())
                .andMonthEqualTo(tbUserWorkTargetMonth.getMonth())
                .andUserIdEqualTo(tbUserWorkTargetMonth.getUserId());

        userWorkTargetMonthMapper.updateByExampleSelective(tbUserWorkTargetMonth, example);
    }

}
