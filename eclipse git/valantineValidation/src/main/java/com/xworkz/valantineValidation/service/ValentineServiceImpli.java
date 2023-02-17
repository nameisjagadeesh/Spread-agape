package com.xworkz.valantineValidation.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valantineValidation.dto.ValentineDTO;
import com.xworkz.valantineValidation.entity.ValentineEntity;
import com.xworkz.valantineValidation.repository.ValentineRepository;

@Service
public class ValentineServiceImpli implements ValentineService {

	@Autowired
	private ValentineRepository valentine;

	@Override
	public ValentineDTO findById(int id) {
		if (id > 0) {
			ValentineEntity entity = this.valentine.findById(id);
			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				ValentineDTO dto = new ValentineDTO();
				dto.setGift(entity.getGift());
				dto.setName(entity.getName());
				dto.setPlace(entity.getPlace());
				dto.setValentine(entity.getValentine());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return ValentineService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violation = validator.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.err.println("errors in dto" + dto);
			return violation;
		} else {
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentine(dto.getValentine());
			entity.setGift(dto.getGift());
			entity.setPlace(dto.getPlace());
			boolean saved = this.valentine.save(entity);
			System.out.println("dto saved in service" + saved);
			System.out.println("no violations in dto");
			return Collections.emptySet();
		}

	}

}
