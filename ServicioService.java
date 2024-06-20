
package com.tuempresa.taller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


package com.tuempresa.taller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    public List<Servicio> buscarServiciosPorNombre(String nombre) {
        return servicioRepository.findByNombreContaining(nombre);
    }

    public Optional<Servicio> obtenerServicioPorId(Long id) {
        return servicioRepository.findById(id);
    }

    public Servicio guardarServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    public void eliminarServicio(Long id) {
        servicioRepository.deleteById(id);
    }

    public List<Servicio> obtenerTodosLosServicios() {
        return servicioRepository.findAll();
    }
}

