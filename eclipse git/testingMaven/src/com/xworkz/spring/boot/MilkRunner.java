package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Milk ref=spring.getBean(Milk.class);
		System.out.println(ref);
	}

}
