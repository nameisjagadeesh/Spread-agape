package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalendarDTO;

public class CalendarRunner {

	public static void main(String[] args) {
		CalendarDTO calendarDTO1 = new CalendarDTO("asali", 25, "white");
		CalendarDTO calendarDTO2 = new CalendarDTO("mahalaxmi", 35, "red");
		CalendarDTO calendarDTO3 = new CalendarDTO("customized", 0, "colorfull");
		CalendarDTO calendarDTO4 = new CalendarDTO("shree", 165, "blue");
		CalendarDTO calendarDTO5 = new CalendarDTO("om", 65, "orange");

		Collection<CalendarDTO> collection = new ArrayList<CalendarDTO>();
		collection.add(calendarDTO5);
		collection.add(calendarDTO4);
		collection.add(calendarDTO3);
		collection.add(calendarDTO2);
		collection.add(calendarDTO1);

		boolean equals = calendarDTO1.equals(calendarDTO4);
		System.out.println(equals);

	}

}
