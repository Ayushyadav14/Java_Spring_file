package com.example.Spring_demo_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_world {
    @GetMapping
    public String hello(){
        return  "Hello world from ayush";
    }
}
