package com.xworkz.crudSpring.dao;

import org.springframework.stereotype.Component;

import com.xworkz.crudSpring.dto.MissileDTO;
@Component
public class MissileRepoImpli implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("created save"+getClass().getSimpleName());
		return true;
	}

}
