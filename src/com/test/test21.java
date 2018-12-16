package com.test;
import com.factory.MyBatisUtil;
import com.service.impl.DemoService;
public class test21 {
	public static void main(String[] args) {
		DemoService ds = new DemoService();
		long count = ds.selectCount();
//		MyBatisUtil.closeSession();
		System.out.println(count);
	}
}
