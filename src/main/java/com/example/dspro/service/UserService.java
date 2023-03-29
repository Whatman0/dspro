package com.example.dspro.service;
import com.example.dspro.entity.User;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.example.dspro")
@Component
public interface UserService {
    
    public User getUser(User user);

    public User insertIntoDatabase(User user);
}