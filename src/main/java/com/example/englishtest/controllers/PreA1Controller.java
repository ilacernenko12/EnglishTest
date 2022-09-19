package com.example.englishtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/preA1")
public class PreA1Controller {
    @GetMapping
    public String setPreA1(){
        return "preA1";
    }
}
