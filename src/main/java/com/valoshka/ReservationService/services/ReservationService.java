package com.valoshka.ReservationService.services;


import com.valoshka.ReservationService.models.Reservation;

import java.util.List;

public interface ReservationService {

    void reserveRestaurant(String id);

    List<Reservation> viewReservations();
}
