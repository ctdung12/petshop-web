package com.example.petshop_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop_web.repository.ProductHomeRP;
import com.example.petshop_web.entity.*;
import java.util.List;

@Service
public class ProductHomeService {
    @Autowired
    private ProductHomeRP productHomeRP;

    public List<Product> getAllProduct() {
        return productHomeRP.findAll();
    }
}
