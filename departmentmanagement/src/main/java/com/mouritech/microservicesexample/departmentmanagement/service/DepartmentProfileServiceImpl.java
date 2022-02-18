package com.mouritech.microservicesexample.departmentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.microservicesexample.departmentmanagement.domain.DepartmentProfile;
import com.mouritech.microservicesexample.departmentmanagement.repository.DepartmentProfileRepository;

@Service
public class DepartmentProfileServiceImpl implements DepartmentProfileService{
	
	@Autowired
	private DepartmentProfileRepository depProfileRepo;

	@Override
	public void addDepartmentProfile(DepartmentProfile depProfile) {
		depProfileRepo.save(depProfile);
		
	}

	@Override
	public List<DepartmentProfile> getDepartmentProfiles() {

		return depProfileRepo.findAll();
	}

}

