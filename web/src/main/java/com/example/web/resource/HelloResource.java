package com.example.web.resource;

import com.example.apiconsumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloResource {

    private HelloService helloService;

    public HelloResource(final HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String helloResource(){
        return helloService.greeting();
    }

}
