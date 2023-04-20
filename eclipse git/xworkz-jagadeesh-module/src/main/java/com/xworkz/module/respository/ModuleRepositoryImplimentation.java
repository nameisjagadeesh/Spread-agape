package com.xworkz.module.respository;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.module.entity.ModuleEntity;
import com.xworkz.module.entity.TechnologiesEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ModuleRepositoryImplimentation implements ModuleRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ModuleRepositoryImplimentation() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ModuleEntity entity) {
		System.out.println(entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}

	}

	@Override
	public List<ModuleEntity> findAll() {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("find");
			List<ModuleEntity> list = query.getResultList();
			log.info("total list size" + list.size());
			return list;

		} finally {
			manager.close();
		}
	}

	@Override
	public Long findByUser(String user) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("user");
			query.setParameter("user", user);
			Object obj = query.getSingleResult();
			Long casted = (Long) obj;
			log.info("casted here user" + casted);
			return casted;
		} finally {
			manager.close();
		}
	}

	@Override
	public Long findByEmail(String email) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("email");
			query.setParameter("emails", email);
			Object obj = query.getSingleResult();
			Long casted = (Long) obj;
			log.info("casted email n printed" + casted);
			return casted;

		} finally {
			manager.close();
		}
	}

	@Override
	public Long findByNumber(Long number) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("number");
			query.setParameter("numbers", number);
			Object obj = query.getSingleResult();
			Long casted = (Long) obj;
			log.info("casted number n printed" + casted);
		} finally {
			manager.close();
		}
		return ModuleRepository.super.findByNumber(number);
	}

	@Override
	public ModuleEntity signIn(String user) {
		log.info("user---" + user);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("sign");
			query.setParameter("uby", user);

			Object object = query.getSingleResult();
			ModuleEntity casted = (ModuleEntity) object;// downcasting
			log.info("casted " + casted);
			return casted;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean login(String user, int count) {
		log.info("count--" + count);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("loginCount");
			query.setParameter("lc", count);
			query.setParameter("ui", user);
			query.executeUpdate();
			transaction.commit();
			// Object object=query.getSingleResult();
			return true;

		} finally {
			manager.close();
		}

	}

	@Override
	public boolean updateUser(ModuleEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}
	}

	@Override
	public boolean passwordUpdate(String userId, String password, Boolean passwordReset, LocalTime timeout) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("passUpdate");
			query.setParameter("pby", password);
			query.setParameter("rby", passwordReset);
			query.setParameter("vby", userId);
			query.setParameter("tby", timeout);
			query.executeUpdate();
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}
	}

	@Override
	public ModuleEntity resetPassword(String email) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("userEmail");
			query.setParameter("eby", email);
			Object object = query.getSingleResult();
			ModuleEntity casted = (ModuleEntity) object;
			log.info("--" + casted);
			return casted;

		} finally {
			manager.close();
		}
	}

	@Override
	public boolean techSave(TechnologiesEntity techEnt) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction  =manager.getTransaction();
			transaction.begin();
			manager.persist(techEnt);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

}
