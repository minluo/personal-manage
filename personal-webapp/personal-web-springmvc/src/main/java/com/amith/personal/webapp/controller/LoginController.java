package com.amith.personal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amith.personal.CredentialsUnmatchException;
import com.amith.personal.UserNotActivatedException;
import com.amith.personal.UserNotFoundException;
import com.amith.personal.UserUnusableException;
import com.amith.personal.domain.User;
import com.amith.personal.webapp.dto.ResultMsgDto;

/**
 * 登录
 * 
 * @author amith
 * 
 */
@Controller
public class LoginController extends BaseController {

	private static final String USERNAME_NOTEXIST = "用户不存在";
	private static final String PASSWORD_ERROR = "密码错误";
	private static final String USER_NOTACTIVE = "用户未激活";
	private static final String USER_UNUSABLE = "用户不可用";
	
	@RequestMapping("/login")
	@ResponseBody
	public ResultMsgDto login(String username, String password, HttpServletRequest request) {
		String msg = null;
		try {
			User user = securityApplication.login(username, password);
			putDataToSession(request, USERNAME, user.getUsername());
		} catch (UserNotFoundException e) {
			msg = USERNAME_NOTEXIST;
		} catch (UserNotActivatedException e) {
			msg = USER_NOTACTIVE;
		} catch (UserUnusableException e) {
			msg = USER_UNUSABLE;
		} catch (CredentialsUnmatchException e) {
			msg = PASSWORD_ERROR;
		}
		return comebackResult(msg);
	}

	private ResultMsgDto comebackResult(String msg) {
		if (isNotNull(msg)) {
			return ResultMsgDto.createFailure(msg);
		}
		return ResultMsgDto.createSuccess(msg);
	}
}
