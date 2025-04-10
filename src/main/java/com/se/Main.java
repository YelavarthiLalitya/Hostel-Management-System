package com.hostelmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
/*
 * Client sends HTTP request to UserController.
 * 
 * UserController calls UserService.
 * 
 * UserService calls UserRepository.
 * 
 * UserRepository fetches data from the database.
 * 
 * Data is returned from UserRepository → UserService → UserController.
 * 
 * UserController returns the response to the client.
 */