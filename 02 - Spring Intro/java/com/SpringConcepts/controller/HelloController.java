package com.SpringConcepts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String showHelloPage() {
        return "Hello from BridgeLabz"; 
    }

    @GetMapping("/path/{name}")
    public String helloPath(@PathVariable String name) {
    	return "Hello" +" " + name + " from Bridgelabz !!";
    }
    
}