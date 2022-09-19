package com.example.englishtest.controllers;

import com.example.englishtest.models.TestOne;
import com.example.englishtest.repos.TestOneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

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
