package sam.springwork.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import sam.springwork.sfgdi.services.GreetingService;
/*
 * Primary Greeting service controller
 */

@Controller
public class PrimaryController {
	
	private final GreetingService greetingService;
	
	public PrimaryController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return(greetingService.sayGreeting());
	}
}
