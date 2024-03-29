package com.xworkz.module.respository;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import com.xworkz.module.entity.ModuleEntity;
import com.xworkz.module.entity.TechnologiesEntity;

public interface ModuleRepository {

	boolean save(ModuleEntity entity);

	default List<ModuleEntity> findAll() {
		return Collections.emptyList();

	}

	default Long findByUser(String user) {
		return null;
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByNumber(Long number) {
		return null;
	}

	default ModuleEntity signIn(String user) {
		return null;

	}
	
	default ModuleEntity resetPassword(String email) {
		return null;
		
	}
	

	boolean login(String user, int count);

	boolean updateUser(ModuleEntity entity);

	boolean passwordUpdate(String userId, String password, Boolean passwordReset,LocalTime timeout);

	boolean techSave(TechnologiesEntity techEnt);
	
	default List<TechnologiesEntity> showTech(String viewer){
		return null;
		
	}
	
}
