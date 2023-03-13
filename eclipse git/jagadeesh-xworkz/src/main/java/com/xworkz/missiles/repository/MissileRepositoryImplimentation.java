package com.xworkz.missiles.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.missiles.entity.MissileEntity;

@Repository
public class MissileRepositoryImplimentation implements MissileRepository {

	@Autowired
	private EntityManagerFactory entityManagerfactory;

	public MissileRepositoryImplimentation() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(MissileEntity entity) {
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public MissileEntity findById(int id) {
		System.out.println("running findById in repo implementation");
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		MissileEntity entity = manager.find(MissileEntity.class, id);
		manager.close();
		return entity;
	}

	@Override
	public List<MissileEntity> findByName(String name) {
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("na", name);
			List<MissileEntity> list = query.getResultList();
			System.out.println("total size of list" + list.size());
			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean update(MissileEntity missileEntity) {
		System.out.println("running update in repo impli");
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(missileEntity);
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("running in deletById in repositery");
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			MissileEntity entity = manager.find(MissileEntity.class, id);
			manager.remove(entity);
			System.out.println("removed " + entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public List<MissileEntity> list() {
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("list");
			List<MissileEntity> list = query.getResultList();
			list.forEach(e -> System.out.println(e));
			System.out.println("list details" + list.size());
			return list;

		} finally {
			manager.close();
		}
       //return MissileRepository.super.list();
	}
}
