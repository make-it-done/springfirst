package spring.com.rohit.SpringWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    @Autowired
    public TrackCoach(@Qualifier("theSadFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setter method");
        this.fortuneService = fortuneService;
    }

    public void init() {
        System.out.println("initializing the bean");
    }

    public void destroy() {
        System.out.println("destroy the bean");
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
