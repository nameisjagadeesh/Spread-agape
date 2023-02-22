package com.xworkz.aeroplaneSearch.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplaneSearch.dto.AeroplaneDto;

public interface AeroplaneService {

	Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto);
	
	default AeroplaneDto findBy(int id) {
		return null;
		
	}
}
