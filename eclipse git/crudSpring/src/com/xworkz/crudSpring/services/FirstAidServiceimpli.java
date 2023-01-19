package com.xworkz.crudSpring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.crudSpring.dao.FirstAidRepo;
import com.xworkz.crudSpring.dto.FirstAidDTO;
import com.xworkz.crudSpring.services.rule.FirstIAidService;

@Component
public class FirstAidServiceimpli implements FirstIAidService {
	@Autowired
	private Validator validator;
	@Autowired
	private FirstAidRepo aidRepo;

	@Autowired
	public FirstAidServiceimpli(FirstAidRepo aidRepo) {
		this.aidRepo = aidRepo;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running the validate and save" + dto);
		Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("errors are in dto");
			violation.forEach(e -> System.err.println(e.getMessage()));
			return false;
		} else {
			System.out.println("no errors in the dto");
			boolean saved = this.aidRepo.save(dto);
			return saved;

		}

	}

}
