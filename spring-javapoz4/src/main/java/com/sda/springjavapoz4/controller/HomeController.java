package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import com.sda.springjavapoz4.service.SomeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class HomeController {

//@Qualifier("smallNumbersGenerator")
    @Autowired
    private RandomGeneratorNumberService randomGeneratorNumberService;

    @Autowired
    private SomeService aboutService;

    @Qualifier("aboutService")// traktuje to jakby miało nazwe aboutServices
    @Autowired
    private SomeService someService;

    public HomeController() {
        //    this.someService = new SomeService();
    }

    @GetMapping("/")
    public ModelAndView home() {
        System.out.println(randomGeneratorNumberService.generateNumber());
        System.out.println(randomGeneratorNumberService.generateNumber());
        System.out.println(randomGeneratorNumberService.generateNumber());
        System.out.println(randomGeneratorNumberService.generateNumber());
        System.out.println(randomGeneratorNumberService.generateNumber());
        System.out.println(randomGeneratorNumberService.generateNumber());
        System.out.println(randomGeneratorNumberService.generateNumber());
        someService.someAction();
        return new ModelAndView("home");
    }

    @GetMapping("/about")
    public ModelAndView about() {
        randomGeneratorNumberService.generateNumber();
        aboutService.someAction();
        return new ModelAndView("home");
    }

    @GetMapping("/contact_us")
    public ModelAndView random() {
        randomGeneratorNumberService.generateNumber();
        return new ModelAndView("home");
    }
}
