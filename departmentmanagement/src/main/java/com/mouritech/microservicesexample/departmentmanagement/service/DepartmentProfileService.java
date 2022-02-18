package com.mouritech.microservicesexample.departmentmanagement.service;

import java.util.List;

import com.mouritech.microservicesexample.departmentmanagement.domain.DepartmentProfile;

public interface DepartmentProfileService {

	void addDepartmentProfile(DepartmentProfile depProfile);
	List<DepartmentProfile> getDepartmentProfiles();
}

