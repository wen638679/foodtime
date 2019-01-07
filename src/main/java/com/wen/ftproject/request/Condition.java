package com.wen.ftproject.request;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Condition {
	private String createLess;
	private String createGreater;
	private String updateLess;
	private String updateGreater;
	
	
	
	
	public String getCreateLess() {
		return createLess;
	}




	public void setCreateLess(long createLess) {
		Date date = new Date(createLess);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.createLess = sdf.format(date);
	}




	public String getCreateGreater() {
		return createGreater;
	}




	public void setCreateGreater(long createGreater) {
		Date date = new Date(createGreater);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.createGreater = sdf.format(date);
	}




	public String getUpdateLess() {
		return updateLess;
	}




	public void setUpdateLess(long updateLess) {
		Date date = new Date(updateLess);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.updateLess = sdf.format(date);
	}




	public String getUpdateGreater() {
		return updateGreater;
	}




	public void setUpdateGreater(long updateGreater) {
		Date date = new Date(updateGreater);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.updateGreater = sdf.format(date);
	}




	@Override
	public String toString() {
		return "Condition [createLess=" + createLess + ", createGreater=" + createGreater + ", updateLess=" + updateLess
				+ ", updateGreater=" + updateGreater + "]";
	}	
}
