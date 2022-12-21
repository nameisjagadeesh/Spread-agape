package com.xworkz.javacollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorRunner {

	public static void main(String[] args) {
		String animal1 = "Lion ";
		String animal2 = "Tiger ";
		String animal3 = "Cat ";
		String animal4 = "Dog ";
		String animal5 = "Cow ";
		String animal6 = "oxe ";
		String animal7 = "Mouse";
		String animal8 = "Fox";
		String animal9 = "Lipord";
		String animal10 = "Python";

		Collection<String> collection = new ArrayList<String>();
		collection.add(animal1);
		collection.add(animal2);
		collection.add(animal3);
		collection.add(animal4);
		collection.add(animal5);
		collection.add(animal6);
		collection.add(animal7);
		collection.add(animal8);
		collection.add(animal9);
		collection.add(animal10);

		for (String element : collection) {
			System.out.println(element);
		}
		System.out.println("***********************************************");
		Iterator<String> value = collection.iterator();
		while (value.hasNext()) {
			String reference = value.next();
			System.out.println(reference);
		}
		System.out.println(System.lineSeparator());
		String watch1 = "Fastrack";
		String watch2 = "Titan";
		String watch3 = "HMT";
		String watch4 = "Sonata";
		String watch5 = "Ajanta";

		Collection<String> watch = new ArrayList<String>();
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch1);

		Iterator<String> value1 = watch.iterator();
		while (value1.hasNext()) {
			String set = value1.next();
			System.out.println(set);
		}
		System.out.println("***********************************************");

		for (String getwatch : watch) {
			System.out.println(getwatch);
		}

		System.out.println(System.lineSeparator());

		Integer size1 = 1;
		Integer size2 = 2;
		Integer size3 = 3;
		Integer size4 = 4;
		Integer size5 = 5;
		Integer size6 = 6;
		Integer size7 = 7;
		Integer size8 = 8;
		Integer size9 = 9;
		Integer size10 = 13;
		Integer size11 = 12;
		Integer size12 = 14;
		Integer size13 = 15;
		Integer size14 = 10;
		Integer size15 = 11;

		Collection<Integer> size = new ArrayList<Integer>();
		size.add(size1);
		size.add(size2);
		size.add(size3);
		size.add(size4);
		size.add(size5);
		size.add(size6);
		size.add(size7);
		size.add(size8);
		size.add(size9);
		size.add(size10);
		size.add(size11);
		size.add(size12);
		size.add(size13);
		size.add(size14);
		size.add(size15);

		for (Integer value3 : size) {
			System.out.println(value3);
		}
		System.out.println("***********************************************");
		Iterator<Integer> pet = size.iterator();
		while (pet.hasNext()) {
			Integer getSize = pet.next();
			System.out.println(getSize);
		}
		System.out.println(System.lineSeparator());

		String metroCity1 = "Banglore";
		String metroCity2 = "Hydrabad";
		String metroCity3 = "Mumbai";
		String metroCity4 = "Pune";
		String metroCity5 = "Dehali";

		Collection<String> cityname = new ArrayList<String>();
		cityname.add(metroCity5);
		cityname.add(metroCity4);
		cityname.add(metroCity3);
		cityname.add(metroCity2);
		cityname.add(metroCity1);

		for (String name : cityname) {
			System.out.println(name);

		}
		System.out.println("***********************************************");
		Iterator<String> city = cityname.iterator();
		while (city.hasNext()) {
			String metro = city.next();
			System.out.println(metro);
		}
		System.out.println(System.lineSeparator());

		String compnay1 = "TCS";
		String compnay2 = "Infosis";
		String compnay3 = "wipro";
		String compnay4 = "Accentere";
		String compnay5 = "Tech Mahindra";
		String compnay6 = "Sony";
		String compnay7 = "Philiphs";
		String compnay8 = "Accuvate";
		String compnay9 = "Oracale";
		String compnay10 = "SAP";
		String compnay11 = "Globallogic";
		String compnay12 = "Cube labs";
		String compnay13 = "Team Lease";
		String compnay14 = "Penta amount";
		String compnay15 = "Nevvit Technologies";
		String compnay16 = "Pentagan space";
		String compnay17 = "Blue star";
		String compnay18 = "LG";
		String compnay19 = "Lenevo";
		String compnay20 = "Hp";

		Collection<String> software = new ArrayList<String>();
		software.add(compnay1);
		software.add(compnay2);
		software.add(compnay3);
		software.add(compnay4);
		software.add(compnay5);
		software.add(compnay6);
		software.add(compnay7);
		software.add(compnay8);
		software.add(compnay9);
		software.add(compnay10);
		software.add(compnay11);
		software.add(compnay12);
		software.add(compnay13);
		software.add(compnay14);
		software.add(compnay15);
		software.add(compnay16);
		software.add(compnay17);
		software.add(compnay18);
		software.add(compnay19);
		software.add(compnay20);

		for (String name : software) {
			System.out.println(name);

		}
		System.out.println("***********************************************");
		Iterator<String> compnay = software.iterator();
		while (compnay.hasNext()) {
			String metro = compnay.next();
			System.out.println(metro);
		}

	}

}
