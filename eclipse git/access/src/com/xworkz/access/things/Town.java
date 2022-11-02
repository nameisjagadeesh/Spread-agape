package com.xworkz.access.things;

public class Town {
	private String city = "bengaluru";
	private String name="nelamangala";
	private long population = 6657612L;
	private String type="industry";
	private boolean polluted;
	private double area = 6523;
	private String state="karnataka";
	private char code='T';
	private String mla="dont know";
	private String panchayatName="humid weather";
	private int houses;
	public String getCity() {
		return city;
	}
	 void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	 void setPopulation(long population) {
		this.population = population;
	}
	public String getType() {
		return type;
	}
	 void setType(String type) {
		this.type = type;
	}
	public boolean isPolluted() {
		return polluted;
	}
	 void setPolluted(boolean polluted) {
		this.polluted = polluted;
	}
	public double getArea() {
		return area;
	}
	 void setArea(double area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	 void setState(String state) {
		this.state = state;
	}
	public char getCode() {
		return code;
	}
	 void setCode(char code) {
		this.code = code;
	}
	public String getMla() {
		return mla;
	}
	 void setMla(String mla) {
		this.mla = mla;
	}
	public String getPanchayatName() {
		return panchayatName;
	}
	 void setPanchayatName(String panchayatName) {
		this.panchayatName = panchayatName;
	}
	public int getHouses() {
		return houses;
	}
	 void setHouses(int houses) {
		this.houses = houses;
	}

}
