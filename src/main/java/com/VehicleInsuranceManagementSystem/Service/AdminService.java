package com.VehicleInsuranceManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VehicleInsuranceManagementSystem.Entity.AdminEntity;
import com.VehicleInsuranceManagementSystem.Repo.AdminRepo;

	@Service
	public class AdminService {
	    @Autowired
	    private AdminRepo adminRepository;

	    public AdminEntity findByUsername(String username) {
	        return adminRepository.findByUsername(username);
	    }
	}

