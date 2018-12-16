package com.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.entity.Demo;
import com.service.IDemoService;
import com.service.impl.DemoService;
public class test23 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sf.parse("2018-6-5");
		IDemoService ds = new DemoService();
		Demo d2 = new Demo();
			d2.setDid(Integer.valueOf("1"));
			d2.setTitle("");
			d2.setDtime(dt);
		List<Demo> list = ds.selectActive(d2);
		System.out.println(list);
	}
}
