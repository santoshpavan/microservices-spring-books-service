package com.springframework.brewery.services;

import com.springframework.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j //for loggin
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById() {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("customername1")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO: implement updateCustomer
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting the customer!");
    }
}
