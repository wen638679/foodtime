package com.wen.ftproject.service;

import com.wen.ftproject.entity.User;
import com.wen.ftproject.result.Result;

public interface UserService extends BaseService<User>{
	Result<User> findByAP(User user);
}
