package com.example.securitysession.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {

    @GetMapping("/admin")
    public String adminP() {
        return "admin";
    }
}
