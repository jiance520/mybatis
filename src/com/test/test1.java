package com.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.*;

import com.entity.*;
import com.factory.*;

public class test1 {
	public static void main(String[] args) {
		//ȡseission
		SqlSession ss = MyBatisUtil.getSession();
		//ȡ����
		Demo d2 = ss.selectOne("com.entity.DemoMapper.selectByPrimaryKey",Integer.valueOf("1"));
		System.out.println(d2);
		MyBatisUtil.closeSession();
	}
}
