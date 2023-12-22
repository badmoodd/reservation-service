package com.valoshka.ReservationService.services.impls;

import com.valoshka.ReservationService.models.Customer;
import com.valoshka.ReservationService.repositories.CustomerRepository;
import com.valoshka.ReservationService.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional
    public Customer create(String username, String email, String description, String password) {
        Customer customerToSave = new Customer();
        customerToSave.setUsername(username);
        customerToSave.setEmail(email);
        customerToSave.setProfileInfo(description);
        // password
        customerToSave.setPassword(password);
        return customerRepository.save(customerToSave);
    }

    @Override
    public Optional<Customer> findById(String customerID) {
        return customerRepository.findCustomerByCustomerID(customerID);
    }
}
