package com.xworkz.attributeSpring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.attributeSpring")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
}
