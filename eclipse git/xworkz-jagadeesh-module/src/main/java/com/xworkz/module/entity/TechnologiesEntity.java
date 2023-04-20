package com.xworkz.module.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TechTable")
public class TechnologiesEntity extends AbstractAuditEntity {
	@Id
	@Column(name = "t_id")
	private int t_id;

	@Column(name = "name")
	private String name;

	@Column(name = "language")
	private String language;

	@Column(name = "version")
	private String version;

	@Column(name = "owner")
	private String owner;

	@Column(name = "supportFrom")
	private String supportFrom;

	@Column(name = "supportTo")
	private String supportTo;

	@Column(name = "license")
	private String license;

	@Column(name = "openSource")
	private String openSource;

	@Column(name = "osType")
	private String osType;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private ModuleEntity moduleEntity;

	@Column(name = "createdBy")
	@Override
	public String getCreatedBy() {
		
		return super.getCreatedBy();
	}

	@Column(name = "createdDate")
	@Override
	public LocalDateTime getCreatedDate() {
		
		return super.getCreatedDate();
	}

	@Column(name = "updatedBy")
	@Override
	public String getUpdatedBy() {
		
		return super.getUpdatedBy();
	}

	@Column(name = "updatedDate")
	@Override
	public LocalDateTime getUpdatedDate() {
		
		return super.getUpdatedDate();
	}

	//@Column(name = "createdBy")
	@Override
	public void setCreatedBy(String createdBy) {
		this.setCreatedBy(moduleEntity.getUserId());
		super.setCreatedBy(createdBy);
	}

	@Override
	public void setCreatedDate(LocalDateTime createdDate) {
		this.setCreatedDate(LocalDateTime.now());
		super.setCreatedDate(createdDate);
	}

	@Override
	public void setUpdatedBy(String updatedBy) {
		 
		super.setUpdatedBy(updatedBy);
	}

	@Override
	public void setUpdatedDate(LocalDateTime updatedDate) {
		
		super.setUpdatedDate(updatedDate);
	}
}
