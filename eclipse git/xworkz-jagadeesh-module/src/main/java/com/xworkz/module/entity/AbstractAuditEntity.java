package com.xworkz.module.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data

public class AbstractAuditEntity {

	private String createdBy;

	private LocalDateTime createdDate;

	private String updatedBy;
	private LocalDateTime updatedDate;
}
