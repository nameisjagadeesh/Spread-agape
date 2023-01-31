package com.xworkz.springServer.component;

import org.springframework.stereotype.Component;

@Component
public class School {

	public School() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
