package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoller {

    //New comment added
    //Add Feature
    @GetMapping
    public String hello(){
        return "Hello World!!";
    }
}
