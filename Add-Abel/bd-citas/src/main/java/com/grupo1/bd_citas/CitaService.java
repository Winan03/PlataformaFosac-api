package com.grupo1.bd_citas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> obtenerTodas() {
        return citaRepository.findAll();
    }

    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }
}
