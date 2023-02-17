package com.xworkz.valantineValidation.repository;

import com.xworkz.valantineValidation.entity.ValentineEntity;

public interface ValentineRepository {

	boolean save(ValentineEntity entity);
	
	default ValentineEntity findById(int id) {
		
		return null;
	}
}
