package com.mecanicafosac.backend.servicio_perfiles.src.main.java.com.mecanicafosac.servicio_perfiles.applicationController;

import com.mecanicafosac.backend.servicio_perfiles.src.main.java.com.mecanicafosac.servicio_perfiles.domain.Profile;
import com.mecanicafosac.backend.servicio_perfiles.src.main.java.com.mecanicafosac.servicio_perfiles.domain.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable Long id) {
        return profileService.getProfile(id);
    }

    @PutMapping("/{id}")
    public Profile updateProfile(@PathVariable Long id, @RequestBody Profile profile) {
        return profileService.updateProfile(id, profile);
    }
}