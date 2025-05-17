package com.SpringConcepts.controller;

import com.SpringConcepts.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class FirstLastNameRestController {

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz";
    }
}