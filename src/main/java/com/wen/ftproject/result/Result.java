package com.wen.ftproject.result;

public class Result<T>{
	private Integer staust;
	private String msg;
	private T data;
	
	public Integer getStaust() {
		return staust;
	}
	
	public void setStaust(Integer staust) {
		this.staust = staust;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
}
