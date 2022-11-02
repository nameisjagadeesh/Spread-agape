package com.xworkz.access.boot;

import com.xworkz.access.things.Desktop;
import com.xworkz.access.things.Laptop;

public class DesktopRunner {

	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		Laptop laptop=new Laptop();
		System.out.println(desktop.brand);
		System.out.println(desktop.laptop);
		System.out.println(laptop.getCode());
		System.out.println(laptop.getColor());
		System.out.println(laptop.getLaptopName());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getType());
		System.out.println(laptop.isDurable());
		System.out.println(laptop.getWeight());
		System.out.println(laptop.getOutlet());
		System.out.println(laptop.getLocation());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getQuantity());
		desktop.run();
	}

}
