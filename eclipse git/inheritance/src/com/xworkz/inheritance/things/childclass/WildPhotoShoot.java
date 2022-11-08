package com.xworkz.inheritance.things.childclass;

import com.xworkz.inheritance.constants.CameraType;
import com.xworkz.inheritance.things.PhotoShooting;

public class WildPhotoShoot extends PhotoShooting{
	public int totalPhotos;
	
	public WildPhotoShoot() {
	
	
			}

	public WildPhotoShoot(String type, String location, CameraType cameraType,int totalPhotos) {
		super(type, location, cameraType);
		this.totalPhotos=totalPhotos;
			}
	public void clicPhotos() {
		System.out.println(type);
		System.out.println(location);
		System.out.println(cameraType);
		System.out.println(totalPhotos);
	}

	
	

}
