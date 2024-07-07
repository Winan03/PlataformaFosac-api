package com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mecanicafosac.backend.servicio_notificacion.src.main.java.com.mecanicafosac.servicio_notificacion.domain.Notification;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;
    private String password;

    @OneToMany(mappedBy = "destinatario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Notification> notificaciones;
}
