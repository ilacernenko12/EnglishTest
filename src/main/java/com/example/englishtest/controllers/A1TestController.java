package com.example.englishtest.controllers;

import com.example.englishtest.models.A1model;
import com.example.englishtest.models.ResultModel;
import com.example.englishtest.repos.A1Repo;
import com.example.englishtest.repos.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping ("/A1Test")
public class A1TestController {
    @Autowired
    A1Repo a1Repo;

    @Autowired
    ResultRepo resultRepo;

    @GetMapping
    public String getB2Test(){
        return "A1Test";
    }

    @PostMapping
    public RedirectView setAnswerA1 (@RequestParam int q1,
                                     @RequestParam int q2,
                                     @RequestParam int q3,
                                     @RequestParam int q4,
                                     @RequestParam int q5,
                                     @RequestParam int q6,
                                     @RequestParam int q7,
                                     @RequestParam int q8,
                                     @RequestParam int q9,
                                     @RequestParam int q10){
        A1model a1model = new A1model();
        ResultModel resultModel = new ResultModel();
        a1model.setQ1(q1);
        a1model.setQ2(q2);
        a1model.setQ3(q3);
        a1model.setQ4(q4);
        a1model.setQ5(q5);
        a1model.setQ6(q6);
        a1model.setQ7(q7);
        a1model.setQ8(q8);
        a1model.setQ9(q9);
        a1model.setQ10(q10);

        a1Repo.save(a1model);

        int count = 0;

        if (Integer.valueOf(a1model.getQ1()) == 1){
            count++;
        }
        if (Integer.valueOf(a1model.getQ2()) == 2){
            count++;
        }
        if (Integer.valueOf(a1model.getQ3()) == 1){
            count++;
        }
        if (Integer.valueOf(a1model.getQ4()) == 4){
            count++;
        }
        if (Integer.valueOf(a1model.getQ5()) == 3){
            count++;
        }
        if (Integer.valueOf(a1model.getQ6()) == 4){
            count++;
        }
        if (Integer.valueOf(a1model.getQ7()) == 1){
            count++;
        }
        if (Integer.valueOf(a1model.getQ8()) == 4){
            count++;
        }
        if (Integer.valueOf(a1model.getQ9()) == 3){
            count++;
        }
        if (Integer.valueOf(a1model.getQ10()) == 3){
            count++;
        }

        resultModel.setA1Result(count);
        resultRepo.save(resultModel);

        if (count>=5){
            return  new RedirectView("/ResultLevelA2");
        }
        if (count<5){
            return  new RedirectView("/ResultLevelA1");
        }
        else
            return new RedirectView("/A1Test");
    }
}
