package elm.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service
public class SecondaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from SecondaryGreetingService";
    }
}
