package com.xworkz.access.boot;

import com.xworkz.access.things.Mobile;
import com.xworkz.access.things.Phone;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		Phone phone=new Phone();
		System.out.println(mobile.brand);
		System.out.println(mobile.phone);
		System.out.println(phone.getCode());
		System.out.println(phone.getColor());
		System.out.println(phone.getPhoneName());
		System.out.println(phone.getPrice());
		System.out.println(phone.getType());
		System.out.println(phone.isDurable());
		System.out.println(phone.getWeight());
		System.out.println(phone.getOutlet());
		System.out.println(phone.getLocation());
		System.out.println(phone.getBrand());
		System.out.println(phone.getQuantity());
		mobile.use();
	}

}
