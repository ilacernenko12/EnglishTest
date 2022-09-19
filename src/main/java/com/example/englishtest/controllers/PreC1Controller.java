package com.example.englishtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/preC1")
public class PreC1Controller {
    @GetMapping
    public String setPreC1(){
        return "preC1";
    }
}
