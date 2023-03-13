package com.xworkz.missiles.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.missiles.entity.MissileEntity;

public interface MissileRepository {

	boolean save(MissileEntity entity);

	boolean update(MissileEntity missileEntity);

	default MissileEntity findById(int id) {
		return null;

	}

	default List<MissileEntity> findByName(String name) {
		return Collections.emptyList();

	}

	boolean deleteById(int id);

	default List<MissileEntity> list() {
		return Collections.emptyList();
	}
}
