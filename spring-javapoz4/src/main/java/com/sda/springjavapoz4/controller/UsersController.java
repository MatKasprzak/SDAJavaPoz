package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.model.User;
import com.sda.springjavapoz4.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ModelAndView getUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("user");
        User user = userService.getUser(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    @GetMapping(params = {"lastName"})
    public ModelAndView getUsersByLastName(@RequestParam("lastName") String lastName){
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("lastName", lastName);
        return modelAndView;

    } @GetMapping(params = {"firstName"})
    public ModelAndView getUsersByFirstName(@RequestParam("firstName") String firstName){
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", userService.getUsersByFirstName(firstName));
        return modelAndView;
    }

    @GetMapping("/example")
    public ModelAndView getExampleUser() {
        System.out.println(userService.getExampleUser());
        return new ModelAndView("users");
    }
}
