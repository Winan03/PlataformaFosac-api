package com.mecanicafosac.backend.servicio_citas.src.main.java.com.mecanicafosac.servicio_citas.aplicationController;


import com.mecanicafosac.backend.servicio_citas.src.main.java.com.mecanicafosac.servicio_citas.domain.Cita;
import com.mecanicafosac.backend.servicio_citas.src.main.java.com.mecanicafosac.servicio_citas.domain.CitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaServicio citaService;

    @GetMapping
    public List<Cita> getAllCitas() {
        return citaService.getAllCitas();
    }

    @PostMapping
    public Cita createCita(@RequestBody Cita cita) {
        return citaService.createCita(cita);
    }

    @GetMapping("/{id}")
    public Cita getCitaById(@PathVariable Long id) {
        return citaService.getCitaById(id);
    }

    @PutMapping("/{id}")
    public Cita updateCita(@PathVariable Long id, @RequestBody Cita cita) {
        return citaService.updateCita(id, cita);
    }

    @DeleteMapping("/{id}")
    public void deleteCita(@PathVariable Long id) {
        citaService.deleteCita(id);
    }
}