package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Value("12")
	private short number;
	@Value("5.3")
	private double version;
	private String company;
	private int strokes;

	public Engine(@Qualifier("nameOfEngine")String name,@Qualifier("typeOfEngine") String type,@Qualifier("companyOfEngine") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Value("4")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

}
