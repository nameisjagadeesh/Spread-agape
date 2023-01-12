package com.xworkz.springautowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springautowired")
public class AutoConfiguration {

	@Bean
	public String nameOfNewsPaper() {
		return "vijayavani";
	}
	@Bean
	public String publisherNameOfNewsPaper() {
		return "sankeshwar";
	}
	@Bean
	public String nameOfSnake() {
		return "cobra";
	}
	@Bean
	public String typeOfSnake() {
		return "very dangerous";
	}
	@Bean
	public boolean poisionousSnake() {
		return true;
	}
	@Bean
	public String nameOfEngine() {
		return "carEngine";
	}
	@Bean
	public String typeOfEngine() {
		return "carEngine";
	}
	@Bean
	public String companyOfEngine() {
		return "carEngine";
	}
	@Bean
	public String placeOfGhost() {
		return "graveyard";
	}
	@Bean
	public double widthOfGhost() {
		return 1.3;
	}
	@Bean
	public String fatherOfGhost() {
		return "lakshman";
	}
	@Bean
	public double dressOfGhost() {
		return 12.3;
	}
	@Bean
	public String motherOfGhost() {
		return "yashoda";
	}
	@Bean
	public int killsOfGhost() {
		return 532;
	}
	@Bean
	public String silblingrOfGhost() {
		return "hardik";
	}
	@Bean
	public short friendsOfGhost() {
		return 8;
	}
	@Bean
	public double distanceOfGhost() {
		return 63.3;
	}
	@Bean
	public String husbandOfGhost() {
		return "markman";
	}
	

}
