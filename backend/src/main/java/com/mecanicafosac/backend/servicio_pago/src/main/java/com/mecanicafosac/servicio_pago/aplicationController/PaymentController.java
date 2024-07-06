package com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.aplicationController;

import com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.domain.Payment;
import com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }
}