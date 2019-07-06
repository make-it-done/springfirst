package spring.com.rohit.SpringWithAnnotation;

import org.springframework.stereotype.Component;

@Component("theHappyFortune")
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
