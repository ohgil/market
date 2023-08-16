package com.project.market.cart.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {
    @PreAuthorize("isAuthenticated()")
    @GetMapping("list")
    public String list () {

        return "cart/list";
    }
}
