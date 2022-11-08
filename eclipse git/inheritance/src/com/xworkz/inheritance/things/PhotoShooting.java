package com.xworkz.inheritance.things;

import com.xworkz.inheritance.constants.CameraType;

public class PhotoShooting {
	public String type;
	public String location;
	public CameraType cameraType;

	public PhotoShooting() {
		System.out.println("default constructor of photoshooting");
	}

	public PhotoShooting(String type, String location, CameraType cameraType) {
		super();
		this.type = type;
		this.location = location;
		this.cameraType = cameraType;
	}
	
	public void details() {
		System.out.println(type);
		System.out.println(location);
		System.out.println(cameraType);
	}

}
