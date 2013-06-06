package com.amith.personal.webapp.controller;

import javax.inject.Inject;

import com.amith.personal.application.PersonalApplication;
import com.amith.personal.application.SecurityApplication;

/**
 * 父类控制器
 * 
 * @author amith
 * 
 */
public class BaseController {

	@Inject
	protected PersonalApplication personalApplication;
	
	@Inject
	protected SecurityApplication securityApplication;
	
	protected boolean isNotNull(Object object) {
		return object != null;
	}
	
	protected boolean isNull(Object object) {
		return !isNotNull(object);
	}
}
