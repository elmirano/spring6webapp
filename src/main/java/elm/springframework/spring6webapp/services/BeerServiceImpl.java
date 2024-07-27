package elm.springframework.spring6webapp.services;

import elm.springframework.spring6webapp.model.Beer;
import elm.springframework.spring6webapp.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get Beer by Id - in service was called");

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("San Miguel")
                .beerStyle(BeerStyle.STRONG)
                .upc("12345")
                .price(new BigDecimal("60.50"))
                .quantityOnHand(1234)
                .createdDate(LocalDateTime.now())
                .build();
    }
}
