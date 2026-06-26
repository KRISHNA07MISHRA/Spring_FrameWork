package com.Bean_Lifecycle.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ResFile {

    // @Bean(initMethod = "start")
    // public cartService getCartService(){
    //     return new cartService();
    // }

    // @Bean(initMethod = "start",destroyMethod = "stop")
    // public cartService getCartService(){
    //     return new cartService();
    // }
}
