package com.test;
import com.entity.Demo;
import com.service.IDemoService;
import com.service.impl.DemoService;
public class test2 {
	public static void main(String[] args) {
		IDemoService ds = new DemoService();
		Demo d2 = ds.selectByPrimaryKey(Integer.valueOf("1"));
		System.out.println(d2);
	}
}
