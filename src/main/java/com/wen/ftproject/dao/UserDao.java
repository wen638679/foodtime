package com.wen.ftproject.dao;

import java.util.List;

import com.wen.ftproject.entity.User;

public interface UserDao extends BaseDao<User>{
	List<User> findByAP(User user);
}
