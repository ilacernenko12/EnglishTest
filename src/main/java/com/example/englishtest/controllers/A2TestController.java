package com.example.englishtest.controllers;

import com.example.englishtest.models.A2model;
import com.example.englishtest.repos.A2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/A2Test")
public class A2TestController {

    @Autowired
    A2Repo a2Repo;
    @GetMapping
    public String getA2Test(){
        return "A2Test";
    }
    @PostMapping
    public RedirectView setAnswerA2 (@RequestParam int q1,
                                      @RequestParam int q2,
                                      @RequestParam int q3,
                                      @RequestParam int q4,
                                      @RequestParam int q5,
                                      @RequestParam String q6,
                                      @RequestParam int q7,
                                      @RequestParam int q8,
                                      @RequestParam int q9,
                                      @RequestParam int q10){
        A2model a2model = new A2model();
        a2model.setQ1(q1);
        a2model.setQ2(q2);
        a2model.setQ3(q3);
        a2model.setQ4(q4);
        a2model.setQ5(q5);
        a2model.setQ6(q6);
        a2model.setQ7(q7);
        a2model.setQ8(q8);
        a2model.setQ9(q9);
        a2model.setQ10(q10);

        a2Repo.save(a2model);

        int count = 0;
        String answer = a2model.getQ6().toString();
        String trueAnswer = "Я чуть не заснул, пока слушал это предложение";

        if (Integer.valueOf(a2model.getQ1())==4){
            count++;
        }
        if (Integer.valueOf(a2model.getQ2())==2){
            count++;
        }
        if (Integer.valueOf(a2model.getQ3())==1){
            count++;
        }
        if (Integer.valueOf(a2model.getQ4())==1){
            count++;
        }
        if (Integer.valueOf(a2model.getQ5())==2){
            count++;
        }
        if (answer.equalsIgnoreCase(trueAnswer)){
            count++;
        }
        if (Integer.valueOf(a2model.getQ7())==1){
            count++;
        }
        if (Integer.valueOf(a2model.getQ8())==4){
            count++;
        }
        if (Integer.valueOf(a2model.getQ9())==1){
            count++;
        }
        if (Integer.valueOf(a2model.getQ10())==2){
            count++;
        }

        if (count>=5){
            return  new RedirectView("/preC1");
        }
        if (count<5){
            return  new RedirectView("/preA1");
        }
        else
        return new RedirectView("/A2Test");
    }
}
