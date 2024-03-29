package com.xworkz.module.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.module")
@Slf4j
public class ModuleConfiguration {

	public ModuleConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
//	@Bean
//	public MultipartResolver  multipartResolver(){ //
//		System.out.println("registerd multipartResolver");
//		return new StandardServletMultipartResolver();
//		
//	}
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("running viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	 //by this spring and jpa are integrated
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz.module.entity");
		bean.setDataSource(dataSource());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;
	}

	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/module");
		datasource.setPassword("Xworkz@123");
		datasource.setUsername("root");
		return datasource;
	}
	
	@Bean
	public PasswordEncoder encoder() {
		log.info("Running the encoder method in config class");
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		log.info("Running the multipartResolver method in config class");
		return new StandardServletMultipartResolver();
	}
}
