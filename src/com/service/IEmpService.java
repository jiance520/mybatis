package com.service;

import com.entity.Emp;

/**
 * @version ʱ�䣺2018��6��7�� ����9:05:19
 *
 */
public interface IEmpService {
	Emp selectByPrimaryKey(Integer empno);
}
