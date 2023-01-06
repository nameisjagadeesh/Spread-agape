package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.SpringSetUpExamples;

public class SpringSetUpExamplesRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring1=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringSetUpExamples ref=spring1.getBean(SpringSetUpExamples.class);
		System.out.println(ref);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}

}
