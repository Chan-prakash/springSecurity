package com.chan.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @GetMapping("/home")
    public String hello(HttpServletRequest request){
       return "Hello world"+request.getRequestedSessionId();
    }

    @GetMapping("/about")
    public String about(){
        return "Hi I am chandrakanth";
    }
}
