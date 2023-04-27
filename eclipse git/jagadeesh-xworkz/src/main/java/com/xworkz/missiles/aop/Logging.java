package com.xworkz.missiles.aop;

import javax.ejb.BeforeCompletion;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy  //or @aspect
public class Logging {

	@BeforeCompletion //or before("execution") to execute before any other method
	public void loger() {
		
		System.out.println("running the logger");
	}
	
	// @pointcut - to execute a perticular class
}
