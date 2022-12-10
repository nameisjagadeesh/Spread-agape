package com.xworkz.crud_exceptions.repositories;

public interface SweetNameRepository {
	
	boolean prepare(String names);
	
	default int totalSweets() {
		System.out.println("running total sweets");
		return 10;
		
	}

}
