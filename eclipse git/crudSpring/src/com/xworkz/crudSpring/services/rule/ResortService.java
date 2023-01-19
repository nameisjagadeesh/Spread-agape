package com.xworkz.crudSpring.services.rule;

import com.xworkz.crudSpring.dto.ResortDTO;

public interface ResortService {
	
	boolean validateAndSave(ResortDTO dto);

}
