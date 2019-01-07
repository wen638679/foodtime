package com.wen.ftproject.entity;

import java.util.Date;

public class ApplyRole {
	private String arId;
	private String userId;
	private User user;
	private String roleId;
	private Role role;
	private String identityNumber;
	private String identityName;
	private String identityFront;
	private String identityTergal;
	private Integer isAgreed;
	private String arCause;
	private Date arCreateDate;
	private Date arUpdateDate;
	
	public String getArId() {
		return arId;
	}
	public void setArId(String arId) {
		this.arId = arId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
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
	public String getIdentityFront() {
		return identityFront;
	}
	public void setIdentityFront(String identityFront) {
		this.identityFront = identityFront;
	}
	public String getIdentityTergal() {
		return identityTergal;
	}
	public void setIdentityTergal(String identityTergal) {
		this.identityTergal = identityTergal;
	}
	public Integer getIsAgreed() {
		return isAgreed;
	}
	public void setIsAgreed(Integer isAgreed) {
		this.isAgreed = isAgreed;
	}
	public Date getArCreateDate() {
		return arCreateDate;
	}
	public void setArCreateDate(Date arCreateDate) {
		this.arCreateDate = arCreateDate;
	}
	public Date getArUpdateDate() {
		return arUpdateDate;
	}
	public void setArUpdateDate(Date arUpdateDate) {
		this.arUpdateDate = arUpdateDate;
	}
	public String getArCause() {
		return arCause;
	}
	public void setArCause(String arCause) {
		this.arCause = arCause;
	}
}
