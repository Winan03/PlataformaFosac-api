package com.mecanicafosac.backend.servicio_perfiles.src.main.java.com.mecanicafosac.servicio_perfiles.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}