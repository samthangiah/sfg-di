package sam.springwork.sfgdi.controllers;


import sam.springwork.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
