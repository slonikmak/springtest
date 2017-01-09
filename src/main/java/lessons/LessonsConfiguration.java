package lessons;

import lessons.services.GreetingService;
import lessons.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Oceanos on 09.01.2017.
 */
@Configuration
public class LessonsConfiguration {
    @Bean
    GreetingService greetingService(){
        return new GreetingServiceImpl();
    }
}
