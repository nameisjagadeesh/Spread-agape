package com.xworkz.module.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.print.attribute.standard.DateTimeAtCreation;

import lombok.Data;

@Entity
@Table(name = "module_table")
@Data

@NamedQuery(name = "find" ,query = "select ent from ModuleEntity ent")
@NamedQuery(name="user",query = "select count(*)  from ModuleEntity ent where ent.userId=:user")
@NamedQuery(name="number",query = "select count(*)  from ModuleEntity ent where ent.number=:numbers")
@NamedQuery(name="email",query = "select count(*)  from ModuleEntity ent where ent.email=:emails")
@NamedQuery(name="sign",query = "select ent  from ModuleEntity ent where ent.userId=:uby")
@NamedQuery(name = "loginCount" ,query = "update ModuleEntity ent set ent.signInCount=:lc where ent.userId=:ui")
@NamedQuery(name = "passUpdate", query = "update ModuleEntity ent set ent.password=:pby , ent.passwordReset=:rby,ent.passTimeOut=:tby where ent.userId=:vby")
@NamedQuery(name = "userEmail",query = "select ent from ModuleEntity ent where ent.email=:eby ")
public class ModuleEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "userId")
	private String userId;
	@Column(name = "number")
	private long number;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "createdDate")
	private LocalDate createdDate;
	@Column(name = "updatedBy")
	private String updatedBy;
	@Column(name = "updatedDate")
	private LocalDate updatedDate;
	@Column(name = "agreement")
	private boolean agreement;
	@Column(name = "signCount")	
	private int signInCount;
	@Column(name = "passwordReset")	
	private Boolean passwordReset;
	
	@Column(name = "passTimeOut")	
	private LocalTime passTimeOut;
	
	@Column(name = "picPath")	
	private String picPath;
	
	//EAGER is to load both parent entity along with child entities
	@OneToMany(mappedBy = "moduleEntity" ,fetch = FetchType.LAZY,cascade = CascadeType.PERSIST) //moduleEntities can have different properties
	private List<TechnologiesEntity> tech; //=new ArrayList<TechnologiesEntity>();
}
