package spring.com.rohit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        BaseBallCoach coach = context.getBean("myCoach", BaseBallCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        coach.setFortune(new SadFortuneService());

        System.out.println(coach.getDailyFortune());

        BaseBallCoach coach1 = context.getBean("myCoach", BaseBallCoach.class);

        System.out.println(coach1.getDailyFortune());


        if (coach == coach1)
            System.out.println("both are Equal");
        else
            System.out.println("Both are not Equal");

    }
}
