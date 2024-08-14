package elm.springframework.spring6webapp.services;

import elm.springframework.spring6webapp.exception.BeerNotFoundException;
import elm.springframework.spring6webapp.model.Beer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<Beer> getBeerById(UUID id);

    List<Beer> listBeers();

    Beer saveBeer(Beer beer);

    Beer updateBeer(UUID beerId, Beer updatedBeer);

    void delete(UUID beerId);

    void patchBeerById(UUID beerId, Beer beer);
}
