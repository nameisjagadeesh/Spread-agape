package com.xworkz.copy.examples;
//here i declared the methods to access all details
public class Light {
	public String company;
	public char lightCode;
	public int[] price;
	public String[] color;
	public double[] weight;	
	public String producer;
	public String type;
	public short quantity;
	public long[] range;
	public double[] length;
	public String[] adress;
	
	
	
	public Light(String company,char lightCode,int[]price,String[]color,double[] weight,String producer,String type,short quantity,long[]range,double[]length,String[]adress) {
		System.out.println("parameterized constructr of light class");
		this.company=company;
		this.lightCode = lightCode;
		this.type = type;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.producer = producer;
		this.quantity = quantity;
		this.range = range;
		this.length = length;
		this.adress = adress;
	}
		
		public void printDetails() {
			System.out.println(this.company);
			System.out.println(this.lightCode);
			System.out.println(this.type);
			System.out.println(this.price);
			System.out.println(this.color);
			System.out.println(this.weight);
			System.out.println(this.producer);
			System.out.println(this.quantity);
			System.out.println(this.range);
			System.out.println(this.length);
			System.out.println(this.adress);
			
			System.out.println("loop of elements");
			
			for (int i = 0; i < this.adress.length; i++) {
				String string = adress[i];
				System.out.println(string);
			}
			for (int i = 0; i < this.price.length; i++) {
				int money = this.price[i];
				System.out.println(money);
				
			}
			for (int i = 0; i < this.color.length; i++) {
				String paint = this.color[i];
				System.out.println(paint);
				
			}
			for (int i = 0; i < this.weight.length; i++) {
				double weighs = this.weight[i];
				System.out.println(weighs);
				
			}
			for (int i = 0; i < this.range.length; i++) {
				long rover = this.range[i];
				System.out.println(rover);
				
			}
			for (int i = 0; i < this.length.length; i++) {
				double scale = this.length[i];
				System.out.println(scale);
				
			}
		}

	

}
