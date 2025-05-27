package com.example.petshop_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop_web.entity.Smart;
import com.example.petshop_web.service.ProductSmart2Service;

import java.util.List;

@RestController
@RequestMapping("/api/product-smart2")
public class ProductSmart2Controller {

    @Autowired
    private ProductSmart2Service productSmart2Service;

    @GetMapping
    public List<Smart> getAllSmartByClassifyV() {
        return productSmart2Service.searchByClassifyV();
    }
}