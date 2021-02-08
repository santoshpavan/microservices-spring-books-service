package com.springframework.brewery.services;

import com.springframework.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById();

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId);

    void deleteCustomer(UUID customerId);
}
