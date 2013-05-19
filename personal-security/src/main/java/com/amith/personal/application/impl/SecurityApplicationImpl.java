package com.amith.personal.application.impl;

import com.amith.personal.CredentialsUnmatchException;
import com.amith.personal.UserNotActivatedException;
import com.amith.personal.UserNotFoundException;
import com.amith.personal.UserUnusableException;
import com.amith.personal.application.SecurityApplication;
import com.amith.personal.domain.User;
import com.amith.personal.util.SHA1;

/**
 * 安全层接口实现
 * 
 * @author amith
 * 
 */
public class SecurityApplicationImpl implements SecurityApplication {

	public void createUser(User user) {
		user.setPassword(SHA1.encryptString(user.getPassword()));
		user.save();
	}

	public User login(String username, String password) {
		User user = User.getByUsername(username);
		if (user == null) {
			throw new UserNotFoundException();
		}
		if (!user.isActivated()) {
			throw new UserNotActivatedException();
		}
		if (!user.isUsabled()) {
			throw new UserUnusableException();
		}
		if (user.getPassword().equals(SHA1.encryptString(password))) {
			return user;
		}
		throw new CredentialsUnmatchException();
	}

}
