package com.example.petshop_web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop_web.repository.ProductSmart2RP; 
import com.example.petshop_web.entity.Smart;
@Service
public class ProductSmart2Service {
    @Autowired
    private ProductSmart2RP productSmart2RP;

    public List<Smart> searchByClassifyV() {
        return productSmart2RP.searchByClassifyV();
    }
}
