package com.xworkz.missiles.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.xworkz.missiles.exceptions.UserNotFoundException;
import com.xworkz.missiles.service.UserDaoService;
import com.xworkz.missiles.user.UserDeatils;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;

	// constructor injection or copy constructor

	public UserController(UserDaoService service) {
		this.service=service;
	}

	@GetMapping("/users")
	public List<UserDeatils> getUsers() {
		return service.findall();

	}
	@GetMapping("/users/{id}") 
	public UserDeatils getUsers(@PathVariable int id) {
		UserDeatils user=service.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id--"+id);
		}
		return user;
		// service.findall();
	}
	
	@PostMapping("/users")
	public void createUser(@Valid @RequestBody UserDeatils deatils) {
		service.save(deatils);
		//URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(null).toUri(); --to get the location of the resource in header
	}
	
	@DeleteMapping("/users/{id}") 
	public void deleteUsers(@PathVariable int id) {
		service.deleteById(id);
		
	
		// service.findall();
	}
	
}
