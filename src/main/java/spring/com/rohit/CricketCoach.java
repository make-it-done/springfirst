package spring.com.rohit;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice like Virat Kohli";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
