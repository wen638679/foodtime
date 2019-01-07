package com.wen.ftproject.dao;

import java.io.Serializable;

import com.wen.ftproject.entity.Role;
import com.wen.ftproject.service.BaseService;

public interface RoleDao extends BaseDao<Role>{
	int deleteByName(Serializable id);
}
