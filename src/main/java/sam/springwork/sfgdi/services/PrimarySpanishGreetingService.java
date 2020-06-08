package sam.springwork.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Do not have to use Primary, Service and Profile as it is being set up in the config package
/*@Service
@Profile("es")
@Primary
*/

public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}