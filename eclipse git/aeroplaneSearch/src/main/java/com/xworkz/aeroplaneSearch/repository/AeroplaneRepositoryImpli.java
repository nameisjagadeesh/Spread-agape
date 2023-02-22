package com.xworkz.aeroplaneSearch.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplaneSearch.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImpli implements AeroplaneRepository {
	
	@Autowired
		private EntityManagerFactory entityManagerFactory;

		public AeroplaneRepositoryImpli() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		@Override
		public boolean save(AeroplaneEntity entity) {
			EntityManager em = this.entityManagerFactory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(entity);
			transaction.commit();
			em.close();
			return true;
		}
		@Override
			public AeroplaneEntity findBy(int id) {
			System.out.println("find by id in repo.." + id);
			EntityManager entitymanager = this.entityManagerFactory.createEntityManager();
			AeroplaneEntity fromDb=entitymanager.find(AeroplaneEntity.class,id);
			entitymanager.close();
			return fromDb;
			}
}
