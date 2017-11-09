package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import com.sda.springjavapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MyController {
//Controller adontacja szuka w srodku takze get mapping component nie

    @Autowired
    private SomeService someService;

    //@Qualifier("bigNumbersGenerator")
    @Autowired
    private RandomGeneratorNumberService randomGeneratorNumberService;

    @GetMapping("/users")
    public ModelAndView users(){

        someService.someAction();
        System.out.println(randomGeneratorNumberService.generateNumber());
        return new ModelAndView("home");
    }
}
