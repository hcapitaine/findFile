package com.example.findFile.exposition.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping(value="/hello")
    public String sayHello(String name) {
        return "world";
    }
}
