package com.VehicleInsuranceManagementSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VehicleInsuranceManagementSystem.Entity.PaymentEntity;
import com.VehicleInsuranceManagementSystem.Service.PaymentService;

	@RestController
	@RequestMapping("/payments")
	public class PaymentController {
	    @Autowired
	    private PaymentService paymentService;

	    @GetMapping
	    public List<PaymentEntity> getAllPayments() {
	        return paymentService.getAllPayments();
	    }

	    @GetMapping("/{id}")
	    public PaymentEntity getPaymentById(@PathVariable Long id) {
	        return paymentService.getPaymentById(id);
	    }

	    @PostMapping
	    public PaymentEntity createPayment(@RequestBody PaymentEntity payment) {
	        return paymentService.savePayment(payment);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePayment(@PathVariable Long id) {
	        paymentService.deletePayment(id);
	    }
	}


