package com.example.petshop_web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private Long IdAdmin;

    @Column(name = "admin_name", nullable = false)
    private String AdminName;

    @Column(name = "admin_pw", nullable = false)
    private String AdminPW;

    public Admin() {
    }

    public Long getIdAdmin() {
        return IdAdmin;
    }

    public String getAdminName() {
        return AdminName;
    }

    public String getAdminPW() {
        return AdminName;
    }
}
