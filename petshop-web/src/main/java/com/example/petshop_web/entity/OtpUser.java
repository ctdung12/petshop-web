package com.example.petshop_web.entity;

import java.time.LocalDateTime;

public class OtpUser {
    private String code;
    private LocalDateTime time;

    public String getCode() {
        return code;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public OtpUser(String code, LocalDateTime time) {
        this.code = code;
        this.time = time;
    }
}
