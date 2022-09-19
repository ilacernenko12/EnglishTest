package com.example.englishtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/preB2")
public class PreB2Controller {
    @GetMapping
    public String getPreB2(){
        return "preB2";
    }
}
