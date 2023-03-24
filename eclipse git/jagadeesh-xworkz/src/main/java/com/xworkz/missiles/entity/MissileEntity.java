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
@NamedQuery(name = "list",query = "select ent from MissileEntity ent")
@NamedQuery(name = "lists",query = "select ktr from MissileEntity ktr where ktr.name=:nby or ktr.company=:cby" )
public class MissileEntity {
//select entity from SareeEntity entity where entity.name=:nameby or entity.color=:colorby
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
