package com.example.petshop_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/home")

public class HomeController {
    @GetMapping
    public List<String> getUser() {
        return List.of("1", "2", "3");
    }
}
