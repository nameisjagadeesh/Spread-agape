package com.xworkz.crudSpring.boots;

import com.xworkz.crudSpring.dao.SoldierRepo;
import com.xworkz.crudSpring.dao.SoldierRepoImpli;
import com.xworkz.crudSpring.dto.SoldierDTO;
import com.xworkz.crudSpring.services.rule.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("vikramaditya", "airAtacks", 1997, "major", 5);

		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpli();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
	}

}
