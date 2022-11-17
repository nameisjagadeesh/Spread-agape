package com.xworkz.inheritance.boot;

public class OWedsM {
		
	private String groomName = "Omkar";
	private String brideName = "Mamatha";
	public String absenteeName = "Jagadeesh Allagi";

	public OWedsM() {
		System.out.println("from default and routine life to colorful step with ur loved one ");
	}
	
	public void wishesFromJagadeesh() {
	System.out.println("Wishing you a very happy married life ji"
	+ "and all the best for ur next milestone stay happy, stay blessed and be the  greatest anubandhada jodi");
		
	}
	
	public void absenteeExcuses() {
	System.out.println("I could not attend ur lovely celebration moments ,as i am out of station i.e hometown");
	}
	
	public static void main(String[] args) {
		OWedsM oWedsM=new OWedsM();
		oWedsM.wishesFromJagadeesh();
		oWedsM.absenteeExcuses();
	}
}
