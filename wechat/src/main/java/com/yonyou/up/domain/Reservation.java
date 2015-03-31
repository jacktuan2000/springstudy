package com.yonyou.up.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends BaseDomain {
	@Column(nullable = false,length=100)
	private String openID;
	// 客户名称
	@Column(length=50)
	private String customer;
	
	@Column(length=20)
	private String tel;
	
	@Column(length=200)
	private String address;
	// 设备信息
	@OneToOne
	private Equipment equipment;
	
	// 备注
	@Column(length=1000)
	private String comment;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ServiceInfo serviceInfo;

	public String getOpenID() {
		return openID;
	}

	public void setOpenID(String openID) {
		this.openID = openID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
}
