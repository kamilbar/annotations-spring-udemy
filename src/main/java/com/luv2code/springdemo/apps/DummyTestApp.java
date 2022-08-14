package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.DummyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DummyTestApp {

    public static void main(String[] args) {

        // load java config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DummyConfig.class);

        // load beans
        Coach coach = context.getBean("dummyCoach", Coach.class);

        System.out.println("\nWelcome to Dummy App!\n");
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }

}
