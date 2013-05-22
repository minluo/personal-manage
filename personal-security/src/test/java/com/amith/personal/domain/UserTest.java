package com.amith.personal.domain;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import com.amith.personal.AbstractIntegrationTest;

public class UserTest extends AbstractIntegrationTest {

	@Test
	public void testActivate() {
		User user = createUser();
		assertFalse(user.isActivated());
		user.activate();
		assertTrue(user.isActivated());
	}
	
	@Test
	public void testUnusable() {
		User user = createUser();
		user.usable();
		assertTrue(user.isUsabled());
		user.unusable();
		assertFalse(user.isUsabled());
	}
	
	@Test
	public void testUsable() {
		User user = createUser();
		user.unusable();
		assertFalse(user.isUsabled());
		user.usable();
		assertTrue(user.isUsabled());
	}
	
	@Test
	public void testIsExist() {
		createUser();
		assertTrue(User.isExist(USERNAME));
		assertFalse(User.isExist(USERNAME2));
	}
	
	@Test
	public void testGetByUsername() {
		createUser();
		assertNotNull(User.getByUsername(USERNAME));
		assertNull(User.getByUsername(USERNAME2));
	}
	
	@After
	public void cleanData() {
		removeAllUser();
	}
}
