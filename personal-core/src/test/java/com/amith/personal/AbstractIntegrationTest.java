package com.amith.personal;


import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

import com.amith.domain.InstanceFactory;
import com.amith.personal.application.PersonalApplication;
import com.amith.spring.SpringInstanceProvider;


@SpringApplicationContext("/applicationContext.xml")
public abstract class AbstractIntegrationTest extends UnitilsJUnit4 {

	protected static final String TEST_USERNAME = "test";
	
	@SpringApplicationContext
	private ApplicationContext applicationContext;
	
	@SpringBeanByType
	protected PersonalApplication personalApplication;
	
	@Before
	public void setUp() throws Exception {
		SpringInstanceProvider provider = new SpringInstanceProvider(applicationContext);
		InstanceFactory.registerInstanceProvider(provider);
	}
	
	@After
	public void tearDown() throws Exception {
		InstanceFactory.registerInstanceProvider(null);
	}

}
