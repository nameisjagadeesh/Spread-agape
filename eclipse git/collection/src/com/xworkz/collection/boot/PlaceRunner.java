package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO placeDTO1 = new PlaceDTO("Vijayapura", 'V', "Karnataka");
		PlaceDTO placeDTO2 = new PlaceDTO("vizag", 'B', "andraPradesh");
		PlaceDTO placeDTO3 = new PlaceDTO("pondycherry", 'P', "TN");
		PlaceDTO placeDTO4 = new PlaceDTO("kashmir", 'K', "J&K");
		PlaceDTO placeDTO5 = new PlaceDTO("delhi", 'D', "Delhi");

		Collection<PlaceDTO> collection = new ArrayList<PlaceDTO>();
		collection.add(placeDTO5);
		collection.add(placeDTO4);
		collection.add(placeDTO3);
		collection.add(placeDTO2);
		collection.add(placeDTO1);

		boolean equals = placeDTO1.equals(placeDTO5);
		System.out.println(equals);

	}

}
