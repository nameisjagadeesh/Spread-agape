package com.xworkz.springServer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springServer")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

}
