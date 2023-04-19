package com.xworkz.module.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.module.dto.ModuleDTO;

public interface ModuleService {

	Set<ConstraintViolation<ModuleDTO>> validateAndSave(ModuleDTO dto);

	boolean sendMail(String email,String text);
	
	default List<ModuleDTO> findAll(){
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
	
	default ModuleDTO signIn(String user,String password) {
		return null;
		
		
	}
	default ModuleDTO resetPass(String email) {
		return null;
		
	}
	default ModuleDTO updatePass(String userId,String password,String confirmPassword) {
		return null;
		
	}
	default ModuleDTO profileUpdate(String userId,String email,Long mobile,String path) {
		return null;
		
	}
}
