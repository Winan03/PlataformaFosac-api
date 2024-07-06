package com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}