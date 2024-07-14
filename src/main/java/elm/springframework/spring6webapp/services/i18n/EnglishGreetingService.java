package elm.springframework.spring6webapp.services.i18n;

import elm.springframework.spring6webapp.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello world - EN";
    }
}
