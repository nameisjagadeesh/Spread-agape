package com.xworkz.access.boot;

import com.xworkz.access.things.Car;
import com.xworkz.access.things.Vehicle;

public class CarVehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		Car car=new Car();
		System.out.println(vehicle.brand);
		System.out.println(vehicle.car);
		System.out.println(car.getCode());
		System.out.println(car.getColor());
		System.out.println(car.getCarName());
		System.out.println(car.getPrice());
		System.out.println(car.getType());
		System.out.println(car.isSafe());
		System.out.println(car.getWeight());
		System.out.println(car.getOutlet());
		System.out.println(car.getAdress());
		System.out.println(car.getBrand());
		System.out.println(car.getQuantity());
		vehicle.drive();
	}

}
