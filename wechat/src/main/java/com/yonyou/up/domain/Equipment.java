package com.yonyou.up.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Equipment extends BaseDomain {
	// 设备名称
	@Column(length=100)
	private String name;
	// 设备型号
	@Column(length=50)
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
