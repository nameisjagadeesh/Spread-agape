package com.xworkz.valantineValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valantineValidation.dto.ValentineDTO;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);
	
	default ValentineDTO findById(int id) {
		
		return null;
	}
}
