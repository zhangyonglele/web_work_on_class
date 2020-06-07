package com.work.web_work_on_class.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8080","*"})
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
