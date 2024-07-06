package com.mecanica.fosac.gestion_citas.domain;


import com.mecanicafosac.servicio_citas.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}
