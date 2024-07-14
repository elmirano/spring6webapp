package elm.springframework.spring6webapp;

import elm.springframework.spring6webapp.controllers.MyController;
import elm.springframework.spring6webapp.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6WebappApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Spring6WebappApplication.class, args);;

		System.out.println("In Main Method");
//		MyController myController = ctx.getBean(MyController.class);
//		GreetingService greetingService = ctx.getBean(GreetingService.class);
//
//		greetingService.sayHello();
//
//		System.out.println(myController.sayHello());


	}

}
