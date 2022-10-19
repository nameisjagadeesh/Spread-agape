package com.xworkz.copy.examples; //7th
//here i declared the instance methods to access all details

public class Glass {
	public String brand;
	public char glassCode;
	public String type;
	public int[] price;
	public String color;
	public double[] weight;
	public double[] width;
	public String[] production;
	public boolean transparency;
	public long[] revenues;
	public double[] radius;
	
	public Glass(String brand,char glassCode,String type,int[] price,String color,double[] weight,double[] width,String[] production,boolean transparency,long[] revenues,double[] radius) {
		
		System.out.println("parameterized constructr of glass class");
		this.brand=brand;
		this.glassCode = glassCode;
		this.type = type;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.width = width;
		this.production = production;
		this.transparency = transparency;
		this.revenues = revenues;
		this.radius = radius;

	}
	
	public void seeGlass() {
		// here i declared the method in instance to acccess all details at once in
		// runner class files
System.out.println(this.brand);
System.out.println(this.glassCode);
System.out.println(this.type);
System.out.println(this.production);
System.out.println(this.color);
System.out.println(this.transparency);
System.out.println(this.price);
System.out.println(this.width);
System.out.println(this.weight);
System.out.println(this.radius);
System.out.println(this.revenues);


System.out.println("=========now for loop=========");

for (int i = 0; i < this.production.length; i++) {
System.out.println("elements of production names");
String string = this.production[i];
System.out.println(string);

}
for (int i = 0; i < this.price.length; i++) {
System.out.println("elements of factory glass prices");
int string1 = this.price[i];
System.out.println(string1);

}
for (int i = 0; i < this.weight.length; i++) {
System.out.println("elements of glass weights");
double weight = this.weight[i];
System.out.println(weight);

}
for (int i = 0; i < this.width.length; i++) {
double width = this.width[i];
System.out.println("elements of glass perimeters");
System.out.println(width);

}
for (int i = 0; i < this.radius.length; i++) {
double radius = this.radius[i];
System.out.println("elements of glass radius");
System.out.println(radius);

}
for (int i = 0; i < this.revenues.length; i++) {
long revenue = this.revenues[i];
System.out.println("elements of glass revenues");
System.out.println(revenue);

}
	}

}
