package com.service;

import java.util.List;
import java.util.Map;

import com.entity.*;

public interface IDemoService {
	Demo selectByPrimaryKey(Integer did);
	List<Demo> selectAll();
	int insert(Demo d2);
	long selectCount();
	List<Demo> selectPage(Map<String,Object> mp);
	List<Demo> selectActive(Demo d2);//多条件查询
	List<Demo> selectIn(List<Integer> list);
}
