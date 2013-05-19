package com.amith.personal.application.impl;

import com.amith.domain.AggregateRootEntity;
import com.amith.personal.application.PersonalApplication;

/**
 * 领域层接口实现
 * 
 * @author amith
 * 
 */
public class PersonalApplicationImpl implements PersonalApplication {

	public void saveEntity(AggregateRootEntity entity) {
		entity.save();
	}

	public void removeEntity(AggregateRootEntity entity) {
		entity.remove();
	}

}
