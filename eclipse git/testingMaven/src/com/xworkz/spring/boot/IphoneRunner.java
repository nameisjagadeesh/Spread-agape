package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.things.Iphone;
import com.xworkz.spring.things.SpringConfigurationOfIphone;

public class IphoneRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigurationOfIphone.class);
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		Iphone ref2 = spring.getBean(Iphone.class);
		System.out.println(ref2);
		ApplicationContext spring2 = new AnnotationConfigApplicationContext(SpringConfigurationOfIphone.class);
		String ref3 = spring2.getBean("send", String.class);
		System.out.println(ref3); // when we are try to access the method of same type string
		String ref4 = spring2.getBean("buy", String.class);
		System.out.println(ref4); // when we are try to access the method of same type string
		Double ref5 = spring2.getBean("stock", Double.class);
		System.out.println(ref5);

	}

}
