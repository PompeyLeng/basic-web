package com.example.demo.controller;

import com.example.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dvo")
public class UserController {
    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);



    @GetMapping("/test")
    public String test() {
        logger.info("test");
        return "test success";
    }

}