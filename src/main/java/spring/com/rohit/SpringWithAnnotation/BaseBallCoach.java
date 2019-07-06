package spring.com.rohit.SpringWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theBaseBallCoach")
public class BaseBallCoach implements Coach {

    @Autowired
    @Qualifier("theHappyFortune")
    private FortuneService fortune;

    public BaseBallCoach() {
    }

    public BaseBallCoach(FortuneService fortune) {
        this.fortune = fortune;
    }

    public FortuneService getFortune() {
        return fortune;
    }

    public void setFortune(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {

        return "spend 20 minutes in batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
