package com.mecanicafosac.servicio_citas.domain;


import com.mecanica.fosac.gestion_citas.domain.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServicio {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    public Cita createCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Cita getCitaById(Long id) {
        return citaRepository.findById(id).orElse(null);
    }

    public Cita updateCita(Long id, Cita cita) {
        Optional<Cita> existingCita = citaRepository.findById(id);
        if (existingCita.isPresent()) {
            Cita updatedCita = existingCita.get();
            updatedCita.setCliente(cita.getCliente());
            updatedCita.setServicio(cita.getServicio());
            updatedCita.setFecha(cita.getFecha());
            updatedCita.setHora(cita.getHora());
            return citaRepository.save(updatedCita);
        } else {
            return null;
        }
    }

    public void deleteCita(Long id) {
        citaRepository.deleteById(id);
    }
}
