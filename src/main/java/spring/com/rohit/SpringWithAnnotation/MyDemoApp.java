package spring.com.rohit.SpringWithAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        Coach coach =context.getBean("theBaseBallCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        Coach coach1 = context.getBean("trackCoach",Coach.class);

        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
        context.close();

    }
}
