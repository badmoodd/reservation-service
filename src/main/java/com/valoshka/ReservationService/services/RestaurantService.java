package com.valoshka.ReservationService.services;

import com.valoshka.ReservationService.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    void create(Restaurant restaurantToSave);

    Optional<Restaurant> findById(String restaurantID);

    List<Restaurant> findAllByName(String name);

    List<Restaurant> findAll();


}
