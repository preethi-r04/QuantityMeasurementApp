package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/user")
    public String userApi() {
        return "User API accessed";
    }

    @GetMapping("/api/admin")
    public String adminApi() {
        return "Admin API accessed";
    }
}