package sam.springwork.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Do not have to use Primary, Service and Profile as it is being set up in the config package
/*@Service
@Primary
@Profile("de")
*/

public class PrimaryGermanGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getGermanGreeting();
	}
}

