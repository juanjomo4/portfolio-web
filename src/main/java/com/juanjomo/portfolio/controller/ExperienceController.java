package com.juanjomo.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExperienceController {

    @GetMapping({"/experience"})
    public String showExperienceController() {
        return "experience";
    }

}
