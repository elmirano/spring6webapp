package elm.springframework.spring6webapp.services.i18n;

import elm.springframework.spring6webapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
