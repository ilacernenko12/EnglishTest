package com.example.englishtest.controllers;

import com.example.englishtest.models.ResultModel;
import com.example.englishtest.repos.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/preA2")
public class PreA2Controller {
    @Autowired
    ResultRepo resultRepo;

    ResultModel resultModel;

    @GetMapping("/{id}")
    public String getPreA2(Model model, @PathVariable long id)  {
        List<ResultModel> resultModels = Collections.singletonList(resultRepo.findAllById(id));
        List<String> list = new ArrayList<>();
        for (ResultModel r: resultModels){
            list.add(String.valueOf(r.getTestResult()));
        }

        model.addAttribute("list", list);
        return "preA2";
    }
}
