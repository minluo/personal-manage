package com.amith.personal.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 项目实体,一个项目可由多个计划和任务组成
 * 
 * @author amith
 * 
 */
@Entity
@Table(name = "projects")
public class Project extends PersonalAggregateRootEntity {

	private static final long serialVersionUID = 1L;

	
	
}
