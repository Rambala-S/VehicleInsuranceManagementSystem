package com.VehicleInsuranceManagementSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VehicleInsuranceManagementSystem.Entity.InsuranceEntity;
import com.VehicleInsuranceManagementSystem.Service.InsuranceService;
@RestController
@RequestMapping("/api/insurances")
public class InsuranceController {
    @Autowired
    private InsuranceService insuranceService;
    @PostMapping("/provide")
    public ResponseEntity<InsuranceEntity> provideInsurance(@RequestBody InsuranceEntity insurance) {
        InsuranceEntity providedInsurance = insuranceService.provideInsurance(insurance);
        return ResponseEntity.ok(providedInsurance);
    }
    @GetMapping("/{id}")
    public ResponseEntity<InsuranceEntity> getInsuranceById(@PathVariable Long id) {
        InsuranceEntity insurance = insuranceService.getInsuranceById(id);
        if (insurance == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(insurance);
    }

    @GetMapping
    public List<InsuranceEntity> getAllInsurances() {
        return insuranceService.getAllInsurances();
    }  

    @PutMapping("/update")
    public ResponseEntity<InsuranceEntity> updateInsurance(@RequestBody InsuranceEntity insurance) {
        InsuranceEntity updatedInsurance = insuranceService.updateInsurance(insurance);
        return ResponseEntity.ok(updatedInsurance);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteInsurance(@PathVariable Long id) {
        insuranceService.deleteInsurance(id);
        return ResponseEntity.noContent().build();
    }
}



