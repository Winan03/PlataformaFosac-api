package com.grupo1.bd_citas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CitaServiceTests {

    @Autowired
    private CitaService citaService;

    @Test
    public void testCrearCita() {
        Cita cita = new Cita();
        cita.setCliente("Test Cliente");
        cita.setServicio("Test Servicio");
        cita.setFecha(LocalDateTime.now());

        Cita guardada = citaService.crearCita(cita);
        assertNotNull(guardada.getId());
    }
}
