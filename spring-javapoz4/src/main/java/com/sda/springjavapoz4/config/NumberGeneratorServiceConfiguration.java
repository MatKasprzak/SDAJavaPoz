package com.sda.springjavapoz4.config;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberGeneratorServiceConfiguration {
    @Bean
    public RandomGeneratorNumberService randomGeneratorNumberService() {
        return new RandomGeneratorNumberService();
    }
    @Bean
    public RandomGeneratorNumberService smallNumbersGenerator(){
        return new RandomGeneratorNumberService(50,0);
    }
    @Bean
    public RandomGeneratorNumberService bigNumbersGenerator(){
        RandomGeneratorNumberService randomGeneratorNumberService = new RandomGeneratorNumberService();
        randomGeneratorNumberService.setBound(9000);
        randomGeneratorNumberService.setOffset(1000);
        return new RandomGeneratorNumberService();
    }


}
