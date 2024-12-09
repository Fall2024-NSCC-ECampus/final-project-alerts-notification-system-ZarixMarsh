package com.example.assignment2.controller;

import com.assignment2.service.FloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class FloodController {
    private static final Logger logger = LoggerFactory.getLogger(FloodController.class);

    @Autowired
    private FloodService floodService;

    @GetMapping("/flood/stations")
    public String getHouseholdsByStationNumbers(@RequestParam String stations) {
        logger.info("Received request for flood data for stations: " + stations);
        return floodService.getHouseholdsByStations(stations);
    }
}
