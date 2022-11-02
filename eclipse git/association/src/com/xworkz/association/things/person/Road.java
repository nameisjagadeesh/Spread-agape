package com.xworkz.association.things.person;

 class Road {
	private String name;
	int length;
	double width;
	boolean safe;
	public Road(String name, int length, double width, boolean safe) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.safe = safe;
	}
	void details() {
		System.out.println(this.name);
		System.out.println(this.length);
		System.out.println(this.width);
		System.out.println(this.safe);
	}
	public String getName() {
		return name;
	}

}
