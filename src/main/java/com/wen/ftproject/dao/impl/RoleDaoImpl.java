package com.wen.ftproject.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.wen.ftproject.dao.RoleDao;
import com.wen.ftproject.entity.Role;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{
	
	public RoleDaoImpl() {
		super.setNs(Role.class.getName());
	}

	@Override
	public int deleteByName(Serializable id) {
		// TODO Auto-generated method stub
		return getSqlSession().delete(getNs()+".deleteByName", id);
	}

}
