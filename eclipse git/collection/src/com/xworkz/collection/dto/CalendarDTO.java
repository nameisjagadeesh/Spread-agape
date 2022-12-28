package com.xworkz.collection.dto;

import java.io.Serializable;

public class CalendarDTO implements Serializable {

	private String name;
	private Integer price;
	private String color;

	public CalendarDTO(String name, Integer price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO) obj;
				if (dto.color.equals(this.color)) {
					System.out.println("color is matching" + dto);
				} else {
					System.err.println("color is not matching" + dto);
				}
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return "CalendarDTO [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
