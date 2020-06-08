package sam.springwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sam.springwork.sfgdi.services.GreetingService;


/* For setting up profiles
 * 
 */
@Controller
public class I18nController {

	private final GreetingService greetingService;
	
	//public I18nController(@Qualifier("i18nService") GreetingService greetingService)
	//public ConstructorInjectedControllerSpr(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
	//	this.greetingService = greetingService;
	//}
	public I18nController(@Qualifier("i18nService") GreetingService greetingService){
		this.greetingService = greetingService;
	}
	
	public String sayHello()
	{
		return(greetingService.sayGreeting());
	}
	
	
	
}
