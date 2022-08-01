package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get beans
        Coach theCoach = context.getBean("MySillyCoach", Coach.class);

        // do stuff on beans
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();

    }

}
