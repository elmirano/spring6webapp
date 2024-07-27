package elm.springframework.spring6webapp.services;

import elm.springframework.spring6webapp.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
