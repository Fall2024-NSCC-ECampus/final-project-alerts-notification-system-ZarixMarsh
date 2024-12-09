package com.example.assignment2.controller;

import com.assignment2.service.ChildAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ChildAlertController {
    private static final Logger logger = LoggerFactory.getLogger(ChildAlertController.class);

    @Autowired
    private ChildAlertService childAlertService;

    @GetMapping("/childAlert")
    public String getChildrenByAddress(@RequestParam String address) {
        logger.info("Received request for children at address: " + address);
        return childAlertService.getChildrenByAddress(address);
    }
}
