package com.valoshka.ReservationService.controllers;

import com.valoshka.ReservationService.models.dtos.AuthRequest;
import com.valoshka.ReservationService.models.dtos.SignUpRequest;
import com.valoshka.ReservationService.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("signUpRequest", new SignUpRequest());
//        authService.createCustomer(new SignUpRequest());
        return "customers/signup";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("authRequest", new AuthRequest());
//        authService.loginCustomer(new AuthRequest());
        return "customers/login";
    }

}
