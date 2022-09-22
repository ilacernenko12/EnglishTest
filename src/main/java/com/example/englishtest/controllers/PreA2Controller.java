package com.example.englishtest.controllers;

import com.example.englishtest.helpers.ResultHelp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PreA2Controller {
    @GetMapping
    public String getPreA2(){
        return "preA2";
    }
}
