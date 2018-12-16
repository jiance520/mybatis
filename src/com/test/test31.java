package com.test;

import com.entity.Dept;
import com.service.IDeptService;
import com.service.impl.DeptService;

/**
 * @version 时间：2018年6月7日 上午9:16:57
 *
 */
public class test31 {
	public static void main(String[] args) {
		IDeptService ds = new DeptService();
		Dept d2 = ds.selectByPrimaryKey(Integer.valueOf("10"));
		System.out.println(d2);
	}
}
