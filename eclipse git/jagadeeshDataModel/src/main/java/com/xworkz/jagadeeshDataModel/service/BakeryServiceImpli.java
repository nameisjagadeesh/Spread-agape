package com.xworkz.jagadeeshDataModel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.jagadeeshDataModel.dto.BakeryDto;
import com.xworkz.jagadeeshDataModel.repository.BakeryRepo;

@Service
public class BakeryServiceImpli implements BakeryService {

	@Autowired
	private BakeryRepo bakeryRepo;
	
	public BakeryServiceImpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	@Override
	public boolean validateAndSave(BakeryDto dto) {
		System.out.println("running the validateAndSave");
		boolean save=this.bakeryRepo.save(dto);
		System.out.println("saved "+save);
		return false;
	}

}
