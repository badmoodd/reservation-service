package com.valoshka.ReservationService.repositories;

import com.valoshka.ReservationService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    Optional<Customer> findCustomerByCustomerID(String customerID);
}
