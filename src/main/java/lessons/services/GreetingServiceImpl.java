package lessons.services;

/**
 * Created by Oceanos on 09.01.2017.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
