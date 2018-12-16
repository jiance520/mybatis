package com.service;

import com.entity.Emp;

/**
 * @version 时间：2018年6月7日 上午9:05:19
 *
 */
public interface IEmpService {
	Emp selectByPrimaryKey(Integer empno);
}
