package com.bridgelabz.service;

import com.bridgelabz.dto.AuthRequest;
import com.bridgelabz.dto.AuthResponse;
import com.bridgelabz.dto.RegisterRequest;

public interface AuthService {

    String register(RegisterRequest request);

    AuthResponse login(AuthRequest request);
}