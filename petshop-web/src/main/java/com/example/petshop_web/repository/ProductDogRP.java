package com.example.petshop_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.petshop_web.entity.Product;
import java.util.List;;

@Repository
public interface ProductDogRP extends JpaRepository<Product, Long> {
    // JPQL
    @Query("SELECT u FROM Product u WHERE u.Classify = 'D01'")
    List<Product> seasearchByClassifyD01(@Param("Classify") String Classify);
}