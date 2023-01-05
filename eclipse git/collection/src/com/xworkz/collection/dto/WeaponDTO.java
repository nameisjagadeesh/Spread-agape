package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collection.constants.Type;

public class WeaponDTO implements Serializable{
	
	private String name;
	private String madeBy;
	private String madeOn;
	private Double price;
	private Type type=Type.SNIPER;
	public WeaponDTO(String name, String madeBy, String madeOn, Double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto=(WeaponDTO) obj;
				if(dto.madeBy.equals(this.madeBy)) {
					System.out.println("the madeby is matching"+dto);
					return true;
				}
				else {
					System.out.println("the madeby is not matching"+dto);
				}
			}
		}
		return false;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public String getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	


}
