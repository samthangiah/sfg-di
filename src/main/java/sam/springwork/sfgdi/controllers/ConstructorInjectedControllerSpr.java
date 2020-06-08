package sam.springwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sam.springwork.sfgdi.services.GreetingService;

/* Constructor injected controller for Spring */

@Controller
public class ConstructorInjectedControllerSpr {
	//@Autowired - optional
	private final GreetingService greetingService;

	//@Autowired - optional
	//Qualifiers are used if there are more than one GreetingService
	public ConstructorInjectedControllerSpr(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
