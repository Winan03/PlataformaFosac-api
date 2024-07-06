package com.mecanicafosac.backend.servicio_pago.src.main.java.com.mecanicafosac.servicio_pago.adapter;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaymentAdapter {

    private final String CULQI_API_URL = "";
    private final String CULQI_API_KEY = "";

    public Map<String, Object> processPayment(Double amount, String currency, String email, String token) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> request = new HashMap<>();
        request.put("amount", (int) (amount * 100));
        request.put("currency_code", currency);
        request.put("email", email);
        request.put("source_id", token);

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + CULQI_API_KEY);
        headers.put("Content-Type", "application/json");

        return restTemplate.postForObject(CULQI_API_URL, request, Map.class, headers);
    }
}