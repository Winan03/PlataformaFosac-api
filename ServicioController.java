
package com.tuempresa.taller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/servicios")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/buscar")
    public List<Servicio> buscarServicios(@RequestParam String nombre) {
        return servicioService.buscarServiciosPorNombre(nombre);
    }

    @GetMapping("/{id}")
    public Optional<Servicio> obtenerServicioPorId(@PathVariable Long id) {
        return servicioService.obtenerServicioPorId(id);
    }

    @PostMapping
    public Servicio guardarServicio(@RequestBody Servicio servicio) {
        return servicioService.guardarServicio(servicio);
    }

    @DeleteMapping("/{id}")
    public void eliminarServicio(@PathVariable Long id) {
        servicioService.eliminarServicio(id);
    }

    @GetMapping
    public List<Servicio> obtenerTodosLosServicios() {
        return servicioService.obtenerTodosLosServicios();
    }
}

