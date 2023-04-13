package com.example.springbootnotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springbootnotes.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    // public boolean validateUserCredential() {
    // boolean isValid = false;

    // User loginUser = this.userRepository.getUser();

    // if (loginUser != null && loginUser.getPassword()) {

    // }

    // return isValid;
    // }

    public String encodeTest(String password) {
        return passwordEncoder.encode(password);
    };
}
