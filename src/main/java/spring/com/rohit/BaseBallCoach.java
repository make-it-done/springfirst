package spring.com.rohit;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {

        return "spend 20 minutes in batting practice";
    }
}
