package sam.springwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sam.springwork.sfgdi.services.GreetingService;

/* Property injected controller for Spring */

@Controller
public class PropertyInjectedControllerSpr {
	
	//Qualifier as there is more than one service
	@Qualifier("propertyInjectedGreetingService")
	//handle to GreetingService
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	

}
