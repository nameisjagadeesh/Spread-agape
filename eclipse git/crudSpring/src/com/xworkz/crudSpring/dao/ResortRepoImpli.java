package com.xworkz.crudSpring.dao;

import org.springframework.stereotype.Component;

import com.xworkz.crudSpring.dto.ResortDTO;

@Component
public class ResortRepoImpli implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("class getting"+getClass().getSimpleName());
		return false;
	}

}
