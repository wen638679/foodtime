package com.wen.ftproject.service;

import java.util.List;

import com.wen.ftproject.entity.Identity;
import com.wen.ftproject.result.Result;

public interface IdentityService extends BaseService<Identity>{
	Result<Identity> findByNumber(String number);
	
	Result<List<Identity>> findByName(String name);
	
	Result<List<Identity>> findByNumbers(String[] numbers);
	
	Result<Object> updateByNumber(Identity identity);
	
	Result<Object> deleteByName(String name);
	
	Result<Object> deleteByNumber(String number);
	
	
}
