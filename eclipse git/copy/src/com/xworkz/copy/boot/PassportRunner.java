<<<<<<< HEAD
package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		System.out.println("passport details by passing args");
		Passport number=new Passport(42);
		System.out.println(number.no);
		System.out.println("=========");
		
		Passport naam=new Passport("Bhartiya passport");
		System.out.println(naam.name);
		System.out.println("=========");
		
		Passport passport=new Passport("australian airpass", 36);
		System.out.println(passport.name);
		System.out.println(passport.no);
		System.out.println("=========");
		
		Passport passport2=new Passport(1500, "India", 65);
		System.out.println(passport2.country);
		System.out.println(passport2.no);
		System.out.println(passport2.price);
		System.out.println("=========");
		
		Passport passport3=new Passport(1452, 25);
		System.out.println(passport3.no);
		System.out.println(passport3.price);
		System.out.println("=========");
		
		
		Passport passport4=new Passport(1689, 86, "Aug 2034");
		System.out.println(passport4.no);
		System.out.println(passport4.price);
		System.out.println(passport4.expiryDate);
		System.out.println("=========");
		
		Passport passport5=new Passport(1890, "USA");
		System.out.println(passport5.price);
		System.out.println(passport5.country);
		System.out.println("=========");
		
		Passport passport6=new Passport(1716);
		System.out.println(passport6.price);
		
		
		
	}

}
=======
package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		System.out.println("passport details by passing args");
		Passport number=new Passport(42);
		System.out.println(number.no);
		System.out.println("=========");
		
		Passport naam=new Passport("Bhartiya passport");
		System.out.println(naam.name);
		System.out.println("=========");
		
		Passport passport=new Passport("australian airpass", 36);
		System.out.println(passport.name);
		System.out.println(passport.no);
		System.out.println("=========");
		
		Passport passport2=new Passport(1500, "India", 65);
		System.out.println(passport2.country);
		System.out.println(passport2.no);
		System.out.println(passport2.price);
		System.out.println("=========");
		
		Passport passport3=new Passport(1452, 25);
		System.out.println(passport3.no);
		System.out.println(passport3.price);
		System.out.println("=========");
		
		
		Passport passport4=new Passport(1689, 86, "Aug 2034");
		System.out.println(passport4.no);
		System.out.println(passport4.price);
		System.out.println(passport4.expiryDate);
		System.out.println("=========");
		
		Passport passport5=new Passport(1890, "USA");
		System.out.println(passport5.price);
		System.out.println(passport5.country);
		System.out.println("=========");
		
		Passport passport6=new Passport(1716);
		System.out.println(passport6.price);
		
		
		
	}

}
>>>>>>> 7ecf9214bb26a7d832c46d6666c1a71dac1965fe
