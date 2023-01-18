package com.xworkz.crudSpring.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class AbstactAuditDTO implements Serializable {

	private String cretedBy;
	private LocalDateTime cretedDate;
	private String updatedBy;
	private LocalDateTime updatedDate;

}
