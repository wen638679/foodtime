package com.wen.ftproject.entity;

import java.util.Date;

public class Role {
	private String roleId;
	private String rName;
	private String rDescript;
	private Date rCreateDate;
	private Date rUpdateDate;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrDescript() {
		return rDescript;
	}
	public void setrDescript(String rDescript) {
		this.rDescript = rDescript;
	}
	public Date getrCreateDate() {
		return rCreateDate;
	}
	public void setrCreateDate(Date rCreateDate) {
		this.rCreateDate = rCreateDate;
	}
	public Date getrUpdateDate() {
		return rUpdateDate;
	}
	public void setrUpdateDate(Date rUpdateDate) {
		this.rUpdateDate = rUpdateDate;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", rName=" + rName + ", rDescript=" + rDescript + ", rCreateDate="
				+ rCreateDate + ", rUpdateDate=" + rUpdateDate + "]";
	}
}
