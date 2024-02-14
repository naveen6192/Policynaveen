package com.example.policynaveen.controller;

import com.example.policynaveen.entity.Coverage;
import com.example.policynaveen.entity.Policy;
import com.example.policynaveen.entity.State;
import com.example.policynaveen.service.Policyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("/Policy")
public class Policycontroller {
    @Autowired
    private Policyservice policyservice;

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/insertpolicy")
    public String insert(Model model) {
        model.addAttribute("policy", new Policy());
        model.addAttribute("state", policyservice.getallstate());
        model.addAttribute("coverage", policyservice.getallcoverage());
        return "addpolicy";
    }


    @PostMapping("/addpolicy")
    public String submit(@ModelAttribute("policy") Policy policy, @RequestParam("coverage") String coverage[], @RequestParam("state") String selectedstate[]) {

        for (String state : selectedstate) {
            int id = Integer.parseInt(state);
            State state1 = policyservice.getstate(id);
            policy.getState();
        }


        for (String cover : coverage) {
            int id = Integer.parseInt(cover);
            Coverage coverage1 = policyservice.getcoverage(id);
            policy.getCoverages().add(coverage1);
        }
        policyservice.addpolicy(policy);
        return "index";
    }

    @GetMapping("/viewpolicy")
    public String view(Model model) {
        List<Policy> policies = policyservice.getallpolicy();
        model.addAttribute("policy", policies);
        return "listpolicy";
    }

    @GetMapping("/editpolicy")
    public String edit(@ModelAttribute("policy") Policy policy, @RequestParam("coverage") String coverage[], @RequestParam("state") String selectedstate[], Model model) {
        for (String state : selectedstate) {
            int id = Integer.parseInt(state);
            State state1 = policyservice.getstate(id);
            policy.getState();
        }


        for (String cover : coverage) {
            int id = Integer.parseInt(cover);
            Coverage coverage1 = policyservice.getcoverage(id);
            policy.getCoverages().add(coverage1);
        }
        policyservice.addpolicy(policy);

        return "editpolicy";
    }
    @GetMapping("/updatepolicy")
    public String update(Model model,Policy policy){
        policyservice.updatepolicy(policy);
        return "listpolicy";
    }


}
