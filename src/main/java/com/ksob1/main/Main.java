package com.ksob1.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Main {



    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
