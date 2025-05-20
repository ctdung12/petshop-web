package com.example.petshop_web.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petshop_web.entity.User;

@Repository
public interface UserRP extends JpaRepository<User, Long> {
    ArrayList<User> findAllUser(Long Id);
}