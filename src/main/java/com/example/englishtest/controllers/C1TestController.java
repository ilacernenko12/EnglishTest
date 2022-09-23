package com.example.englishtest.controllers;

import com.example.englishtest.models.C1Model;
import com.example.englishtest.models.ResultModel;
import com.example.englishtest.repos.C1Repo;
import com.example.englishtest.repos.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/C1Test")
public class C1TestController {
    @Autowired
    C1Repo c1Repo;

    @Autowired
    ResultRepo resultRepo;

    @GetMapping
    public String getB2Test() {
        return "C1Test";
    }

    @PostMapping
    public RedirectView setAnswerC1 (@RequestParam int q1,
                                     @RequestParam int q2,
                                     @RequestParam int q3,
                                     @RequestParam int q4,
                                     @RequestParam int q5,
                                     @RequestParam int q6,
                                     @RequestParam int q7,
                                     @RequestParam int q8,
                                     @RequestParam int q9,
                                     @RequestParam int q10){
        C1Model c1Model = new C1Model();
        ResultModel resultModel = new ResultModel();
        c1Model.setQ1(q1);
        c1Model.setQ2(q2);
        c1Model.setQ3(q3);
        c1Model.setQ4(q4);
        c1Model.setQ5(q5);
        c1Model.setQ6(q6);
        c1Model.setQ7(q7);
        c1Model.setQ8(q8);
        c1Model.setQ9(q9);
        c1Model.setQ10(q10);

        c1Repo.save(c1Model);

        int count = 0;

        if (Integer.valueOf(c1Model.getQ1()) == 2){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ2()) == 1){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ3()) == 2){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ4()) == 1){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ5()) == 2){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ6()) == 1){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ7()) == 2){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ8()) == 2){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ9()) == 1){
            count++;
        }
        if (Integer.valueOf(c1Model.getQ10()) == 1){
            count++;
        }

        resultModel.setC1Result(count);
        resultRepo.save(resultModel);

        if (count>=5){
            return  new RedirectView("/ResultLevelC1");
        }
        if (count<5){
            return  new RedirectView("/ResultLevelB2");
        }
        else
            return new RedirectView("/C1Test");
    }
}
