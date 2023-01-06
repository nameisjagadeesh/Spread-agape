package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Cycle;

public class CycleRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Cycle ref=spring.getBean(Cycle.class);
		System.out.println(ref);
		System.out.println(spring);
	}

}
