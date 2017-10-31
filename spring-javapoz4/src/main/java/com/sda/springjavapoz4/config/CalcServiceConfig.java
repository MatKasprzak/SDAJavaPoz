package com.sda.springjavapoz4.config;

import com.sda.springjavapoz4.service.CalcService;
import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalcServiceConfig {
    @Bean
    public CalcService sum(){
        return new CalcService();
    }
    @Bean
    public CalcService multiply(){
        return new CalcService();
    }
}
