package com.prashantjain.yummyrest.repo;

import com.prashantjain.yummyrest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email); // Custom method to find by email
}
//public interface CustomerRepo extends JpaRepository<Customer, Long> {
//
//}
