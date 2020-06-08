package sam.springwork.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;






//Primary greeting service to be used if there are more than one greeting service

//Do not have to use Primary, Service and Profile as it is being set up in the config package
/*@Primary
@Service
@Profile({"en", "default"})
*/
public class PrimaryGreetingService implements GreetingService{

	private GreetingRepository greetingRepository;

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	@Override
	public String sayGreeting() {
		return "Hello World - Primary Bean";
	}

}
