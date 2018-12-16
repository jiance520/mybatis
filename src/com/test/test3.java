package com.test;
import java.util.List;

import com.entity.Demo;
import com.service.IDemoService;
import com.service.impl.DemoService;
public class test3 {
	public static void main(String[] args) {
		IDemoService ds = new DemoService();
		List<Demo> list = ds.selectAll();
		System.out.println(list);
	}
}
