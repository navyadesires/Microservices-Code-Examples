package com.mouritech.microservicesexample.departmentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.microservicesexample.departmentmanagement.domain.DepartmentProfile;
import com.mouritech.microservicesexample.departmentmanagement.service.DepartmentProfileService;

@RestController
@RequestMapping(value = "/")
public class DapartmentProfileController {
	
	@Autowired
	private DapartmentProfileController deptProfileService;
	
	@PostMapping
	public void addDepartentProfile(@RequestBody DapartmentProfileController depProfile) {
	 deptProfileService.addDepartentProfile(depProfile);
	}
	
	@GetMapping
	public List<DepartmentProfile> getDepartentProfiles() {

		return deptProfileService.getDepartentProfiles();
	}
}
