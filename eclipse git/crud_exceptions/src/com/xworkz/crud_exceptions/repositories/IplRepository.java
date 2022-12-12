package com.xworkz.crud_exceptions.repositories;

import com.xworkz.crud_exceptions.dto.IplDTO;

public interface IplRepository {
	boolean makeTeam(IplDTO dto);

	default int total() {
		return 0;
	}

}
