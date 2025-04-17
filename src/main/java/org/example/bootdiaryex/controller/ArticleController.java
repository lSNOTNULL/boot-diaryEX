package org.example.bootdiaryex.controller;

import org.example.bootdiaryex.model.form.ArticleForm;
import org.example.bootdiaryex.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("title","글 목록");
        model.addAttribute("list", articleService.findAll());
        return "article/list";
    }

    @GetMapping("/new")
    public String newArticle(Model model) {
        model.addAttribute("form", ArticleForm.empty());
        return "article/form";
    }
}
