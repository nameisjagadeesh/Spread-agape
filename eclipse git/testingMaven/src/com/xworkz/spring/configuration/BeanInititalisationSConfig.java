package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

@ComponentScan("com.xworkz.spring")
@Configuration
public class BeanInititalisationSConfig {
	public BeanInititalisationSConfig() {
		System.out.println("runnin BeanInititalisationSConfig");
	}

	@Bean
	public Actor act() {
		Actor actor = new Actor();
		return actor;
	}

	@Bean
	public Rocket launch() {
		Rocket rocketing = new Rocket("GSLV MK III", "India", 256D);
		return rocketing;
	}

	@Bean
	public Season shower() {
		Season season = new Season();
		season.setDuration(4D);
		season.setName("monsoon");
		season.setStartinMonth("june");
		return season;
	}

}
