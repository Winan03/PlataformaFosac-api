package com.mecanicafosac.backend.servicio_notificacion.src.main.java.com.mecanicafosac.servicio_notificacion.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
