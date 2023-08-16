package com.project.market.question.controller;

import com.project.market.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private  final QuestionService questionService;

    @PostMapping("/create")
    public String create() {
        this.questionService.create();

        return "redirect:";
    }
}
