package com.example.freemarkerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @RequestMapping("/index")
    public String toIndex(Model model) {
        model.addAttribute("name", "zzz");
        return "index";
    }
}
