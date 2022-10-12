package com.xworkz.copy.boot;

import com.xworkz.copy.examples.RMD;

public class RmdRunner {

	public static void main(String[] args) {
		System.out.println("initiated properties of RMD by literals and reference");

		RMD Name;
		Name = new RMD();
		System.out.println("RMD name is :" + Name.name);

		RMD Brand = new RMD();
		System.out.println("RMD brand is :" + Brand.brand);

		RMD Origin = new RMD();
		System.out.println("RMD Origin is :" + Origin.origin);

		RMD Company = new RMD();
		System.out.println("RMD company is :" + Company.company);

		RMD Color = new RMD();
		System.out.println("RMD color is :" + Color.color);

		RMD Price = new RMD();
		System.out.println("RMD price is :" + Price.price);

		RMD Quantity = new RMD();
		System.out.println("RMD quantity is :" + Quantity.quantity);

		RMD FactoryName = new RMD();
		System.out.println("RMD FcatoryName is :" + FactoryName.factoryName);

		RMD Box = new RMD();
		System.out.println("RMD box is :" + Box.boxes);

		RMD flav = new RMD();
		flav.flavour = "Sweet";
		System.out.println("RMD flavor is :" + flav.flavour);

		RMD good1 = new RMD();
		good1.good = false;
		System.out.println("RMD flavor is :" + good1.good);

		RMD MD = new RMD();
		MD.manufactureDate = "nov 2021";
		System.out.println("RMD manufacture date is :" + flav.flavour);

		RMD ingr = new RMD();
		ingr.ingradients = "tobacoo suger etc......";
		System.out.println("RMD ingradients are :" + ingr.ingradients);

		RMD expdate = new RMD();
		expdate.expireDate = "dec 2022";
		System.out.println("RMD exp date is :" + flav.flavour);

		RMD taste1 = new RMD();
		taste1.taste = true;
		System.out.println("RMD taste is good:" + taste1.taste);

		RMD type1 = new RMD();
		type1.type = "gutka";
		System.out.println("RMD tyoe is :" + type1.type);

		RMD pure = new RMD();
		pure.purity = false;
		System.out.println("RMD purit  is good :" + pure.purity);

		RMD quality = new RMD();
		quality.quality = "wakkkkkkkk";
		System.out.println("RMD quality is :" + quality.quality);

	}

}
