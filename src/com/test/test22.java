package com.test;
import java.util.*;

import com.entity.Demo;
import com.service.IDemoService;
import com.service.impl.DemoService;
public class test22 {
	public static void main(String[] args) {
		IDemoService ds = new DemoService();
		Map<String,Object> mp = new HashMap<String,Object>();
		mp.put("start", 0);
		mp.put("size", 2);
		List<Demo> list = ds.selectPage(mp);
		System.out.println(list);
	}
}
