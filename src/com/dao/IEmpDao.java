package com.dao;

import com.entity.Emp;

/**
 * @version ʱ�䣺2018��6��7�� ����9:01:34
 *
 */
public interface IEmpDao {
	Emp selectByPrimaryKey(Integer empno);
}
