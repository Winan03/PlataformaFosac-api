package com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.Service;

import com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.domain.UserRepository;
import com.mecanicafosac.backend.servicio_authenticacion.src.main.java.com.mecanicafosac.servicio_authenticacion.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(Usuario user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully";
    }

    public String login(Usuario user) {
        Usuario existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null && passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
