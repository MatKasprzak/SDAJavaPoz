package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.CalcService;
import com.sda.springjavapoz4.service.NumberGenerator;
import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @Autowired
    private CalcService calcService;

    @Autowired
   // @Qualifier("smallNumbersGenerator")
    private NumberGenerator numberGenerator;

@GetMapping("/calc/sum")
    public ModelAndView sum(){
    int firstValue = numberGenerator.generateNumber();
    int secondValue = numberGenerator.generateNumber();
    System.out.println(firstValue +"+"+ secondValue+ "="+ calcService.multiply(firstValue, secondValue));

    return new ModelAndView("home");
}


@GetMapping("/calc/multiply")
public ModelAndView multiply(){
    int firstValue = numberGenerator.generateNumber();
    int secondValue = numberGenerator.generateNumber();
    System.out.println(firstValue +"*"+ secondValue+ "=" +calcService.multiply(firstValue, secondValue));
    return new ModelAndView("home");
    }
}
