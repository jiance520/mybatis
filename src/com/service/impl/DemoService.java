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
	//调用构造方法时，初始化代码块
	{
		session = MyBatisUtil.getSession();//不要关session,最后关
		//用框架取dao对象，注意要提前绑定xml。接口。
		demoDao = session.getMapper(IDemoDao.class);
	}
	public Demo selectByPrimaryKey(Integer did){
		return demoDao.selectByPrimaryKey(did);
	}
	public int insert(Demo d2){
		int num = demoDao.insert(d2);
		session.commit();//--------------提交
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
