package com.xworkz.optinal.repository;

import java.util.Optional;

public interface KingsRepository {

	boolean save(String king);
	
	default Optional<String> find(String name){
		
		return null;
	}
}
