package com.VehicleInsuranceManagementSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VehicleInsuranceManagementSystem.Entity.InsuranceEntity;
public interface InsuranceRepo extends JpaRepository<InsuranceEntity, Long> {
	    // Add custom query methods if needed
	}

