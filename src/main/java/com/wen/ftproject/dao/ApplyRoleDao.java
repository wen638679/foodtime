package com.wen.ftproject.dao;

import java.io.Serializable;
import java.util.List;

import com.wen.ftproject.entity.ApplyRole;

public interface ApplyRoleDao extends BaseDao<ApplyRole>{

	List<ApplyRole> findByUserId(Serializable id);
	
	List<ApplyRole> findByUserIds(Serializable ids);
	
	List<ApplyRole> findByRoleId(Serializable id);
	
	List<ApplyRole> findByRoleIds(Serializable ids);
	
}
