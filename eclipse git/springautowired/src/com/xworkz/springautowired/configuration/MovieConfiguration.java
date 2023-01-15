package com.xworkz.springautowired.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.springautowired.boot.AutowiredConfiguration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springautowired", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { AutoConfiguration.class,
				AutowiredConfiguration.class }) })
public class MovieConfiguration {

	public MovieConfiguration() {
		System.out.println("running MovieConfiguration");
	}

}
