package com.harshshah.khaanakhazana.mapper;

import com.harshshah.khaanakhazana.dto.CustomerRequest;
import com.harshshah.khaanakhazana.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }
}
