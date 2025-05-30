package com.example.petshop_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop_web.entity.Product;
import com.example.petshop_web.service.ProductDogService;

@RestController
@RequestMapping("api/product-dog")
public class ProductDogController {
    @Autowired
    private ProductDogService productDogService;

    @GetMapping
    public List<Product> getAllProduct() {
        return productDogService.seasearchByClassifyD01();
    }
}
