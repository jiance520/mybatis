package com.service;

import com.entity.Dept;

/**
 * @version 时间：2018年6月7日 上午9:04:58
 *
 */
public interface IDeptService {
	Dept selectByPrimaryKey(Integer deptno);
}
