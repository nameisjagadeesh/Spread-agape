package com.xworkz.missiles.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.missiles.dto.MissileDto;
import com.xworkz.missiles.entity.MissileEntity;
import com.xworkz.missiles.repository.MissileRepository;

@Service
public class MissileServiceImplimentaion implements MissileService {

	@Autowired
	private MissileRepository missileRepository;

	public MissileServiceImplimentaion() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<MissileDto>> validateAndSave(MissileDto dto) {
		Validator validator = extracted();
//		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
//		Validator validator=factory.getValidator();
		Set<ConstraintViolation<MissileDto>> violation = validator.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.out.println("there is no violation in dto");
			return violation;
		} else {
			System.out.println("there is a error in the entity");
			MissileEntity entity = new MissileEntity();
			BeanUtils.copyProperties(dto, entity);
			boolean saved = this.missileRepository.save(entity);
			System.out.println("saved repo" + saved);
			System.out.println("entity" + entity);
			return Collections.emptySet();
		}
	}

	private Validator extracted() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}

	@Override
	public MissileDto findById(int id) {
		System.out.println("running findByid in service");
		if (id > 0) {
			MissileEntity entity = this.missileRepository.findById(id);
			if (entity != null) {
				MissileDto dto = new MissileDto();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return MissileService.super.findById(id);
	}

	@Override
	public List<MissileDto> findByName(String name) {
		if (name != null && !name.isEmpty()) {
			List<MissileEntity> entity = this.missileRepository.findByName(name);
			List<MissileDto> list = new ArrayList<MissileDto>();
			for (MissileEntity mEntity : entity) {
				MissileDto dto = new MissileDto();
				BeanUtils.copyProperties(mEntity, dto);
				list.add(dto);
			}
			return list;
		} else {
			System.out.println("data is not found in the missile_Table");
		}
		return MissileService.super.findByName(name);
	}

	@Override
	public Set<ConstraintViolation<MissileDto>> updateAndSave(MissileDto dto) {
		Validator validator = extracted();
		Set<ConstraintViolation<MissileDto>> violation = validator.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.out.println("there is  violation");
			return violation;
		} else {
			System.out.println("there are no violation   in dto ");
			System.out.println(dto);
			MissileEntity entity = new MissileEntity();
			BeanUtils.copyProperties(dto, entity);
			boolean saved = this.missileRepository.update(entity);
			System.out.println("saved entity" + saved);
			System.out.println("entity" + entity);
			System.out.println(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("running deleteByID n service");
		if (id > 0) {
			this.missileRepository.deleteById(id);
		}
		return true;
	}

}
