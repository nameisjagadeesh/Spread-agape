package com.xworkz.valantineValidation.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ValentineWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("registerd getServletConfigClasses");
		return new Class [] {ValentineConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("registerd getServletMappings");
		return new String [] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("registerd configureDefaultServletHandling");
		configurer.enable();
		
	}
	@Override
	protected void customizeRegistration(Dynamic registration) {

		String tempDrive = "J:\\temporary";
		int maxUploadSizeInMb = 5 * 1024 * 1024;
		File uploadDirectory = new File(System.getProperty(tempDrive));
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

		registration.setMultipartConfig(multipartConfigElement);
		super.customizeRegistration(registration);
	}
}
