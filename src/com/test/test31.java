package com.test;

import com.entity.Dept;
import com.service.IDeptService;
import com.service.impl.DeptService;

/**
 * @version ʱ�䣺2018��6��7�� ����9:16:57
 *
 */
public class test31 {
	public static void main(String[] args) {
		IDeptService ds = new DeptService();
		Dept d2 = ds.selectByPrimaryKey(Integer.valueOf("10"));
		System.out.println(d2);
	}
}
