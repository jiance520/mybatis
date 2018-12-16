package com.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.entity.Demo;
import com.service.IDemoService;
import com.service.impl.DemoService;
public class test24 {
	public static void main(String[] args) throws Exception {
		IDemoService ds = new DemoService();
		List<Integer> clist = new ArrayList<Integer>();
			clist.add(1);
			clist.add(2);
		List<Demo> list = ds.selectIn(clist);
		System.out.println(list);
	}
}
