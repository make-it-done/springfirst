package spring.com.rohit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());
    }
}
