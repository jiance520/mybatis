package com.test;
import java.util.*;

import com.entity.Demo;
import com.service.IDemoService;
import com.service.impl.DemoService;
public class test4 {
	public static void main(String[] args) {
		DemoService ds = new DemoService();
		Demo d2 = new Demo();
		d2.setTitle("≤‚ ‘ ˝æ›");
		d2.setDtime(new Date());
		int num = ds.insert(d2);
		System.out.println(d2);
	}
}
