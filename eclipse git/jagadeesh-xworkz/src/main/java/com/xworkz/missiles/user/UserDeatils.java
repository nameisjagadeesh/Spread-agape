package com.xworkz.missiles.user;

import java.time.LocalDate;

//DAO-Data Access Object...

public class UserDeatils {

	@Override
	public String toString() {
		return "UserDeatils [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	public UserDeatils(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	private Integer id;
	private String name;
	private LocalDate birthDate;

}
