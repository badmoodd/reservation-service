package com.valoshka.ReservationService.services.impls;

import com.valoshka.ReservationService.models.dtos.AuthRequest;
import com.valoshka.ReservationService.models.dtos.SignUpRequest;
import com.valoshka.ReservationService.services.AuthService;
import com.valoshka.ReservationService.services.CustomerService;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final CustomerService customerService;

    @Override
    public ResponseEntity<?> createCustomer(SignUpRequest request) {
        try {
            customerService.create(request.getUsername(), request.getEmail(), request.getDescription(), request.getPassword());
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> loginCustomer(AuthRequest request) {
        try {
            authenticate(request.getEmail(), request.getPassword());
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    private HttpStatus authenticate(String email, String password) {
        // authentication
        return HttpStatus.OK;
    }
}
