package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.HolidayDTO;

public class HolidaysRunner {

	public static void main(String[] args) {
		HolidayDTO holidayDTO1 = new HolidayDTO("DasaraHoliday", 25, "mysore");
		HolidayDTO holidayDTO2 = new HolidayDTO("diwali", 5, "hometown");
		HolidayDTO holidayDTO3 = new HolidayDTO("summer", 12, "abroad");
		HolidayDTO holidayDTO4 = new HolidayDTO("sankrati", 3, "westernGhats");
		HolidayDTO holidayDTO5 = new HolidayDTO("december offs", 14, "usa");

		Collection<HolidayDTO> collection = new ArrayList<HolidayDTO>();
		collection.add(holidayDTO5);
		collection.add(holidayDTO4);
		collection.add(holidayDTO3);
		collection.add(holidayDTO2);
		collection.add(holidayDTO1);

		collection.stream().filter(dto -> dto.getPlaceVisited() == "abroad").collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));

		boolean equals = holidayDTO1.equals(holidayDTO5);
		System.out.println(equals);

	}

}
