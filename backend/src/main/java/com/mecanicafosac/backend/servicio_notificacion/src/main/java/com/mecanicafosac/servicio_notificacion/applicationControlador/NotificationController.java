package com.mecanicafosac.backend.servicio_notificacion.src.main.java.com.mecanicafosac.servicio_notificacion.applicationControlador;



import com.mecanicafosac.backend.servicio_notificacion.src.main.java.com.mecanicafosac.servicio_notificacion.domain.Notification;
import com.mecanicafosac.backend.servicio_notificacion.src.main.java.com.mecanicafosac.servicio_notificacion.domain.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }
}
