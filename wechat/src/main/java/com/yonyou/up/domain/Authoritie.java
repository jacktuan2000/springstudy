package com.yonyou.up.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Authoritie extends BaseDomain{
	private String authority;
	@ManyToOne(optional=false,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user; 
	
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
