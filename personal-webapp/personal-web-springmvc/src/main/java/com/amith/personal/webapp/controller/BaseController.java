package com.amith.personal.webapp.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import com.amith.personal.application.PersonalApplication;
import com.amith.personal.application.SecurityApplication;

/**
 * 父类控制器
 * 
 * @author amith
 * 
 */
public class BaseController {

	protected static final String USERNAME = "USERNAME";
	
	@Inject
	protected PersonalApplication personalApplication;
	
	@Inject
	protected SecurityApplication securityApplication;
	
	protected void putDataToSession(HttpServletRequest request, String key, Object value) {
		request.getSession().setAttribute(key, value);
	}
	
	protected Object getDataForSession(HttpServletRequest request, String key) {
		return request.getSession().getAttribute(key);
	}
	
	protected boolean isNotNull(Object object) {
		return object != null;
	}
	
	protected boolean isNull(Object object) {
		return !isNotNull(object);
	}
}
