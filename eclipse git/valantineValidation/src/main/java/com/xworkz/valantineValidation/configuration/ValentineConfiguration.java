package com.xworkz.valantineValidation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class ValentineConfiguration {

	public ValentineConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {

		System.out.println("registerd viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("rigistered the containerEntityManagerFactoryBean");
        return new LocalContainerEntityManagerFactoryBean();
	}
}
