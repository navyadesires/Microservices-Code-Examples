package com.mouritech.microservicesexample.departmentmanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dep_profile")
public class DepartmentProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dep_id")
	private Long depId;
	
	@Column(name = "dep_name")
	private String depName;
	
	@Column(name = "dep_address")
	private String depAddress;
	
	public DepartmentProfile() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentProfile(Long depId, String depName, String depAddress) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depAddress = depAddress;
	}

	public DepartmentProfile(String depName, String depAddress) {
		super();
		this.depName = depName;
		this.depAddress = depAddress;
	}

	public Long getDepId() {
		return depId;
	}

	public void setDepId(Long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepAddress() {
		return depAddress;
	}

	public void setDepAddress(String depAddress) {
		this.depAddress = depAddress;
	}
	
	

}