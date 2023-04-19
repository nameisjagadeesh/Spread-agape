package com.xworkz.missiles.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.xworkz.missiles.user.UserDeatils;

@Component
public class UserDaoService {

	private static List<UserDeatils> users=new ArrayList<>();
	
	private static int count=0;
	static {
		users.add(new UserDeatils(++count,"jagadeesh",LocalDate.now().minusYears(25)));
		users.add(new UserDeatils(++count,"jai",LocalDate.now().minusYears(22)));
		users.add(new UserDeatils(++count,"rudra",LocalDate.now().minusYears(24)));
		users.add(new UserDeatils(++count,"prashant",LocalDate.now().minusYears(23)));
	}
	
	
	public List<UserDeatils> findall() {
		return users;
	}
	
	public UserDeatils findOne(int id) {
		Predicate<? super UserDeatils> predicate=user->user.getId().equals(id); // predicate will check to match the user
		return users.stream().filter(predicate).findFirst().orElse(null);//get method will throw error if not matched 
		
	}
	
	public UserDeatils  save(UserDeatils details) {
		details.setId(++count);//to auto increment of id
		users.add(details);
		return details;
	}
	public void deleteById(int id) { //it will delete using talend API
		Predicate<? super UserDeatils> predicate=user->user.getId().equals(id); // predicate will check to match the user
	    users.removeIf(predicate);
		//return users.stream().filter(predicate).findFirst().orElse(null);//get method will throw error if not matched 
		
	}
	
	
	
}
