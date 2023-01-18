package com.xworkz.crudSpring.services.rule;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.crudSpring.dao.SoldierRepo;
import com.xworkz.crudSpring.dto.SoldierDTO;

public class SoldierServiceImpl implements SoldierService {
	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("Running the SoldierServiceImpl");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("datas of dto=" + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("errors are in the dto");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			System.out.println("no errors are in the dto");
			boolean fight = soldierRepo.fights(dto);
			System.out.println("after validating the dto in repo" + fight);
			return fight;

		}
	}

}
