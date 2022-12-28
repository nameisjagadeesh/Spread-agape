package com.xworkz.collection.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
	private String name;
	private Character code;
	private String state;

	public PlaceDTO(String name, Character code, String state) {
		super();
		this.name = name;
		this.code = code;
		this.state = state;
	}
	public boolean equals (Object obj) {
		if(obj !=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)obj;
				if(dto.state.equals(this.state)) {
					System.out.println("state is matched"+dto);
					return true;
				}
				else {
					System.err.println("state is not matched"+dto);
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", code=" + code + ", state=" + state + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getCode() {
		return code;
	}

	public void setCode(Character code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
