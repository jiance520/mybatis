package com.service.impl;
import java.util.*;

import org.apache.ibatis.session.*;

import com.dao.*;
import com.entity.*;
import com.factory.*;
import com.service.*;

import org.apache.ibatis.*;
/**
 * @version 时间：2018年6月7日 上午9:05:52
 *
 */
public class DeptService implements IDeptService{
	private SqlSession session;
	private IDeptDao deptDao;
	//初始化代码块
	{
		session = MyBatisUtil.getSession();//不要关session,最后关
		//用框架取dao对象，注意要提前绑定xml。接口。
		deptDao = session.getMapper(IDeptDao.class);
	}
	@Override
	public Dept selectByPrimaryKey(Integer deptno) {
		return deptDao.selectByPrimaryKey(deptno);
	}
}
