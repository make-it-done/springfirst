package spring.com.rohit;

public class BaseBallCoach implements Coach {

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
