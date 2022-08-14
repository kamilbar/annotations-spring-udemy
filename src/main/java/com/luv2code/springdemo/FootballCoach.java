package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.team}")
    private String team;

    @Value("${foo.email}")
    private String email;

    public FootballCoach() {
        System.out.println(" > inside Constructor FootballCoach()");
    }

    //    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void doSomeMethodStuff(FortuneService fortuneService) {
//        System.out.println(" > inside method doSomeMethodStuff()");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "FootballCoach{" +
                "team='" + team + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
