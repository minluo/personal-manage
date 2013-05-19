package com.amith.personal.application;

import com.amith.personal.domain.User;

/**
 * 安全层接口
 * 
 * @author amith
 *
 */
public interface SecurityApplication {
	
	/**
	 * 创建用户
	 * @param user 要创建的用户
	 */
	void createUser(User user);
	
	/**
	 * 用户登录
	 * @param username 用户名
	 * @param password 密码
	 * @return 
	 */
	User login(String username, String password);
	
}
