package com.valoshka.ReservationService.controllers;

import com.valoshka.ReservationService.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {

    ReservationService reservationService;

    @GetMapping("/reserve/{id}")
    public String reserveRestaurant(@PathVariable(name = "id") String id) {
        reservationService.reserveRestaurant(id);
        return "redirect:/restaurants";
    }

    @GetMapping()
    public String viewReservations(Model model) {
        model.addAttribute("reservations", reservationService.viewReservations());
        return "reservations/reservations";
    }
}
