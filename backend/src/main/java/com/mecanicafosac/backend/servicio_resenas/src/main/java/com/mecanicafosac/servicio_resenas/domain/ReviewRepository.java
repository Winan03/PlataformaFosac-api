package com.mecanicafosac.backend.servicio_resenas.src.main.java.com.mecanicafosac.servicio_resenas.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
