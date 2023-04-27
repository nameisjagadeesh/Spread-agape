package com.xworkz.missiles.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.missiles.configuration.MissileConfiguration;

public class AopRunner {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MissileConfiguration.class);
		
		ShoppingCart cart=context.getBean(ShoppingCart.class);
		cart.checkOut();
	}
}
