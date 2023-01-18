package com.xworkz.crudSpring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.crudSpring.dao.SoldierRepo;
import com.xworkz.crudSpring.dto.SoftwareDTO;
import com.xworkz.crudSpring.services.rule.SoftwareService;

public class SoftwareServiceImpl implements SoftwareService {
	
	

	public SoftwareServiceImpl() {
		System.out.println("Running SoftwareServiceImpl");
	}
	
	

	@Override
	public boolean develop(SoftwareDTO dto) {
		System.out.println("Running the developer test");
		System.out.println("dto accessed are =" + dto);

		// the bellow methods are done through quarkus validators
		ValidatorFactory factory = new Validation().buildDefaultValidatorFactory();
		// the above factory using the new keyword will not make good code as the
		// buildfactory is static
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoftwareDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {

			System.err.println("errors present in dto datas");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;

		} else {
			System.out.println("there are no errors in the dto datas,all are matched the validation requirements");
			
			return true;

		}

	}

}
