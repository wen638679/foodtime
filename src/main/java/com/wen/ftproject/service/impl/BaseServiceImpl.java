package com.wen.ftproject.service.impl;

import java.util.List;

import com.wen.ftproject.dao.BaseDao;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.result.ResultPageData;
import com.wen.ftproject.service.BaseService;
import com.wen.ftproject.utils.Constants;

public abstract class BaseServiceImpl<T> implements BaseService<T>{
	
	@Override
	public Result<Object> deleteById(String id) {
		// TODO Auto-generated method stub
		int i = getDao().deleteById(id);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<Object> deleteByIds(String[] ids) {
		// TODO Auto-generated method stub
		int i = getDao().deleteByIds(ids);
		Result<Object> result = new Result<>();
		if(i>0) {
			Constants.createSuccessResult(result);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<T>> findAll() {
		List<T> list = getDao().findAll();
		Result<List<T>> result = Constants.createSuccessResult();
		result.setData(list);
		return result;
	}

	@Override
	public Result<T> findById(String id) {
		List<T> list = getDao().findById(id);
		Result<T> result = new Result<>();
		if(list != null && list.size()>0) {
			Constants.createSuccessResult(result);
			result.setData(list.get(0));
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<List<T>> findByIds(String[] ids) {
		List<T> list = getDao().findByIds(ids);
		Result<List<T>> result = new Result<>();
		if(list != null && list.size() > 0) {
			Constants.createSuccessResult(result);
			result.setData(list);
		}else {
			Constants.createFailResult(result);
		}
		return result;
	}

	@Override
	public Result<ResultPageData<T>> findByPages(T t, PageData pageData, Condition condition) {
		ResultPageData<T> rpd = new ResultPageData<>();
		int i = getDao().findCounts(t, condition);
		if(pageData.getPageNum() != null && pageData.getPageSize() != null 
				&& pageData.getPageNum()>0 && pageData.getPageSize()>0) {
			pageData.setPageStart((pageData.getPageNum()-1)*pageData.getPageSize());
			rpd.setPageNum(pageData.getPageNum());
			rpd.setPageSize(pageData.getPageSize());
		}else {
			rpd.setPageNum(0);
			rpd.setPageSize(0);
		}
		Result<ResultPageData<T>> result = new Result<>();
		if(i > 0) {
			rpd.setTotalPage(i);
			List<T> list = getDao().findByPages(t, pageData, condition);
			if(list != null) {
				rpd.setData(list);
				Constants.createSuccessResult(result);
			}else {
				Constants.createFailResult(result);
			}
		}else {
			rpd.setTotalPage(0);
			Constants.createSuccessResult(result);
		}
		result.setData(rpd);
		return result;
	}

	public abstract BaseDao<T> getDao();
	
}
