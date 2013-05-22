package com.amith.personal.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 任务实体
 * 
 * @author amith
 * 
 */
@Entity
@Table(name = "tasks")
public class Task extends PersonalAggregateRootEntity {

	private static final long serialVersionUID = 1L;

	
	
	
}
