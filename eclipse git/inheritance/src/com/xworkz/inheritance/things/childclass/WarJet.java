package com.xworkz.inheritance.things.childclass;

public class WarJet {
	public long investment;
	public String name;

	public WarJet() {
	}

	public WarJet(long investment, String name) {
		super();
		this.investment = investment;
		this.name = name;
	}

	public void flies() {
		System.out.println(this.investment);
		System.out.println(this.name);
	}

	public void procured() {
		System.out.println("procured from");
	}

}
