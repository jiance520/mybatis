package com.dao;

import com.entity.Dept;

/**
 * @version 时间：2018年6月7日 上午9:02:54
 *
 */
public interface IDeptDao {
	Dept selectByPrimaryKey(Integer deptno);
}
