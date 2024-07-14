package elm.springframework.spring6webapp;

import elm.springframework.spring6webapp.controllers.MyController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

//	@Test
//	void contextLoads() {
//		MyController myController = applicationContext.getBean(MyController.class);
//		Assertions.assertNotNull(myController);
//	}
//
//	@Test
//	void testGetController() {
//		MyController myController = applicationContext.getBean(MyController.class);
//		Assertions.assertEquals( myController.sayHello(), "Hello Everyone!!!");
//	}

}
