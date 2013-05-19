package com.amith.personal.domain;

import javax.persistence.MappedSuperclass;

import com.amith.domain.AbstractEntity;

/**
 * 系统抽象父类,用于处理公共逻辑
 * 
 * @author amith
 * 
 */
@MappedSuperclass
public abstract class PersonalAbstractEntity extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
