package com.trilogyed.hellocircle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCirCleController {

    @GetMapping(value = "/hello")
    public String helloCircle(){
        return "Hello, Circle!";
    }
}
