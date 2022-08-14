package com.luv2code.springdemo;


import com.luv2code.springdemo.service.FortuneService;

public class DummyCoach implements Coach {

    private FortuneService fortuneService;

    public DummyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do some dummy workout!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
