package com.developer.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class MainController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String init() {
        return "Service is running ...";
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "Test ...";
    }
}
