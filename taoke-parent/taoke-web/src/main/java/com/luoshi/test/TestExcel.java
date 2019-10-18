package com.luoshi.test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import com.luoshi.utils.ExcelUtils;
import com.luoshi.utils.Student;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("赵金毅");
		s1.setScore(23);
		
		Student s2 = new Student();
		s2.setId(1);
		s2.setName("赵金毅");
		s2.setScore(24);
		
		Student s3 = new Student();
		s3.setId(1);
		s3.setName("赵金毅");
		s3.setScore(25);
		
		Student s4 = new Student();
		s4.setId(1);
		s4.setName("赵金毅");
		s4.setScore(26);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("id", "创建时间");
		map.put("name", "点击时间");
		map.put("score", "商品信息");
		map.put("score", "商品ID");
		map.put("score", "掌柜旺旺");
		map.put("score", "所属店铺");
		map.put("score", "商品数");
		map.put("score", "商品单价");
		map.put("score", "订单状态");
		map.put("score", "服务费率");
		map.put("score", "付款金额");
		map.put("score", "预估付款服务费");
		map.put("score", "结算时间");
		map.put("score", "结算金额");
		map.put("score", "预估结算服务费");
		map.put("score", "订单编号");
		map.put("score", "活动id");
	
		
		OutputStream os = new FileOutputStream("E:\\AdvancedFramework\\后台预算.xls");
		
//		List<T> list, LinkedHashMap<String, String> fieldMap, String sheetName, int sheetSize, OutputStream os
		ExcelUtils.listToExcel(list, map, "学生成绩表", 20, os);
	}
	
}
