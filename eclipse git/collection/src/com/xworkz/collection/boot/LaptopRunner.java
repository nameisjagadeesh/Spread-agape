package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.LaptopsDto;

public class LaptopRunner {

	public static void main(String[] args) {
		LaptopsDto laptopsDto1 = new LaptopsDto("pavilion", 56235.56, 15, "hp", true);
		LaptopsDto laptopsDto2 = new LaptopsDto("predator", 86000, 5, "asus", true);
		LaptopsDto laptopsDto3 = new LaptopsDto("cuba", 25652, 1, "dell", false);
		LaptopsDto laptopsDto4 = new LaptopsDto("kintex", 58265, 15, "redmi", true);

		Collection<LaptopsDto> collection = new ArrayList<LaptopsDto>();
		collection.add(laptopsDto4);
		collection.add(laptopsDto3);
		collection.add(laptopsDto2);
		collection.add(laptopsDto1);
		collection.add(new LaptopsDto("abs", 65236, 6, "bvc", true));

		collection.stream()
		.collect(Collectors.toSet())
		.forEach(e-> System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		collection.stream().filter(ele->ele.getBrand()=="hp")
		.collect(Collectors.toList()).forEach(e-> System.out.println(e));
//		System.out.println("~~~~~~~~~~~~~~~~~~~");
//		collection.stream().collect(Collectors.toList()).forEach(e-> System.out.println(e.toString()));

	}

}
