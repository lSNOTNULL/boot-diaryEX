package org.example.bootdiaryex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "환영합니다");
        model.addAttribute("message", "오늘도 화이팅");
        model.addAttribute("frontImage", "/assets/dog.jpg");
        return "index";
    }
}
