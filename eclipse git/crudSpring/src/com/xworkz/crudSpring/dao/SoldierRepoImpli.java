package com.xworkz.crudSpring.dao;

import com.xworkz.crudSpring.dto.SoldierDTO;

public class SoldierRepoImpli implements SoldierRepo {

	public SoldierRepoImpli() {
		System.out.println("running the sodlierRepoImpli");
	}

	@Override
	public boolean fights(SoldierDTO dto) {
		// TODO Auto-generated method stub
		return true;
	}

}
