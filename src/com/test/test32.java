package com.test;

import com.entity.Emp;
import com.service.IEmpService;
import com.service.impl.EmpService;

/**
 * @version ʱ�䣺2018��6��7�� ����9:16:57
 *
 */
public class test32 {
	public static void main(String[] args) {
		IEmpService ds = new EmpService();
		Emp e2 = ds.selectByPrimaryKey(Integer.valueOf("7369"));
		System.out.println(e2);
	}
}
