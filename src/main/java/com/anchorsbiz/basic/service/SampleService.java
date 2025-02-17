package com.anchorsbiz.basic.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    
    public String printMessage() {
        String message = "Hello World";
        System.out.println(message);  
        return message;
    }
}