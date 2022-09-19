package com.example.englishtest.controllers;

import com.example.englishtest.models.B2model;
import com.example.englishtest.repos.B2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/B2Test")
public class B2TestController {
    @Autowired
    B2Repo b2Repo;

    @GetMapping
    public String getB2Test(){
        return "B2Test";
    }

    @PostMapping
    public RedirectView setAnswerB2(@RequestParam String  q1,
                                    @RequestParam int q2,
                                    @RequestParam int q3,
                                    @RequestParam int q4,
                                    @RequestParam int q5,
                                    @RequestParam String q6,
                                    @RequestParam int q7,
                                    @RequestParam int q8,
                                    @RequestParam int q9,
                                    @RequestParam int q10){
        B2model b2model = new B2model();
        b2model.setQ1(q1);
        b2model.setQ2(q2);
        b2model.setQ3(q3);
        b2model.setQ4(q4);
        b2model.setQ5(q5);
        b2model.setQ6(q6);
        b2model.setQ7(q7);
        b2model.setQ8(q8);
        b2model.setQ9(q9);
        b2model.setQ10(q10);

        b2Repo.save(b2model);

        int count = 0;
        String answer1 = b2model.getQ1().toString();
        String answer6 = b2model.getQ6().toString();
        String trueAnswer1 = "А теперь попробуйте послушать без субтитров";
        String trueAnswer6 = "Now freelancing is a great oprion";

        if (answer1.equalsIgnoreCase(trueAnswer1)){
            count++;
        }
        if (Integer.valueOf(b2model.getQ2()) == 1){
            count++;
        }
        if (Integer.valueOf(b2model.getQ3()) == 3){
            count++;
        }
        if (Integer.valueOf(b2model.getQ4()) == 1){
            count++;
        }
        if (Integer.valueOf(b2model.getQ5()) == 2){
            count++;
        }
        if (answer6.equalsIgnoreCase(trueAnswer6)){
            count++;
        }
        if (Integer.valueOf(b2model.getQ7()) == 1){
            count++;
        }
        if (Integer.valueOf(b2model.getQ8()) == 3){
            count++;
        }
        if (Integer.valueOf(b2model.getQ9()) == 1){
            count++;
        }
        if (Integer.valueOf(b2model.getQ10()) == 3){
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
