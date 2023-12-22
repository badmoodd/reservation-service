package com.valoshka.ReservationService.controllers;

import com.valoshka.ReservationService.models.dtos.SignUpRequest;
import com.valoshka.ReservationService.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("{id}")
    public String showCustomerProfile(@PathVariable String id, Model model) {
        model.addAttribute("customer", customerService.findById(id).orElseThrow());
        return "customers/profilePage";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute SignUpRequest request) {
        customerService.create(request.getUsername(),
                request.getEmail(),
                request.getDescription(),
                request.getPassword());
        return "redirect:restaurants";
    }

    @GetMapping("/home")
    public String showCustomerHome(Model model) {
        model.addAttribute("customer", customerService.findById("f401953ILz2aeaggJ0DCOLLw").orElseThrow());
        return "customers/profilePage";
    }

}
