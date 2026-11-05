package com.example.CICD_Demo.controller;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome(){
        return ResponseEntity.status(HttpStatus.OK)
                .body("<h1>Wish You a Very Happy Diwali</h1>");
    }

}
