package com.example.petshop_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop_web.entity.Smart;
import com.example.petshop_web.service.ProductSmart3Service;

import java.util.List;

@RestController
@RequestMapping("/api/product-smart3")
public class ProductSmart3Controller {

    @Autowired
    private ProductSmart3Service productSmart3Service;

    @GetMapping
    public List<Smart> getAllSmartByClassifyD() {
        return productSmart3Service.searchByClassifyD();
    }
}