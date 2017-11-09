package com.sda.springjavapoz4.config;

import com.sda.springjavapoz4.service.CalcService;
import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CalcServiceConfig {

    @Profile("dev")
    @Bean
    public CalcService sum(){
        return new CalcService("This is connected with dev");
    }
    @Profile("prod")
    @Bean
    public CalcService multiply(){
        return new CalcService("This is connected with prod");
    }
}
