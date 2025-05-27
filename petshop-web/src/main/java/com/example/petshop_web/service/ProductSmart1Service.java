package com.example.petshop_web.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop_web.repository.ProductSmart1RP; 
import com.example.petshop_web.entity.Smart; 

@Service
public class ProductSmart1Service {
    @Autowired
    private ProductSmart1RP productSmart1RP;

    public List<Smart> searchByClassifyA() { 
        return productSmart1RP.searchByClassifyA();
    }
}
