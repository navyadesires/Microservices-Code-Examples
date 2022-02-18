package com.mouritech.microservicesexample.departmentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.microservicesexample.departmentmanagement.domain.DepartmentProfile;

@Repository
public interface DepartmentProfileRepository extends JpaRepository<DepartmentProfile, Long>{


}
