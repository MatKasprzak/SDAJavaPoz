package com.sda.springjavapoz4.service;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

    public int sum(int a, int b){
     //   System.out.println(a+b);
        return a+b;
    }
    public  int multiply(int a, int b){
      //  System.out.println(a*b);
        return a*b;
    }
/*    public CalcService(){
        RandomGeneratorNumberService randomGeneratorNumberService = new RandomGeneratorNumberService();
        this.a = randomGeneratorNumberService.generateNumber();
        this.b = randomGeneratorNumberService.generateNumber();
    }*/
}
