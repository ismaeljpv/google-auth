package com.example.apiconsumer.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greeting(){
        return "Hello, module access success";
    }

}
