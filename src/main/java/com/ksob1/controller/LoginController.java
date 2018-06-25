package com.ksob1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    public LoginController(){
        System.out.println("Created");
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
