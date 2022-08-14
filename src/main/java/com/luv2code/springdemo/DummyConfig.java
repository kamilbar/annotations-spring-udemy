package com.luv2code.springdemo;

import com.luv2code.springdemo.service.DummyFortuneService;
import com.luv2code.springdemo.service.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyConfig {

    @Bean
    public FortuneService dummyFortuneService(){
        return new DummyFortuneService();
    }

    @Bean
    public DummyCoach dummyCoach() {
        return new DummyCoach(dummyFortuneService());
    }

}
