package com.example.assignment2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class FireStationController {
    private static final Logger logger = LoggerFactory.getLogger(FireStationController.class);

    @GetMapping("/firestation")
    public String getPeopleByFireStation(@RequestParam int stationNumber) {
        logger.info("Received request for fire station: " + stationNumber);


        return "{\"message\": \"Data for fire station " + stationNumber + "\"}";
    }
}
