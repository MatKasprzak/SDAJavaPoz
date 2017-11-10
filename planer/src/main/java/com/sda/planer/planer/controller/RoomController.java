package com.sda.planer.planer.controller;

import com.sda.planer.planer.Services.RoomService;
import com.sda.planer.planer.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public String saveRoom(@ModelAttribute Room room){
        roomService.saveRoom(room);
        return "redirect:/rooms";
    }
    @GetMapping
    public ModelAndView getAllRooms(){
        ModelAndView modelAndView = new ModelAndView("allRooms");
        modelAndView.addObject("employee", roomService.getAllRooms());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getRoom(@PathVariable ("id") long id){
        ModelAndView modelAndView = new ModelAndView("room");

        modelAndView.addObject("room",roomService.getRoom(id));
        return modelAndView;


    }
}
