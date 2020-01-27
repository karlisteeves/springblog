package com.example.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller


public class Countdown {




    @GetMapping("/deimos")

    public String countdown() {
        return "/deimos";
    }

}
