package com.wen.ftproject.service;

import java.util.List;

import com.wen.ftproject.entity.ApplyRole;
import com.wen.ftproject.result.Result;

public interface ApplyRoleService extends BaseService<ApplyRole>{
	Result<List<ApplyRole>> findByUserId(String id);
	
	Result<List<ApplyRole>> findByUserIds(String[] ids);
	
	Result<List<ApplyRole>> findByRoleId(String id);
	
	Result<List<ApplyRole>> findByRoleIds(String[] ids);
}
