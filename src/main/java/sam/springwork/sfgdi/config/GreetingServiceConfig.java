package sam.springwork.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import sam.springwork.sfgdi.services.GreetingRepository;
import sam.springwork.sfgdi.services.GreetingService;
import sam.springwork.sfgdi.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
	
	//Spring will pick this up automatically, based on where it is placed
	//and automatically inject into the configuration method
	//Will return a new instace of the GreetingServiceFactory
	//Can utilize this to declare other Spring Beans
	//When annotated as a @bean, it gets annotated as a Spring Bean
	
	@Bean
	GreetingServiceFactory greetingServiceFactory (GreetingRepository repository)
	{
		return new GreetingServiceFactory(repository);
	}
	
	@Bean
	@Primary
	@Profile({"default","en"})
    GreetingService PrimaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingServices("en");
	}
	
	
	@Bean
	@Primary
	@Profile("de")
    GreetingService PrimaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingServices("de");
	}
	
	@Bean
	@Primary
	@Profile("es")
    GreetingService PrimarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingServices("es");
		
	}
	
}
