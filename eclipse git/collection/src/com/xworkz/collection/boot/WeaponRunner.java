package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		Collection<WeaponDTO> collection = new ArrayList<WeaponDTO>();
		collection.add(new WeaponDTO("Sword", "warriors", "ages ago", 65212D, Type.AXE));
		collection.add(new WeaponDTO("knife", "users", "ancients", 212D, Type.MACE));
		collection.add(new WeaponDTO("rifle", "army", "medievle time", 5212D, Type.RIFLE));
		collection.add(new WeaponDTO("axe", "hunters", "ages ago", 6522D, Type.AXE));
		collection.add(new WeaponDTO("pike", "micerons", "old time", 65212D, Type.AXE));
		collection.add(new WeaponDTO("lance", "forsters", "centuries ago", 85212D, Type.SPEAR));
		collection.add(new WeaponDTO("akm", "extremist", "long back", 6585D, Type.SNIPER));
		collection.add(new WeaponDTO("gagger", "warriors", "recently", 32212D, Type.AXE));
		collection.add(new WeaponDTO("sabre", "warriors", "ages ago", 62212D, Type.AXE));
		collection.add(new WeaponDTO("bow", "fighters", "ages ago", 1265D, Type.AXE));
		collection.add(new WeaponDTO("ballista", "hunter", "ages ago", 5624D, Type.MACE));
		collection.add(new WeaponDTO("javelin", "warriors", "ice age", 9856D, Type.AXE));
		collection.add(new WeaponDTO("longbow", "warriors", "during war", 2365D, Type.AXE));
		collection.add(new WeaponDTO("guns", "common people", "recentlt", 5623D, Type.RIFLE));
		collection.add(new WeaponDTO("shells", "gravers", "modern time", 742D, Type.AXE));
		collection.add(new WeaponDTO("grenede", "terrorist", "medievel time", 9512D, Type.SPEAR));
		collection.add(new WeaponDTO("lightsaers", "users", "modern time", 7536D, Type.AXE));
		collection.add(new WeaponDTO("glavie", "army", "recently", 32569D, Type.AXE));
		collection.add(new WeaponDTO("pokeball", "forsesters", "ancient time", 14669D, Type.SPEAR));
		collection.add(new WeaponDTO("phaser", "extremists", "recently", 8462D, Type.AXE));

		Stream.of(collection).collect(Collectors.toList());
		// collection.stream().collect(Collectors.toList()).forEach(e->
		// System.out.println(e));
		collection.stream().map(e -> e.getPrice() > 25000D).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		collection.stream().filter(e -> e.getMadeBy() == "warriors" && e.getMadeOn() == "ancient time")
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));
		// collection.stream().sorted().filter(e -> e.getMadeBy() ==
		// "army").collect(Collectors.toList())
		// .forEach(e -> System.out.println(e));
		System.out.println("sorting by name order");
		Comparator<WeaponDTO> comparator1 = (a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()); // to sort
		collection.stream().sorted(comparator1).forEach(e -> System.out.println(e));
		System.out.println("sorting by made by ascending order");
		collection.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("sorting by madeon descending order");
		collection.stream().sorted((a1, a2) -> a2.getMadeOn().compareTo(a1.getMadeOn())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("sorting based upon price ascescending");
		collection.stream().sorted((a1, a2) -> a1.getPrice().compareTo(a2.getPrice())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("sorting based upon price decescending");
		collection.stream().sorted((a1, a2) -> a2.getPrice().compareTo(a1.getPrice())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("name and made on sorted");
		collection.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
				.forEach(e -> System.out.println(e.getName() + "~~" + e.getMadeOn()));
		System.out.println("sorted by type,madeby and name decending order");
		collection.stream().sorted((a1, a2) -> a1.getType().compareTo(a2.getType()))
				.sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
				.sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.forEach(e -> System.out.println(e.getType() + "==" + e.getName() + "==" + e.getMadeBy()));

	}

}
