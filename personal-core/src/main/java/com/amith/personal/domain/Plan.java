package com.amith.personal.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 计划实体
 * 
 * @author amith
 * 
 */
@Entity
@Table(name = "plans")
public class Plan extends PersonalAggregateRootEntity {

	private static final long serialVersionUID = 1L;

	
}
