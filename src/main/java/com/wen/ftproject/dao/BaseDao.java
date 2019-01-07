package com.wen.ftproject.dao;

import java.io.Serializable;
import java.util.List;

import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;

public interface BaseDao<T> {
	int add(T t);
	int updateById(T t);
	int deleteById(Serializable id);
	int deleteByIds(Serializable ids);
	List<T> findAll();
	List<T> findById(Serializable id);
	List<T> findByIds(Serializable ids);
	List<T> findByPages(T t,PageData pageData, Condition condition);
	int findCounts(T t, Condition condition);
}
