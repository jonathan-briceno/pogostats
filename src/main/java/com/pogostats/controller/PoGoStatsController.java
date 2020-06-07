package com.pogostats.controller;


import com.pogostats.service.PikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoGoStatsController {

    @Autowired
    PikaService pikaService;

    @GetMapping("/pika/{pikaTimes}")
    public String getPika(@PathVariable("pikaTimes") int pikaTimes) {
        return pikaService.getPika(pikaTimes);
    }
}
    /*public Employee getEmployeeByID(@PathVariable("id") int id) {
        return repository.retrieve(id);
    }*/

