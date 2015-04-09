package com.yonyou.up.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Resource extends BaseDomain{
	private String Name;
	
	private String type;
	
	private String content;
	
	private String remark;
	

	private boolean enabled;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="WE_Resource_authority",joinColumns=@JoinColumn(name="resources_id"),
			   inverseJoinColumns=@JoinColumn(name="authority_id"))
	private Set<Authoritie>  authorities;

	
	public Set<Authoritie> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authoritie> authorities) {
		this.authorities = authorities;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
