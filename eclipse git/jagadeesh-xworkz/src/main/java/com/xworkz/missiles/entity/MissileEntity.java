package com.xworkz.missiles.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "missile_table")
@NamedQuery(name = "findByName" ,query = "select str from MissileEntity str where str.name=:na")
public class MissileEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "company")
	private String company;
	@Column(name = "country")
	private String country;
	@Column(name = "price")
	private Double price;
	@Column(name = "type")
	private String type;
}
