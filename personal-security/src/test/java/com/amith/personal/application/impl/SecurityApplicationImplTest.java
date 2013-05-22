package com.amith.personal.application.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;

import com.amith.personal.AbstractIntegrationTest;
import com.amith.personal.domain.User;

public class SecurityApplicationImplTest extends AbstractIntegrationTest {

	@Test
	public void testCreateUser() {
		securityApplication.createUser(new User(USERNAME, PASSWORD));
		assertEquals(1, User.findAll(User.class).size());
	}
	
	@Test
	public void testLogin() {
		User user = createUser();
		user.activate();
		assertNotNull(securityApplication.login(USERNAME, PASSWORD));
	}
	
	@After
	public void cleanData() {
		removeAllUser();
	}
	
}
