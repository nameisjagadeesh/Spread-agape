package com.xworkz.inheritance.things.childclass;

public class Rafel extends WarJet {
	public String procuredFrom;

	public Rafel(long investment, String name, String procuredFrom) {
		super(investment, name);
		this.procuredFrom = procuredFrom;
	}
    @Override //it will check compile time error like spelling mistake
    public void flies() {
    	super.flies();
    	System.out.println(this.procuredFrom);
    }
    public void procured() {
    	System.out.println("~~~~~~~~~~~");
    }
}
