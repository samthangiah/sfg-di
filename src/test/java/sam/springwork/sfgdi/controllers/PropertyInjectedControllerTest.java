package sam.springwork.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sam.springwork.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	
	@BeforeEach
	void setUp() {
		
		//Mimicking what the controller service would do
		//Instance of a PropertyInjectedController
		controller = new PropertyInjectedController();
		//Type of greeting service to be done- could be in any language
		controller.greetingService = new GreetingServiceImpl();
			
	}
	@Test
	void getGreeting() {
		
		//Do the greeting
		System.out.println(controller.getGreeting());
		//fail("Not yet implemented");
	}

}
