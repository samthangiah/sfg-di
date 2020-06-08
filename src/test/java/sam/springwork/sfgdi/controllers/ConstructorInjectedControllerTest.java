package sam.springwork.sfgdi.controllers;


import sam.springwork.sfgdi.controllers.ConstructorInjectedController;
import sam.springwork.sfgdi.services.GreetingServiceImpl;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	
	@BeforeEach
	void setUp() throws Exception {	
		//Mimicking what Spring Framework would do
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
