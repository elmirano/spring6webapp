package elm.springframework.spring6webapp.controllers;

import elm.springframework.spring6webapp.exception.BeerNotFoundException;
import elm.springframework.spring6webapp.model.Beer;
import elm.springframework.spring6webapp.services.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerController {

    public static final String BEER_PATH = "/api/v1/beer";
    public static final String BEER_PATH_ID = BEER_PATH + "/{beerId}";
    private final BeerService beerService;

    @GetMapping(BEER_PATH)
    public List<Beer> listBeers(){
        log.debug("List Beer - in controller");
        return beerService.listBeers();
    }

    @GetMapping(BEER_PATH_ID)
    public Beer getBeerById(@PathVariable(name = "beerId") UUID beerId){
        return beerService.getBeerById(beerId).orElseThrow(BeerNotFoundException::new);
    }

    @PostMapping(BEER_PATH)
    public ResponseEntity<Beer> saveBeer(@RequestBody Beer beer){
        log.debug("Saving beer...");
        Beer savedBeer = beerService.saveBeer(beer);

        URI location = URI.create("/api/v1/beer/"+savedBeer.getId());
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders. setLocation(location);
        responseHeaders. set("MyResponseHeader", savedBeer.toString());

        return new ResponseEntity<Beer>(savedBeer, responseHeaders, HttpStatus. CREATED);
    }

    @PutMapping(BEER_PATH_ID)
    public ResponseEntity<Beer> updateBeer(@PathVariable(value = "beerId") UUID beerId, @RequestBody Beer beer){

        beerService.updateBeer(beerId, beer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(BEER_PATH_ID)
    public ResponseEntity deleteBeer(@PathVariable(value = "beerId") UUID beerId){

        beerService.delete(beerId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PatchMapping(BEER_PATH_ID)
    public ResponseEntity updateBeerPatchById(@PathVariable("beerId")UUID beerId, @RequestBody Beer beer){

        beerService.patchBeerById(beerId, beer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
