package com.amith.personal.webapp.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.amith.personal.application.PersonalApplication;
import com.amith.personal.application.SecurityApplication;
import com.amith.personal.application.impl.PersonalApplicationImpl;
import com.amith.personal.application.impl.SecurityApplicationImpl;

@Configuration
@ImportResource({ "classpath*:applicationContext.xml"})
@EnableTransactionManagement
public class ApplicationConfig {

	@Bean
	public PersonalApplication personalApplication() {
		return new PersonalApplicationImpl();
	}
	
	@Bean
	public SecurityApplication securityApplication() {
		return new SecurityApplicationImpl();
	}
	
}
