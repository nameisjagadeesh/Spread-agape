package com.xworkz.aeroplaneSearch.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplaneSearch.dto.AeroplaneDto;
import com.xworkz.aeroplaneSearch.entity.AeroplaneEntity;
import com.xworkz.aeroplaneSearch.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceimpli implements AeroplaneService {
	@Autowired
	private AeroplaneRepository repositery;

	public AeroplaneServiceimpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto) {
               ValidatorFactory validation=Validation.buildDefaultValidatorFactory();
               Validator validator=validation.getValidator();
               Set<ConstraintViolation<AeroplaneDto>> violation=validator.validate(dto);
               if (violation != null && !violation.isEmpty()) {
       			System.err.println("constraintViolations exists in service");
       			
       		} 
       		else {
       			System.out.println("constraintViolations does not exist");
       			AeroplaneEntity entity = new AeroplaneEntity();
       			entity.setCompany(dto.getCompany());
       			entity.setCost(dto.getCost());
       			entity.setCountry(dto.getCountry());
       			entity.setName(dto.getName());
       			entity.setType(dto.getType());
       			boolean saved = this.repositery.save(entity);
       			System.out.println(saved);
       			System.out.println("DTO" + dto);
       			System.out.println("Entity is " + entity);
       			return Collections.emptySet();
       		}
			return null;

       	}
		
	

	@Override
	public AeroplaneDto findBy(int id) {
		if (id > 0) {
			AeroplaneEntity entity = this.repositery.findBy(id);
			if (entity != null) {
				AeroplaneDto dto = new AeroplaneDto();
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setName(entity.getName());
				dto.setType(entity.getType());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AeroplaneService.super.findBy(id);

	}



	
}

