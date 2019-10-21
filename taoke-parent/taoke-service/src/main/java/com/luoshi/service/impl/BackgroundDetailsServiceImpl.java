package com.luoshi.service.impl;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luoshi.mapper.TbBackgroundDetailsMapper;
import com.luoshi.pojo.TbBackgroundDetails;
import com.luoshi.pojo.TbBackgroundDetailsExample;
import com.luoshi.pojo.TbProductSubmit;
import com.luoshi.pojo.TbBackgroundDetailsExample.Criteria;
import com.luoshi.service.BackgroundDetailsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BackgroundDetailsServiceImpl implements BackgroundDetailsService {

	@Autowired
	private TbBackgroundDetailsMapper backgroundDetailsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBackgroundDetails> findAll() {
		return backgroundDetailsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbBackgroundDetails> page=   (Page<TbBackgroundDetails>) backgroundDetailsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBackgroundDetails backgroundDetails) {
		backgroundDetailsMapper.insert(backgroundDetails);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbBackgroundDetails backgroundDetails){
		backgroundDetailsMapper.updateByPrimaryKey(backgroundDetails);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbBackgroundDetails findOne(int id){
		return backgroundDetailsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			backgroundDetailsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbBackgroundDetails backgroundDetails, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBackgroundDetailsExample example=new TbBackgroundDetailsExample();
		Criteria criteria = example.createCriteria();
		
		if(backgroundDetails!=null){			
						if(backgroundDetails.getShopMessage()!=null && backgroundDetails.getShopMessage().length()>0){
				criteria.andShopMessageLike("%"+backgroundDetails.getShopMessage()+"%");
			}
			if(backgroundDetails.getAliwangwang()!=null && backgroundDetails.getAliwangwang().length()>0){
				criteria.andAliwangwangLike("%"+backgroundDetails.getAliwangwang()+"%");
			}
			if(backgroundDetails.getShopName()!=null && backgroundDetails.getShopName().length()>0){
				criteria.andShopNameLike("%"+backgroundDetails.getShopName()+"%");
			}
	
		}
		
		Page<TbBackgroundDetails> page= (Page<TbBackgroundDetails>)backgroundDetailsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public void doImport(InputStream ins) throws Exception {
			HSSFWorkbook wb = null;
			try {
				wb = new HSSFWorkbook(ins);
				HSSFSheet sheet = wb.getSheetAt(0);
				String type = "";
	/*			if("供应商".equals(sheet.getSheetName())){
					type = Supplier.TYPE_SUPPLIER;
				}else if("客户".equals(sheet.getSheetName())){
					type = Supplier.TYPE_CUSTOMER;
				}else{
					throw new ErpException("工作表名称不正确");
				}*/
				
				//读取数据
				//最后一行的行号
				int lastRow = sheet.getLastRowNum();
				TbBackgroundDetails details = null;
				for(int i = 1; i <= lastRow; i++){
					details = new TbBackgroundDetails();
				/*	productSubmit.setName(sheet.getRow(i).getCell(0).getStringCellValue());//供应商名称
					//判断是否已经存在，通过名称来判断
					List<Supplier> list = supplierDao.getList(null, supplier, null);
					if(list.size() > 0){
						supplier = list.get(0);
					}
					supplier.setAddress(sheet.getRow(i).getCell(1).getStringCellValue());//地址
					supplier.setContact(sheet.getRow(i).getCell(2).getStringCellValue());//联系人
					supplier.setTele(sheet.getRow(i).getCell(3).getStringCellValue());//电话
					supplier.setEmail(sheet.getRow(i).getCell(4).getStringCellValue());//Email
					if(list.size() == 0){
						//新增
						supplier.setType(type);
						supplierDao.add(supplier);
					}*/
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					details.setCreateTime(sdf.parse(sheet.getRow(i).getCell(0).getStringCellValue()));
					details.setClickTime(sdf.parse(sheet.getRow(i).getCell(1).getStringCellValue()));
					details.setShopMessage(sheet.getRow(i).getCell(2).getStringCellValue());
					details.setGoodsId(Integer.parseInt( sheet.getRow(i).getCell(3).getStringCellValue()));
					details.setAliwangwang(sheet.getRow(i).getCell(4).getStringCellValue());
					details.setShopName(sheet.getRow(i).getCell(5).getStringCellValue());
					details.setGoodsCounts(Integer.parseInt(sheet.getRow(i).getCell(6).getStringCellValue()));//设置商品数量
					details.setGoodsPrice(Double.parseDouble(sheet.getRow(i).getCell(7).getStringCellValue()));
					details.setOrdersFl(Double.parseDouble(sheet.getRow(i).getCell(8).getStringCellValue()));
					details.setPay(Double.parseDouble(sheet.getRow(i).getCell(9).getStringCellValue()));//付款金额
					details.setPayAbout(Double.parseDouble(sheet.getRow(i).getCell(10).getStringCellValue()));//预估付款服务费
					details.setPayTime(sdf.parse(sheet.getRow(i).getCell(11).getStringCellValue()));//结算时间
					details.setPayMoney(Double.parseDouble(sheet.getRow(i).getCell(12).getStringCellValue()));//结算金额
					details.setOrderId(Long.parseLong(sheet.getRow(i).getCell(13).getStringCellValue()));//订单编号
					details.setGdId(Long.parseLong(sheet.getRow(i).getCell(14).getStringCellValue()));//活动id
					backgroundDetailsMapper.insert(details);
					
					}			
			} finally{
				if(null != wb){
					try {
						wb.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	
}
