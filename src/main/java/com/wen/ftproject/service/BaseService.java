package com.wen.ftproject.service;

import java.util.List;

import com.wen.ftproject.entity.Role;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.result.ResultPageData;

public interface BaseService<T> {
	Result<Object> add(T t);
	
	Result<Object> deleteById(String id);
	
	Result<Object> deleteByIds(String[] ids);
	
	Result<Object> updateById(T t);
	
	Result<List<T>> findAll();
	
	Result<T> findById(String id);
	
	Result<List<T>> findByIds(String[] ids);
	
	Result<ResultPageData<T>> findByPages(T t, PageData pageData, Condition condition);
	
}
