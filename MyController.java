package com.soda.foodtruck.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @RequestMapping("/SmsResource/{id}")
    public String getExampleById(@PathVariable String id) {
        // Your code here
        return "Received ID: " + id;
    }
}