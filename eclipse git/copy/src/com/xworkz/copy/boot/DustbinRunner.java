package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Cigarette;
import com.xworkz.copy.examples.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		System.out.println("initiated properties of cigerette by literals and reference");

		Dustbin nam = new Dustbin();
		System.out.println("Dustbin name is :" + nam.name);

		Dustbin brand1 = new Dustbin();
		System.out.println("Dustbin brand is :" + brand1.brand);

		Dustbin ori = new Dustbin();
		System.out.println("Dustbin origin is :" + ori.origin);

		Dustbin comp = new Dustbin();
		System.out.println("Dustbin company is :" + comp.company);

		Dustbin col = new Dustbin();
		System.out.println("Dustbin color is :" + col.color);

		Dustbin price = new Dustbin();
		System.out.println("Dustbin price is :" + price.price);

		Dustbin quant = new Dustbin();
		System.out.println("Dustbin quantity is :" + quant.quantity);

		Dustbin point = new Dustbin();
		System.out.println("Dustbin productionpont  is :" + point.factoryName);

		Dustbin part = new Dustbin();
		System.out.println("Dustbin parts are :" + part.factoryName);

		Dustbin strong = new Dustbin();
		strong.strength = "very strong";
		System.out.println("Dustbin strength  is :" + point.factoryName);

		Dustbin nice = new Dustbin();
		nice.good = true;
		System.out.println("Dustbin is looking nice   :" + nice.good);

		Dustbin MD = new Dustbin();
		MD.manufactureDate = "april 2022";
		System.out.println("Dustbin manufacure date  is :" + point.factoryName);

		Dustbin mate = new Dustbin();
		mate.materials = "plastic rubber";
		System.out.println("Dustbin materials used  is :" + mate.materials);

		Dustbin cover = new Dustbin();
		cover.covertype = "multilayes";
		System.out.println("Dustbin covertype  is :" + cover.covertype);

		Dustbin stiff = new Dustbin();
		stiff.stiffness = false;
		System.out.println("Dustbin stiffness  is :" + stiff.stiffness);

		Dustbin type = new Dustbin();
		type.type = "domestic use";
		System.out.println("Dustbin type  is :" + type.type);

		Dustbin pure = new Dustbin();
		pure.purity = true;
		System.out.println("Dustbin purity  is :" + pure.purity);

		Dustbin quality1 = new Dustbin();
		quality1.quality = "compromissed";
		System.out.println("Dustbin quality  is :" + quality1.quality);

	}

}
