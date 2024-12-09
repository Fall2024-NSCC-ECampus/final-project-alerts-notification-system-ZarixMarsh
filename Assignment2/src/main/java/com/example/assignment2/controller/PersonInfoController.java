package com.example.assignment2.controller;

import com.assignment2.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PersonInfoController {
    private static final Logger logger = LoggerFactory.getLogger(PersonInfoController.class);

    @Autowired
    private PersonInfoService personInfoService;

    @GetMapping("/personInfo")
    public String getPersonInfo(@RequestParam String firstName, @RequestParam String lastName) {
        logger.info("Received request for person info: " + firstName + " " + lastName);
        return personInfoService.getPersonInfo(firstName, lastName);
    }
}
