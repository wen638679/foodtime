package com.wen.ftproject.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wen.ftproject.dao.IdentityDao;
import com.wen.ftproject.entity.Identity;
import com.wen.ftproject.entity.Role;

@Repository("identityDao")
public class IdentityDaoImpl extends BaseDaoImpl<Identity> implements IdentityDao{

	public IdentityDaoImpl() {
		// TODO Auto-generated constructor stub
		super.setNs(Identity.class.getName());
	}
	
	@Override
	public List<Identity> findByNumber(Serializable number) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByNumber", number);
	}

	@Override
	public List<Identity> findByName(Serializable name) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByName", name);
	}

	@Override
	public List<Identity> findByNumbers(Serializable numbers) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("numbers", numbers);
		return getSqlSession().selectList(getNs()+".findByNumbers", numbers);
	}

	@Override
	public int updateByNumber(Identity identity) {
		// TODO Auto-generated method stub
		return getSqlSession().update(getNs()+".updateByNumber", identity);
	}

	@Override
	public int deleteByName(Serializable name) {
		// TODO Auto-generated method stub
		return getSqlSession().delete(getNs()+"deleteByName", name);
	}

	@Override
	public int deleteByNumber(Serializable number) {
		// TODO Auto-generated method stub
		return getSqlSession().delete(getNs()+"deleteByNumber", number);
	}

}
