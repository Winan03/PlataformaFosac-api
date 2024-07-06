package com.mecanicafosac.backend.servicio_perfiles.src.main.java.com.mecanicafosac.servicio_perfiles.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile getProfile(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public Profile updateProfile(Long id, Profile profile) {
        Profile existingProfile = profileRepository.findById(id).orElse(null);
        if (existingProfile != null) {
            existingProfile.setNombre(profile.getNombre());
            existingProfile.setApellido(profile.getApellido());
            existingProfile.setCorreo(profile.getCorreo());
            return profileRepository.save(existingProfile);
        }
        return null;
    }
}
