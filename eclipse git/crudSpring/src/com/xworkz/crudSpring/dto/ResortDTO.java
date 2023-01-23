package com.xworkz.crudSpring.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
//this class should not be managed by spring as the properties of this dto changes
//so no @component should be used
public class ResortDTO extends AbstactAuditDTO {

}
