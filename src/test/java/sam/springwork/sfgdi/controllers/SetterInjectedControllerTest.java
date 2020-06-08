package sam.springwork.sfgdi.controllers;

import sam.springwork.sfgdi.services.GreetingService;
import sam.springwork.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		
		//Mimicking what Spring Framework would do
		//Create an instance of the SetterInjectedController
		controller = new SetterInjectedController();
		//associate the greeting and then call the greeting
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void sayGreeting() {
		System.out.println(controller.getGreeting());
	}

}
