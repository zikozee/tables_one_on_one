package com.spiritbeing.tables_one_on_one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("page", System.currentTimeMillis());
        return "home";
    }
}
