package com.xworkz.crud_exceptions.repositories;

import com.xworkz.crud_exceptions.customExceptions.SweetSizeExceededException;

public class SweetNameRepositoryImpli implements SweetNameRepository {
	private String[] sweets = new String[10];
	private int sweetIndex = 0;

	@Override
	public boolean prepare(String names) {
		System.out.println("running the sweet preparation");
		if (this.sweetIndex > this.sweets.length) {
			throw new SweetSizeExceededException();
		}
		this.sweets[sweetIndex] = names;
		this.sweetIndex++;

		return false;
	}

	@Override
	public int totalSweets() {
		System.out.println("running totalGmails");
		return SweetNameRepository.super.totalSweets();

	}

}
