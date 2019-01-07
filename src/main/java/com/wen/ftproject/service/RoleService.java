package com.wen.ftproject.service;

import com.wen.ftproject.entity.Role;
import com.wen.ftproject.result.Result;

public interface RoleService extends BaseService<Role>{
	Result<Object> deleteByName(String name);
}
