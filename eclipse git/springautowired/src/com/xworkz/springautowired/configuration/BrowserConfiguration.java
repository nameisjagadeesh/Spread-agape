package com.xworkz.springautowired.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springautowired")
public class BrowserConfiguration {

	public BrowserConfiguration() {
		System.out.println("running the BrowserConfiguration");	}

}
