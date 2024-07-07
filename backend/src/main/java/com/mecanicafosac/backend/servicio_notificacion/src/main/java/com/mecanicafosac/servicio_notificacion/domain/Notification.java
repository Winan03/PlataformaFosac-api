package com.mecanicafosac.backend.servicio_notificacion.src.main.java.com.mecanicafosac.servicio_notificacion.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.domain.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Usuario destinatario;


}
