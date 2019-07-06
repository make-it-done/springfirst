package spring.com.rohit.SpringWithAnnotation;

import org.springframework.stereotype.Component;

@Component("theSadFortune")
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today you will be charged more";
    }
}
