package com.xworkz.springautowired.bean.associationBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;
	@Autowired
	private CameraMan cameraMan;

	public Movie() {
		System.out.println("created movie using default constructor");

	}

	public void details() {

		System.out.println("hashcode of cameraman" + this.cameraMan.hashCode());
		System.out.println("hashcode of director" + this.director.hashCode());
		System.out.println("hashcode of producre" + this.producer.hashCode());

	}

}
