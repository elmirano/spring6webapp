package elm.springframework.spring6webapp.services.i18n;

import elm.springframework.spring6webapp.controllers.Myi18nController;
import elm.springframework.spring6webapp.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("ES")
@SpringBootTest
class SpanishGreetingServiceTest {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void sayHello() {
//        assertEquals("Hola Mundo - ES", myi18nController.sayHello());
        System.out.println(myi18nController.sayHello());
    }
}