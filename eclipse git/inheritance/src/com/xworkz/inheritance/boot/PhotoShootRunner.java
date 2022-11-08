package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.constants.CameraType;
import com.xworkz.inheritance.things.PhotoShooting;
import com.xworkz.inheritance.things.childclass.WildPhotoShoot;

public class PhotoShootRunner {

	public static void main(String[] args) {
		PhotoShooting photoShooting=new PhotoShooting("wedding", "mysuru", CameraType.INSTACAMERA);
		photoShooting.details();
		System.out.println("~~~~~~~~~~~~~~");
		
		WildPhotoShoot wildPhotoShoot=new WildPhotoShoot("wildnature", "Bandipura", CameraType.NIKON,6365);
		wildPhotoShoot.clicPhotos();
	}

}
