package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Value("6.3")
	private double length;
	@Value("brown")
	private String color;
	private String type;
	private boolean poisioness;

	public Snake(@Qualifier("nameOfSnake")String name,@Qualifier("typeOfSnake") String type,@Qualifier("poisionousSnake") boolean poisioness) {
		super();
		this.name = name;
		this.type = type;
		this.poisioness = poisioness;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisioness="
				+ poisioness + "]";
	}

}
