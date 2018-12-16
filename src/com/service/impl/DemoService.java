package com.service.impl;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dao.IDemoDao;
import com.entity.Demo;
import com.factory.MyBatisUtil;
import com.service.IDemoService;
public class DemoService implements IDemoService{
	private SqlSession session;
	private IDemoDao demoDao;
	//���ù��췽��ʱ����ʼ�������
	{
		session = MyBatisUtil.getSession();//��Ҫ��session,����
		//�ÿ��ȡdao����ע��Ҫ��ǰ��xml���ӿڡ�
		demoDao = session.getMapper(IDemoDao.class);
	}
	public Demo selectByPrimaryKey(Integer did){
		return demoDao.selectByPrimaryKey(did);
	}
	public int insert(Demo d2){
		int num = demoDao.insert(d2);
		session.commit();//--------------�ύ
		return num;
	}
	@Override
	public List<Demo> selectAll() {
		return demoDao.selectAll();
	}
	@Override
	public long selectCount() {
		
		return demoDao.selectCount();
	}
	@Override
	public List<Demo> selectPage(Map<String, Object> mp) {
		return demoDao.selectPage(mp);
	}
	@Override
	public List<Demo> selectActive(Demo d2) {
		return demoDao.selectActive(d2);
	}
	@Override
	public List<Demo> selectIn(List<Integer> list) {
		return demoDao.selectIn(list);
	}
}
