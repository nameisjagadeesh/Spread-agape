package com.xworkz.copy.examples;//9th
//here i declared the instance methods to access all details


public class Medical {
	public String name;
	public int shopNumber;
	public String place;
	public long mobileNumber;
	public String ownerName;
	public String[] colors;
	public String[] workersNmes;
	public String[] chocolates;
	public String[] tablets;
	public String[] syreps;
	public int[] dailyearnings;

	public Medical(String name, int shopNumber, String place, long mobileNumber, String ownerName, String[] colors,
			String[] workersNmes, String[] chocolates, String[] tablets, String[] syreps, int[] dailyearnings) {
		this.name = name;
		this.shopNumber = shopNumber;
		this.place = place;
		this.mobileNumber = mobileNumber;
		this.ownerName = ownerName;
		this.colors = colors;
		this.workersNmes = workersNmes;
		this.chocolates = chocolates;
		this.tablets = tablets;
		this.syreps = syreps;
		this.dailyearnings = dailyearnings;
	}

	public void prescription() {
		System.out.println(colors);
		System.out.println(name);
		System.out.println(shopNumber);
		System.out.println(place);
		System.out.println(mobileNumber);
		System.out.println(ownerName);
	
		for (int i = 0; i < colors.length; i++) {
			System.out.println("colour"+colors[i]);
		}
		for (int i = 0; i < workersNmes.length; i++) {
			System.out.println("Names"+workersNmes[i]);
		}
		for (int i = 0; i < chocolates.length; i++) {
			System.out.println("Chocolate"+chocolates[i]);
		}
		for (int i = 0; i < tablets.length; i++) {
			System.out.println("Tablets"+tablets[i]);
		}
		for (int i = 0; i < syreps.length; i++) {
			System.out.println("Syrep"+syreps[i]);
		}
		for (int i = 0; i < dailyearnings.length; i++) {
			System.out.println("Earning"+dailyearnings[i]);
		}
	}

}
