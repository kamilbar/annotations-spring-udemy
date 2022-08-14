package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
