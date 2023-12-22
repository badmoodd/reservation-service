package com.valoshka.ReservationService.repositories;

import com.valoshka.ReservationService.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
