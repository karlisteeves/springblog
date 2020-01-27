package com.example.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JoinController {

    @GetMapping("/deimos")
    public String joinForm() {
        return "deimos";
    }

    @PostMapping("/deimos")
    public String joinCohort(@RequestParam String cohort, Model model) {
        model.addAttribute("cohort", cohort);
        return "join";

    }
}



