package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.models.User;

public interface UserService {
    public Page<User> getAllUsers (Pageable pageable);
    public Optional<User> getUserById (String id);
    public User addUser(User customer);
    public void delete (String id);
    
}