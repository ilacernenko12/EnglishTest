package com.example.englishtest.controllers;

import com.example.englishtest.repos.TestOneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainPageController {
    @Autowired
    TestOneRepo testOneRepo;

    @GetMapping
    public String getMainPage(){
        return "MainPage";
    }
}
