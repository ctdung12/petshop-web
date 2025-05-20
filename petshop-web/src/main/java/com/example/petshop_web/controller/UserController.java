package com.example.petshop_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop_web.entity.User;
import com.example.petshop_web.repository.UserRP;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRP userRP;

    @GetMapping
    public List<User> getAllUser() {
        return userRP.findAll();
    }
}
