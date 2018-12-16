package com.service.impl;
import java.util.*;

import org.apache.ibatis.session.*;

import com.dao.*;
import com.entity.*;
import com.factory.*;
import com.service.*;

import org.apache.ibatis.*;
/**
 * @version ʱ�䣺2018��6��7�� ����9:05:52
 *
 */
public class DeptService implements IDeptService{
	private SqlSession session;
	private IDeptDao deptDao;
	//��ʼ�������
	{
		session = MyBatisUtil.getSession();//��Ҫ��session,����
		//�ÿ��ȡdao����ע��Ҫ��ǰ��xml���ӿڡ�
		deptDao = session.getMapper(IDeptDao.class);
	}
	@Override
	public Dept selectByPrimaryKey(Integer deptno) {
		return deptDao.selectByPrimaryKey(deptno);
	}
}
