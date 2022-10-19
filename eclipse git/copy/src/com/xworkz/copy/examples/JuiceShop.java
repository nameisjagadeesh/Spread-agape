package com.xworkz.copy.examples;//10th
//here i declared the instance methods to access all details

public class JuiceShop {
	public String[] juiceTypes;
	public String[] iteams;
	public String[] workersNames;
	public String[] Fruites;
	public int[] rates;
	public String[] iceCreams;	
	public String name;
	public String ownerName ;
	public int shopno;
	public int varites;
	public int workers;
	

	public JuiceShop(String name, String ownerName,int shopno , int varites, int workers, String[] juiceTypes,
			String[] iteams, String[] workersNames, String[] Fruites, int[] rates, String[] iceCreams) {
		this.name = name;
		this.ownerName = ownerName;
		this.shopno = shopno;
		this.varites = varites;
		this.workers = workers;
		this.juiceTypes = juiceTypes;
		this.iteams = iteams;
		this.workersNames = workersNames;
		this.Fruites = Fruites;
		this.rates = rates;
		this.iceCreams = iceCreams;
	}

	public void reading() {
		System.out.println(name);
		System.out.println(ownerName);
		System.out.println(shopno);
		System.out.println(varites);
		System.out.println(workers);
		for (int i = 0; i < juiceTypes.length; i++) {
			System.out.println("juiceTypes:" + juiceTypes[i]);
		}
		for (int i = 0; i < iteams.length; i++) {
			System.out.println("iteams:" + iteams[i]);
		}
		for (int i = 0; i < workersNames.length; i++) {
			System.out.println("workersNames:" + workersNames[i]);
		}
		for (int i = 0; i < Fruites.length; i++) {
			System.out.println("Fruites:" + Fruites[i]);
		}
		for (int i = 0; i < rates.length; i++) {
			System.out.println("juice rates:" + rates[i]);
		}
		for (int i = 0; i < iceCreams.length; i++) {
			System.out.println("iceCreams:" + iceCreams[i]);
		}
	}

}
