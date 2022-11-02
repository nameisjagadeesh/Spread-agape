package com.xworkz.access.things;

public class Carrot {
	public String name="abcd";
	public Vegitables vegitables=new Vegitables();
	
	public void eatVegs() {
		System.out.println(this.name);
		if(this.vegitables!=null) {
			System.out.println(vegitables.getColor());
			vegitables.setColor("orange");
			System.out.println("updated color is"+vegitables.getColor());
			
			System.out.println(vegitables.getName());
			vegitables.setName("pink lady");
			System.out.println("updated color is"+vegitables.getName());
			
			System.out.println(vegitables.getTotalVeg());
			vegitables.setTotalVeg(2365412L);
			System.out.println("updated total vegitabless are"+ vegitables.getTotalVeg());

			System.out.println(vegitables.getType());
			vegitables.setType("juari");
			System.out.println("updated type is" + vegitables.getType());

			System.out.println(vegitables.isHealthy());
			vegitables.setHealthy(true);
			System.out.println("updated type is" + vegitables.isHealthy());

			System.out.println(vegitables.getWeight());
			vegitables.setWeight(136);
			System.out.println("updated weight is" + vegitables.getWeight());

			System.out.println(vegitables.getPlace());
			vegitables.setPlace("ladhak");
			System.out.println("updated place is" + vegitables.getPlace());

			System.out.println(vegitables.getCode());
			vegitables.setCode('B');
			System.out.println("updated code is" + vegitables.getCode());

			System.out.println(vegitables.getSpeciesName());
			vegitables.setSpeciesName("appletiocity");
			System.out.println("updated type is" + vegitables.getSpeciesName());

			System.out.println(vegitables.getConditions());
			vegitables.setConditions("dry weather");
			System.out.println("updated weather is" + vegitables.getType());

			System.out.println(vegitables.getQuantity());
			vegitables.setQuantity(956);
			System.out.println("updated quantity is" + vegitables.getQuantity());
		}
		else {
			System.out.println("vegitables is null");
		}
		
		}
	

}
