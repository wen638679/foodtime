package com.wen.ftproject.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.ftproject.dao.BaseDao;
import com.wen.ftproject.dao.IdentityDao;
import com.wen.ftproject.entity.Identity;
import com.wen.ftproject.entity.Role;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.result.ResultPageData;
import com.wen.ftproject.service.IdentityService;
import com.wen.ftproject.utils.Constants;

@Service("identityService")
public class IdentityServiceImpl extends BaseServiceImpl<Identity> implements IdentityService{

	@Resource(name="identityDao")
	public IdentityDao identityDao;

	@Override
	public Result<Object> add(Identity t) {
		// TODO Auto-generated method stub
		String id = System.currentTimeMillis()+"";
		t.setIdentityId(id);
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
	public Result<Object> updateById(Identity t) {
		// TODO Auto-generated method stub
		t.setiUpdateDate(new Date(System.currentTimeMillis()));
		int i = getDao().updateById(t);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Identity> findByNumber(String number) {
		// TODO Auto-generated method stub
		List<Identity> list = getDao().findByNumber(number);
		Result<Identity> result = new Result<>();
		if(list != null && list.size() > 0) {
			Constants.createSuccessResult(result);
			result.setData(list.get(0));
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<Identity>> findByName(String name) {
		// TODO Auto-generated method stub
		List<Identity> list = getDao().findByName(name);
		Result<List<Identity>> result = new Result<>();
		if(list != null) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<Identity>> findByNumbers(String[] numbers) {
		// TODO Auto-generated method stub
		List<Identity> list = getDao().findByNumbers(numbers);
		Result<List<Identity>> result = new Result<>();
		if(list != null) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Object> updateByNumber(Identity identity) {
		// TODO Auto-generated method stub
		identity.setiCreateDate(new Date(System.currentTimeMillis()));
		int i = getDao().updateById(identity);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Object> deleteByName(String name) {
		// TODO Auto-generated method stub
		int i = getDao().deleteByName(name);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Object> deleteByNumber(String number) {
		// TODO Auto-generated method stub
		int i = getDao().deleteByNumber(number);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public IdentityDao getDao() {
		// TODO Auto-generated method stub
		return identityDao;
	}
}
