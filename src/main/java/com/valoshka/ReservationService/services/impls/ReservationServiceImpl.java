package com.valoshka.ReservationService.services.impls;

import com.valoshka.ReservationService.models.Customer;
import com.valoshka.ReservationService.models.Reservation;
import com.valoshka.ReservationService.models.Restaurant;
import com.valoshka.ReservationService.repositories.CustomerRepository;
import com.valoshka.ReservationService.repositories.ReservationRepository;
import com.valoshka.ReservationService.repositories.RestaurantRepository;
import com.valoshka.ReservationService.services.CustomerService;
import com.valoshka.ReservationService.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final RestaurantRepository restaurantRepository;
    private CustomerRepository customerRepository;
    @Override
    @Transactional
    public void reserveRestaurant(String id) {
        Reservation reservation = new Reservation();
        Restaurant rest = restaurantRepository.findById(id).orElseThrow();
        Customer customer = customerRepository.findCustomerByCustomerID("f401953ILz2aeaggJ0DCOLLw").orElseThrow();
        reservation.setDateTime(LocalDateTime.now());
        reservation.setRestaurant(rest);
        reservation.setCustomer(customer);
        reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> viewReservations() {
        return reservationRepository.findAll();
    }
}
