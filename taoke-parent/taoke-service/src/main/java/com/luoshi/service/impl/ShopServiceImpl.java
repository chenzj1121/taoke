package com.luoshi.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.luoshi.pojo.TbSysUser;
import com.luoshi.service.SysUserService;
import com.luoshi.service.WaitingWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbShopMapper;
import com.luoshi.pojo.TbBackmoneyExample.Criteria;
import com.luoshi.pojo.TbShop;
import com.luoshi.pojo.TbShopExample;
import com.luoshi.service.ShopService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private TbShopMapper shopMapper;

    @Autowired
    private SysUserService sysUserService;
    
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbShop> findAll() {
		TbShopExample example=new TbShopExample();
		com.luoshi.pojo.TbShopExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("id DESC");
		return shopMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbShop> page=   (Page<TbShop>) shopMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbShop shop) {
		shop.setCreateTime(new Date());
		shop.setNextTime(new Date());
		HttpSession session = request.getSession();
		TbSysUser user = (TbSysUser) session.getAttribute("user");
		shop.setShopUseId(user.getId());
		shopMapper.insert(shop);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbShop shop){
		shopMapper.updateByPrimaryKey(shop);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbShop findOne(int id){
		return shopMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			shopMapper.deleteByPrimaryKey(id);
		}		
	}


    @Override
    public List<String> checkWangWangAccount(String wangwangAccount) {

	    List<String> list = new ArrayList<>();
        TbShopExample example=new TbShopExample();
        com.luoshi.pojo.TbShopExample.Criteria criteria = example.createCriteria();

        criteria.andWangwangaccountEqualTo(wangwangAccount);
        List<TbShop> tbShops = shopMapper.selectByExample(example);
        if(tbShops.size() == 0) {
            return list;
        } else {
            for (TbShop shop : tbShops){
                list.add(sysUserService.findOne(shop.getShopUseId()).getRealname());
            }
            return list;
        }
    }

    @Override
	public PageResult findPage(TbShop shop, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbShopExample example=new TbShopExample();
		com.luoshi.pojo.TbShopExample.Criteria criteria = example.createCriteria();
		HttpSession session = request.getSession();
		TbSysUser user = (TbSysUser) session.getAttribute("user");
		example.setOrderByClause("id DESC");
		if(shop!=null){
			//如果是员工只能查询本人
			if(user.getType().equals("2")&&shop.getPrivateType()!="1") {
				criteria.andShopUserId2EqualTo(user.getId());
			}
			//根据部门查找
			if(shop.getShopDeptId()!=null) {
				criteria.andShopDeptIdEqualTo(shop.getShopDeptId());
			}
			//根据小组查找
			if(shop.getShopGroupId()!=null) {
				criteria.andShopGroupIdEqualTo(shop.getShopGroupId());
			}
			//根据员工id查找
			if(shop.getShopUserId2()!=null) {
				criteria.andShopUserId2EqualTo(shop.getShopUserId2());
			}
			//创建时间
			if(shop.getCreateTime()!=null){
				criteria.andCreateTimeGreaterThanOrEqualTo(shop.getCreateTime());
			}
			//创建时间
			if(shop.getCreateTimeEnd()!=null){
				criteria.andCreateTimeLessThanOrEqualTo(shop.getCreateTimeEnd());
			}
			//回款金额区间
			if(shop.getRefundsMoney()!=null) {
				criteria.andRefundsMoneyGreaterThanOrEqualTo(shop.getRefundsMoney());
			}
			//回款金额区间
			if(shop.getShopMaxMoney()!=null) {
				criteria.andRefundsMoneyLessThan(shop.getShopMaxMoney());
			}
			if(shop.getShopName()!=null && shop.getShopName().length()>0){
				criteria.andShopNameLike("%"+shop.getShopName()+"%");
			}
			if(shop.getWangwangaccount()!=null && shop.getWangwangaccount().length()>0){
				criteria.andWangwangaccountLike("%"+shop.getWangwangaccount()+"%");
			}
			if(shop.getShopProduct()!=null && shop.getShopProduct().length()>0){
				criteria.andShopProductLike("%"+shop.getShopProduct()+"%");
			}
			if(shop.getShopBoss()!=null && shop.getShopBoss().length()>0){
				criteria.andShopBossLike("%"+shop.getShopBoss()+"%");
			}
			if(shop.getShopPhone()!=null && shop.getShopPhone().length()>0){
				criteria.andShopPhoneLike("%"+shop.getShopPhone()+"%");
			}
			if(shop.getShopQq()!=null && shop.getShopQq().length()>0){
				criteria.andShopQqLike("%"+shop.getShopQq()+"%");
			}
			if(shop.getShopWx()!=null && shop.getShopWx().length()>0){
				criteria.andShopWxLike("%"+shop.getShopWx()+"%");
			}
			if(shop.getShopOperatePhone()!=null && shop.getShopOperatePhone().length()>0){
				criteria.andShopOperatePhoneLike("%"+shop.getShopOperatePhone()+"%");
			}
			if(shop.getShopUrl()!=null && shop.getShopUrl().length()>0){
				criteria.andShopUrlLike("%"+shop.getShopUrl()+"%");
			}
			if(shop.getMaturity()!=null && shop.getMaturity().length()>0){
				criteria.andMaturityLike("%"+shop.getMaturity()+"%");
			}
			if(shop.getShopType()!=null && shop.getShopType().length()>0){
				criteria.andShopTypeLike("%"+shop.getShopType()+"%");
			}
			if(shop.getMainOperate()!=null && shop.getMainOperate().length()>0){
				criteria.andMainOperateLike("%"+shop.getMainOperate()+"%");
			}
			
			if(shop.getShopRealShooting()!=null && shop.getShopRealShooting().length()>0){
				criteria.andShopRealShootingLike("%"+shop.getShopRealShooting()+"%");
			}
			if(shop.getOperatePhone()!=null && shop.getOperatePhone().length()>0){
				criteria.andOperatePhoneLike("%"+shop.getOperatePhone()+"%");
			}
			if(shop.getFollowUpRecord()!=null && shop.getFollowUpRecord().length()>0){
				criteria.andFollowUpRecordLike("%"+shop.getFollowUpRecord()+"%");
			}
			if(shop.getRefundsTime()!=null && shop.getRefundsTime().length()>0){
				criteria.andRefundsTimeLike("%"+shop.getRefundsTime()+"%");
			}
			if(shop.getDataType()!=null && shop.getDataType().length()>0){
				criteria.andDataTypeLike("%"+shop.getDataType()+"%");
			}
			if(shop.getTaokeType()!=null && shop.getTaokeType().length()>0){
				criteria.andTaokeTypeLike("%"+shop.getTaokeType()+"%");
			}
			if(shop.getCooperation()!=null && shop.getCooperation().length()>0){
				criteria.andCooperationLike("%"+shop.getCooperation()+"%");
			}
			if(shop.getSpare()!=null && shop.getSpare().length()>0){
				criteria.andSpareLike("%"+shop.getSpare()+"%");
			}
			if(shop.getPrivateType()!=null && shop.getPrivateType().length()>0){
				criteria.andPrivateTypeLike("%"+shop.getPrivateType()+"%");
			}
			if(shop.getShopBz()!=null && shop.getShopBz().length()>0){
				criteria.andShopBzLike("%"+shop.getShopBz()+"%");
			}
	
		}
		
		Page<TbShop> page= (Page<TbShop>)shopMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
