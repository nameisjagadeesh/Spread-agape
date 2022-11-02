package com.xworkz.access.things;

public class Desktop {
	public String brand="apple";
	public Laptop laptop=new Laptop();
	public void run() {
		System.out.println(this.brand);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		if(this.laptop!=null) {
			System.out.println(laptop.getColor());
			laptop.setColor("white");
			System.out.println("updated color is"+laptop.getColor());
			
			System.out.println(laptop.getLaptopName());
			laptop.setLaptopName("pavilion");
			System.out.println("updated name is"+laptop.getLaptopName());
			
			System.out.println(laptop.getPrice());
			laptop.setPrice(3123654L);
			System.out.println("updated total laptops are"+ laptop.getPrice());

			System.out.println(laptop.getType());
			laptop.setType("office");
			System.out.println("updated type is" + laptop.getType());

			System.out.println(laptop.isDurable());
			laptop.setDurable(true);
			System.out.println("updated durable is" + laptop.isDurable());

			System.out.println(laptop.getWeight());
			laptop.setWeight(136);
			System.out.println("updated weight is" + laptop.getWeight());

			System.out.println(laptop.getOutlet());
			laptop.setOutlet("ladhak");
			System.out.println("updated outlet is" + laptop.getOutlet());

			System.out.println(laptop.getCode());
			laptop.setCode('w');
			System.out.println("updated code is" + laptop.getCode());

			System.out.println(laptop.getBrand());
			laptop.setBrand("hp");
			System.out.println("updated brand is" + laptop.getBrand());

			System.out.println(laptop.getLocation());
			laptop.setLocation("hongkong");
			System.out.println("updated location is" + laptop.getLocation());

			System.out.println(laptop.getQuantity());
			laptop.setQuantity(236);
			System.out.println("updated quantity is" + laptop.getQuantity());
		}
		else {
			System.out.println("laptop is null");
		}
	}

}
