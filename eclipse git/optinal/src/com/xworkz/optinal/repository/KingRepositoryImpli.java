package com.xworkz.optinal.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KingRepositoryImpli implements KingsRepository {

	private List<String> kings = new ArrayList<String>();

	@Override
	public boolean save(String king) {
		System.out.println("king save ");
		return this.kings.add(king);
	}
	@Override
	public Optional<String> find(String args) {
		for (String string : kings) {
			
		}	
		
		return KingsRepository.super.find(args);
	}

}
