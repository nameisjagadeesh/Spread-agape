package com.xworkz.access.things;

public class Vehicle {
	public String brand="kia";
	public Car car=new Car();
	
	public void drive() {
		System.out.println(this.brand);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		if(this.car!=null) {
			System.out.println(car.getColor());
			car.setColor("red");
			System.out.println("updated color is"+car.getColor());
			
			System.out.println(car.getCarName());
			car.setCarName("alcazar");
			System.out.println("updated name is"+car.getCarName());
			
			System.out.println(car.getPrice());
			car.setPrice(3123654L);
			System.out.println("updated total cars are"+ car.getPrice());

			System.out.println(car.getType());
			car.setType("juari");
			System.out.println("updated type is" + car.getType());

			System.out.println(car.isSafe());
			car.setSafe(false);
			System.out.println("updated safe is" + car.isSafe());

			System.out.println(car.getWeight());
			car.setWeight(136);
			System.out.println("updated weight is" + car.getWeight());

			System.out.println(car.getOutlet());
			car.setOutlet("ladhak");
			System.out.println("updated outlet is" + car.getOutlet());

			System.out.println(car.getCode());
			car.setCode('k');
			System.out.println("updated code is" + car.getCode());

			System.out.println(car.getBrand());
			car.setBrand("ford");
			System.out.println("updated brand is" + car.getBrand());

			System.out.println(car.getAdress());
			car.setAdress("showroom of kia");
			System.out.println("updated weather is" + car.getAdress());

			System.out.println(car.getQuantity());
			car.setQuantity(236);
			System.out.println("updated quantity is" + car.getQuantity());
		}
		else {
			System.out.println("car is null");
		}
	}

}
