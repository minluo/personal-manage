package com.amith.personal.application;

import com.amith.domain.AggregateRootEntity;

/**
 * 领域层接口
 * 
 * @author amith
 * 
 */
public interface PersonalApplication {

	/**
	 * 保存、更新领域实体
	 * @param entity 聚合根实体
	 */
	void saveEntity(AggregateRootEntity entity);
	
	/**
	 * 删除领域实体
	 * @param entity 聚合根实体
	 */
	void removeEntity(AggregateRootEntity entity);
}
