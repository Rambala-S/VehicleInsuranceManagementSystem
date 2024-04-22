package com.VehicleInsuranceManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VehicleInsuranceManagementSystem.Entity.InsuranceEntity;
import com.VehicleInsuranceManagementSystem.Repo.InsuranceRepo;

import java.util.List;
@Service
	public class InsuranceService {
	    
	    @Autowired
	    private InsuranceRepo insuranceRepository;

	    // Method to provide insurance for a new car or change policy for an existing customer
	    public InsuranceEntity provideInsurance(InsuranceEntity insurance) {
	        // Implement logic to provide insurance (e.g., save insurance details)
	        return insuranceRepository.save(insurance);
	    }

	    // Method to retrieve insurance by ID
	    public InsuranceEntity getInsuranceById(Long id) {
	        return insuranceRepository.findById(id).orElse(null);
	    }
	    // Method to retrieve all insurances
	    public List<InsuranceEntity> getAllInsurances() {
	        return insuranceRepository.findAll();
	    }
	    // Method to update insurance details
	    public InsuranceEntity updateInsurance(InsuranceEntity insurance) {
	        // Implement logic to update insurance details
	        return insuranceRepository.save(insurance);
	    }

	    // Method to delete insurance
	    public void deleteInsurance(Long id) {
	        // Implement logic to delete insurance
	        insuranceRepository.deleteById(id);
	    }
	}




