package com.VehicleInsuranceManagementSystem.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VehicleInsuranceManagementSystem.Entity.PaymentEntity;
@Repository
public interface PaymentRepo extends JpaRepository<PaymentEntity, Long> {

	List<PaymentEntity> findAll();
    // Additional methods if needed
}
