package com.xworkz.access.things;

public class Home {
	public String name = "bapuji";
	public Town town = new Town();

	public void live() {
		System.out.println(this.name);
		if (this.town != null) {
			System.out.println(town.getCity());
			town.setCity("dabasaphete");
			System.out.println("updated city is" + town.getCity());

			System.out.println(town.getName());
			town.setName("kings landing");
			System.out.println("updated name is" + town.getName());

			System.out.println(town.getPopulation());
			town.setPopulation(65412L);
			System.out.println("updated total towns are" + town.getPopulation());

			System.out.println(town.getType());
			town.setType("residential");
			System.out.println("updated type is" + town.getType());

			System.out.println(town.isPolluted());
			town.setPolluted(true);
			System.out.println("updated type is" + town.isPolluted());

			System.out.println(town.getArea());
			town.setArea(6226);
			System.out.println("updated area is" + town.getArea());

			System.out.println(town.getState());
			town.setState("hydearbad");
			System.out.println("updated state is" + town.getState());

			System.out.println(town.getCode());
			town.setCode('B');
			System.out.println("updated code is" + town.getCode());

			System.out.println(town.getMla());
			town.setMla("b patil");
			System.out.println("updated mla is" + town.getMla());

			System.out.println(town.getPanchayatName());
			town.setPanchayatName("dabasapet nagara sabha");
			System.out.println("updated weather is" + town.getPanchayatName());

			System.out.println(town.getHouses());
			town.setHouses(3365);
			System.out.println("updated house is" + town.getHouses());
		} else {
			System.out.println("town is null");
		}
	}

}
