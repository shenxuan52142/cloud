package com.itmuch.cloud.mircroservicesimpleprovideruser.controller;

import com.itmuch.cloud.mircroservicesimpleprovideruser.jpa.UserRepository;
import com.itmuch.cloud.mircroservicesimpleprovideruser.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String findById(@PathVariable Long id){
        return "ssss";
    }
}
