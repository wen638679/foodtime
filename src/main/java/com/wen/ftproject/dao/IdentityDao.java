package com.wen.ftproject.dao;

import java.io.Serializable;
import java.util.List;

import com.wen.ftproject.entity.Identity;

public interface IdentityDao extends BaseDao<Identity>{
	List<Identity> findByNumber(Serializable number);
	List<Identity> findByName(Serializable name);
	List<Identity> findByNumbers(Serializable numbers);
	int updateByNumber(Identity identity);
	int deleteByName(Serializable name);
	int deleteByNumber(Serializable number);
}
