package com.grupo1.bd_citas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> obtenerCitas() {
        return citaService.obtenerTodas();
    }

    @PostMapping
    public Cita crearCita(@RequestBody Cita cita) {
        return citaService.crearCita(cita);
    }
}
