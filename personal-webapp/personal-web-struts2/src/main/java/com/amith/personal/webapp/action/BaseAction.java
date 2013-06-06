package com.amith.personal.webapp.action;

import javax.inject.Inject;

import org.apache.struts2.convention.annotation.ParentPackage;

import com.amith.personal.application.PersonalApplication;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 基础父类
 * 
 * @author amith
 * 
 */
@ParentPackage("web")
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Inject
	protected PersonalApplication personalApplication;

}
