package com.amith.personal.application.impl;

import org.junit.Test;
import static org.junit.Assert.*;

import com.amith.personal.AbstractIntegrationTest;
import com.amith.personal.UserNotFoundException;
import com.amith.personal.domain.User;

public class SecurityApplicationImplTest extends AbstractIntegrationTest {

	private static final String USERNAME = "username";
	private static final String PASSWORD = "password";
	
	@Test
	public void testCreateUser() {
		securityApplication.createUser(new User(USERNAME, PASSWORD));
		assertEquals(1, User.findAll(User.class).size());
	}
	
	@Test(expected = UserNotFoundException.class)
	public void testLogin() {
		User user = securityApplication.login(USERNAME, PASSWORD);
		assertNull(user);
	}
}
