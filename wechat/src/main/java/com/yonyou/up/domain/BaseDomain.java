package com.yonyou.up.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@MappedSuperclass
public class BaseDomain {

	@Id
    @GeneratedValue
    private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime = new Date();

    public Long getId() {
        return id;
    }
    
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
