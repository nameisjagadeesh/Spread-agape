package com.xworkz.crudSpring.dao;

import org.springframework.stereotype.Component;

import com.xworkz.crudSpring.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpli implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("running save in repoimpli" + dto.getClass().getSimpleName());

		return false;
	}

}
