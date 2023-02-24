package com.xworkz.valantineValidation.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FindAreaByNameRunner {
	public static void main(String[] args) {
		System.out.println("Running the FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query=manager.createNamedQuery("findAreaByName");
		Object obj=query.getSingleResult();
		Double area=(Double)obj;
		System.out.println(area);
		manager.close();
	}
}
