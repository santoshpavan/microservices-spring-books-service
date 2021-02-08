package com.springframework.brewery.services;

import com.springframework.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("beername1")
                .beerStyle("beerstyle1")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
