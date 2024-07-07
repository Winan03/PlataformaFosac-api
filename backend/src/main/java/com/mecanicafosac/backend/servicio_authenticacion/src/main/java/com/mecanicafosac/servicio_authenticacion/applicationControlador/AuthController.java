package com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.applicationControlador;

import com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.Service.AuthService;
import com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String registerUser(@RequestBody Usuario user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            return "Password cannot be null or empty";
        }
        return authService.register(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Usuario user) {
        return authService.login(user);
    }
}
