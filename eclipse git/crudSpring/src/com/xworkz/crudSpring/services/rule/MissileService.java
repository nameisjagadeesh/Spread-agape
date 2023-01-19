package com.xworkz.crudSpring.services.rule;

import com.xworkz.crudSpring.dto.MissileDTO;

public interface MissileService {
	
	boolean validateAndSave(MissileDTO dto);

}
