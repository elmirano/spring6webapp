package elm.springframework.spring6webapp.controllers;

import elm.springframework.spring6webapp.model.Beer;
import elm.springframework.spring6webapp.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerById(UUID id){

        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(id);
    }
}
