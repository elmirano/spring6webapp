package elm.springframework.spring6webapp.client;

import elm.springframework.spring6webapp.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers();
}
