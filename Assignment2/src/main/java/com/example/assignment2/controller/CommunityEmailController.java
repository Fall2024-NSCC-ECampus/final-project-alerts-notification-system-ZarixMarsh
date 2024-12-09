package com.example.assignment2.controller;

import com.assignment2.service.CommunityEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CommunityEmailController {
    private static final Logger logger = LoggerFactory.getLogger(CommunityEmailController.class);

    @Autowired
    private CommunityEmailService communityEmailService;

    @GetMapping("/communityEmail")
    public String getEmailsByCity(@RequestParam String city) {
        logger.info("Received request for community emails in city: " + city);
        return communityEmailService.getEmailsByCity(city);
    }
}
