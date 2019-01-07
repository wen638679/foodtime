package com.wen.ftproject.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wen.ftproject.dao.ApplyRoleDao;
import com.wen.ftproject.entity.ApplyRole;

@Repository("applyRoleDao")
public class ApplyRoleDaoImpl extends BaseDaoImpl<ApplyRole> implements ApplyRoleDao{
	
	public ApplyRoleDaoImpl() {
		// TODO Auto-generated constructor stub
		super.setNs(ApplyRole.class.getName());
	}

	@Override
	public List<ApplyRole> findByUserId(Serializable id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByUserId", id);
	}

	@Override
	public List<ApplyRole> findByUserIds(Serializable ids) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByUserIds", ids);
	}

	@Override
	public List<ApplyRole> findByRoleId(Serializable id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByRoleId", id);
	}

	@Override 
	public List<ApplyRole> findByRoleIds(Serializable ids) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getNs()+".findByRoleIds", ids);
	}
	
	

}
