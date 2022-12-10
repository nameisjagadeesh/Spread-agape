package com.xworkz.crud_exceptions.boot;

import com.xworkz.crud_exceptions.repositories.SweetNameRepository;
import com.xworkz.crud_exceptions.repositories.SweetNameRepositoryImpli;

public class SweetsRunner {

	public static void main(String[] args) {
		SweetNameRepository nameRepository=new SweetNameRepositoryImpli();
		nameRepository.prepare("mysore pak");
		nameRepository.prepare("jaamuun");
		nameRepository.prepare("rasagulla");
		nameRepository.prepare("kesaribath");
		nameRepository.prepare("paisa");
		nameRepository.prepare("barfi");
		nameRepository.prepare("jalebi");
		nameRepository.prepare("rasmalai");
		nameRepository.prepare("laddus");
		nameRepository.prepare("obbattu");
		//nameRepository.prepare("sugar");
		System.out.println(nameRepository.totalSweets());
	}

}
