package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Cigarette;
import com.xworkz.copy.examples.Tea;

public class CigeretteRunner {

	public static void main(String[] args) {
		System.out.println("initiated properties of cigerette by literals and reference");

		Cigarette nam = new Cigarette();
		System.out.println("cigerratte name is :" + nam.name);

		Cigarette length1 = new Cigarette();
		System.out.println("cigerratte length is :" + length1.length);

		Cigarette brand1 = new Cigarette();
		System.out.println("cigerratte brand is :" + brand1.brand);

		Cigarette ori = new Cigarette();
		System.out.println("cigerratte origin is :" + ori.origin);

		Cigarette comp = new Cigarette();
		System.out.println("cigerratte company is :" + comp.company);

		Cigarette col = new Cigarette();
		System.out.println("cigerratte color is :" + col.color);

		Cigarette price = new Cigarette();
		System.out.println("cigerratte price is :" + price.price);

		Cigarette quant = new Cigarette();
		System.out.println("cigerratte quantity is :" + quant.quantity);

		Cigarette point = new Cigarette();
		System.out.println("cigerratte productionpont  is :" + point.produrepoint);

		Cigarette square = new Cigarette();
		square.boxes = 5;
		System.out.println("cigerratte boxes  are :" + square.boxes);

		Cigarette good = new Cigarette();
		good.good = false;
		System.out.println("cigerate is good  :" + good.good);

		Cigarette MD = new Cigarette();
		MD.manufactureDate = "AUG 2020";
		System.out.println("Cigarette manufacure date is :" + MD.manufactureDate);

		Cigarette ingr = new Cigarette();
		ingr.ingradients = "tobacco r";
		System.out.println("Cigarette ingradients is :" + ingr.ingradients);

		Cigarette exp = new Cigarette();
		exp.expireDate = "Dec 2023";
		System.out.println("Cigarette exp dates  is :" + exp.expireDate);

		Cigarette thick = new Cigarette();
		thick.thickness = 2;
		System.out.println("Cigarette thickness is  :" + thick.thickness);

		Cigarette type = new Cigarette();
		type.type = "electric cigerette";
		System.out.println("Cigarette type is :" + type.type);

		Cigarette pure = new Cigarette();
		pure.purity = false;
		System.out.println("Cigarette purity is good :" + pure.purity);

		Cigarette qua = new Cigarette();
		qua.quality = "quality is very bad and is injures to health";
		System.out.println("Cigarette quality is :" + qua.quality);

		Cigarette name2 = new Cigarette();
		name2.name = "icebust";
		System.out.println(name2.name);

		name2 = nam;
		System.out.println(name2.name);

	}

}
