package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get beans
 //       Coach theCoach = context.getBean("MySillyCoach", Coach.class);
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach myCoach = context.getBean("footballCoach", FootballCoach.class);

        // do stuff on beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.toString());

        // close the context
        context.close();

    }

}
