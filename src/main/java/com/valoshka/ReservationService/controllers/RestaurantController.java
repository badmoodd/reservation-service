package com.valoshka.ReservationService.controllers;

import com.valoshka.ReservationService.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurants")
@AllArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping
    public String showAllRestaurants(Model model) {
        model.addAttribute("allRestaurants", restaurantService.findAll());
        return "restaurants/allRestaurants";
    }

    @GetMapping("/{id}")
    public String viewRestaurant(@PathVariable("id") String id, Model model) {
        model.addAttribute("restaurant", restaurantService.findById(id).orElseThrow());
        return "restaurants/profilePage";
    }


}
