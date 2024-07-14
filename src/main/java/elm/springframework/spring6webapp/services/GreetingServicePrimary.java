package elm.springframework.spring6webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello from PrimaryGreetingService";
    }
}
