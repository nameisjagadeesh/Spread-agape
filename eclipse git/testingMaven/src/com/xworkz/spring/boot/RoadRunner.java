package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Roads;

public class RoadRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Roads ref=spring.getBean(Roads.class);
		System.out.println(ref);
	}

}
