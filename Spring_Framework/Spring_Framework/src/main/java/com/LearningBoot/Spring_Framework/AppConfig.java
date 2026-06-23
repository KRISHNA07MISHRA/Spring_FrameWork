package com.LearningBoot.Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.LearningBoot.Spring_Framework.Payment.CardPayment;

@Configuration
@ComponentScan("com.LearningBoot.Spring_Framework")
public class AppConfig {

    @Bean
    public User user(){
        return new User("krishna","krishnamail@gmail.com");
    }

    @Bean("card")
    @Primary
    public CardPayment cardPayment() {
        return new CardPayment();
    }
}
