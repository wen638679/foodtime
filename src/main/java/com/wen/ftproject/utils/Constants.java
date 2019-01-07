package com.wen.ftproject.utils;

import com.wen.ftproject.result.Result;

public class Constants {
	public static final int RESULT_STATUS_SUCCESS = 0;
	public static final int RESULT_STATUS_FAIL = 1;
	public static final int RESULT_STATUS_FAIL_PARAM = 2;
	public static final int RESULT_STATUS_FAIL_VERIFY = 3;
	public static final int RESULT_STATUS_FAIL_AUTH = 4;
	public static final int RESULT_STATUS_FAIL_SERVICE = 5;
	public static final int RESULT_STATUS_FAIL_OTHER = 6;
	
	public static final String RESULT_MSG_SUCCESS = "成功";
	public static final String RESULT_MSG_FAIL = "失败";
	public static final String RESULT_MSG_FAIL_PARAM = "参数错误";
	public static final String RESULT_MSG_FAIL_VERIFY = "验证错误";
	public static final String RESULT_MSG_FAIL_AUTH = "权限不足";
	public static final String RESULT_MSG_FAIL_SERVICE = "服务器错误";
	
	public static <T> Result<T> createSuccessResult(){
		return createSuccessResult(null);
	}
	
	public static <T> Result<T> createSuccessResult(Result<T> result){
		return createResult(result, RESULT_STATUS_SUCCESS, RESULT_MSG_SUCCESS);
	}
	
	public static <T> Result<T> createFailResult(){
		return createFailResult(null);
	}
	
	public static <T> Result<T> createFailResult(Result<T> result){
		return createResult(result, RESULT_STATUS_FAIL, RESULT_MSG_FAIL);
	}
	
	public static <T> Result<T> createParamFailResult(Result<T> result){
		return createResult(result, RESULT_STATUS_FAIL_PARAM, RESULT_MSG_FAIL_PARAM);
	}
	
	public static <T> Result<T> createVerifyFailResult(Result<T> result){
		return createResult(result, RESULT_STATUS_FAIL_VERIFY, RESULT_MSG_FAIL_VERIFY);
	}
	
	public static <T> Result<T> createAuthFailResult(Result<T> result){
		return createResult(result, RESULT_STATUS_FAIL_AUTH, RESULT_MSG_FAIL_AUTH);
	}
	
	public static <T> Result<T> createServiceFailResult(Result<T> result){
		return createResult(result, RESULT_STATUS_FAIL_SERVICE, RESULT_MSG_FAIL_SERVICE);
	}
	
	public static <T> Result<T> createResult(Result<T> result, int status, String msg){
		if(result == null) {
			result = new Result<>();
		}
		result.setStaust(status);
		result.setMsg(msg);
		return result;
	}
}
