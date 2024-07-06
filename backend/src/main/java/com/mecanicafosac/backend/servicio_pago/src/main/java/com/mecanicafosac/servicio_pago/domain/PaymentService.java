package com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.domain;


import com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.adapter.PaymentAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}