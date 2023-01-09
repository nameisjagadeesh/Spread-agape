package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfigurtionOfColor;
import com.xworkz.spring.things.Color;

public class ColorRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigurtionOfColor.class);
		Color ref = spring.getBean(Color.class);
		System.out.println(ref);
		String ref2 = spring.getBean("send", String.class);
		System.out.println(ref2);
		StringBuilder ref3 = spring.getBean("name", StringBuilder.class);
		System.out.println(ref3);

	}

}
