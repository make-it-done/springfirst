package spring.com.rohit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMethodDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("myTrackCoach",Coach.class);

        System.out.println(coach.getDailyFortune());

        context.close();

    }
}
