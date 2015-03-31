package com.yonyou.up.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SystemAuth extends BaseDomain {
	@Column(length=100)
	private String openID;
	@Column(length=50)
	private String systemCode;
	@Column(length=100)
	private String systemName;
	@Column(length=50)
	private String userName;
	@Column(length=50)
	private String passWord;
	
	public String getOpenID() {
		return openID;
	}
	public void setOpenID(String openID) {
		this.openID = openID;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
