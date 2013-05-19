package com.amith.personal.domain;

import javax.persistence.MappedSuperclass;

import com.amith.domain.AggregateRootEntity;

/**
 * 系统聚合根父类,用于处理公共逻辑
 * 
 * @author amith
 * 
 */
@MappedSuperclass
public class PersonalAggregateRootEntity extends AggregateRootEntity {

	private static final long serialVersionUID = 1L;
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
