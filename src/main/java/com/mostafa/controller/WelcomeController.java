package com.mostafa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.controller.WelcomeController.java: SpringBoot-LogBack
 * @CreationDate 9/27/2022 5:40 PM
 */
@RestController
public class WelcomeController {
    Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/api/{name}")
    public String greeting(@PathVariable("name") String name){
        logger.debug("Request : "+name);
        String response = "Hello "+name;
        logger.debug("Response : "+response);
        return response;
    }
}
