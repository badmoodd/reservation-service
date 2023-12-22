package com.valoshka.ReservationService.repositories;

import com.valoshka.ReservationService.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, String> {

    List<Restaurant> findAllByName(String name);

}
