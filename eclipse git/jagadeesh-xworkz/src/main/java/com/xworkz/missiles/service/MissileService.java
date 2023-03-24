package com.xworkz.missiles.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.missiles.dto.MissileDto;

public interface MissileService {

	Set<ConstraintViolation<MissileDto>> validateAndSave(MissileDto dto);

	Set<ConstraintViolation<MissileDto>> updateAndSave(MissileDto dto);

	default MissileDto findById(int id) {
		return null;

	}

	default List<MissileDto> findByName(String name) {
		return Collections.emptyList();

	}

	boolean deleteById(int id);

	default List<MissileDto> list() {
		return Collections.emptyList();
	}

	default List<MissileDto> findByTwo(String name, String company) {
		return Collections.emptyList();
	}
}
