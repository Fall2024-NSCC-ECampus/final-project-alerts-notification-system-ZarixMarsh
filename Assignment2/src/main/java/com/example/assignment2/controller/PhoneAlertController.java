package com.example.assignment2.controller;

import com.assignment2.service.PhoneAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PhoneAlertController {
    private static final Logger logger = LoggerFactory.getLogger(PhoneAlertController.class);

    @Autowired
    private PhoneAlertService phoneAlertService;

    @GetMapping("/phoneAlert")
    public String getPhonesByFireStation(@RequestParam int firestation) {
        logger.info("Received request for phone alert for fire station: " + firestation);
        return phoneAlertService.getPhonesByFireStation(firestation);
    }
}
