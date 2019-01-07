package com.wen.ftproject.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.ftproject.dao.ApplyRoleDao;
import com.wen.ftproject.entity.ApplyRole;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.service.ApplyRoleService;
import com.wen.ftproject.utils.Constants;

@Service("applyRoleService")
public class ApplyRoleServiceImpl extends BaseServiceImpl<ApplyRole> implements ApplyRoleService{

	@Resource(name="applyRoleDao")
	public ApplyRoleDao applyRoleDao;
	
	@Override
	public Result<Object> add(ApplyRole t) {
		// TODO Auto-generated method stub
		String id = System.currentTimeMillis()+"";
		t.setArId(id);
		int i = getDao().add(t);
		Result<Object> result = new Result<>();
		if(i > 0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Object> updateById(ApplyRole t) {
		// TODO Auto-generated method stub
		t.setArUpdateDate(new Date(System.currentTimeMillis()));
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
	public Result<List<ApplyRole>> findByUserId(String id) {
		// TODO Auto-generated method stub
		List<ApplyRole> list = getDao().findByUserId(id);
		Result<List<ApplyRole>> result = new Result<>();
		if(list!=null && list.size()>0) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<ApplyRole>> findByUserIds(String[] ids) {
		// TODO Auto-generated method stub
		List<ApplyRole> list = getDao().findByUserIds(ids);
		Result<List<ApplyRole>> result = new Result<>();
		if(list!=null && list.size()>0) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<ApplyRole>> findByRoleId(String id) {
		// TODO Auto-generated method stub
		List<ApplyRole> list = getDao().findByRoleId(id);
		Result<List<ApplyRole>> result = new Result<>();
		if(list!=null && list.size()>0) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<ApplyRole>> findByRoleIds(String[] ids) {
		// TODO Auto-generated method stub
		List<ApplyRole> list = getDao().findByRoleIds(ids);
		Result<List<ApplyRole>> result = new Result<>();
		if(list!=null && list.size()>0) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public ApplyRoleDao getDao() {
		// TODO Auto-generated method stub
		return this.applyRoleDao;
	}

}
