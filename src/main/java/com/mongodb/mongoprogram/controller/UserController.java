package com.mongodb.mongoprogram.controller;

import com.mongodb.mongoprogram.domain.UserReg;
import com.mongodb.mongoprogram.repository.UserRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRegRepository userRegRepository;

    @PostMapping(value="/saveuser")
    public String saveUser(@RequestBody UserReg user){
        userRegRepository.save(user);
        return "User Registered";
    }
}
