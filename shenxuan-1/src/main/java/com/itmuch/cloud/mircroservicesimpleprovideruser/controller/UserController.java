package com.itmuch.cloud.mircroservicesimpleprovideruser.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Value("${profile}")
    private String name;
    @GetMapping("/{getName}")
    public String findById(@PathVariable Long id){
        return name;
    }
}
