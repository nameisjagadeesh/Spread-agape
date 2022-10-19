package com.xworkz.copy.examples;//6th
//here i declared the instance methods to access all details

public class Bat {
	public double breadth;
	public String brand;
	public long[] totalBats;
	public String[] color;
	public double[] weight;
	public boolean comfort;
	public String type;
	public short warranty;
	public int[] failedBats;
	public double[] width;
	public String[] usingPlayers;

	
	public Bat(double breadth,String brand,long[] totalBats,String[] color, double[] weight,boolean comfort,String type,short warranty,int[] failedBats,double[] width,String[] usingPlayers) {
		this.brand = brand;
		this.breadth = breadth;
		this.color = color;
		this.totalBats = totalBats;
		this.weight = weight;
		this.type = type;
		this.warranty = warranty;
		this.failedBats = failedBats;
		this.width = width;
		this.usingPlayers = usingPlayers;
		this.comfort = comfort;
}
	public void playit() {//instance method declaration
		System.out.println(this.brand);
		System.out.println(this.breadth);
		System.out.println(this.type);
		System.out.println(this.totalBats);
		System.out.println(this.color);
		System.out.println(this.weight);
		System.out.println(this.width);
		System.out.println(this.comfort);
		System.out.println(this.warranty);
		System.out.println(this.failedBats);
		System.out.println(this.usingPlayers);
		
		for (int i = 0; i < this.color.length; i++) {
			String string = color[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.totalBats.length; i++) {
			long string = totalBats[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.weight.length; i++) {
			double string = weight[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.width.length; i++) {
			double string = width[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.failedBats.length; i++) {
			int string = failedBats[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.usingPlayers.length; i++) {
			String string = usingPlayers[i];
			System.out.println(string);
			
		}
		
	}
}
