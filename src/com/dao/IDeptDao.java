package com.dao;

import com.entity.Dept;

/**
 * @version ʱ�䣺2018��6��7�� ����9:02:54
 *
 */
public interface IDeptDao {
	Dept selectByPrimaryKey(Integer deptno);
}
