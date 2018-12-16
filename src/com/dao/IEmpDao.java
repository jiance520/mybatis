package com.dao;

import com.entity.Emp;

/**
 * @version 时间：2018年6月7日 上午9:01:34
 *
 */
public interface IEmpDao {
	Emp selectByPrimaryKey(Integer empno);
}
