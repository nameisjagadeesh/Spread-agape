package com.xworkz.collection.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable {
	private String nameOfHoliday;
	private Integer noOfHolidays;
	private String placeVisited;

	@Override
	public String toString() {
		return "HolidayDTO [nameOfHoliday=" + nameOfHoliday + ", noOfHolidays=" + noOfHolidays + ", placeVisited="
				+ placeVisited + "]";
	}

	public HolidayDTO(String nameOfHoliday, Integer noOfHolidays, String placeVisited) {
		super();
		this.nameOfHoliday = nameOfHoliday;
		this.noOfHolidays = noOfHolidays;
		this.placeVisited = placeVisited;
	}
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof HolidayDTO ) {
				HolidayDTO dto=(HolidayDTO) obj;
				if(dto.noOfHolidays.equals(this.noOfHolidays)) {
					System.out.println("no of holidays are matched"+dto);
					return true;
				}
				else {
					System.err.println("no of holidays are not matched"+dto);
				}
			}
		}
		return false;
		
	}

	public String getNameOfHoliday() {
		return nameOfHoliday;
	}

	public void setNameOfHoliday(String nameOfHoliday) {
		this.nameOfHoliday = nameOfHoliday;
	}

	public Integer getNoOfHolidays() {
		return noOfHolidays;
	}

	public void setNoOfHolidays(Integer noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}

	public String getPlaceVisited() {
		return placeVisited;
	}

	public void setPlaceVisited(String placeVisited) {
		this.placeVisited = placeVisited;
	}

}
