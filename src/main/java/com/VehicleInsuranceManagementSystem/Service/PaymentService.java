package com.VehicleInsuranceManagementSystem.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VehicleInsuranceManagementSystem.Entity.PaymentEntity;
import com.VehicleInsuranceManagementSystem.Repo.PaymentRepo;
@Service
public class PaymentService {
    @Autowired
    private PaymentRepo paymentRepository;
    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    public PaymentEntity getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public PaymentEntity savePayment(PaymentEntity payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
