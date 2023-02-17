package com.xworkz.jagadeeshDataModel.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="bakery_dto")
@Data
public class BakeryDto {

	@Column(name="id")
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="owner_name")
	private String ownerName;
	@Column(name="married")
	private Boolean isMarried;
	@Column(name="wife_name")
	private String wifeName;
	@Column(name="since")
	private int since;
	@Column(name="famous_for")
	private String famousFor;
	
}
