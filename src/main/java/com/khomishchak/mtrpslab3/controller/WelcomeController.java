package com.khomishchak.mtrpslab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String welcomeUser(@RequestParam("username") String username) {
        return "Welcome to our world: %s".formatted(username);
    }
}
