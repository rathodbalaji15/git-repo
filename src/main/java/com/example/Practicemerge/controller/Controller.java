package com.example.Practicemerge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/msg")
    public String getMsg(String msg){
        return "Hellow World";
    }
}
