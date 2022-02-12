package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoller {

    //New comment added
    //Add Feature one
    //Added Feature two
    @GetMapping
    public String hello(){
        return "Hello World!!";
    }
}
