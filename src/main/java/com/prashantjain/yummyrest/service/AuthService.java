//package com.prashantjain.yummyrest.service;
//
//public class AuthService {
//}

// AuthService.java
package com.prashantjain.yummyrest.service;

import com.prashantjain.yummyrest.dto.LoginRequest;
import com.prashantjain.yummyrest.dto.LoginResponse;
import com.prashantjain.yummyrest.entity.Customer;
import com.prashantjain.yummyrest.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final CustomerRepo customerRepo;

    public LoginResponse login(LoginRequest request) {
        // Find customer by email
        Optional<Customer> customerOpt = customerRepo.findByEmail(request.email());
        if (customerOpt.isPresent()) {
            Customer customer = customerOpt.get();
            // Validate password (consider hashing for security)
            if (customer.getPassword().equals(request.password())) {
                // In a real app, generate a JWT or session token here
                return new LoginResponse("Login successful", "dummy-token"); // Replace with real token
            }
        }
        return new LoginResponse("Invalid email or password", null);
    }
}
