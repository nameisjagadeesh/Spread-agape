package com.xworkz.aeroplaneSearch.repository;

import com.xworkz.aeroplaneSearch.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	boolean save(AeroplaneEntity entity);
	
	default AeroplaneEntity findBy(int id) {
		return null;
		
		
	}
}
