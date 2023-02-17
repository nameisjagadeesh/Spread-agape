package com.xworkz.valantineValidation.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valantineValidation.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpli implements ValentineRepository {

	@Autowired
	private EntityManagerFactory managerFactory;

	@Override
	public boolean save(ValentineEntity entity) {
		EntityManager em=this.managerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}
	
	@Override
	public ValentineEntity findById(int id) {
		System.out.println("running the findById "+id);
		EntityManager entityManager=this.managerFactory.createEntityManager();
		ValentineEntity fromDb=entityManager.find(ValentineEntity.class, id);
		entityManager.close();
		return fromDb;
	}

}
