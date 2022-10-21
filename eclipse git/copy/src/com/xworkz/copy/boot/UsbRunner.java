package com.xworkz.copy.boot;

import com.xworkz.copy.constants.OwnerName;
import com.xworkz.copy.examples.Usb;

public class UsbRunner {
	public static void main(String[] args) {
		short quantity = 3;
		System.out.println("here accessing static ,instance,final variables");

		Usb usb = new Usb(1299, quantity, "SSD", 'U',OwnerName.JAGADEESH);
		usb.readUsb();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Usb usb2 = new Usb(1600, quantity, "portable", 'S',OwnerName.SAGAR_K);
		usb2.readUsb();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Usb usb3 = new Usb(1695, quantity, "sanpro", 'B',OwnerName.SUNIL);
		usb3.readUsb();
		
		
	}

}
