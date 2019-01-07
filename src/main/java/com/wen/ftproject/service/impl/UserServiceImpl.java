package com.wen.ftproject.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Service;

import com.wen.ftproject.dao.UserDao;
import com.wen.ftproject.entity.User;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.service.UserService;
import com.wen.ftproject.utils.Constants;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Resource(name="userDao")
	public UserDao userDao;
	
	@Override
	public Result<Object> add(User t) {
		// TODO Auto-generated method stub
		String id = System.currentTimeMillis()+"";
		t.setUserId(id);
		int i = getDao().add(t);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Object> updateById(User t) {
		// TODO Auto-generated method stub
		t.setuUpdateDate(new Date(System.currentTimeMillis()));
		int i = getDao().updateById(t);
		Result<Object> result = new Result<>();
		if(i > 0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public UserDao getDao() {
		// TODO Auto-generated method stub
		return userDao;
	}

	@Override
	public Result<User> findByAP(User user) {
		// TODO Auto-generated method stub
		Result<User> result = new Result<>();
		if(user !=null && !TextUtils.isEmpty(user.getuAccount()) && !TextUtils.isEmpty(user.getuPassword())) {
			List<User> list = getDao().findByAP(user);
			if(list != null && list.size() > 0) {
				Constants.createSuccessResult(result);
				result.setData(list.get(0));
			}else {
				Constants.createFailResult(result);
			}
		}else {
			Constants.createFailResult(result);
		}
		
		return result;
	}

}
