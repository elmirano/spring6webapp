package elm.springframework.spring6webapp.controllers;

import elm.springframework.spring6webapp.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }
    public void sayGreeting(){
        greetingService.sayHello();
    }
}
