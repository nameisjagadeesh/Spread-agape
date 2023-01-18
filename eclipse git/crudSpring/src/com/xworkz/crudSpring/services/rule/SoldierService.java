package com.xworkz.crudSpring.services.rule;

import com.xworkz.crudSpring.dto.SoldierDTO;

public interface SoldierService {
	
	boolean validateAndSave(SoldierDTO dto);

}
