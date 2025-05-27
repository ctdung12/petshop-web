package com.example.petshop_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop_web.repository.ProductDogRP;
import com.example.petshop_web.entity.*;

@Service
public class ProductDogService {
    @Autowired
    private ProductDogRP productDogRP;

    public List<Product> seasearchByClassifyD01() {
        return productDogRP.seasearchByClassifyD01();
    }
}