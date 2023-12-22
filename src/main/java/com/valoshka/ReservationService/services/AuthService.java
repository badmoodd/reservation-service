package com.valoshka.ReservationService.services;

import com.valoshka.ReservationService.models.dtos.AuthRequest;
import com.valoshka.ReservationService.models.dtos.SignUpRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<?> createCustomer(SignUpRequest request);

    ResponseEntity<?> loginCustomer(AuthRequest request);

}
