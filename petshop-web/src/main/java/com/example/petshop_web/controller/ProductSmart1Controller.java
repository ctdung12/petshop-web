package com.example.petshop_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop_web.entity.Smart;
import com.example.petshop_web.service.ProductSmart1Service;

@RestController
@RequestMapping("/api/product-smart1")
public class ProductSmart1Controller {
    @Autowired
    private ProductSmart1Service productSmart1Service;

    @GetMapping
    public List<Smart> getAllSmartByClassifyA() {
        return productSmart1Service.searchByClassifyA();
    }
}