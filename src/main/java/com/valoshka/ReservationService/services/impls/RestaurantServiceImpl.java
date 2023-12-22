package com.valoshka.ReservationService.services.impls;

import com.valoshka.ReservationService.models.Restaurant;
import com.valoshka.ReservationService.repositories.RestaurantRepository;
import com.valoshka.ReservationService.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Override
    @Transactional
    public void create(Restaurant restaurantToSave) {
        restaurantRepository.save(restaurantToSave);
    }

    @Override
    public Optional<Restaurant> findById(String restaurantID) {
        return restaurantRepository.findById(restaurantID);
    }

    @Override
    public List<Restaurant> findAllByName(String name) {
        return restaurantRepository.findAllByName(name);
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }
}
