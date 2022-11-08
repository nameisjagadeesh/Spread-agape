package com.xworkz.inheritance.things;

public class Dowry {
	public String recipientName;
	public long dowryMoney;
	public boolean legality;

	public Dowry() {
		System.out.println("default constructor of Dowry ");
	}

	public Dowry(String recipientName, long dowryMoney, boolean legality) {
		super();
		this.recipientName = recipientName;
		this.dowryMoney = dowryMoney;
		this.legality = legality;
	}
	
	

}
