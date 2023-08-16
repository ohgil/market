package com.project.market.question.controller;

import com.project.market.member.entity.Member;
import com.project.market.member.service.MemberService;
import com.project.market.product.entity.Product;
import com.project.market.product.service.ProductService;
import com.project.market.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private  final QuestionService questionService;
    private  final ProductService productService;
    private  final MemberService memberService;

    @PostMapping("/create/{id}")
    public String create(@PathVariable Long id, Principal principal, @RequestParam String content) {
        Product product = this.productService.getProduct(id);
        Member member = this.memberService.findByUsername(principal.getName());

        this.questionService.create(product, member, content);

        return String.format("redirect:/product/detail/%s", id);
    }
}
