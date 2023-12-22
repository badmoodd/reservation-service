package com.valoshka.ReservationService.services;

import com.valoshka.ReservationService.models.Customer;

import java.util.Optional;

public interface CustomerService {

    Customer create(String name,
                            String email,
                            String description,
                            String password);

    Optional<Customer> findById(String customerID);

}
