package com.springframework.brewery.services;

import com.springframework.brewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById();

    BeerDto saveNewBeer(BeerDto beerDto);
}
