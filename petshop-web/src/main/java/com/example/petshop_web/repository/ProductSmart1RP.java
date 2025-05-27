package com.example.petshop_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.example.petshop_web.entity.Smart;
import java.util.List;;

public interface ProductSmart1RP extends JpaRepository<Smart, Long> {
    @Query("SELECT s FROM Smart s WHERE s.ClassifySmart = 'A'")
    List<Smart> searchByClassifyA();
}
