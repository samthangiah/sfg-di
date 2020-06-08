package sam.springwork.sfgdi.controllers;

import sam.springwork.sfgdi.services.GreetingService;

public class PropertyInjectedController {
	
	//handle to GreetingService
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	

}
