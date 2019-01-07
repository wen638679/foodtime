package com.wen.ftproject.entity;

import java.util.Date;

public class Identity {
	private String identityId;
	private String identityNumber;
	private String identityName;
	private String identityTergal;
	private String identityFront;
	private Date iCreateDate;
	private Date iUpdateDate;
	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getIdentityName() {
		return identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}
	public String getIdentityTergal() {
		return identityTergal;
	}
	public void setIdentityTergal(String identityTergal) {
		this.identityTergal = identityTergal;
	}
	public String getIdentityFront() {
		return identityFront;
	}
	public void setIdentityFront(String identityFront) {
		this.identityFront = identityFront;
	}
	public Date getiCreateDate() {
		return iCreateDate;
	}
	public void setiCreateDate(Date iCreateDate) {
		this.iCreateDate = iCreateDate;
	}
	public Date getiUpdateDate() {
		return iUpdateDate;
	}
	public void setiUpdateDate(Date iUpdateDate) {
		this.iUpdateDate = iUpdateDate;
	}
	@Override
	public String toString() {
		return "Identity [identityId=" + identityId + ", identityNumber=" + identityNumber + ", identityName="
				+ identityName + ", identityTergal=" + identityTergal + ", identityFront=" + identityFront
				+ ", iCreateDate=" + iCreateDate + ", iUpdateDate=" + iUpdateDate + "]";
	}
	
	
}
