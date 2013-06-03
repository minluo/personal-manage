package com.amith.personal.webapp.controller;

import javax.inject.Inject;

import com.amith.personal.application.PersonalApplication;

/**
 * 父类控制器
 * 
 * @author amith
 * 
 */
public class BaseController {

	@Inject
	protected PersonalApplication personalApplication;
}
