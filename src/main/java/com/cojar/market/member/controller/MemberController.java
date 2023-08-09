package com.cojar.market.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/login")
    public String login() {
        return "/member/login";
    }

    @GetMapping("/join")
    public String join() {
        return "/member/join";
    }

}