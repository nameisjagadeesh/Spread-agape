package com.xworkz.copy.boot;

import com.xworkz.copy.examples.*;

public class TeaRunner {

	public static void main(String[] args) {
		System.out.println("initiated properties of tea by literals and reference");
		Tea Name;
		Name = new Tea();
		System.out.println("tea name is :" + Name.name);

		Tea Brand = new Tea();
		System.out.println("tea brand is :" + Brand.brand);

		Tea Origin = new Tea();
		System.out.println("tea Origin is :" + Origin.origin);

		Tea Company = new Tea();
		System.out.println("tea company is :" + Company.company);

		Tea Color = new Tea();
		System.out.println("tea color is :" + Color.color);

		Tea Price = new Tea();
		System.out.println("tea price is :" + Price.price);

		Tea Quantity = new Tea();
		System.out.println("tea quantity is :" + Quantity.quantity);

		Tea FactoryName = new Tea();
		System.out.println("tea FcatoryName is :" + FactoryName.factoryName);

		Tea Box = new Tea();
		System.out.println("tea brand is :" + Box.boxes);

		Tea flav = new Tea();
		flav.flavour = "Mint";
		System.out.println("tea flavour is :" + flav.flavour);

		Tea good = new Tea();
		good.good = true;
		System.out.println("tea taste good  :" + good.good);

		Tea MD = new Tea();
		MD.manufactureDate = "AUG 2021";
		System.out.println("tea manufacure date is :" + MD.manufactureDate);

		Tea ingr = new Tea();
		ingr.ingradients = "as prescirbed by manufacuruer";
		System.out.println("tea ingradients is :" + ingr.ingradients);

		Tea exp = new Tea();
		exp.expireDate = "Dec 2022";
		System.out.println("tea exp dates  is :" + exp.expireDate);

		Tea sug = new Tea();
		sug.suger = false;
		System.out.println("tea is sugerless :" + sug.suger);

		Tea type = new Tea();
		type.type = "naturalCare";
		System.out.println("tea flavour is :" + type.type);

		Tea pure = new Tea();
		pure.purity = true;
		System.out.println("tea purity is good :" + pure.purity);

		Tea qua = new Tea();
		qua.quality = "quality is no upto the standards";
		System.out.println("tea quality is :" + qua.quality);

	}

}
