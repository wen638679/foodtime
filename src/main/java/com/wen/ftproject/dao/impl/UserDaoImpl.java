package com.wen.ftproject.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wen.ftproject.dao.UserDao;

import com.wen.ftproject.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		super.setNs(User.class.getName());
	}
	
	@Override
	public List<User> findByAP(User user) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByAP", user);
	}

}
