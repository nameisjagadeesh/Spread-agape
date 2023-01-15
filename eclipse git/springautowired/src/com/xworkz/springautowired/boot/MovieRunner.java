package com.xworkz.springautowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springautowired.bean.associationBeans.Movie;
import com.xworkz.springautowired.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		Movie ref = container.getBean(Movie.class);
		ref.details();
	}

}
