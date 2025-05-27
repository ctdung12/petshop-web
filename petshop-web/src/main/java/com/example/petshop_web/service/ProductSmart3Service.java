package com.example.petshop_web.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop_web.repository.ProductSmart3RP; 
import com.example.petshop_web.entity.Smart; 

@Service
public class ProductSmart3Service {
    @Autowired
    private ProductSmart3RP productSmart3RP;

    public List<Smart> searchByClassifyD() {
        return productSmart3RP.searchByClassifyD();
    }
}
