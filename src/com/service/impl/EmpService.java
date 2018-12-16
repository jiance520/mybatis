package com.service.impl;

import java.util.*;

import org.apache.ibatis.session.*;

import com.dao.*;
import com.entity.*;
import com.factory.*;
import com.service.*;

import org.apache.ibatis.*;

/**
 * @version 时间：2018年6月7日 上午9:08:28
 *
 */
public class EmpService implements IEmpService{
	private SqlSession session;
	private IEmpDao empDao;
	//初始化代码块
	{
		session = MyBatisUtil.getSession();//不要关session,最后关
		//用框架取dao对象，注意要提前绑定xml。接口。
		empDao = session.getMapper(IEmpDao.class);
	}
	@Override
	public Emp selectByPrimaryKey(Integer empno) {
		return empDao.selectByPrimaryKey(empno);
	}
}
