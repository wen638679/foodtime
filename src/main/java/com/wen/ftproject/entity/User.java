package com.wen.ftproject.entity;

import java.util.Date;

public class User {
	private String userId;
	private String uAccount;
	private String uPassword;
	private String uNick;
	private String uHeadPort;
	private String uAddress;
	private Date uCreateDate;
	private Date uUpdateDate;
	private String roleId;
	private Role role;
	private String identityId;
	private Identity identity;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getuAccount() {
		return uAccount;
	}
	public void setuAccount(String uAccount) {
		this.uAccount = uAccount;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuNick() {
		return uNick;
	}
	public void setuNick(String uNick) {
		this.uNick = uNick;
	}
	public String getuHeadPort() {
		return uHeadPort;
	}
	public void setuHeadPort(String uHeadPort) {
		this.uHeadPort = uHeadPort;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public Date getuCreateDate() {
		return uCreateDate;
	}
	public void setuCreateDate(Date uCreateDate) {
		this.uCreateDate = uCreateDate;
	}
	public Date getuUpdateDate() {
		return uUpdateDate;
	}
	public void setuUpdateDate(Date uUpdateDate) {
		this.uUpdateDate = uUpdateDate;
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
	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	public Identity getIdentity() {
		return identity;
	}
	public void setIdentity(Identity identity) {
		this.identity = identity;
	}
}
