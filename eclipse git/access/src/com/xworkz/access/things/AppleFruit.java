package com.xworkz.access.things;

public class AppleFruit {
	public String name="xyz";
	public Fruit fruit=new Fruit();
	
	public void eatFruit() {
		System.out.println(this.name);
		if(this.fruit!=null) {
			System.out.println(fruit.getColor());
			fruit.setColor("orange");
			System.out.println("updated color is"+fruit.getColor());
			
			System.out.println(fruit.getName());
			fruit.setName("pink lady");
			System.out.println("updated color is"+fruit.getName());
			
			System.out.println(fruit.getTotalFruits());
			fruit.setTotalFruits(2365412L);
			System.out.println("updated total fruits are"+ fruit.getTotalFruits());

			System.out.println(fruit.getType());
			fruit.setType("juari");
			System.out.println("updated type is" + fruit.getType());

			System.out.println(fruit.isHealthy());
			fruit.setHealthy(true);
			System.out.println("updated type is" + fruit.isHealthy());

			System.out.println(fruit.getWeight());
			fruit.setWeight(136);
			System.out.println("updated weight is" + fruit.getWeight());

			System.out.println(fruit.getPlace());
			fruit.setPlace("ladhak");
			System.out.println("updated place is" + fruit.getPlace());

			System.out.println(fruit.getCode());
			fruit.setCode('B');
			System.out.println("updated code is" + fruit.getCode());

			System.out.println(fruit.getSpeciesName());
			fruit.setSpeciesName("appletiocity");
			System.out.println("updated type is" + fruit.getSpeciesName());

			System.out.println(fruit.getConditions());
			fruit.setConditions("dry weather");
			System.out.println("updated weather is" + fruit.getType());

			System.out.println(fruit.getquantity());
			fruit.setquantity(365);
			System.out.println("updated type is" + fruit.getquantity());
		}
		else {
			System.out.println("fruit is null");
		}
		
		}
	

}
