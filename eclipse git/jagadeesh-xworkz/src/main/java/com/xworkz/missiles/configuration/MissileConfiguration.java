package com.xworkz.missiles.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.missiles")
public class MissileConfiguration {

	public MissileConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver  multipartResolver(){ //
		System.out.println("registerd multipartResolver");
		return new StandardServletMultipartResolver();
		
	}
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("running viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean //by this spring and jpa are integrated
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("running LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

}
