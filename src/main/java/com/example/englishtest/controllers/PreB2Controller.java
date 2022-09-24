package com.example.englishtest.controllers;

import com.example.englishtest.models.ResultModel;
import com.example.englishtest.repos.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/preB2")
public class PreB2Controller {
    @Autowired
    ResultRepo resultRepo;
    @GetMapping
    public String getPreB2(Model model){
        List<ResultModel> resultModels = resultRepo.findAll();
        List<String> list = new ArrayList<>();
        for (ResultModel r: resultModels){
            list.add(String.valueOf(r.getTestResult()));
        }
        model.addAttribute("list", list);
        return "preB2";
    }
}
