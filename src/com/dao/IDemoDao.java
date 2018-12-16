package com.dao;
import java.util.*;

import com.entity.*;

public interface IDemoDao {
	Demo selectByPrimaryKey(Integer did);
	List<Demo> selectAll();
	int insert(Demo d2);
	long selectCount();
	List<Demo> selectPage(Map<String,Object> mp);
	List<Demo> selectActive(Demo d2);//多条件查询
	List<Demo> selectIn(List<Integer> list);
}
