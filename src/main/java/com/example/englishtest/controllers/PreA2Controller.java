package com.example.englishtest.controllers;

import com.example.englishtest.repos.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;


@Controller

public class PreA2Controller {

    @GetMapping
    public String getPreA2(){
        return "preA2";
    }
}
