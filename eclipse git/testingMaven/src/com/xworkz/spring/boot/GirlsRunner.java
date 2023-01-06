package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Girls;

public class GirlsRunner {

	public static void main(String[] args) {
		ApplicationContext spring =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Girls ref=spring.getBean(Girls.class);
		System.out.println(ref);
	}

}
