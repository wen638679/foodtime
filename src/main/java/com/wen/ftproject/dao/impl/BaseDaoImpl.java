package com.wen.ftproject.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import com.wen.ftproject.dao.BaseDao;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;

public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	private String ns;
	
	public void setNs(String ns) {
		this.ns = ns;
	}
	
	public String getNs() {
		return this.ns;
	}
	
	@Override
	public int add(T t) {
		return getSqlSession().insert(ns+".insert", t);
	}
	
	@Override
	public int updateById(T t) {
		// TODO Auto-generated method stub
		return getSqlSession().update(ns+".updateById", t);
	}
	
	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return getSqlSession().delete(ns+".deleteById", id);
	}
	
	@Override
	public int deleteByIds(Serializable ids) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("ids", ids);
		return getSqlSession().delete(ns+".deleteByIds", map);
	}
	
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(ns+".findAll");
	}
	
	@Override
	public List<T> findById(Serializable id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(ns+".findById", id);
	}
	
	@Override
	public List<T> findByIds(Serializable ids) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("ids", ids);
		return getSqlSession().selectList(ns+".findByIds", map);
	}
	
	@Override
	public List<T> findByPages(T t, PageData pageData, Condition condition) {
		System.out.println(condition);
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		if(t != null) {
			map.put("content", t);
		}
		if(pageData != null) {
			map.put("pageData", pageData);
		}
		if(condition != null) {
			map.put("condition", condition);
		}
		return getSqlSession().selectList(ns+".findByPages", map);
	}
	
	@Override
	public int findCounts(T t, Condition condition) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		if(t != null) {
			map.put("content", t);
		}
		if(condition != null) {
			map.put("condition", condition);
		}
		return getSqlSession().selectOne(ns+".findCounts", map);
	}
}
