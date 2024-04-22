package com.VehicleInsuranceManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.VehicleInsuranceManagementSystem.Entity.AdminEntity;
import com.VehicleInsuranceManagementSystem.Service.AdminService;
@Controller
public class AdminController {
	@Autowired
	private AdminService adminservice;
	
    @GetMapping("/admin")
    public AdminEntity adminDashboard(String username) {
        return adminservice.findByUsername(username); // Thymeleaf template for admin dashboard
    }

    // Add more mappings for other admin functionalities
}

