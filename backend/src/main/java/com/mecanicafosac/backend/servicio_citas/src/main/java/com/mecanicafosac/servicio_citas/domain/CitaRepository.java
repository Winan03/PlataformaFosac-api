package com.mecanicafosac.backend.servicio_citas.src.main.java.com.mecanicafosac.servicio_citas.domain;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}
