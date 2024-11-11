//package com.prashantjain.yummyrest.service;
//
//public class AuthService {
//}

// AuthService.java
package com.harshshah.khaanakhazana.service;

import com.harshshah.khaanakhazana.dto.LoginRequest;
import com.harshshah.khaanakhazana.dto.LoginResponse;
import com.harshshah.khaanakhazana.entity.Customer;
import com.harshshah.khaanakhazana.repo.CustomerRepo;
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
