package sam.springwork.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"ES","default"})
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hola Mundo - Spanish";
	}

}
