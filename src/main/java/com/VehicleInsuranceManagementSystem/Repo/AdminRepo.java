package com.VehicleInsuranceManagementSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.VehicleInsuranceManagementSystem.Entity.AdminEntity;
@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, Long> {
    AdminEntity findByUsername(String username);
}
