package com.example.assignment2.controller;

import com.assignment2.service.FireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class FireController {
    private static final Logger logger = LoggerFactory.getLogger(FireController.class);

    @Autowired
    private FireService fireService;

    @GetMapping("/fire")
    public String getFireDetailsByAddress(@RequestParam String address) {
        logger.info("Received request for fire details at address: " + address);
        return fireService.getFireDetailsByAddress(address);
    }
}