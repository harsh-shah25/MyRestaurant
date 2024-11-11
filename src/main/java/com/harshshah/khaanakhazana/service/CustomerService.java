package com.harshshah.khaanakhazana.service;

import com.harshshah.khaanakhazana.dto.CustomerRequest;
import com.harshshah.khaanakhazana.entity.Customer;
import com.harshshah.khaanakhazana.mapper.CustomerMapper;
import com.harshshah.khaanakhazana.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo repo;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }


}
