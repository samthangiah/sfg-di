package sam.springwork.sfgdi.services;

import  sam.springwork.sfgdi.services.GreetingRepository;
import  sam.springwork.sfgdi.services.PrimaryGreetingService;
import  sam.springwork.sfgdi.services.PrimaryGermanGreetingService;
import  sam.springwork.sfgdi.services.PrimarySpanishGreetingService;

public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingServices(String lang) {
		switch (lang) {
		case "en": return new PrimaryGreetingService(greetingRepository);
		case "de": return new PrimaryGermanGreetingService(greetingRepository);
		case "es": return new PrimarySpanishGreetingService(greetingRepository);
		default: return new PrimaryGreetingService(greetingRepository);

		}
	}

}
