package com.amith.personal;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

import com.amith.domain.InstanceFactory;
import com.amith.personal.application.SecurityApplication;
import com.amith.personal.domain.User;
import com.amith.spring.SpringInstanceProvider;


@SpringApplicationContext("/applicationContext.xml")
public abstract class AbstractIntegrationTest extends UnitilsJUnit4 {

	protected static final String USERNAME = "username";
	protected static final String USERNAME2 = "username2";
	protected static final String PASSWORD = "password";

	
	@SpringApplicationContext
	private ApplicationContext applicationContext;
	
	@SpringBeanByType
	protected SecurityApplication securityApplication;
	
	@Before
	public void setUp() throws Exception {
		SpringInstanceProvider provider = new SpringInstanceProvider(applicationContext);
		InstanceFactory.registerInstanceProvider(provider);
	}
	
	@After
	public void tearDown() throws Exception {
		InstanceFactory.registerInstanceProvider(null);
	}

	protected User createUser() {
		User user = new User(USERNAME, PASSWORD);
		securityApplication.createUser(user);
		return user;
	}
	
	protected void removeAllUser() {
		List<User> users = User.findAll(User.class);
		for (User each : users) {
			each.remove();
		}
	}
}
