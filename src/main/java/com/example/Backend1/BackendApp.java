package com.example.Backend1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApp {
    public static void main(String[] args) {

        System.out.println("Hello Spring!");
        SpringApplication.run( BackendApp.class, args);
    }
}
