package spring.com.rohit;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today you will be charged more";
    }
}
