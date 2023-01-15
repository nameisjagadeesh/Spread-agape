package com.xworkz.springautowired.bean.associationBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lense lense;
	@Autowired
	private Battery battery;
	
	public Camera() {
		System.out.println("created camera using default constructor");
	}

}
