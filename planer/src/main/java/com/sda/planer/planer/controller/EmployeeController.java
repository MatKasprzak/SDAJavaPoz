package com.sda.planer.planer.controller;

import com.sda.planer.planer.Services.EmployeeService;
import com.sda.planer.planer.model.Employee;
import com.sda.planer.planer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping
    public ModelAndView getAllEmployees() {
        ModelAndView modelAndView = new ModelAndView("allEmployees");
        modelAndView.addObject("message", "HelloWorld");
        modelAndView.addObject("employee", employeeService.getAllEmployees());
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView getEmployee(@PathVariable ("id") long id){
        ModelAndView modelAndView = new ModelAndView("employee");
        Employee employee = employeeService.getEmployee(id);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
}
