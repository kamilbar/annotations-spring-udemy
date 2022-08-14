package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FootballCoach;
import com.luv2code.springdemo.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        /*
           WILL THROW AN ERROR IF COMPONENTSCAN IS COMMENTED OUT IN SPORTCONFIG
        */

        // load spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get beans
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach myCoach = context.getBean("footballCoach", FootballCoach.class);

        System.out.println("\nHello in JavaConfigDemoApp!\n");
        // do stuff on beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach);

        // close the context
        context.close();

    }

}
