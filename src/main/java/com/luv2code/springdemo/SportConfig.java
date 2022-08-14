package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import com.luv2code.springdemo.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    /*
        @BEAN ANNOTATION IS USEFUL IF WANT TO MAKE EXISTING 3RD PARTY CLASS
        AVAILABLE TO SPRING FRAMEWORK APPLICATION CONTEXT

        THEN @BEAN SERVES AS WRAPPER / ADAPTER TO 3RD PARTY CLASSES.
        IT WRAPS THE CLASS AS A SPRING BEAN SO IT CAN BE SHARED
        VIA DEPENDENCY INJECTION
    */

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public SwimCoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
