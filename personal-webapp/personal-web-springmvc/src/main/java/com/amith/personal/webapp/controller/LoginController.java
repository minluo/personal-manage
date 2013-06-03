package com.amith.personal.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录
 * 
 * @author amith
 * 
 */
@Controller
public class LoginController extends BaseController {

	@RequestMapping("/login")
	@ResponseBody
	public String login(String username, String password) {
		
		return "ok";
	}
}
