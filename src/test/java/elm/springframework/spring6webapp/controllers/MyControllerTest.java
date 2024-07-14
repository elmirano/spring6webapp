package elm.springframework.spring6webapp.controllers;

import elm.springframework.spring6webapp.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

    @Autowired
    GreetingService greetingService;

    @Test
    void sayHello() {
        assertEquals("Hello from PrimaryGreetingService", greetingService.sayHello());
    }
}