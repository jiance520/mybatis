package com.service.impl;

import java.util.*;

import org.apache.ibatis.session.*;

import com.dao.*;
import com.entity.*;
import com.factory.*;
import com.service.*;

import org.apache.ibatis.*;

/**
 * @version ʱ�䣺2018��6��7�� ����9:08:28
 *
 */
public class EmpService implements IEmpService{
	private SqlSession session;
	private IEmpDao empDao;
	//��ʼ�������
	{
		session = MyBatisUtil.getSession();//��Ҫ��session,����
		//�ÿ��ȡdao����ע��Ҫ��ǰ��xml���ӿڡ�
		empDao = session.getMapper(IEmpDao.class);
	}
	@Override
	public Emp selectByPrimaryKey(Integer empno) {
		return empDao.selectByPrimaryKey(empno);
	}
}
