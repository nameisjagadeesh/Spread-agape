package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Codes;
import com.xworkz.copy.constants.Numbers;
import com.xworkz.copy.constants.Type;

//here imported the enum datatypes after declaring the int Strings and char datatype(multiple) in enum references 

public class Clock {
	public String name;
	public Type type=Type.DIGITAL;
	public Numbers numbers;
	public Codes code=Codes.A;
	public double weight;
	public long BatteryLife;
	
	public Clock(String name, Type type, Numbers numbers, Codes code, double weight, long batteryLife) {
		super();
		this.name = name;
		this.type = type;
		this.numbers = numbers;
		this.code = code;
		this.weight = weight;
		BatteryLife = batteryLife;
	}
	
	public void timeing() {
		System.out.println("clock name is :"+this.name);
		System.out.println("clock type is :"+this.type);
		System.out.println("args passed to clock type is :"+this.type.time);
		System.out.println("clock number is :"+this.numbers);
		System.out.println("clock nocode is :"+this.numbers.no);
		System.out.println("clock price is :"+this.numbers.price+"rs");
		System.out.println("clock weight is :"+this.weight+"kgs");
		System.out.println("clock code is :"+this.code);
		System.out.println("args passed to clock code is :"+this.code.value);
		System.out.println("batterylife in minutes :"+this.BatteryLife);
		
	}

}
