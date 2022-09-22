package com.example.englishtest.controllers;

import com.example.englishtest.helpers.ResultHelp;
import com.example.englishtest.models.ResultModel;
import com.example.englishtest.models.TestOne;
import com.example.englishtest.repos.ResultRepo;
import com.example.englishtest.repos.TestOneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/Test")
public class TestController {
    @Autowired
    TestOneRepo testOneRepo;
    @Autowired
    ResultRepo resultRepo;

    @GetMapping
    public String getTest(){
        return "Test";
    }

    @PostMapping
    public RedirectView setAnswerOne (@RequestParam int q1,
                                      @RequestParam int q2,
                                      @RequestParam int q3,
                                      @RequestParam int q4,
                                      @RequestParam int q5,
                                      @RequestParam int q6,
                                      @RequestParam int q7,
                                      @RequestParam int q8,
                                      @RequestParam int q9,
                                      @RequestParam int q10,
                                      Model model){
        ResultModel resultModel = new ResultModel();
        TestOne testOne = new TestOne();
        testOne.setQ1(q1);
        testOne.setQ2(q2);
        testOne.setQ3(q3);
        testOne.setQ4(q4);
        testOne.setQ5(q5);
        testOne.setQ6(q6);
        testOne.setQ7(q7);
        testOne.setQ8(q8);
        testOne.setQ9(q9);
        testOne.setQ10(q10);


        testOneRepo.save(testOne);
        int count = 0;
        if (Integer.valueOf(testOne.getQ1())==2){
            count++;
        }
        if (Integer.valueOf(testOne.getQ2())==3){
            count++;
        }
        if (Integer.valueOf(testOne.getQ3())==1){
            count++;
        }
        if (Integer.valueOf(testOne.getQ4())==4){
            count++;
        }
        if (Integer.valueOf(testOne.getQ5())==2){
            count++;
        }
        if (Integer.valueOf(testOne.getQ6())==4){
            count++;
        }
        if (Integer.valueOf(testOne.getQ7())==1){
            count++;
        }
        if (Integer.valueOf(testOne.getQ8())==4){
            count++;
        }
        if (Integer.valueOf(testOne.getQ9())==3){
            count++;
        }
        if (Integer.valueOf(testOne.getQ10())==4){
            count++;
        }

        resultModel.setTestResult(count);
        resultRepo.save(resultModel);

        List<ResultModel> resultModels = resultRepo.findAll();
        List<String> list = new ArrayList<>();
        for (ResultModel r: resultModels){
            list.add(String.valueOf(r.getTestResult()));
        }
        model.addAttribute("list", list);

        if (count>=5){
            return  new RedirectView("/preB2");
        }
        if (count<5){
            return  new RedirectView("/preA2");
        }
        else
        return new RedirectView("/Test");
    }
}
