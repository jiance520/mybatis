package com.service;

import com.entity.Dept;

/**
 * @version ʱ�䣺2018��6��7�� ����9:04:58
 *
 */
public interface IDeptService {
	Dept selectByPrimaryKey(Integer deptno);
}
