package com.itmuch.cloud.mircroservicesimpleprovideruser.controller;

import com.itmuch.cloud.mircroservicesimpleprovideruser.jpa.UserRepository;
import com.itmuch.cloud.mircroservicesimpleprovideruser.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/{id}")
    public String findById(@PathVariable Long id){
        return "ssss";
    }
}
