package com.SpringConcepts.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/query")
    public String helloParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!!";
    }
}