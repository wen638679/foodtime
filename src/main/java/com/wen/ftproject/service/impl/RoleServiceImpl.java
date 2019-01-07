package com.wen.ftproject.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.ftproject.dao.BaseDao;
import com.wen.ftproject.dao.RoleDao;
import com.wen.ftproject.entity.Role;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.result.ResultPageData;
import com.wen.ftproject.service.RoleService;
import com.wen.ftproject.utils.Constants;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService{
	
	@Resource(name="roleDao")
	public RoleDao roleDao;

	@Override
	public Result<Object> add(Role t) {
		// TODO Auto-generated method stub
		String time = System.currentTimeMillis()+"";
		t.setRoleId(time);
		int i = getDao().add(t);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}
//
//	@Override
//	public Result<Object> deleteById(int id) {
//		// TODO Auto-generated method stub
//		int i = roleDao.deleteById(id);
//		Result<Object> result = new Result<>();
//		if(i>0) {
//			Constants.createSuccessResult(result);
//		}else {
//			Constants.createFailResult(result);
//		}
//		return result;
//	}
//
//	@Override
//	public Result<Object> deleteByIds(int[] ids) {
//		// TODO Auto-generated method stub
//		int i = roleDao.deleteByIds(ids);
//		Result<Object> result = new Result<>();
//		if(i>0) {
//			Constants.createSuccessResult(result);
//		}else {
//			Constants.createFailResult(result);
//		}
//		return result;
//	}
//
	@Override
	public Result<Object> updateById(Role role) {
		role.setrUpdateDate(new Date(System.currentTimeMillis()));
		// TODO Auto-generated method stub
		int i = getDao().updateById(role);
		Result<Object> result = new Result<>();
		if(i > 0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}
//
//	@Override
//	public Result<List<Role>> findAll() {
//		// TODO Auto-generated method stub
//		List<Role> list = roleDao.findAll();
//		Result<List<Role>> result = Constants.createSuccessResult();
//		result.setData(list);
//		return result;
//	}
//
//	@Override
//	public Result<Role> findById(String id) {
//		// TODO Auto-generated method stub
//		List<Role> list = roleDao.findById(id);
//		Result<Role> result = new Result<>();
//		if(list != null && list.size()>0) {
//			Constants.createSuccessResult(result);
//			result.setData(list.get(0));
//		}else {
//			Constants.createFailResult(result);
//		}
//		return result;
//	}
//
//	@Override
//	public Result<List<Role>> findByIds(String[] ids) {
//		// TODO Auto-generated method stub
//		List<Role> list = roleDao.findByIds(ids);
//		Result<List<Role>> result = new Result<>();
//		if(list != null && list.size() > 0) {
//			Constants.createSuccessResult(result);
//			result.setData(list);
//		}else {
//			Constants.createFailResult(result);
//		}
//		return result;
//	}
//
//	@Override
//	public Result<ResultPageData<Role>> findByPages(Role t, PageData pageData, Condition condition) {
//		// TODO Auto-generated method stub
//		ResultPageData<Role> rpd = new ResultPageData<>();
//		int i = roleDao.findCounts(t, condition);
//		if(pageData.getPageNum() != null && pageData.getPageSize() != null 
//				&& pageData.getPageNum()>0 && pageData.getPageSize()>0) {
//			pageData.setPageStart((pageData.getPageNum()-1)*pageData.getPageSize());
//			rpd.setPageNum(pageData.getPageNum());
//			rpd.setPageSize(pageData.getPageSize());
//		}else {
//			rpd.setPageNum(0);
//			rpd.setPageSize(0);
//		}
//		Result<ResultPageData<Role>> result = new Result<>();
//		if(i > 0) {
//			rpd.setTotalPage(i);
//			List<Role> list = roleDao.findByPages(t, pageData, condition);
//			if(list != null) {
//				rpd.setData(list);
//				Constants.createSuccessResult(result);
//			}else {
//				Constants.createFailResult(result);
//			}
//		}else {
//			rpd.setTotalPage(0);
//			Constants.createSuccessResult(result);
//		}
//		result.setData(rpd);
//		return result;
//	}

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
	public RoleDao getDao() {
		// TODO Auto-generated method stub
		return roleDao;
	}

}
