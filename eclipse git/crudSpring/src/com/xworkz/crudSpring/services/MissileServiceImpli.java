package com.xworkz.crudSpring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.crudSpring.dao.MissileRepo;
import com.xworkz.crudSpring.dto.MissileDTO;
import com.xworkz.crudSpring.services.rule.MissileService;

@Component
public class MissileServiceImpli implements MissileService {

	@Autowired
	private Validator validator;
	@Autowired
	private MissileRepo missile;

	@Autowired
	public MissileServiceImpli(MissileRepo missile) {
		System.out.println("getting the MissileRepo missile");
		this.missile = missile;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("getting the validate and save");
		Set<ConstraintViolation<MissileDTO>> violation=this.validator.validate(dto);
		if(!violation.isEmpty()) {
			System.err.println("errors are in the dto");
			violation.forEach(e->System.out.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("no errors are in dto");
			boolean saved=missile.save(dto);
			System.out.println("saving"+saved);
			return saved;
		}
		
	}

}
